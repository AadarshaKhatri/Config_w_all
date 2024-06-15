package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String password = "root";
        String query = "insert into students(Age, Name, Class) values(?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 20);
            ps.setString(2, "Hari");
            ps.setInt(3, 12);

            int i = ps.executeUpdate();

            if(i>0){
                System.out.println("Value Inserted!");
            }else{
                System.out.println("Failed to insert");
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException q){
            System.out.println(q.getMessage());
        }


    }
    }