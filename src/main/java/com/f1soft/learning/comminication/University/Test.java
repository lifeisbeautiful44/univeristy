package com.f1soft.learning.comminication.University;

import com.f1soft.learning.comminication.University.platform.DataBaseConnection;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {

       Connection con =  DataBaseConnection.getInstance().getConnection();
        System.out.println(con);
        Connection con1 =  DataBaseConnection.getInstance().getConnection();
        System.out.println(con1);

    }
}
