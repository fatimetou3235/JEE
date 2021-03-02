package sn.Babs.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConn {
    private final String server= "localhost";
     private final String username = "root";
     private final String password = ""; 
     private final String bd = "gesschool_jee"; 
     private final String url = ""
             + "jdbc:mysql://"+server+":3306/"+bd;
   private Connection conx;
  public Connection getConnection(){
         try {
             Class.forName("com.mysql.jdbc.Driver");
             conx=DriverManager.getConnection(url, username, password);
              System.out.print("Connecte");
         } catch (Exception ex) {
             conx=null;
             System.out.print("Erreur");
         }
      return conx;
  }
}