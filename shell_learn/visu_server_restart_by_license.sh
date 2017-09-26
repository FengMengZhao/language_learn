#!/bin/bash

tomcat_id=`ps aux | grep org.apache.catalina.startup.Bootstrap | grep -v grep | awk '{ print $2 }'`

if [[ ! -z ${tomcat_id} ]]; then
 kill -9 ${tomcat_id}
 if [ $? -eq 0 ]; then
  echo "进程被杀死"
 fi
else
 echo "进程不存在!"
fi

echo "删除license"
rm -rf /opt/apache-tomcat-7.0.79_8080/webapps/visu/license/*

cd /opt/apache-tomcat-7.0.79_8080/bin
./startup.sh
