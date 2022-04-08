package javaapplication1;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Billing1 extends JFrame implements ActionListener {
    JTextArea ta1,ta2;
    JPanel p1, p2;
    JLabel l1, l2, l4, l3, l5, l6,l7;
    JButton b1, b2, b3, b4;
    Choice c1;
    JTextField tf1, tf2, tf3, tf4, tf5,tf6;
    JTable t1;
    Billing1() {
        setBounds(-10, 0, 1950, 1050);

        p1 = new JPanel(new BorderLayout());
        p1.setBackground(Color.DARK_GRAY);
        p1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                "Billings", TitledBorder.CENTER, TitledBorder.TOP));
        TitledBorder titledBorder = (TitledBorder) p1.getBorder();
        titledBorder.setTitleColor(Color.white);

        l1 = new JLabel("Id:");
        l1.setForeground(Color.white);
        l1.setBounds(520, 60, 150, 20);
        l1.setFont(new Font("Thoma", Font.LAYOUT_NO_LIMIT_CONTEXT, 25));
        p1.add(l1, BorderLayout.AFTER_LINE_ENDS);

        l2 = new JLabel("Item Name:");
        l2.setForeground(Color.white);
        l2.setBounds(780, 60, 150, 20);
        l2.setFont(new Font("Thoma", Font.LAYOUT_NO_LIMIT_CONTEXT, 25));
        p1.add(l2, BorderLayout.AFTER_LINE_ENDS);

        l3 = new JLabel("Qantity:");
        l3.setForeground(Color.white);
        l3.setBounds(1090, 60, 150, 30);
        l3.setFont(new Font("Thoma", Font.LAYOUT_NO_LIMIT_CONTEXT, 25));
        p1.add(l3, BorderLayout.AFTER_LINE_ENDS);

        l4 = new JLabel("Price:");
        l4.setForeground(Color.white);
        l4.setBounds(500, 200, 150, 20);
        l4.setFont(new Font("Thoma", Font.LAYOUT_NO_LIMIT_CONTEXT, 25));
        p1.add(l4, BorderLayout.AFTER_LINE_ENDS);

        l5 = new JLabel("Tottal Price:");
        l5.setForeground(Color.white);
        l5.setBounds(780, 200, 150, 20);
        l5.setFont(new Font("Thoma", Font.LAYOUT_NO_LIMIT_CONTEXT, 25));
        p1.add(l5, BorderLayout.AFTER_LINE_ENDS);
        
         l6 = new JLabel("Text Field:");
        l6.setForeground(Color.white);
        l6.setBounds(780, 350, 150, 20);
        l6.setFont(new Font("Thoma", Font.LAYOUT_NO_LIMIT_CONTEXT, 25));
        p1.add(l6, BorderLayout.AFTER_LINE_ENDS);
        

        tf1 = new JTextField();
        tf1.setBounds(600, 60, 150, 40);
        tf1.setForeground(Color.black);
        tf1.setFont(new Font("Thoma", Font.LAYOUT_LEFT_TO_RIGHT, 26));
        p1.add(tf1, BorderLayout.AFTER_LINE_ENDS);

        tf2 = new JTextField();
        tf2.setBounds(910, 60, 150, 40);
        tf2.setForeground(Color.black);
        tf2.setFont(new Font("Thoma", Font.LAYOUT_LEFT_TO_RIGHT, 26));
        p1.add(tf2, BorderLayout.AFTER_LINE_ENDS);

        tf3 = new JTextField();
        tf3.setBounds(1190, 60, 150, 40);
        tf3.setForeground(Color.black);
        tf3.setFont(new Font("Thoma", Font.LAYOUT_LEFT_TO_RIGHT, 26));
        p1.add(tf3, BorderLayout.AFTER_LINE_ENDS);

        tf4 = new JTextField();
        tf4.setBounds(600, 200, 150, 40);
        tf4.setForeground(Color.black);
        tf4.setFont(new Font("Thoma", Font.LAYOUT_LEFT_TO_RIGHT, 26));
        p1.add(tf4, BorderLayout.AFTER_LINE_ENDS);

        tf5 = new JTextField();
        tf5.setBounds(920, 200, 150, 40);
        tf5.setForeground(Color.black);
        tf5.setFont(new Font("Thoma", Font.LAYOUT_LEFT_TO_RIGHT, 26));
        p1.add(tf5, BorderLayout.AFTER_LINE_ENDS);
        
         tf6 = new JTextField();
        tf6.setBounds(920, 350, 150, 40);
        tf6.setForeground(Color.black);
        tf6.setFont(new Font("Thoma", Font.LAYOUT_LEFT_TO_RIGHT, 26));
        p1.add(tf6, BorderLayout.AFTER_LINE_ENDS);

        b1 = new JButton("Add In List");
        b1.setFont(new Font("Thoma", Font.PLAIN, 20));
        b1.setBounds(1190, 200, 150, 50);
        b1.setForeground(Color.white);
        b1.setBackground(Color.blue);
        p1.add(b1, BorderLayout.AFTER_LINE_ENDS);
        
        b3 = new JButton("Search");
        b3.setBounds(1200, 350, 150, 45);
        b3.setBackground(Color.blue);
        b3.setFont(new Font("Tahoma", Font.BOLD, 20));
        b3.setForeground(Color.WHITE);
        p1.add(b3, BorderLayout.AFTER_LINE_ENDS);
        
         b4 = new JButton("Back to home");
        b4.setBounds(1200, 700, 150, 40);
        b4.setBackground(Color.BLUE);
        b4.setFont(new Font("Tahoma", Font.BOLD, 20));
        b4.setForeground(Color.WHITE);
        p1.add(b4, BorderLayout.AFTER_LINE_ENDS); 
        
         c1 = new Choice();
        c1.add("search by");
        c1.add("number");
        c1.add("item name");
        c1.add("quatity");
        c1.add("price");
        c1.setBounds(540, 350, 150, 60);
        p1.add(c1,BorderLayout.AFTER_LINE_ENDS);
       
              try {
            connectionClass c1 = new connectionClass();
            String s1 = "select * from stock";
            String x[] = {"No.", "Item Name", "Price", "Piece", "Total Price"};     
            String y[][] = new String[40][8];
            int i = 0, j = 0;
            ResultSet rs = c1.s.executeQuery(s1);
            while (rs.next()) {
                y[i][j++] = rs.getString("no");
                y[i][j++] = rs.getString("itemname");
                y[i][j++] = rs.getString("price");
                y[i][j++] = rs.getString("piece");
                y[i][j++] = rs.getString("totalprice");
                i++;
                j = 0;
            }
            t1 = new JTable(y, x);
            t1.setSize(400, 400);

        } catch (Exception e) {
            e.printStackTrace();
        }

        b2 = new JButton("Print");
        add(b2, "South");
        t1.setSize(400, 400);
        p1.add(new JScrollPane(t1), BorderLayout.BEFORE_LINE_BEGINS);
        
        ta1=new JTextArea();
        ta1.setSize(480,1000);
        ta1.setBounds(1415, 15, 500, 950);
        ta1.setBackground(Color.black);
        ta1.setForeground(Color.white);
        p1.add(ta1,BorderLayout.AFTER_LINE_ENDS);
        
        ta2=new JTextArea();
        ta2.setSize(500,1050);
        ta2.setBackground(Color.black);
        ta2.setForeground(Color.white);
        p1.add(ta2,BorderLayout.AFTER_LINE_ENDS);
        
        add(p1);
          b1.addActionListener(this); 
          b2.addActionListener(this);
          b3.addActionListener(this);
          b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Back to home")) {
            this.setVisible(false);
        }
        else if(msg.equals("Print")){
        try {
            t1.print();
        } catch (Exception e) {
        }
        }else if (msg.equals("Search")) {
            try {
                connectionClass c = new connectionClass();
                String a = tf6.getText();
                String searchBy = c1.getSelectedItem();
                String q = null;
                if (searchBy.equals("number")) {
                    q = "select * from stock where no = '" + a + "'";
                } else if (searchBy.equals("item name")) {
                    q = "select * from stock where itemname = '" + a + "'";
                } else if (searchBy.equals("quatity")) {
                    q = "select * from stock where piece = '" + a + "'";
                } else if (searchBy.equals("price")) {
                    q = "select * from stock where price = '" + a + "'";
                }
                ResultSet rs = c.s.executeQuery(q);
                if (rs.next()) {
                    String s1 = rs.getString("no");
                    String s2 = rs.getString("itemname");
                    String s3 = rs.getString("piece");
                    String s4 = rs.getString("price");
                    String s5 = rs.getString("totalprice");
                    tf1.setText(s1);
                    tf2.setText(s2);
                    tf3.setText(s3);
                    tf4.setText(s4);
                    tf5.setText(s5);
                    tf6.setText("");
                }

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("error: " + e);
            }
           }else if(msg.equals("Add In List")){
                String gt1 = tf1.getText();
                String gt2 = tf2.getText();
                String gt3 = tf3.getText();
                String gt4 = tf4.getText();
                String gt5 = tf5.getText();
                
                    ta1.setText(gt1);
                   ta1.setText(gt2);
                    ta1.setText(gt4);
                    ta1.setText(gt5);
                    
                   // tf1.setText("");
                   // tf2.setText("");
                   // tf3.setText("");
                   // tf4.setText("");
                   // tf5.setText("");
                    
       }
    }

    public static void main(String[] args) {
        new Billing1().setVisible(true);
    }
}
