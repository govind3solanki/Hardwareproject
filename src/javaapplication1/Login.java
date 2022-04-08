
package javaapplication1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JLabel l1,l2,l3, l4,l5;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2, b3;
    Choice c1;
    JPanel p1,p2;
    Login(){
        super("Hardware Store-MS");
        setLayout(null);
        getContentPane().setBackground(Color.DARK_GRAY);

        p1=new JPanel();
        p1.setBounds(0,0,630,50);
        p1.setBackground(Color.cyan);
        add(p1);
        
        p2=new JPanel();
        p2.setBounds(0,300,630,20);
        p2.setBackground(Color.cyan);
        add(p2);
        
        l1 = new JLabel("Username");
        l1.setForeground(Color.white);
         l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setBounds(300, 70, 100, 20);
        add(l1);
        
       
        
        l2 = new JLabel("Password");
        l2.setForeground(Color.white);
         l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(300, 110, 100, 20);
        add(l2);
        
        tf1 = new JTextField(15);
        tf1.setBounds(400, 70, 150, 20);
        add(tf1);
        pf2 = new JPasswordField(15);
        pf2.setBounds(400, 110, 150, 20);
        add(pf2);
        
        l4 = new JLabel("Logging in as");
        l4.setForeground(Color.white);
         l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(300, 150, 100, 20);
        add(l4);
        
        l5= new JLabel("Login Page");
        l5.setForeground(Color.black);
        l5.setBounds(335,0,110,30);
        l5.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(l5);
                
        c1 = new Choice();
        c1.add("Admin");
        c1.add("Customer");
        c1.setBounds(400, 150, 150, 20);
        add(c1);
        
        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i1 = ic1.getImage().getScaledInstance(16, 16,Image.SCALE_DEFAULT);
        b1 = new JButton("Login", new ImageIcon(i1));
        b1.setBounds(330, 210, 100, 20);
        add(b1);
        
        ImageIcon ic2 = new ImageIcon(ClassLoader.getSystemResource("icons/cancel.jpg"));
        Image i2 = ic2.getImage().getScaledInstance(16, 16,Image.SCALE_DEFAULT);
        b2 = new JButton("Cancel",new ImageIcon(i2));
        b2.setBounds(450, 210, 100, 20);
        add(b2);
        
        ImageIcon ic4 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i4 = ic4.getImage().getScaledInstance(16, 16,Image.SCALE_DEFAULT);
        b3 = new JButton("Signup",new ImageIcon(i4));
        b3.setBounds(380, 250, 130, 20);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


        ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("icons/second.png"));
        Image i3 = ic3.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        l3 = new JLabel(icc3);
        l3.setBounds(0, 50, 250, 250);
        add(l3);
        
        setLayout(new BorderLayout());
    
     
        setSize(640,370);
        setLocation(600,300);
        setVisible(true);
        

        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{        
                connectionClass c = new connectionClass();
                String a  = tf1.getText();
                String b  = pf2.getText();
                String user = c1.getSelectedItem();
                String q  = "select * from login2 where username = '"+a+"' and password = '"+b+"' and user = '"+user+"'";
                ResultSet rs = c.s.executeQuery(q);
                if(rs.next()){
                    new Project(user).setVisible(true);
                    this.setVisible(false);

                }else{
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    tf1.setText("");
                    pf2.setText("");
                }
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("error: "+e);
            }
        }else if(ae.getSource() == b2){
            this.setVisible(false);
        }else if(ae.getSource() == b3){
            this.setVisible(false);
            new Signup().setVisible(true);
            
        }
    }
    
    public static void main(String[] args){
        new Login().setVisible(true);
    }

    
}
