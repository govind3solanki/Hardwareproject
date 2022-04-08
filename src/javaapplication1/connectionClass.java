package javaapplication1;

import java.sql.*;

public class connectionClass {
   
    Connection c;
    Statement s;
    
    public connectionClass(){
       
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///gsd","root","");
            s=c.createStatement();
        
        }catch(Exception e){
        System.out.println(e);
        }
    }
}
