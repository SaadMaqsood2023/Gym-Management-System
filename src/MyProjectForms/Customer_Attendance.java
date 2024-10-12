package MyProjectForms;

import MyProjectForms.ConnectionClass;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
public class Customer_Attendance extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5;
    Choice ch1,ch2,ch3;
    Font f1,f2;
    JButton btn1,btn2;
    JPanel p1,p2;
    Customer_Attendance()
    {
        super("Customer attendance");
        setBounds(350,50,400,250);
        setResizable(false);

        Font f1 = new Font("Lucida Fax",Font.BOLD,25);
        Font f2 = new Font("MS UI Gothic",Font.BOLD,18);

        l1 = new JLabel("Customer Id");
        l2 = new JLabel("Morning Time");
        l3 = new JLabel("Evening Time");
        l4 = new JLabel("Customer Attendance");

        l1.setForeground(Color.white);
        l2.setForeground(Color.white);
        l3.setForeground(Color.white);
        l4.setForeground(Color.yellow);

        l4.setFont(f1);
        l4.setHorizontalAlignment(JLabel.CENTER);

        l1.setFont(f2);
        l2.setFont(f2);
        l3.setFont(f2);

        ch1 = new Choice();
        ch2 = new Choice();
        ch3 = new Choice();

        ch1.add("Absent");
        ch1.add("Present");

        ch2.add("Absent");
        ch2.add("Present");

        ch3 = new Choice();


        try
        {
            ConnectionClass obj = new ConnectionClass();
            String q1 ="Select id from add_customer";
            ResultSet rest = obj.stm.executeQuery(q1);
            while(rest.next())
            {
                String s1 = rest.getString("id");
                ch3.add(s1);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        ch1.setFont(f2);
        ch2.setFont(f2);
        ch3.setFont(f2);

        // my buttons
        btn1 = new JButton("Submit");
        btn2 = new JButton("Cancel");

        // background and text color
        btn1.setBackground(Color.BLACK);
        btn2.setBackground(Color.BLACK);
        btn1.setForeground(Color.CYAN);
        btn2.setForeground(Color.RED);

        // font
        btn1.setFont(f2);
        btn2.setFont(f2);

        // add action listener of buttons otherwise it won't implement
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(4,2,10,10));
        p1.add(l1);
        p1.add(ch3);
        p1.add(l2);
        p1.add(ch1);
        p1.add(l3);
        p1.add(ch2);
        p1.add(btn1);
        p1.add(btn2);

        p1.setBackground(Color.BLACK);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,1,10,10));
        p2.setBackground(Color.BLACK);

        setLayout(new BorderLayout(0,0));
        add(p2,"North");
        add(p1,"Center");

        //check font,text color and background color of every thing
        //Also check everything is included in the panel
        //And all panels are added to the frame


    }

    public void actionPerformed(ActionEvent e)
    {
        String id = ch3.getSelectedItem();
        String morn_atn = ch1.getSelectedItem();
        String aft_atn = ch2.getSelectedItem();
        String date = new java.util.Date().toString(); // todays date
        try
        {

            if (e.getSource() == btn1) {
                ConnectionClass obj1 = new ConnectionClass();
                String q1 = "Insert into customer_attend values ('"+id+"','"+morn_atn+"','"+aft_atn+"','"+date+"') ";
                obj1.stm.executeUpdate(q1);
                JOptionPane.showMessageDialog(null, "Data Insert.....");
                setVisible(false);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        if(e.getSource() == btn2)
        {
            JOptionPane.showMessageDialog(null,"Are you Sure");
            setVisible(false);
        }
    }

    public static void main(String args[])
    {
        new Customer_Attendance().setVisible(true);
    }

}

