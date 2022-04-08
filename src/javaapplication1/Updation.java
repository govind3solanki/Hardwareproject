package javaapplication1;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;

public class Updation extends JFrame implements ActionListener {

    JPanel p1, p2, p3;
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JButton b1, b2, b3, b4, b5, b6;
    Choice c1;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;

    Updation() {
        setBounds(-10, 0, 1950, 1050);
        p1 = new JPanel();
        p1.setBounds(-10, 0, 1950, 1050);
        p1.setLayout(null);
        p1.setBackground(Color.DARK_GRAY);
        p1.setForeground(new Color(34, 139, 34));
        add(p1);

        p2 = new JPanel();
        p2.setBounds(10, 120, 930, 1030);
        p2.setLayout(null);
        p2.setBackground(Color.GRAY);
        p2.setForeground(new Color(34, 139, 34));
        p1.add(p2);

        p3 = new JPanel();
        p3.setBounds(975, 120, 935, 1030);
        p3.setLayout(null);
        p3.setBackground(Color.LIGHT_GRAY);
        p3.setForeground(new Color(34, 139, 34));
        p1.add(p3);

        l1 = new JLabel("Item Name : ");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahoma", Font.BOLD, 18));
        l1.setBounds(330, 60, 150, 40);
        p2.add(l1);

        l2 = new JLabel("Price : ");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma", Font.BOLD, 18));
        l2.setBounds(630, 60, 100, 40);
        p2.add(l2);

        l3 = new JLabel("Qantity :");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Tahoma", Font.BOLD, 18));
        l3.setBounds(100, 200, 150, 40);
        p2.add(l3);

        l4 = new JLabel("No. : ");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Tahoma", Font.BOLD, 18));
        l4.setBounds(100, 60, 100, 40);
        p2.add(l4);

        l5 = new JLabel("Update Stock  ");
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Tahoma", Font.BOLD, 30));
        l5.setBounds(850, 50, 300, 40);
        p1.add(l5);

        l7 = new JLabel("Text Field:");
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Tahoma", Font.BOLD, 18));
        l7.setBounds(300, 500, 100, 40);
        p2.add(l7);

        tf1 = new JTextField();
        tf1.setBounds(150, 60, 150, 30);
        p2.add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(450, 60, 150, 30);
        p2.add(tf2);
        tf3 = new JTextField();
        tf3.setBounds(690, 60, 150, 30);
        p2.add(tf3);
        tf4 = new JTextField();
        tf4.setBounds(180, 200, 150, 30);
        p2.add(tf4);
        tf5 = new JTextField();
        tf5.setBounds(600, 200, 150, 30);
        p2.add(tf5);
        tf6 = new JTextField();
        tf6.setBounds(400, 500, 150, 30);
        p2.add(tf6);

        b1 = new JButton("Add Item");
        b1.setBounds(100, 340, 150, 40);
        b1.setBackground(Color.BLUE);
        b1.setFont(new Font("Tahoma", Font.BOLD, 20));
        b1.setForeground(Color.WHITE);
        p2.add(b1);

        b2 = new JButton("Edit");
        b2.setBounds(390, 340, 150, 40);
        b2.setBackground(Color.BLUE);
        b2.setFont(new Font("Tahoma", Font.BOLD, 20));
        b2.setForeground(Color.WHITE);
        p2.add(b2);

        b3 = new JButton("delete");
        b3.setBounds(680, 340, 150, 40);
        b3.setBackground(Color.BLUE);
        b3.setFont(new Font("Tahoma", Font.BOLD, 20));
        b3.setForeground(Color.WHITE);
        p2.add(b3);

        b4 = new JButton("Back to home");
        b4.setBounds(680, 700, 150, 40);
        b4.setBackground(Color.BLUE);
        b4.setFont(new Font("Tahoma", Font.BOLD, 20));
        b4.setForeground(Color.WHITE);
        p2.add(b4);

        b5 = new JButton("Search");
        b5.setBounds(680, 500, 150, 40);
        b5.setBackground(Color.blue);
        b5.setFont(new Font("Tahoma", Font.BOLD, 20));
        b5.setForeground(Color.WHITE);
        p2.add(b5);

        b6 = new JButton("Tottal Price");
        b6.setForeground(Color.WHITE);
        b6.setBackground(Color.blue);
        b6.setFont(new Font("Tahoma", Font.BOLD, 18));
        b6.setBounds(400, 200, 150, 40);
        p2.add(b6);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

        c1 = new Choice();
        c1.add("search by");
        c1.add("number");
        c1.add("item name");
        c1.add("quatity");
        c1.add("price");
        c1.setBounds(100, 500, 150, 60);
        p2.add(c1);

        connectionClass c = new connectionClass();
        ResultSet rs;
        try {
            rs = c.s.executeQuery("select max(no) from stock");
            rs.next();
            if (rs.getString("max(no)") == null) {
                tf1.setText("00001");
            } else {
                Long no = Long.parseLong(rs.getString("max(no)").substring(0, rs.getString("max(no)").length()));
                no++;
                tf1.setText("00" + String.format("%03d", no));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Updation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Back to home")) {
            this.setVisible(false);
        } else if (msg.equals("Add Item")) {
            try {
                connectionClass c = new connectionClass();
                String a = tf1.getText();
                String b = tf2.getText();
                String c2 = tf3.getText();
                String d = tf4.getText();
                String e2 = tf5.getText();
                String str = null;
                str = "insert into stock values('" + a + "', '" + b + "', '" + c2 + "', '" + d + "', '" + e2 + "')";

                try {
                    c.s.executeUpdate(str);
                } catch (SQLException ex) {
                    Logger.getLogger(Updation.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Item successfully inserted.");

            } catch (HeadlessException e) {
            }
            connectionClass c = new connectionClass();
            ResultSet rs;
            try {
                rs = c.s.executeQuery("select max(no) from stock");
                rs.next();
                if (rs.getString("max(no)") == null) {
                    tf1.setText("00001");
                } else {
                    Long no = Long.parseLong(rs.getString("max(no)").substring(0, rs.getString("max(no)").length()));
                    no++;
                    tf1.setText("00" + String.format("%03d", no));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Updation.class.getName()).log(Level.SEVERE, null, ex);
            }

            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
        } else if (msg.equals("Tottal Price")) {
            try {
                if (tf2.getText() != null && tf3.getText() != null && tf4.getText() != null) {
                    int p = Integer.parseInt(tf3.getText().trim());
                    int q = Integer.parseInt(tf4.getText().trim());
                    int tp = p * q;
                    tf5.setText(String.valueOf(tp));
                }
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Invalid text enterd");

            }
        } else if (msg.equals("Search")) {
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
                }

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("error: " + e);
            }
        } else if (msg.equals("delete")) {
            try {
                connectionClass c = new connectionClass();
                String a2 = tf1.getText();
                String b21 = tf2.getText();
                String c3 = tf3.getText();
                String d2 = tf4.getText();
                String e3 = tf5.getText();
                String sql = "DELETE FROM stock WHERE no = '"+a2+"'";
                int delete = c.s.executeUpdate(sql);
                if (delete == 1) {
                    System.out.println("Row is deleted.");
                } else {
                    System.out.println("Row is not deleted.");
                }
            } catch (SQLException s) {
                System.out.println("SQL statement is not executed!");
            }
            connectionClass c = new connectionClass();
            ResultSet rs;
            try {
                rs = c.s.executeQuery("select max(no) from stock");
                rs.next();
                if (rs.getString("max(no)") == null) {
                    tf1.setText("00001");
                } else {
                    Long no = Long.parseLong(rs.getString("max(no)").substring(0, rs.getString("max(no)").length()));
                    no++;
                    tf1.setText("00" + String.format("%03d", no));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Updation.class.getName()).log(Level.SEVERE, null, ex);
            }

            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
        } 

    }

    public static void main(String args[]) {
        new Updation().setVisible(true);
    }
}




