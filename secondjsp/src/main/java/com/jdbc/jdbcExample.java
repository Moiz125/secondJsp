package com.jdbc;

import java.sql.*;

public class jdbcExample {
   static final String DB_URL = "jdbc:mysql://localhost/mydb?autoReconnect=true&useSSL=false";
   static final String USER = "root";
   static final String PASS = "sibi@soft";
   static final String QUERY = "SELECT * from students";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("Id: " + rs.getInt("id"));
            System.out.print(", Name: " + rs.getString("name"));
            System.out.println(", Roll No: " + rs.getString("rollno"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}