package MyProjectForms;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
public class Update_customer extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField Tf1,Tf2,Tf3,Tf4,Tf5,Tf6,Tf7,Tf8,Tf9,Tf10;
    Choice ch0,ch1,ch2,ch3;
    JButton btn1,btn2;
    JPanel p1,p2,p3;

    Font f1,f2,f3;

    Update_customer()
    {
        super("Update Customer");
        setBounds(350,50,750,700);
        setResizable(false);

        ImageIcon img_c = new ImageIcon(ClassLoader.getSystemResource("MyProjectForms/Icons/36.jpg"));
        Image img = img_c.getImage().getScaledInstance(750,700,Image.SCALE_DEFAULT);
        l15 = new JLabel(new ImageIcon(img));

        f1 = new Font("Lucida Fax",Font.BOLD,30);
        f2 = new Font("MS UI Gothic",Font.BOLD,20);
        //f3 = new Font("MS UI Gothic",Font.BOLD,15);

        l1 = new JLabel("Name");
        l2 = new JLabel("Father's name");
        l3 = new JLabel("Email");
        l4 = new JLabel("Address");
        l5 = new JLabel("Contact no");
        l6 = new JLabel("Trainer name");
        l7 = new JLabel("Trainer Category");
        l8 = new JLabel("ID");
        l9 = new JLabel("Min agreement");
        l10 = new JLabel("Gender");
        l11 = new JLabel("Height (inches)");
        l12 = new JLabel("Weight (KG)");
        l13 = new JLabel("Remarks");
        l14 = new JLabel("Update Customer");

        //Our main heading
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

        ch0 = new Choice();
        ch1 = new Choice();
        ch2 = new Choice();
        ch3 = new Choice();

        try
        {
            ConnectionClass obj = new ConnectionClass();
            String q = "Select id from add_customer";
            ResultSet rest = obj.stm.executeQuery(q);
            while(rest.next())
            {
                String s1 = rest.getString("id");
                ch0.add(s1);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

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
        btn1 = new JButton("Update");
        btn2 = new JButton("Cancel");

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
        p1.add(l8); // trainer id and it's text field
        p1.add(ch0);
        //p1.add(Tf7);
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

        p1.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));

        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,1,10,10));
        p2.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
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

        //Tf6.setForeground(Color.RED);
        p2.setBounds(100,0,500,100);
        p1.setBounds(150,120,400,500);
        setLayout(new BorderLayout(0,0));

        l15.add(p2);
        l15.add(p1);
        add(l15);


        ch0.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int id=Integer.parseInt(ch0.getSelectedItem());
                try {
                    ConnectionClass obj1=new ConnectionClass();
                    String q1="select * from add_customer where id ='"+id+"'";
                    ResultSet rest1=obj1.stm.executeQuery(q1);
                    while(rest1.next())
                    {
                        String s1 = rest1.getString("name");
                        Tf1.setText(s1);
                        String s2 = rest1.getString("fath_name");
                        Tf2.setText(s2);
                        String s3 = rest1.getString("email");
                        Tf3.setText(s3);
                        String s4 = rest1.getString("address");
                        Tf4.setText(s4);
                        String s5 = rest1.getString("cont");
                        Tf5.setText(s5);
                        String s6 = rest1.getString("tr_name");
                        Tf6.setText(s6);
                        String s7 = rest1.getString("tr_cate");
                        ch1.select(s7);
                        String s8 = rest1.getString("m_agr");
                        ch2.select(s8);
                        String s9 = rest1.getString("gender");
                        ch3.select(s9);
                        String s10 = rest1.getString("height");
                        Tf8.setText(s10);
                        String s11 = rest1.getString("weight");
                        Tf9.setText(s11);
                        String s12 = rest1.getString("remarks");
                        Tf10.setText(s12);
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

        try
        {
            if(e.getSource() == btn1 )
            {
                String name = Tf1.getText();
                String fath_name = Tf2.getText();
                String email = Tf3.getText();
                String address = Tf4.getText();
                String cont = Tf5.getText();
                String tr_name = Tf6.getText();
                String tr_cate = ch1.getSelectedItem();  // trainer category
                //int id  = Integer.parseInt(Tf7.getText());
                String m_agr = ch2.getSelectedItem();  // min aggrement
                String  gender = ch3.getSelectedItem();
                float height = Float.parseFloat(Tf8.getText());
                float weight = Float.parseFloat(Tf9.getText());
                String remarks = Tf10.getText();
                int id = Integer.parseInt(ch0.getSelectedItem());


                ConnectionClass obj1 = new ConnectionClass();
                //String q1 = "Select * from add_trainer where tr_id = '"+trainer_id+"'";
                //String q = "UPDATE add_customer SET id='"+id+"', name ='"+name+"',fath_name ='"+fath_name+"',email = '"+email+"',address ='"+address+"',cont ='"+cont+"',tr_name = '"+tr_name+"',tr_cate ='"+tr_cate+"',m_agr ='"+m_agr+"',gender ='"+gender+"',height ='"+height+"',weight'"+weight+"',remarks ='"+remarks+"' where id='"+id+"'";
                String q = "Update add_customer SET id=?,name=?,fath_name=?,email=?,address=?,cont=?,tr_name=?,tr_cate=?,m_agr=?,gender=?,height=?,weight=?,remarks=? where id ="+id;
                //obj1.stm.executeUpdate(q);
                PreparedStatement pst = obj1.con.prepareStatement(q);
                pst.setInt(1,id);
                pst.setString(2,name);
                pst.setString(3,fath_name);
                pst.setString(4,email);
                pst.setString(5,address);
                pst.setString(6,cont);
                pst.setString(7,tr_name);
                pst.setString(8,tr_cate);
                pst.setString(9,m_agr);
                pst.setString(10,gender);
                pst.setFloat(11,height);
                pst.setFloat(12,weight);
                pst.setString(13,remarks);
                int i =pst.executeUpdate();
                /*ResultSet rest = obj.stm.executeQuery(q1); id ='"+id+"',
                while(rest.next())
                {
                    Tf1.setText(rest.getString("name"));
                    Tf2.setText(rest.getString("fath_name"));
                    Tf3.setText(rest.getString("email"));
                    Tf4.setText(rest.getString("address"));
                    Tf5.setText(rest.getString("cont"));
                    Tf6.setText(rest.getString("emergency_con"));
                    Tf8.setText(rest.getString("height"));
                    Tf9.setText(rest.getString("weight"));
                    Tf10.setText(rest.getString("remarks"));
                }*/
                JOptionPane.showMessageDialog(null,"Data Updated Successfully.....");
                setVisible(false);
            }


        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

       if(e.getSource() == btn2)
    {
        JOptionPane.showMessageDialog(null,"Are you sure");
        this.setVisible(false);
        //System.exit(0);
    };

    }

    public static void main(String args[])
    {
        new Update_customer().setVisible(true);
    }
}
