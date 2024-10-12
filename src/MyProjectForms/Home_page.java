package MyProjectForms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import static java.awt.event.KeyEvent.VK_T;

public class Home_page extends JFrame implements ActionListener
{
    //constructor
    /*Home_page()
    {
    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Welcome");
    setSize(400, 200);
    }*/

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    Font f,f1,f2;
    JPanel p1,p2,p3,p4,p5,p6;
    JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17;

    Home_page() {
        super("Home Page");
        setSize(1600, 900);
        setLocation(0, 0);

        f = new Font("Lucida Fax", Font.BOLD, 20);
        f1 = new Font("MS UI Gothic", Font.BOLD, 18);
        f2 = new Font("Gadugi", Font.BOLD, 35);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("MyProjectForms/Icons/224.jpg"));
        Image img = ic.getImage().getScaledInstance(1600, 1100, Image.SCALE_DEFAULT);
        ImageIcon ic1 = new ImageIcon(img);
        l1 = new JLabel(ic1);

        ImageIcon ic2 = new ImageIcon(ClassLoader.getSystemResource("MyProjectForms/Icons/logo.jpg"));
        Image img1 = ic2.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon ic3 = new ImageIcon(img1);
        l2 = new JLabel(ic3);
        l2.setBounds(50,10,200,200);
        l2.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));

        bt1=new JButton("Master");
       bt1.setBackground(Color.BLACK);
        bt1.setFont(f);
        bt1.setBorder(null);
        bt1.setForeground(Color.WHITE);

        bt2=new JButton("Add Trainer");
        bt2.setBackground(Color.BLACK);
        bt2.setFont(f);
        bt2.setBorder(null);
        bt2.setForeground(Color.WHITE);

        bt3=new JButton("Add Customer");
        bt3.setBackground(Color.BLACK);
        bt3.setFont(f);
        bt3.setBorder(null);
        bt3.setForeground(Color.WHITE);

        bt4=new JButton("Personal Information");
        bt4.setBackground(Color.BLACK);
        bt4.setFont(f);
        bt4.setBorder(null);
        bt4.setForeground(Color.WHITE);

        bt5=new JButton("Trainer Information");
        bt5.setBackground(Color.BLACK);
        bt5.setFont(f);
        bt5.setBorder(null);
        bt5.setForeground(Color.WHITE);

        bt6=new JButton("Customer Information");
        bt6.setBackground(Color.BLACK);
        bt6.setFont(f);
        bt6.setBorder(null);
        bt6.setForeground(Color.WHITE);

        bt7=new JButton("Update Information");
        bt7.setBackground(Color.BLACK);
        bt7.setFont(f);
        bt7.setBorder(null);
        bt7.setForeground(Color.WHITE);

        bt8=new JButton("Update Trainer");
        bt8.setBackground(Color.BLACK);
        bt8.setFont(f);
        bt8.setBorder(null);
        bt8.setForeground(Color.WHITE);

        bt14=new JButton("Update Customer");
        bt14.setBackground(Color.BLACK);
        bt14.setFont(f);
        bt14.setBorder(null);
        bt14.setForeground(Color.WHITE);

        bt9=new JButton("Fee Pay");
        bt9.setBackground(Color.BLACK);
        bt9.setFont(f);
        bt9.setBorder(null);
        bt9.setForeground(Color.WHITE);

        bt10=new JButton("Customer Fee");
        bt10.setBackground(Color.BLACK);
        bt10.setFont(f);
        bt10.setBorder(null);
        bt10.setForeground(Color.WHITE);

        bt11=new JButton("Shop");
        bt11.setBackground(Color.BLACK);
        bt11.setFont(f);
        bt11.setBorder(null);
        bt11.setForeground(Color.WHITE);

        bt12=new JButton("Exit");
        bt12.setBackground(Color.BLACK);
        bt12.setFont(f);
        bt12.setBorder(null);
        bt12.setForeground(Color.WHITE);

        bt13=new JButton("Back");
        bt13.setBackground(Color.BLACK);
        bt13.setFont(f);
        bt13.setBorder(null);
        bt13.setForeground(Color.WHITE);

        bt15=new JButton("Back");
        bt15.setBackground(Color.BLACK);
        bt15.setFont(f);
        bt15.setBorder(null);
        bt15.setForeground(Color.WHITE);

        bt16=new JButton("Back");
        bt16.setBackground(Color.BLACK);
        bt16.setFont(f);
        bt16.setBorder(null);
        bt16.setForeground(Color.WHITE);

        bt17=new JButton("Back");
        bt17.setBackground(Color.BLACK);
        bt17.setFont(f);
        bt17.setBorder(null);
        bt17.setForeground(Color.WHITE);

        p1 = new JPanel();
        p1.setBackground(Color.BLACK);
        p1.setLayout(null);
        /*bt12.setBounds(100,100,100,100);
        bt11.setBounds(100,100,100,100);
        bt9.setBounds(100,100,100,100);
        bt7.setBounds(100,100,100,100);
        bt4.setBounds(100,100,100,100);
        bt1.setBounds(100,100,100,100);*/

        p2 = new JPanel();
        p2.setBackground(Color.BLACK);
        p2.setLayout(new GridLayout(6,1,0,0));
        p2.add(bt1);
        p2.add(bt4);
        //bt4.setBounds(100,100,100,100);
        p2.add(bt7);
       // bt7.setBounds(100,100,100,100);
        p2.add(bt9);
        //bt9.setBounds(100,100,100,100);
        p2.add(bt11);
       // bt11.setBounds(100,100,100,100);
        p2.add(bt12);

        p1.add(l2);

        p3=new JPanel();
        p3.setBackground(Color.BLACK);
        p3.setLayout(new GridLayout(3,1,0,0));
        p3.add(bt2);
        p3.add(bt3);
        //p3.add(bt13);

        p4=new JPanel();
        p4.setBackground(Color.BLACK);
        p4.setLayout(new GridLayout(2,1,0,0));
        p4.add(bt5);
        p4.add(bt6);
        //p4.add(bt15);
        //p4.add(bt13);

        p5=new JPanel();
        p5.setBackground(Color.BLACK);
        p5.setLayout(new GridLayout(2,1,0,0));
        p5.add(bt8);
        p5.add(bt14);
        //p5.add(bt16);
        //p5.add(bt13);

        p6=new JPanel();
        p6.setBackground(Color.BLACK);
        p6.setLayout(new GridLayout(1,1,0,0));
        p6.add(bt10);
        //p6.add(bt17);
       // p6.add(bt13);



        //p2.setSize(500,500);




        //l2 = new JLabel("WELCOME TO FITNESS POINT");

        /*JMenuBar m1 = new JMenuBar(); // Menu Bar

        //First Menu and its items and item's ImageIcon
        JMenu menu1 = new JMenu("Master");
        JMenuItem men_itm1 = new JMenuItem("Add Trainer");
        JMenuItem men_itm2 = new JMenuItem("Add Customer");

        //First item's men_itm1 ImageIcon
        ImageIcon ic2 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img2 = ic2.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ImageIcon ic3 = new ImageIcon(img2);
        men_itm1.setIcon(ic3);
        men_itm1.setMnemonic('T');
        men_itm1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));

        //men_itm2 ImageIcon
        ImageIcon ic4 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img3 = ic4.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm2.setIcon(new ImageIcon(img3));
        men_itm2.setMnemonic('C');
        men_itm2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));

        //Second Menu and its items and item's ImageIcon
        JMenu menu2 = new JMenu("Attendance");
        JMenuItem men_itm3 = new JMenuItem("Trainer Attendance");
        JMenuItem men_itm4 = new JMenuItem(("Customer Attendance"));


        //men_itm3 ImageIcon
        ImageIcon ic5 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img4 = ic5.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm3.setIcon(new ImageIcon(img4));
        men_itm3.setMnemonic('A');
        men_itm3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));

        //men_itm4 ImageIcon
        ImageIcon ic6 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img5 = ic6.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm4.setIcon(new ImageIcon(img5));
        men_itm4.setMnemonic('W');
        men_itm4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));

        //Third menu its items and item's ImageIcon
        JMenu menu3 = new JMenu("Personal Information");
        JMenuItem men_itm5 = new JMenuItem("Trainer Information");
        JMenuItem men_itm6 = new JMenuItem(("Customer Information"));

        //men_itm5 ImageIcon
        ImageIcon ic7 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img6 = ic7.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm5.setIcon(new ImageIcon(img6));
        men_itm5.setMnemonic('R');
        men_itm5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));

        //men_itm6 ImageIcon
        ImageIcon ic8 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img7 = ic8.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm6.setIcon(new ImageIcon(img7));
        men_itm6.setMnemonic('E');
        men_itm6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));

        //Fourth menu its items and item's ImageIcon
        JMenu menu4 = new JMenu("Update Information");
        JMenuItem men_itm7 = new JMenuItem("Update Trainer");
        JMenuItem men_itm8 = new JMenuItem(("Update Customer"));

        //men_itm7 ImageIcon
        ImageIcon ic9 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img8 = ic9.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm7.setIcon(new ImageIcon(img8));
        men_itm7.setMnemonic('u');
        men_itm7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));

        //men_itm8 ImageIcon
        ImageIcon ic10 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img9 = ic10.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm8.setIcon(new ImageIcon(img9));
        men_itm8.setMnemonic('I');
        men_itm8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));

        //Fifth menu its items and item's ImageIcon
        JMenu menu5 = new JMenu("Fee Information");
        JMenuItem men_itm9 = new JMenuItem("Trainer Fee");
        JMenuItem men_itm10 = new JMenuItem(("Customer Fee"));

        //men_itm9 ImageIcon
        ImageIcon ic11 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img10 = ic11.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm9.setIcon(new ImageIcon(img10));
        men_itm9.setMnemonic('S');
        men_itm9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        //men_itm10 ImageIcon
        ImageIcon ic12 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img11 = ic12.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm10.setIcon(new ImageIcon(img11));
        men_itm10.setMnemonic('F');
        men_itm10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));

        //Sixth menu its items and item's ImageIcon
        JMenu menu6 = new JMenu("All Details");                  //extra
        JMenuItem men_itm11 = new JMenuItem("Gym Details");
        JMenuItem men_itm12 = new JMenuItem(("Gym Gadgets"));

        //men_itm11 ImageIcon
        ImageIcon ic13 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img12 = ic13.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm11.setIcon(new ImageIcon(img12));
        men_itm11.setMnemonic('D');
        men_itm11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));

        //men_itm12 ImageIcon
        ImageIcon ic14 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img13 = ic14.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm12.setIcon(new ImageIcon(img13));
        men_itm12.setMnemonic('P');
        men_itm12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));

        //seventh menu and it's items
        JMenu menu7 = new JMenu("Exit");
        JMenuItem men_itm13 = new JMenuItem("Exit");

        //men_itm13 ImageIcon
        ImageIcon ic15 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img14 = ic15.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm13.setIcon(new ImageIcon(img14));
        men_itm13.setMnemonic('Z');
        men_itm13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));

        //Eightth menu its items and item's ImageIcon
        JMenu menu8 = new JMenu("Excercise Routine");                  //extra
        JMenuItem men_itm14 = new JMenuItem("Excercise Images");
        JMenuItem men_itm15 = new JMenuItem(("BMR Calculator"));

        //men_itm11 ImageIcon
        ImageIcon ic16 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img15 = ic16.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm14.setIcon(new ImageIcon(img15));
        men_itm14.setMnemonic('3');
        men_itm14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.CTRL_MASK));

        //men_itm12 ImageIcon
        ImageIcon ic17 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img16 = ic17.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        men_itm15.setIcon(new ImageIcon(img16));
        men_itm15.setMnemonic('4');
        men_itm15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.CTRL_MASK));


        //Adding menu items in the menu
        menu1.add(men_itm1);
        menu1.add(men_itm2);

        menu2.add(men_itm3);
        menu2.add(men_itm4);

        menu3.add(men_itm5);
        menu3.add(men_itm6);

        menu4.add(men_itm7);
        menu4.add(men_itm8);

        menu5.add(men_itm9);
        menu5.add(men_itm10);

        menu6.add(men_itm11);
        menu6.add(men_itm12);

        menu7.add(men_itm13);

        menu8.add(men_itm14);
        menu8.add(men_itm15);

        //Adding menu in the menubar
        m1.add(menu1);
        m1.add(menu2);
        m1.add(menu3);
        m1.add(menu4);
        m1.add(menu5);
        m1.add(menu6);
        m1.add(menu8);
        m1.add(menu7);

        //Set font of the menu
        menu1.setFont(f);
        menu2.setFont(f);
        menu3.setFont(f);
        menu4.setFont(f);
        menu5.setFont(f);
        menu6.setFont(f);
        menu7.setFont(f);
        menu8.setFont(f);

        //Set font of menu items
        men_itm1.setFont(f1);
        men_itm2.setFont(f1);
        men_itm3.setFont(f1);
        men_itm4.setFont(f1);
        men_itm5.setFont(f1);
        men_itm6.setFont(f1);
        men_itm7.setFont(f1);
        men_itm8.setFont(f1);
        men_itm9.setFont(f1);
        men_itm10.setFont(f1);
        men_itm11.setFont(f1);
        men_itm12.setFont(f1);
        men_itm13.setFont(f1);
        men_itm14.setFont(f1);
        men_itm15.setFont(f1);

        //Color of menubar
        m1.setBackground(Color.BLACK);

        //Color of menu writing
        menu1.setForeground(Color.WHITE);
        menu2.setForeground(Color.WHITE);
        menu3.setForeground(Color.WHITE);
        menu4.setForeground(Color.WHITE);
        menu5.setForeground(Color.WHITE);
        menu6.setForeground(Color.WHITE);
        menu7.setForeground(Color.RED);
        menu8.setForeground(Color.WHITE);

        //Background Color of menu items
        men_itm1.setBackground(Color.BLACK);
        men_itm2.setBackground(Color.BLACK);
        men_itm3.setBackground(Color.BLACK);
        men_itm4.setBackground(Color.BLACK);
        men_itm5.setBackground(Color.BLACK);
        men_itm6.setBackground(Color.BLACK);
        men_itm7.setBackground(Color.BLACK);
        men_itm8.setBackground(Color.BLACK);
        men_itm9.setBackground(Color.BLACK);
        men_itm10.setBackground(Color.BLACK);
        men_itm11.setBackground(Color.BLACK);
        men_itm12.setBackground(Color.BLACK);
        men_itm13.setBackground(Color.BLACK);
        men_itm14.setBackground(Color.BLACK);
        men_itm15.setBackground(Color.BLACK);


        //Color of menu items writing
        men_itm1.setForeground(Color.YELLOW);
        men_itm2.setForeground(Color.YELLOW);
        men_itm3.setForeground(Color.YELLOW);
        men_itm4.setForeground(Color.YELLOW);
        men_itm5.setForeground(Color.YELLOW);
        men_itm6.setForeground(Color.YELLOW);
        men_itm7.setForeground(Color.YELLOW);
        men_itm8.setForeground(Color.YELLOW);
        men_itm9.setForeground(Color.YELLOW);
        men_itm10.setForeground(Color.YELLOW);
        men_itm11.setForeground(Color.YELLOW);
        men_itm12.setForeground(Color.YELLOW);
        men_itm13.setForeground(Color.RED);
        men_itm14.setForeground(Color.YELLOW);
        men_itm15.setForeground(Color.YELLOW);

        //Action Listeners of menu items
        men_itm1.addActionListener(this);
        men_itm2.addActionListener(this);
        men_itm3.addActionListener(this);
        men_itm4.addActionListener(this);
        men_itm5.addActionListener(this);
        men_itm6.addActionListener(this);
        men_itm7.addActionListener(this);
        men_itm8.addActionListener(this);
        men_itm9.addActionListener(this);
        men_itm10.addActionListener(this);
        men_itm11.addActionListener(this);
        men_itm12.addActionListener(this);
        men_itm13.addActionListener(this);
        men_itm14.addActionListener(this);
        men_itm15.addActionListener(this);*/
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt10.addActionListener(this);
        bt11.addActionListener(this);
        bt12.addActionListener(this);
        bt13.addActionListener(this);
        bt14.addActionListener(this);



        setLayout(new BorderLayout(0,0));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setJMenuBar(m1);
        p2.setBounds(0,200,300,300);
        add(p2);
        p1.setBounds(0,0,300,900);
        add(p1);
        //p3.setBounds(400,200,300,150);
       add(p3);
       add(p4);
        add(p5);
        add(p6);
        add(l1);

    }
    public void actionPerformed(ActionEvent e)
    {
       String command = e.getActionCommand();

       if (command.equals("Fee Pay"))

    {
        p2.setVisible(false);
        p6.setBounds(0,200,300,50);
        p6.setVisible(true);
    }
       else if(command.equals("Master"))
        {
            p2.setVisible(false);
            p3.setBounds(0,200,300,150);
            p3.setVisible(true);
        }

        else if(command.equals("Personal Information"))
        {
            p2.setVisible(false);
            p4.setBounds(0,200,300,150);
            p4.setVisible(true);
        }

        else if(command.equals("Update Information"))
        {
            p2.setVisible(false);
            p5.setBounds(0,200,300,150);
            p5.setVisible(true);
        }


       /*if(command.equals("Add Trainer"))
        {
            new Add_Trainer().setVisible(true);
        }

        else if(command.equals("Add Customer"))
        {
            new Add_Customer().setVisible(true);
        }
        else if(command.equals("Trainer Attendance"))
        {
            new Trainer_Attendance().setVisible(true);
        }
        else if(command.equals("Customer Attendance"))
        {
            new Customer_Attendance().setVisible(true);
        }
        else if(command.equals("Trainer Information"))
        {
            new Trainer_Information().setVisible(true);
        }
        else if(command.equals("Customer Information"))
        {
            new Customer_Information().setVisible(true);
        }
        else if(command.equals("Update Trainer"))
        {
            new Update_trainer().setVisible(true);
        }
        else if(command.equals("Update Customer"))
        {
            new Update_customer().setVisible(true);
        }
        else if(command.equals("Trainer Fee"))
        {
            new Trainer_Fees().setVisible(true);
        }
        else if(command.equals("Customer Fee"))
        {
            new Customer_Fees().setVisible(true);
        }
        else if(command.equals("Exit"))
        {
            System.exit(0);
        };

        else if(command.equals("Gym Details"))
        {
            new Gym_Details().setVisible(true);
        }
            else if(command.equals("Gym Gadgets"));
            {
                new Gym_Gadgets().setVisible(true);
            }
            else if(command.equals("Exercise Images"));
            {
                new Exercise_Images().setVisible(true);
            }
            else if(command.equals("BMR Calculator"));
            {
                new BMR_Calculator().setVisible(true);
            }*/


        String command1 = e.getActionCommand();
        if(command1.equals("Back"))
        {
            p2.setVisible(true);
        }
        if(command1.equals("Add Trainer"))
        {
            new Add_Trainer().setVisible(true);
        }
        else if(command1.equals("Add Customer"))
        {
            new Add_Customer().setVisible(true);
        }

        else if(command.equals("Trainer Information"))
        {
            new Trainer_Information().setVisible(true);
        }
        else if(command.equals("Customer Information"))
        {
            new Customer_Information().setVisible(true);
        }
        else if(command.equals("Update Trainer"))
        {
            new Update_trainer().setVisible(true);
        }
        else if(command.equals("Update Customer"))
        {
            new Update_customer().setVisible(true);
        }

            else if(command.equals("Customer Fee"))
        {
            new Customer_Fees().setVisible(true);
        }
        else if(command.equals("Exit"))
        {
            System.exit(0);
        }


    }



    public static void main(String[] args)
    {
        new Home_page().setVisible(true);
    }



}




