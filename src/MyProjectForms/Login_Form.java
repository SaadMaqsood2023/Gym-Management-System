package MyProjectForms;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextField;


public class Login_Form extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7; // l5 is title label
    JTextField Tf1;
    JPasswordField Pf1;
    JButton btn1,btn2;
    JPanel p1,p3;
    Font f,f1,f3;

    Login_Form()
    {
        l5 = new JLabel("Login Page");
        l5.setFont(f);
        setTitle(l5.getText());
        setResizable(false);
        setLocation(150,100);
        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon ic16 = new ImageIcon(ClassLoader.getSystemResource("MyProjectForms/Icons/Gym_Login_Image.jpg"));
        Image img15 = ic16.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ImageIcon icon_img =new ImageIcon(img15);
        setIconImage(icon_img.getImage());

        f = new Font("Arial",Font.BOLD,40);
        f1 = new Font("Arial",Font.BOLD,15);
        f3 = new Font("Arial",Font.BOLD+Font.ITALIC,50);

        l1 = new JLabel("LOGIN");
        l2 = new JLabel("    Username : ");
        l3 = new JLabel("    Password : ");

        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);

        l1.setVisible(true);

        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);

        Tf1 = new JTextField();
        Pf1 = new JPasswordField();

        Tf1.setFont(f1);
        Pf1.setFont(f1);

        Tf1.setBorder(BorderFactory.createEmptyBorder());
        Pf1.setBorder(BorderFactory.createEmptyBorder());

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("MyProjectForms/Icons/Pict.jpg"));
        Image img2 = img.getImage().getScaledInstance(600,500,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        l4 = new JLabel(img3);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("MyProjectForms/Icons/logo.jpg"));
        Image it1 = img1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon if1 = new ImageIcon(it1);
        l6 = new JLabel(if1);
        l6.setBounds(100,30,200,200);
        l6.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));

       /* l7 = new JLabel("ABSS GYM");
        l7.setFont(f3);
        l7.setForeground(Color.LIGHT_GRAY);
        l7.setBounds(75,0,300,200);*/

        btn1 = new JButton("LOGIN");
        btn2 = new JButton("CANCEL");
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        btn1.setBackground(Color.BLACK);
        btn2.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn2.setForeground(Color.WHITE);
        btn1.setFont(f1);
        btn2.setFont(f1);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(3,2,20,20));
        p1.add(l2);
        p1.add(Tf1);
        p1.add(l3);
        p1.add(Pf1);
        p1.add(btn1);
        p1.add(btn2);

        p1.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));

        l1.setBounds(50,130,300,200);
        p1.setBounds(50,300,300,100);

        l4.add(p1);
        l4.add(l1);

        //l4.add(l7);
        l4.add(l6);
        setLayout(new BorderLayout(0,0));

        add(l4);

    }

    public void actionPerformed(ActionEvent e)
    {
        String name = Tf1.getText();
        String pass = Pf1.getText();
        if(e.getSource()==btn1 )
        {
            try
            {
                ConnectionClass obj = new ConnectionClass();
                String q = "select * from login_form_info where name = '"+name+"' and pass = '"+pass+"'";
                ResultSet rest = obj.stm.executeQuery(q);
                if(rest.next())
                {
                    new Home_page().setVisible(true);
                    this.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Are you sure ?");
                    this.setVisible(false);
                }
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        if(e.getSource()==btn2)
        {
            JOptionPane.showMessageDialog(null,"Are you sure to cancel ?");
            this.setVisible(false);
        }

    }

    public static void main(String args[])
    {
        new Login_Form().setVisible(true);
    }

}

