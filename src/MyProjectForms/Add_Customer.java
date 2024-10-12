package MyProjectForms;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Add_Customer extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JTextField Tf1,Tf2,Tf3,Tf4,Tf5,Tf6,Tf7,Tf8,Tf9,Tf10;
    Choice ch1,ch2,ch3,ch4,ch5;
    JButton btn1,btn2,btn3,btn4;
    JPanel p1,p2,p3;

    Font f1,f2;

    Add_Customer()
    {
        super("Add customer");
        setBounds(350,50,750,700);
        setResizable(false);

        ImageIcon img_c = new ImageIcon(ClassLoader.getSystemResource("MyProjectForms/Icons/Gym_Trainer_blur.jpg"));
        Image img = img_c.getImage().getScaledInstance(750,700,Image.SCALE_DEFAULT);
        l15 = new JLabel(new ImageIcon(img));

        f1 = new Font("Lucida Fax",Font.BOLD,30);
        f2 = new Font("MS UI Gothic",Font.BOLD,20);

        l1 = new JLabel("Name");
        l2 = new JLabel("Father's name");
        l3 = new JLabel("Email");
        l4 = new JLabel("Address");
        l5 = new JLabel("Contact no");
        l6 = new JLabel("Emergency no");
        l7 = new JLabel("Membership Category");
        l8 = new JLabel("Trainer ID");
        l9 = new JLabel("Min agreement");
        l10 = new JLabel("Gender");
        l11 = new JLabel("Height (inches)");
        l12 = new JLabel("Weight (KG)");
        l13 = new JLabel("Remarks");
        l14 = new JLabel("CUSTOMER SIGNUP");
        l17 = new JLabel("Trainer name");

        l14.setFont(f1);
        l14.setForeground(Color.YELLOW);
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
        ch4 = new Choice();
        ch5 = new Choice();

        ch1.add("Personal");
        ch1.add("Public");

        ch2.add("1 Month");
        ch2.add("3 Months");
        ch2.add("6 Months");
        ch2.add("12 Months");
        ch4.add("Male");
        ch4.add("Female");


        ch3.add("Male");
        ch3.add("Female");

        btn1 = new JButton("SUBMIT");
        btn2 = new JButton("CANCEL");

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
        l17.setFont(f2);

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
        ch4.setFont(f2);
        ch5.setFont(f2);

        //set font of button text 1 and 2
        btn1.setFont(f2);
        btn2.setFont(f2);

        // 3rd and 4th button
        btn3 = new JButton("Public");
        btn4 = new JButton("Personal");
        btn3.setFont(f2);
        btn4.setFont(f2);

        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.white);
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.white);

        btn3.addActionListener(this);
        btn4.addActionListener(this);


        p1 = new JPanel();
        p1.setLayout(new GridLayout(15,2,15,15));

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

        p1.add(l8);
        p1.add(Tf7);
        p1.add(l9);
        p1.add(ch2);
        p1.add(l10);
        p1.add(ch4);
        p1.add(l11);
        p1.add(Tf8); // Float
        p1.add(l12);
        p1.add(Tf9); // Float
        p1.add(l13);
        p1.add(Tf10);
        p1.add(btn3);
        p1.add(btn4);
        p1.add(l7);
        p1.add(ch1);
        p1.add(l17);
        p1.add(ch5);
        //p1.add(Tf6);

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
        l17.setForeground(Color.WHITE);
        setLayout(new BorderLayout(0,0));

        p2.setBounds(100,0,500,100);
        p1.setBounds(150,120,400,500);

        p1.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
        p2.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));

        l15.add(p2);
        l15.add(p1);
        add(l15);


    }

    public void actionPerformed(ActionEvent e)
    {
        try {

            if (e.getSource() == btn3) {
                ConnectionClass obj1 = new ConnectionClass();
                String q1 = "Select name from add_trainer where tr_cate = 'Public'";
                ResultSet rest1 = obj1.stm.executeQuery(q1);
                while (rest1.next()) {
                    String s1 = rest1.getString("name");
                    ch5.add(s1);
                }
            }

            if (e.getSource() == btn4)
            {
                ConnectionClass obj1 = new ConnectionClass();
                String q1 = "Select name from add_trainer where tr_cate = 'Personal'";
                ResultSet rest1 = obj1.stm.executeQuery(q1);// while extraction of data use executeQuery
                while (rest1.next()) {
                    String s1 = rest1.getString("name");
                    ch5.add(s1);
                }
            }

            String name = Tf1.getText();
            String fath_name = Tf2.getText();
            String email = Tf3.getText();
            String address = Tf4.getText();
            String cont = Tf5.getText();
            String tr_cate = ch1.getSelectedItem();  // trainer category
            String tr_name = ch5.getSelectedItem();
            //String tr_name = Tf6.getText();
            int id = Integer.parseInt(Tf7.getText());
            String m_agr = ch2.getSelectedItem();  // min aggrement
            String gender = ch4.getSelectedItem();
            float height = Float.parseFloat(Tf8.getText());
            float weight = Float.parseFloat(Tf9.getText());
            String remarks = Tf10.getText();

            // button 1 and 2
            if (e.getSource() == btn1) {

                ConnectionClass obj1 = new ConnectionClass();
                String q1 = "Insert into add_customer values('"+id+"','"+name+"','"+fath_name+"','"+email+"','"+address+"','"+cont+"','"+tr_name+"','"+tr_cate+"','"+m_agr+"','"+gender+"','"+height+"','"+weight+"','"+remarks+"')";
                obj1.stm.executeUpdate(q1);  // executeUpdate while submiting values
                JOptionPane.showMessageDialog(null, "Data Insert.....");
                setVisible(false);
            }
        }


        catch (Exception ex)
        {
            ex.printStackTrace();
        }





        if(e.getSource() == btn2)
        {
            JOptionPane.showMessageDialog(null,"Are you Sure?");
            setVisible(false);
        }
    }

    public static void main(String args[])
    {
        new Add_Customer().setVisible(true);
    }

}
