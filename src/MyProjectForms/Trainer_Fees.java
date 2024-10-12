package MyProjectForms;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Trainer_Fees extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6;
    JButton bt1,bt2;
    Choice ch1,ch2;
    JTextField tf1,tf2,tf3;
    JPanel p1,p2,p3;

    Trainer_Fees()
    {
        super("trainer fees");
        setSize(670,300);
        setLocation(270,250);
        setResizable(false);
        Font f= new Font ("MS UI Gothic",Font.BOLD,18);
        Font f1= new Font ("MS UI Gothic",Font.BOLD,25);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("MyProjectForms/Icons/Gym_Trainer_img.jpg"));
        Image im = img.getImage().getScaledInstance(100,200,Image.SCALE_DEFAULT);

        l6= new JLabel (new ImageIcon(im));
        l1=new JLabel ("Trainer ID");
        l2=new JLabel("Name");
        l3=new JLabel("Category");
        l4=new JLabel("Charge fees per client");
        l5=new JLabel("Trainer Fees");
        l5.setFont(f1);
        l5.setHorizontalAlignment(JLabel.CENTER);

        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();

        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);

        tf1.setFont(f);
        tf2.setFont(f);
        tf3.setFont(f);

        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.WHITE);
        l5.setForeground(Color.YELLOW);

        ch1 = new Choice();
        try
        {
            ConnectionClass obj=new ConnectionClass();
            String q = "select tr_id from add_trainer";
            ResultSet rest = obj.stm.executeQuery(q);
            while(rest.next())
            {
                String s1 = rest.getString("tr_id");
                ch1.add(s1);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        ch1.setFont(f);
        bt1=new JButton("Submit");
        bt2=new JButton("Cancel");

        bt1.setFont(f);
        bt2.setFont(f);

        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.CYAN);
        bt2.setBackground(Color.BLACK);
        bt2.setForeground(Color.RED);

        bt1.addActionListener(this);
        bt2.addActionListener(this);

        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l5);

        p2=new JPanel();
        p2.setLayout(new GridLayout(5,2,10,10));
        p2.add(l1);
        p2.add(ch1);
        p2.add(l2);
        p2.add(tf1);
        p2.add(l3);
        p2.add(tf2);
        p2.add(l4);
        p2.add(tf3);
        p2.add(bt1);
        p2.add(bt2);

        p3=new JPanel();
        p3.setLayout(new GridLayout(1,1,10,10));
        p3.add(l6);

        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.BLACK);

        setLayout(new BorderLayout(0,0));

        add(p1,"North");
        add(p2,"Center");
        add(p3,"West");

        ch1.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent arg) {
                int id=Integer.parseInt(ch1.getSelectedItem());
                try {
                    ConnectionClass obj1=new ConnectionClass();
                    String q1="select * from add_trainer where tr_id ='"+id+"'";
                    ResultSet rest1=obj1.stm.executeQuery(q1);
                    while(rest1.next())
                    {
                        String s1 = rest1.getString("name");
                        tf1.setText(s1);
                        String s2 = rest1.getString("tr_cate");
                        tf2.setText(s2);
                    }
                }

                catch (Exception exx)
                {
                    exx.printStackTrace();
                }
            }
        });

    }

    public void actionPerformed(ActionEvent e)
    {

        try {
            if(e.getSource()==bt1)
            {
                int tr_id = Integer.parseInt(ch1.getSelectedItem());
                String name = tf1.getText();
                String tr_cate = tf2.getText();

                float fees=Float.parseFloat(tf3.getText());


                ConnectionClass obj2=new ConnectionClass();
                String q2="insert into fee_trainer values('"+tr_id+"','"+name+"','"+tr_cate+"','"+fees+"')";
                obj2.stm.executeUpdate(q2);
                JOptionPane.showMessageDialog(null,"your fees successfully submit:)");
                setVisible(false);
            }
        }

        catch (Exception exxx)
        {
            exxx.printStackTrace();
        }

        if(e.getSource() == bt2)
        {
            JOptionPane.showMessageDialog(null,"Are you sure");
            setVisible(false);
        }
    }

    public static void main(String args[])
    {
        new Trainer_Fees().setVisible(true);
    }
}

