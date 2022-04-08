
package javaapplication1;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class JavaApplication11 {

    public static void main(String[] args) {
       
        fframe f1 = new fframe();
        f1.setVisible(true);
        f1.setLocation(600 , 300 );
            f1.setSize(650,400);
    }
}
class fframe extends JFrame implements Runnable{
    JPanel p1,p2;
    JLabel l,l2,l3,l4,l5,l6,l7,l8,l9;
    Thread t1;
    fframe(){
        super("Hardware Store-MS");

        p1 = new JPanel();
        p1.setBounds(30, 30, 650, 300);
        p1.setLayout( null);
        p1.setBackground(Color.DARK_GRAY);
        p1.setForeground(new Color(34, 139, 34));
        p1.setBorder(new EmptyBorder(10,10,10,10));
        add(p1);
        
        l = new JLabel("WELCOME IN HARDWARE STORE");
        l.setForeground(Color.white);
         l.setFont(new Font("Tahoma", Font.BOLD, 30));
        l.setBounds(60, 30, 500, 30);
        p1.add(l);
        
        ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("icons/hard2.png"));
        Image i3 = ic3.getImage().getScaledInstance(100, 80,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        l2 = new JLabel(icc3);
        l2.setBounds(150, 90, 300, 70);
        p1.add(l2);
        
         l3 = new JLabel("System Loding...");
        l3.setForeground(Color.white);
         l3.setFont(new Font("Tahoma", Font.BOLD, 15));
        l3.setBounds(230, 180, 500, 30);
        p1.add(l3);
        
        p2 = new JPanel();
        p2.setBounds(0, 250, 650, 100);
        p2.setLayout( null);
        p2.setBackground(Color.cyan);
        p2.setForeground(new Color(34, 139, 34));
        p2.setBorder(new EmptyBorder(10,10,10,10));
        p1.add(p2);
        
        l4 = new JLabel("About Projects: ");
        l4.setForeground(Color.black);
         l4.setFont(new Font("Tahoma", Font.BOLD, 15));
        l4.setBounds(0, 0, 200, 30);
        p2.add(l4);
        
         l5 = new JLabel("Hardware Management System is a software-based application developed in Java programming  ");
        l5.setForeground(Color.black);
         l5.setFont(new Font("Tahoma", Font.BOLD, 10));
        l5.setBounds(115, 0, 600, 30);
        p2.add(l5);
        
         l6 = new JLabel("language. The main objective of this system, is to reduce the consumption of time during maintaining  ");
        l6.setForeground(Color.black);
         l6.setFont(new Font("Tahoma", Font.BOLD, 10));
        l6.setBounds(115, 10, 600, 30);
        p2.add(l6);
        
         l7 = new JLabel("the records of Hardware management.  Separate divisions are provide to maintain the records of ");
        l7.setForeground(Color.black);
         l7.setFont(new Font("Tahoma", Font.BOLD, 10));
        l7.setBounds(115, 20, 600, 30);
        p2.add(l7);
        
         l8= new JLabel("each Hardware. In other words, our HMS has following objectives :  Simple database  is maintained.");
        l8.setForeground(Color.black);
         l8.setFont(new Font("Tahoma", Font.BOLD, 10));
        l8.setBounds(115, 30, 600, 30);
        p2.add(l8);
        
        l9= new JLabel(" Easy operations for the operator of the system.  User interfaces are user friendly and attractive.");
        l9.setForeground(Color.black);
         l9.setFont(new Font("Tahoma", Font.BOLD, 10));
        l9.setBounds(115, 40, 600, 30);
        p2.add(l9);
        
        t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(8000);
            this.setVisible(false);
            
            Login l = new Login();
            l.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

