package MyProjectForms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Customer_Fees extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JButton bt1,bt2;
    Choice ch1,ch2;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    JPanel p1,p2,p3;

    Customer_Fees()
    {
        super("customer fees");
        setSize(500,500);
        setLocation(270,250);
        setResizable(false);
        Font f= new Font ("MS UI Gothic",Font.BOLD,20);
        Font f1= new Font ("MS UI Gothic",Font.BOLD,30);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("MyProjectForms/Icons/Gym_Trainer_blur.jpg"));
        Image im = img.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        l9= new JLabel (new ImageIcon(im));
        //l9.setVerticalAlignment(JLabel.CENTER);

        l1=new JLabel ("Recepient ID");
        l2=new JLabel("Name");
        l3=new JLabel("Category");
        l4=new JLabel("Trainer Name");
        l5= new JLabel("Month");
        l6=new JLabel("Fees");
        l7= new JLabel("Pay Fees");
        l7.setFont(f1);
        l7.setHorizontalAlignment(JLabel.CENTER);

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();

        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);

        tf1.setFont(f);
        tf2.setFont(f);
        tf3.setFont(f);
        tf4.setFont(f);

        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.WHITE);
        l5.setForeground(Color.WHITE);
        l6.setForeground(Color.WHITE);
        l7.setForeground(Color.YELLOW);

        ch1 = new Choice();
        try
        {
            ConnectionClass obj=new ConnectionClass();
            String q = "select id from add_customer";
            ResultSet rest = obj.stm.executeQuery(q);
            while(rest.next())
            {
                String s1 = rest.getString("id");
                ch1.add(s1);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        ch2 = new Choice();

        ch2.add("Jan");
        ch2.add("Feb");
        ch2.add("Mar");
        ch2.add("Apr");
        ch2.add("May");
        ch2.add("Jun");
        ch2.add("Jul");
        ch2.add("Aug");
        ch2.add("Sep");
        ch2.add("Oct");
        ch2.add("Nov");
        ch2.add("Dec");


        ch1.setFont(f);
        ch2.setFont(f);

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
        p1.add(l7);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(7,3,10,10));
        p2.add(l1);
        p2.add(ch1);
        p2.add(l2);
        p2.add(tf1);
        p2.add(l3);
        p2.add(tf2);
        p2.add(l4);
        p2.add(tf3);
        p2.add(l5);
        p2.add(ch2);
        p2.add(l6);
        p2.add(tf4);
        p2.add(bt1);
        p2.add(bt2);

        /*p3=new JPanel();
        p3.setLayout(null);
        p3.add(l9);*/

        p1.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
        p2.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));

        setLayout(new BorderLayout(0,0));


        p1.setBounds(150,0,200,100);
        p2.setBounds(100,150,300,220);

        l9.add(p1);
        l9.add(p2);
        //add(p3,"West");
        add(l9);


        ch1.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent arg) {
                int id=Integer.parseInt(ch1.getSelectedItem());
                try {
                    ConnectionClass obj1=new ConnectionClass();
                    String q1="select * from add_customer where id ='"+id+"'";
                    ResultSet rest1=obj1.stm.executeQuery(q1);
                    while(rest1.next())
                    {
                        String s1 = rest1.getString("name");
                        tf1.setText(s1);
                        String s2 = rest1.getString("tr_cate");
                        tf2.setText(s2);
                        String s3 = rest1.getString("tr_name");
                        tf3.setText(s3);
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
                int id = Integer.parseInt(ch1.getSelectedItem());
                String name = tf1.getText();
                String tr_cate = tf2.getText();
                String tr_name = tf3.getText();

                float fees=Float.parseFloat(tf4.getText());


                ConnectionClass obj2=new ConnectionClass();
                String q2="insert into fee_customer values('"+id+"','"+name+"','"+tr_cate+"','"+tr_name+"','"+fees+"')";
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
        new Customer_Fees().setVisible(true);
    }

}
