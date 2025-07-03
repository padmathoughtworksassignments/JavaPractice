package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JDBCInsertPrepared {
    public static void main(String[] args) {
        // dbConn
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String userName = "root";
        String password = "";


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter ID : ");
        int employeeNumber = sc.nextInt();

        System.out.println("Enter Last Name : ");
        String lastName = sc.next();

        System.out.println("Enter First Name : ");
        String firstName = sc.next();

        System.out.println("Enter Extension Name : ");
        String extensionName = sc.next();

        System.out.println("Enter email : ");
        String email = sc.next();

        System.out.println("Enter office code : ");
        String officeCode = sc.next();

        System.out.println("Enter Reports to : ");
        int reportTo = sc.nextInt();

        System.out.println("Enter job title : ");
        String jobTitle = sc.next();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Step 1 : Connect
            Connection con = DriverManager.getConnection(url,userName,password);

            //Prepare SQL insert statement
            String sql = "INSERT INTO employees (employeeNumber, lastName, firstName, extension, email, officeCode, reportsTo, jobTitle) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            //Set Values
            ps.setInt(1,employeeNumber);
            ps.setString(2,lastName);
            ps.setString(3, firstName);
            ps.setString(4, extensionName);
            ps.setString(5, email);
            ps.setString(6, officeCode);
            ps.setInt(7, reportTo);
            ps.setString(8, jobTitle);

            //Execute insert
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record inserted successfully");
            }

            //Close resources
            ps.close();
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}