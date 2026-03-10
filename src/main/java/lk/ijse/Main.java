package lk.ijse;

import lk.ijse.config.FactoryConfiguration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {

//    public static void saveCustomer(String name,String address){
//        try {
//            Connection conn = getConnection();
//            String sql = "INSERT INTO customers (name,address) VALUES (?,?)";
//            PreparedStatement pst = conn.prepareStatement(sql);
//            pst.setString(1,name);
//            pst.setString(2,address);
//            int result = pst.executeUpdate();
//
//            if (result>0){
//                System.out.println("Customer saved Successfully");
//            }else {
//                System.out.println("Customer saved Failed");
//            }
//        }catch (Exception e){
//
//        }
//    }
//
//    public static Connection getConnection(){
//        final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_76_db";
//        final String DB_USERNAME = "root";
//        final String DB_PASSWORD = "";
//
//        Connection connection = null;
//
//        try {
//            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return connection;
//    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name : ");
//        String name = sc.nextLine();
//        System.out.println("Enter your address : ");
//        String address = sc.nextLine();
//        saveCustomer(name,address);
        FactoryConfiguration.getInstance();
    }
}