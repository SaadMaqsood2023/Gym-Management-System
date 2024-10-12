package MyProjectForms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.lang.Class;

public class Add_Trainer extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField Tf1,Tf2,Tf3,Tf4,Tf5,Tf6,Tf7,Tf8,Tf9,Tf10;
    Choice ch1,ch2,ch3;
    JButton btn1,btn2;
    JPanel p1,p2,p3;
    Font f1,f2;
    Add_Trainer()
    {
        setTitle("Add Trainer");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(750, 700);
        setResizable(false);
        setLocation(350,70);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("MyProjectForms/Icons/Gym_Trainer_blur.jpg"));
        Image img_size = img.getImage().getScaledInstance(750, 700, Image.SCALE_DEFAULT);
        l15 = new JLabel(new ImageIcon(img_size));


        f1 = new Font("Lucida Fax",Font.BOLD,30);
        f2 = new Font("MS UI Gothic",Font.BOLD,20);

        l1 = new JLabel("Name");
        l2 = new JLabel("Father's name");
        l3 = new JLabel("Email");
        l4 = new JLabel("Address");
        l5 = new JLabel("Contact no");
        l6 = new JLabel("Emergency no");
        l7 = new JLabel("Trainer Category");
        l8 = new JLabel("Trainer ID");
        l9 = new JLabel("Min agreement");
        l10 = new JLabel("Gender");
        l11 = new JLabel("Height (inches)");
        l12 = new JLabel("Weight (KG)");
        l13 = new JLabel("Remarks");
        l14 = new JLabel("TRAINER SIGNUP");

        l14.setFont(f1);
        l14.setForeground(Color.yellow);
        l14.setHorizontalAlignment(JLabel.CENTER);

        Tf1 = new JTextField();
        Tf2 = new JTextField();
        Tf3 = new JTextField();
        Tf4 = new JTextField();
        Tf5 = new JTextField();
        Tf6 = new JTextField();
        Tf7 = new JTextField();
        Tf8 = new JTextField();
        Tf9 = new JTextField();
        Tf10 = new JTextField();

        ch1 = new Choice();
        ch2 = new Choice();
        ch3 = new Choice();

        ch1.add("Public");
        ch1.add("Personal");

        ch2.add("3 Months");
        ch2.add("6 Months");
        ch2.add("1 Year");
        ch2.add("2 Years");
        ch2.add("3 Years");

        ch3.add("Male");
        ch3.add("Female");

        //buttons
        btn1 = new JButton("SUBMIT");
        btn2 = new JButton("CANCEL");
        btn1.setSize(100,100);
        btn2.setSize(100,100);

        //background color and writing color
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.CYAN);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.RED);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        //set font of labels
        l1.setFont(f2);
        l2.setFont(f2);
        l3.setFont(f2);
        l4.setFont(f2);
        l5.setFont(f2);
        l6.setFont(f2);
        l7.setFont(f2);
        l8.setFont(f2);
        l9.setFont(f2);
        l10.setFont(f2);
        l11.setFont(f2);
        l12.setFont(f2);
        l13.setFont(f2);

        //set font of textfields
        Tf1.setFont(f2);
        Tf2.setFont(f2);
        Tf3.setFont(f2);
        Tf4.setFont(f2);
        Tf5.setFont(f2);
        Tf6.setFont(f2);
        Tf7.setFont(f2);
        Tf8.setFont(f2);
        Tf9.setFont(f2);
        Tf10.setFont(f2);

        //set font of choice
        ch1.setFont(f2);
        ch2.setFont(f2);
        ch3.setFont(f2);

        //set font of button text
        btn1.setFont(f2);
        btn2.setFont(f2);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(14,2,15,15));

        //add labels, textfields and buttons to the panel
        p1.add(l1);
        p1.add(Tf1);
        p1.add(l2);
        p1.add(Tf2);
        p1.add(l3);
        p1.add(Tf3);
        p1.add(l4);
        p1.add(Tf4);
        p1.add(l5);
        p1.add(Tf5);
        p1.add(l6);
        p1.add(Tf6);
        p1.add(l7);
        p1.add(ch1);
        p1.add(l8);
        p1.add(Tf7);
        p1.add(l9);
        p1.add(ch2);
        p1.add(l10);
        p1.add(ch3);
        p1.add(l11);
        p1.add(Tf8);
        p1.add(l12);
        p1.add(Tf9);
        p1.add(l13);
        p1.add(Tf10);

        p1.add(btn1);
        p1.add(btn2);

        p1.setBackground(Color.BLACK);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,1,10,10));
        p2.setBackground(Color.BLACK);
        p2.add(l14);

        /*p3 = new JPanel();
        p3.setLayout(new GridLayout(1,1,10,10));
        p3.setBackground(Color.BLACK);
        p3.add(l15);*/

        //set the writing of the label
        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.WHITE);
        l5.setForeground(Color.WHITE);
        l6.setForeground(Color.WHITE);
        l7.setForeground(Color.WHITE);
        l8.setForeground(Color.WHITE);
        l9.setForeground(Color.WHITE);
        l10.setForeground(Color.WHITE);
        l11.setForeground(Color.WHITE);
        l12.setForeground(Color.WHITE);
        l13.setForeground(Color.WHITE);

        Tf6.setForeground(Color.RED);

        setLayout(new BorderLayout(0,0));

        p2.setBounds(200,0,300,100);
        p1.setBounds(150,120,400,500);

        p1.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
        p2.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));

        l15.add(p2);
        l15.add(p1);
        add(l15);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
        {
            String name = Tf1.getText();
            String fath_name = Tf2.getText();
            String email = Tf3.getText();
            String address = Tf4.getText();
            String cont = Tf5.getText();
            String emergency_con = Tf6.getText();
            String tr_cate = ch1.getSelectedItem();  // trainer category
            int tr_id  = Integer.parseInt(Tf7.getText());
            String m_agr = ch2.getSelectedItem();  // min aggrement
            String  gender = ch3.getSelectedItem();
            float height = Float.parseFloat(Tf8.getText());
            float weight = Float.parseFloat(Tf9.getText());
            String remarks = Tf10.getText();

            try
            {
                ConnectionClass obj = new ConnectionClass();
                String q = "insert into add_trainer values('"+tr_id+"','"+name+"','"+fath_name+"','"+email+"','"+address+"','"+cont+"','"+emergency_con+"','"+tr_cate+"','"+m_agr+"','"+gender+"','"+height+"','"+weight+"','"+remarks+"')";
                obj.stm.executeUpdate(q); // use execute update while submiting values
                JOptionPane.showMessageDialog(null,"Data Insert.....");
                setVisible(false);
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }

        }

        if(e.getSource()==btn2)
        {
            JOptionPane.showMessageDialog(null,"Are you sure");
            setVisible(false);
        }
    }

    public static void main(String args[])
    {
        new Add_Trainer().setVisible(true);
    }
}

