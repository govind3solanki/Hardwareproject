
package javaapplication1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
    String meter;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Project(String person){
        
        super("Hardware Store-MS");
        setSize(1920,1030);
        
        JMenuBar mb  = new JMenuBar();
        JMenu additional = new JMenu("Additional");
          JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");
         additional.setForeground(Color.BLUE);
         
          /* ---- Calender ---- */
        ut1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icons/icon12.png"));
        Image image8 = icon8.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image8));
        ut1.setMnemonic('C');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);
        
        /* ---- Calculator ---- */
        ut2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icons/icon9.png"));
        Image image9 = icon9.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image9));
        ut2.setMnemonic('X');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);
        
        /* ---- Web Browser ---- */
        ut3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icons/icon10.png"));
        Image image10 = icon10.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('W');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);
        
        
        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);
        
         additional.add(ut1);
        additional.add(ut2);
        additional.add(ut3);
        
        mb.add(additional);
         setJMenuBar(mb);
         
        /* Adding background image */
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("icons/black.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 950,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);
        
         b1=new JButton("Item Stock");
          b1.setBackground(Color.DARK_GRAY);
         b1.setFont(new Font("Tahoma", Font.BOLD, 25));
        b1.setForeground(Color.WHITE);
        b1.setBounds(500, 150, 200, 180);
       l1.add(b1);
       
         b2=new JButton("Billing");
         b2.setBackground(Color.DARK_GRAY);
         b2.setFont(new Font("Tahoma", Font.BOLD, 25));
        b2.setForeground(Color.WHITE);
        b2.setBounds(900, 150, 200, 180);
       l1.add(b2);
       
         b3=new JButton("Updation");
         b3.setBackground(Color.DARK_GRAY);
         b3.setFont(new Font("Tahoma", Font.BOLD, 25));
        b3.setForeground(Color.WHITE);
        b3.setBounds(1300, 150, 200, 180);
       l1.add(b3);
       
         b4=new JButton("Credit-debite");
         b4.setBackground(Color.DARK_GRAY);
         b4.setFont(new Font("Tahoma", Font.BOLD, 25));
        b4.setForeground(Color.WHITE);
        b4.setBounds(500, 450, 200, 180);
       l1.add(b4);
       
         b5=new JButton("Import-Export");
         b5.setBackground(Color.DARK_GRAY);
         b5.setFont(new Font("Tahoma", Font.BOLD, 25));
        b5.setForeground(Color.WHITE);
        b5.setBounds(900, 450, 200, 180);
       l1.add(b5);
       
         b6=new JButton("Tottal benefite");
         b6.setBackground(Color.DARK_GRAY);
         b6.setFont(new Font("Tahoma", Font.BOLD, 25));
        b6.setForeground(Color.WHITE);
        b6.setBounds(1300, 450, 200, 180);
       l1.add(b6);
       
         b7=new JButton("null");
         b7.setBackground(Color.DARK_GRAY);
         b7.setFont(new Font("Tahoma", Font.BOLD, 25));
        b7.setForeground(Color.WHITE);
        b7.setBounds(500, 750, 200, 180);
       l1.add(b7);
       
         b8=new JButton("null");
         b8.setBackground(Color.DARK_GRAY);
         b8.setFont(new Font("Tahoma", Font.BOLD, 25));
        b8.setForeground(Color.WHITE);
        b8.setBounds(900, 750, 200, 180);
       l1.add(b8);
       
         b9=new JButton("Exit");
         b9.setBackground(Color.DARK_GRAY);
         b9.setFont(new Font("Tahoma", Font.BOLD, 25));
        b9.setForeground(Color.WHITE);
        b9.setBounds(1300, 750, 200, 180);
        b9.setMnemonic('Z');
        l1.add(b9);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
       
        
    }

    
     public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
    if(msg.equals("Exit")){
            this.setVisible(false);
            new Login().setVisible(true);
        }
    else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Item Stock")){
        new Stock().setVisible(true);
        }else if(msg.equals("Updation")){
        new Updation().setVisible(true);
        }else if(msg.equals("Billing")){
        new Billing1().setVisible(true);
        }
     }
    public static void main(String[] args){
        new Project("").setVisible(true);
    }

    
}