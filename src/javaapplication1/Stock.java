package javaapplication1;

import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public  class Stock  extends JFrame implements ActionListener{
JTable t1;
    JButton b1;
    String x[] = {"No.","Item Name","Price","Piece","Total Price"};
    String y[][] = new String[40][8];
    int i=0, j=0;
     Stock() {
     
        setSize(1300,950);
        setLocation(200,50);
        
        try{
            connectionClass c1  = new connectionClass();
            String s1 = "select * from stock";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("no");
                y[i][j++]=rs.getString("itemname");
                y[i][j++]=rs.getString("price");
                y[i][j++]=rs.getString("piece");
                y[i][j++]=rs.getString("totalprice");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        b1 = new JButton("Print");
        add(b1,"South");
        JScrollPane sp = new JScrollPane(t1);
        add(sp);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            t1.print();
        }catch(Exception e){}
    }

public static void main(String[] args){
       new Stock().setVisible(true);
}

}


