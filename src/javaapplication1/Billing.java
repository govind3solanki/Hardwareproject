package javaapplication1;


import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Billing extends JFrame{
   JPanel p1;
   JLabel l1,l2,l4,l3,l5;
   JButton b1,b2,b3;
   JTextField tf1,tf2,tf3,tf4,tf5;
   JTable t1;
    Billing() {
         setBounds(-10,0,1950,1050);
         
         p1 = new JPanel();
        p1.setBounds(30, 30, 650, 300);
        p1.setLayout( null);
        p1.setBackground(Color.BLACK);
        p1.setForeground(new Color(34, 139, 34));
        p1.setBorder(new TitledBorder(new LineBorder(new Color(173, 216, 230), 2), "Generat-Bill", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(173, 216, 230)));
       
        
        l1=new JLabel("Id:");
        l1.setForeground(Color.BLACK);
        l1.setBounds(200,200,150,20);
        l1.setFont(new Font("Thoma",Font.LAYOUT_NO_LIMIT_CONTEXT,25));
      add(l1);
        
         l2=new JLabel("Item Name:");
        l2.setForeground(Color.BLACK);
        l2.setBounds(500,200,150,20);
        l2.setFont(new Font("Thoma",Font.LAYOUT_NO_LIMIT_CONTEXT,25));
     add(l2);
        
         l3=new JLabel("Qantity:");
        l3.setForeground(Color.BLACK);
        l3.setBounds(800,200,150,20);
        l3.setFont(new Font("Thoma",Font.LAYOUT_NO_LIMIT_CONTEXT,25));
      add(l3);
      
       l4=new JLabel("Price:");
        l4.setForeground(Color.BLACK);
        l4.setBounds(1100,200,150,20);
        l4.setFont(new Font("Thoma",Font.LAYOUT_NO_LIMIT_CONTEXT,25));
      add(l4);
        
         l5=new JLabel("Tottal Price:");
        l5.setForeground(Color.BLACK);
        l5.setBounds(1400,200,150,20);
        l5.setFont(new Font("Thoma",Font.LAYOUT_NO_LIMIT_CONTEXT,25));
      add(l5);
        
        tf1=new JTextField();
        tf1.setBounds(300,200,150,40);
        tf1.setForeground(Color.black);
        tf1.setFont(new Font("Thoma",Font.LAYOUT_LEFT_TO_RIGHT,26));
       add(tf1);
        
           tf2=new JTextField();
        tf2.setBounds(600,200,150,40);
        tf2.setForeground(Color.black);
        tf2.setFont(new Font("Thoma",Font.LAYOUT_LEFT_TO_RIGHT,26));
      add(tf2);
        
           tf3=new JTextField();
        tf3.setBounds(900,200,150,40);
        tf3.setForeground(Color.black);
        tf3.setFont(new Font("Thoma",Font.LAYOUT_LEFT_TO_RIGHT,26));
       add(tf3);
        
           tf4=new JTextField();
        tf4.setBounds(1200,200,150,40);
        tf4.setForeground(Color.black);
        tf4.setFont(new Font("Thoma",Font.LAYOUT_LEFT_TO_RIGHT,26));
      add(tf4);
        
           tf5=new JTextField();
        tf5.setBounds(1500,200,150,40);
        tf5.setForeground(Color.black);
        tf5.setFont(new Font("Thoma",Font.LAYOUT_LEFT_TO_RIGHT,26));
      add(tf5);
        
        
        b1=new JButton("Add In List");
        b1.setFont(new Font("Thoma",Font.PLAIN,20));
        b1.setBounds(1700, 450, 150, 50);
        b1.setForeground(Color.white);
        b1.setBackground(Color.blue);
      add(b1);
        
String[][] rec = {
         { "1", "Steve", "AUS", "null", "null" },
         { "2", "Virat", "IND", "null", "null" },
         { "3", "Kane", "NZ", "null", "null" },
         { "4", "David", "AUS", "null", "null" },
         { "5", "Ben", "ENG", "null", "null" },
         { "6", "Eion", "ENG", "null", "null" },
         { "1", "Steve", "AUS", "null", "null" },
         { "2", "Virat", "IND", "null", "null" },
         { "3", "Kane", "NZ", "null", "null" },
         { "4", "David", "AUS", "null", "null" },
         { "5", "Ben", "ENG", "null", "null" },
         { "6", "Eion", "ENG", "null", "null" },
      };
      String[] header = { "Id", "Item Name", "Qantity","Price","Tottal Price" };
      JTable t1 = new JTable(rec, header);
      t1.setBounds(30, 30, 650, 300);
      JScrollPane sp=new JScrollPane(t1);
    add(sp);
    // add(p1);
        
    }
public static void main(String[] args){
new Billing().setVisible(true);
}    
}
