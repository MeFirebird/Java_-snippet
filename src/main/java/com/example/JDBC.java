package com.example;

import java.sql.*;

/**
 *   心得体会： JDBC没有用到配置文件连接数据库哦！
 *
 *   JDBC（Java Data Base Connectivity,java数据库连接）是一种用于执行SQL语句的Java API，
 *   可以为多种关系数据库提供统一访问，它由一组用Java语言编写的类和接口组成。
 */
public class JDBC {
    public static void main(String[] args) {
        // 驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        // URL指向要访问的数据库名world
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        // MySQL配置时的用户名
        String user = "root";
        // MySQL配置时的密码
        String password = "admin";
        String name;
        try {
            // 1. 加载驱动程序
            Class.forName(driver);
            // 2. 通过驱动管理器获得连接            （数据库名，用户名，密码）
            Connection conn = DriverManager.getConnection(url, user, password);
            if (!conn.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            // 3. 通过连接生成statement对象   sql语句的载体
            Statement statement = conn.createStatement();
            // 要执行的SQL语句
            String sql = "select * from student";
            // 4. 执行sql语句，返回结果集      结果集的载体
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                // 选择Name这列数据,  从结果集中获取指定的数据
                name = rs.getString("Sname");
                // 输出结果     两列的值
                System.out.println(rs.getString("Sno") + "\t" + name);
            }
            rs.close();     // 关闭结果集
            conn.close();   // 关闭数据库连接
        } catch (ClassNotFoundException e) {
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch (SQLException e) {     // 捕获异常先小后大，
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
