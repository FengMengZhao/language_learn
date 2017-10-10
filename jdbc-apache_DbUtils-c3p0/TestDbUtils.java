package org.fmz.jdbc;

import java.sql.*;
import javax.sql.*;
import java.util.*;

import org.apache.commons.dbutils.*;
import org.apache.commons.dbutils.handlers.*;

public class TestDbUtils{

    private Connection conn;
    private DataSource dataSource;

    public void testInsert(){
        final String SQL = "insert into users values(?, ?, ?)";
        try{
            if(null == conn || conn.isClosed()){
                conn = ConnectionManager.getConnection();
            }
            int result = new QueryRunner().update(conn, SQL, new Object[]{"10003", "cll", "321456"});
            if(0 < result){
                System.out.println("数据插入成功!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            close(conn);
        }
    }

    public void testDelete(){
        final String SQL = "delete from users where username = ?";
        try{
            if(null == conn || conn.isClosed()){
                conn = ConnectionManager.getConnection();
            }
            int result = new QueryRunner().update(conn, SQL, new Object[]{"cll"});
            if(0 < result){
                System.out.println("数据删除成功!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            close(conn);
        }
    }

    public void testQuery(){
        //final String SQL = "select * from users where username = 'jack'";
        final String SQL = "select * from users";

        try{
            if(null == conn || conn.isClosed()){
                conn = ConnectionManager.getConnection();
            }
            if(null == dataSource){
                dataSource = ConnectionManager.getDataSource();
            }
            //Users usersBean = (Users)new QueryRunner().query(conn, SQL, new BeanHandler(Users.class));
            //List<Users> usersBeanList = new QueryRunner().query(conn, SQL, new BeanListHandler<Users>(Users.class));
            List<Users> usersBeanList = new QueryRunner(dataSource).query(SQL, new BeanListHandler<Users>(Users.class));
            /*
            if(null != usersBean){
                System.out.println("uid --> " + usersBean.getUid());
                System.out.println("username --> " + usersBean.getUsername());
                System.out.println("password --> " + usersBean.getPassword());
            }
            */
            for(Users usersBean : usersBeanList){
                System.out.println("uid --> " + usersBean.getUid());
                System.out.println("username --> " + usersBean.getUsername());
                System.out.println("password --> " + usersBean.getPassword());

            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            close(conn);
        }

    }

    private void close(Connection conn){
        try{
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String args[]){
        
        //new TestDbUtils().testInsert();
        //new TestDbUtils().testDelete();
        new TestDbUtils().testQuery();
    }
}
