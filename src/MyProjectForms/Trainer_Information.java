package MyProjectForms;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
public class Trainer_Information extends JFrame implements ActionListener
{
    String x[] = {"Trainer ID ","Name","Father's name","Email","Address","Contact no","Emergency no","cate","min aggrement","gender","Height","Weight","Remarks" };
    JButton btn1;
    JPanel p1,p2,p3;
    JLabel l1,l2;
    JTextField Tf1;
    Font f1,f2;
    String y[][] = new String[20][13];
    int i=0,j=0;
    JTable t;
    Font f; // table font

    Trainer_Information()
    {
        super("Trainer Information");
        setBounds(50,50,1200,400);
        f = new Font("MS UI Gothic",Font.BOLD,15);

        try
        {
            ConnectionClass obj = new ConnectionClass();
            String q = "Select * from add_trainer";
            ResultSet rest = obj.stm.executeQuery(q);
            //Jvm reads database vertically
            //we will take data in a single iteration in the following way
            //jvm takes data from first row first column then first row second column then third column
            //because of i remaining same and j is increment with one
            while(rest.next())
            {
                y[i][j++]= rest.getString("tr_id");
                y[i][j++]= rest.getString("name");
                y[i][j++]= rest.getString("fath_name");
                y[i][j++]= rest.getString("email");
                y[i][j++]= rest.getString("address");
                y[i][j++]= rest.getString("cont");
                y[i][j++]= rest.getString("emergency_con");
                y[i][j++]= rest.getString("tr_cate");
                y[i][j++]= rest.getString("m_agr");
                y[i][j++]= rest.getString("gender");
                y[i][j++]= rest.getString("height");
                y[i][j++]= rest.getString("weight");
                y[i][j++]= rest.getString("remarks");
                i++;
                j=0;

            }

            t = new JTable(y,x);
            t.setFont(f);
            t.setBackground(Color.BLACK);
            t.setForeground(Color.CYAN);

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        JScrollPane sc_p = new JScrollPane(t);

        f1 = new Font("Lucida Fax",Font.BOLD,25);

        l1 = new JLabel("Delete Any Trainer");
        l1.setFont(f1);
        l1.setForeground(Color.YELLOW);
        l1.setHorizontalAlignment(JLabel.CENTER);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);

        Tf1 = new JTextField();
        Tf1.setFont(f);

        btn1 = new JButton("Delete Trainer");
        btn1.setFont(f);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.RED);

        btn1.addActionListener(this);

        l2 = new JLabel("Trainer ID");
        l2.setFont(f1);
        l2.setForeground(Color.cyan);



        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,3,10,10));
        p2.add(l2);
        p2.add(Tf1);
        p2.add(btn1);

        p3 = new JPanel();
        p3.setLayout(new GridLayout(2,1,10,10));
        p3.add(p1);
        p3.add(p2);

        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.BLACK);

        add(p3,"South");
        add(sc_p,"Center");



    }

    public void actionPerformed(ActionEvent ae)
    {
        int del_id = Integer.parseInt(Tf1.getText());

        if(ae.getSource() == btn1 )
        {
            try
            {
                ConnectionClass obj = new ConnectionClass();
                String q1 = "Delete from add_trainer where tr_id = '"+del_id+"'";
                obj.stm.executeUpdate(q1);
                setVisible(false);
                new Trainer_Information().setVisible(true);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }


    }

    public static void main(String args[])
    {
        new Trainer_Information().setVisible(true);
    }




}
