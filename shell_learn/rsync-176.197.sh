#!/bin/sh

content="schema-db_cpdp-dump"
remote_ip="172.16.176.197"
local_ip="172.16.33.229"
remote_dump_file="${remote_ip}-${content}-$(date +%F_%R)"
local_dump_file="${local_ip}-${content}-$(date +%F_%R)"

db_user="cpdp"
db_passwd="123456"
db_name="visu"
schema="db_cpdp"

#备份远端数据库
echo "远端数据备份开始..."
pg_dump -h ${remote_ip} -U ${db_user} -d ${db_name} --schema=${schema} > ${remote_dump_file}
if [ $? -eq 0 ]; then
 echo "远端数据备份完成 --> ${remote_dump_file}"
else
 echo "远端数据库备份失败!"
 exit 1
fi

#备份本机数据库
echo "本机数据备份开始..."
pg_dump -h ${local_ip} -U ${db_user} -d ${db_name} --schema=${schema} > ${local_dump_file}
if [ $? -eq 0 ]; then
  echo "本机数据备份完成 --> ${local_dump_file}"
else
 echo "本机数据库备份失败!"
 exit 1
fi

#还原备份文件
if [ -f ./${remote_dump_file} ]; then
 echo "准备还原文件 --> ${remote_dump_file}..."
 echo "先删除SCHEMA --> ${schema}";
result=`psql -h ${local_ip} -U ${db_user} -d ${db_name} << EOF
  drop schema if exists ${schema} cascade;
EOF`
 if [ $? -eq 0 ]; then
  echo "${schema}删除成功!"
  psql -h ${local_ip} -U ${db_user} -d ${db_name} -f ${remote_dump_file};
  if [ $? -eq 0 ]; then
   echo "数据库还原成功!"
  else
   echo "数据库还原失败!"
  fi
 else
  echo "${schema}删除不成功!"
  exit 1
 fi
else
 echo "要还原的文件不存在!"
 exit 1
fi
