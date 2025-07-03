package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;

public class JdbcMySqlCon{
    public static void main (String[] args) {
        // dbConn
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String userName = "root";
        String password = "";

        try {
            //Load mysql driver (optional for new jdbc versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Step 1 : Connect
            Connection con = DriverManager.getConnection(url,userName,password);
            System.out.println("Connected to DB");

            //Step 2 : Create Statement
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM employees");

            // Step 3 : Read Data
            while (result.next()) {
                System.out.println (result.getInt("employeeNumber") +"|"+
                                    result.getString("lastName") +"|" +
                                    result.getString("firstName") //+ "|" +

                        );
            }

            //Step 4 : Close resources
            result.close();
            statement.close();
            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}


