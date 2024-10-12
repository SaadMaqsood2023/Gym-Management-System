import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.*;

public class Shop_Buy extends JFrame implements ActionListener {

    Font f, f1,f2;
    JButton bt1, bt2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    Choice ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10,ch11,ch12;

    JLabel r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;
    JLabel mp,mp1,mp2,mp3,mp4,mp5;
    JPanel p1,p2,p3;
    Shop_Buy()
    {
        super("SHOP");
        setSize(800,700);
        setLocation(0,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        Font f = new Font("Calibri", Font.BOLD, 18);
        Font f1 = new Font("Bahnschrift", Font.BOLD, 30);
        Font f2 = new Font("Bahnschrift", Font.BOLD, 20);

        JLabel l1 = new JLabel("BUY N ENJOY!");
        l1.setHorizontalAlignment(JLabel.CENTER);

        JLabel l2 = new JLabel("******SHAKES******");

        JLabel l5 = new JLabel("BANANA SHAKE");

        JLabel l17 = new JLabel();
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/banana.png"));
        Image im1 = i1.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        l17.setIcon(new ImageIcon(im1));
        l17.setLocation(100,100);

        JLabel l6 = new JLabel("ALMOND SHAKE");
        /*ImageIcon i2 = new ImageIcon();
        Image im2 = i2.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        l6.setIcon(new ImageIcon(im2));*/

        JLabel l7 = new JLabel("DATES SHAKE");
        /*ImageIcon i3 = new ImageIcon();
        Image im3 = i3.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        l7.setIcon(new ImageIcon(im3));*/

        JLabel l8 = new JLabel("MANGO SHAKE");
        /*ImageIcon i4 = new ImageIcon();
        Image im4 = i4.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        l8.setIcon(new ImageIcon(im4));*/

        JLabel l9 = new JLabel("CHOCOLATE SHAKE");
        /*ImageIcon i5 = new ImageIcon();
        Image im5 = i5.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        l9.setIcon(new ImageIcon(im5));*/

        JLabel l14 = new JLabel("INJEER SHAKE");
        /*ImageIcon i6 = new ImageIcon();
        Image im6 = i6.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        l14.setIcon(new ImageIcon(im6));*/

        JLabel l3 = new JLabel("******SUPPLEMENT******");

        JLabel l10 = new JLabel("100% WHEY PROTEIN");
        /*ImageIcon i7 = new ImageIcon();
        Image im7 = i7.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        l3.setIcon(new ImageIcon(im7));*/

        JLabel l11 = new JLabel("LEAN DESSER PROTEIN");
        /*ImageIcon i8 = new ImageIcon();
        Image im8 = i8.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        l11.setIcon(new ImageIcon(im8));*/

        JLabel l15 = new JLabel("MP ASSAULT PROTEIN");
        /*ImageIcon i9 = new ImageIcon();
        Image im9 = i9.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        l15.setIcon(new ImageIcon(im9));*/

        JLabel l16 = new JLabel("WHEY PROTEIN COMPLEX");
        /*ImageIcon i10 = new ImageIcon();
        Image im10 = i10.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        l16.setIcon(new ImageIcon(im10));*/

        JLabel l4 = new JLabel("******DRINKS******");
        JLabel l12 = new JLabel("GATORADE ENERGY DRINK");
        /*ImageIcon i11 = new ImageIcon();
        Image im11 = i11.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        l14.setIcon(new ImageIcon(im11));*/

        JLabel l13 = new JLabel("RED BULL DRINK");
        /*ImageIcon i12 = new ImageIcon();
        Image im12 = i12.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        l13.setIcon(new ImageIcon(im12));*/

        bt1= new JButton("Print");
        bt2= new JButton("Cancel");
        bt1.setBounds(10,10,5,10);

        JLabel r1 = new JLabel ("Rs. 100");
        JLabel r2 = new JLabel ("Rs. 140");
        JLabel r3 = new JLabel ("Rs. 140");
        JLabel r4 = new JLabel ("Rs. 120");
        JLabel r5 = new JLabel ("Rs. 190");
        JLabel r6 = new JLabel ("Rs. 130");
        JLabel r7 = new JLabel ("Rs. 8150/15950");
        JLabel r8 = new JLabel ("Rs. 7600/15200");
        JLabel r9 = new JLabel ("Rs. 8400/16100");
        JLabel r10 = new JLabel ("Rs. 6900/13800");
        JLabel r11 = new JLabel ("Rs. 120");
        JLabel r12 = new JLabel ("Rs. 290");

        ch1 = new Choice();
        ch2 = new Choice();
        ch3 = new Choice();
        ch4 = new Choice();
        ch5 = new Choice();
        ch6 = new Choice();
        ch7 = new Choice();
        ch8 = new Choice();
        ch9 = new Choice();
        ch10 = new Choice();
        ch11 = new Choice();
        ch12 = new Choice();

        l1.setFont(f1);
        l2.setFont(f2);
        l3.setFont(f2);
        l4.setFont(f2);
        l5.setFont(f);
        l6.setFont(f);
        l7.setFont(f);
        l8.setFont(f);
        l9.setFont(f);
        l10.setFont(f);
        l11.setFont(f);
        l12.setFont(f);
        l13.setFont(f);
        l14.setFont(f);
        l15.setFont(f);
        l16.setFont(f);
        bt1.setFont(f);
        bt2.setFont(f);
        r1.setFont(f);
        r2.setFont(f);
        r3.setFont(f);
        r4.setFont(f);
        r5.setFont(f);
        r6.setFont(f);
        r7.setFont(f);
        r8.setFont(f);
        r9.setFont(f);
        r10.setFont(f);
        r11.setFont(f);
        r12.setFont(f);


        l1.setBackground(Color.BLACK);
        l2.setBackground(Color.BLACK);
        l3.setBackground(Color.BLACK);
        l4.setBackground(Color.BLACK);
        l5.setBackground(Color.BLACK);
        l6.setBackground(Color.BLACK);
        l7.setBackground(Color.BLACK);
        l8.setBackground(Color.BLACK);
        l9.setBackground(Color.BLACK);
        l10.setBackground(Color.BLACK);
        l11.setBackground(Color.BLACK);
        l12.setBackground(Color.BLACK);
        l13.setBackground(Color.BLACK);
        l14.setBackground(Color.BLACK);
        l15.setBackground(Color.BLACK);
        l16.setBackground(Color.BLACK);
        bt1.setBackground(Color.WHITE);
        bt2.setBackground(Color.WHITE);
        r1.setBackground(Color.BLACK);
        r2.setBackground(Color.BLACK);
        r3.setBackground(Color.BLACK);
        r4.setBackground(Color.BLACK);
        r5.setBackground(Color.BLACK);
        r6.setBackground(Color.BLACK);
        r7.setBackground(Color.BLACK);
        r8.setBackground(Color.BLACK);
        r9.setBackground(Color.BLACK);
        r10.setBackground(Color.BLACK);
        r11.setBackground(Color.BLACK);
        r12.setBackground(Color.BLACK);


        l1.setForeground(Color.RED);
        l2.setForeground(Color.YELLOW);
        l3.setForeground(Color.YELLOW);
        l4.setForeground(Color.YELLOW);
        l5.setForeground(Color.BLACK);
        l6.setForeground(Color.BLACK);
        l7.setForeground(Color.BLACK);
        l8.setForeground(Color.BLACK);
        l9.setForeground(Color.BLACK);
        l10.setForeground(Color.BLACK);
        l11.setForeground(Color.BLACK);
        l12.setForeground(Color.BLACK);
        l13.setForeground(Color.BLACK);
        l14.setForeground(Color.BLACK);
        l15.setForeground(Color.BLACK);
        l16.setForeground(Color.BLACK);
        bt1.setForeground(Color.BLACK);
        bt2.setForeground(Color.BLACK);
        r1.setForeground(Color.BLACK);
        r2.setForeground(Color.BLACK);
        r3.setForeground(Color.BLACK);
        r4.setForeground(Color.BLACK);
        r5.setForeground(Color.BLACK);
        r6.setForeground(Color.BLACK);
        r7.setForeground(Color.BLACK);
        r8.setForeground(Color.BLACK);
        r9.setForeground(Color.BLACK);
        r10.setForeground(Color.BLACK);
        r11.setForeground(Color.BLACK);
        r12.setForeground(Color.BLACK);



        ch1.add("1");
        ch1.add("2");
        ch1.add("3");

        ch2.add("1");
        ch2.add("2");
        ch2.add("3");

        ch3.add("1");
        ch3.add("2");
        ch3.add("3");

        ch4.add("1");
        ch4.add("2");
        ch4.add("3");

        ch5.add("1");
        ch5.add("2");
        ch5.add("3");

        ch6.add("1");
        ch6.add("2");
        ch6.add("3");

        ch7.add("1");
        ch7.add("2");
        ch7.add("3");

        ch8.add("1");
        ch8.add("2");
        ch8.add("3");

        ch9.add("2 LBS");
        ch9.add("5 LBS");

        ch10.add("2 LBS");
        ch10.add("5 LBS");

        ch11.add("2 LBS");
        ch11.add("5 LBS");

        ch12.add("2 LBS");
        ch12.add("5 LBS");


        p1 = new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
        p1.add(l1);

        JLabel mp = new JLabel("    ");
        JLabel mp1 = new JLabel("    ");
        JLabel mp2 = new JLabel("    ");
        JLabel mp3 = new JLabel("    ");
        JLabel mp4 = new JLabel("    ");
        JLabel mp5 = new JLabel("    ");

        p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
        p2.add(l2);
        p2.add(mp);
        p2.add(mp1);
        l2.setBounds(0,0,200,100);
        p2.add(l5);
        l5.setBounds(0,50,200,100);
        p2.add(r1);
        r1.setBounds(350,50,100,100);
        p2.add(ch1);
        ch1.setBounds(450,85,300,100);
        p2.add(l6);
        l6.setBounds(0,100,200,100);
        p2.add(r2);
        r2.setBounds(350,100,100,100);
        p2.add(ch2);
        ch2.setBounds(450,135,300,100);
        p2.add(l7);
        l7.setBounds(0,150,200,100);
        p2.add(r3);
        r3.setBounds(350,150,100,100);
        p2.add(ch3);
        ch3.setBounds(450,185,300,100);
        p2.add(l8);
        l8.setBounds(0,200,200,100);
        p2.add(r4);
        r4.setBounds(350,200,100,100);
        p2.add(ch4);
        ch4.setBounds(450,235,300,100);
        p2.add(l9);
        l9.setBounds(0,250,200,100);
        p2.add(r5);
        r5.setBounds(350,250,100,100);
        p2.add(ch5);
        ch5.setBounds(450,285,300,100);
        p2.add(l14);
        l14.setBounds(0,300,200,100);
        p2.add(r6);
        r6.setBounds(350,300,100,100);
        p2.add(ch6);
        ch6.setBounds(450,335,300,100);

        p2.add(l4);
        l4.setBounds(0,350,200,100);
        p2.add(mp2);
        p2.add(mp3);
        p2.add(l12);
        l12.setBounds(0,400,200,100);
        p2.add(r11);
        r11.setBounds(350,400,100,100);
        p2.add(ch7);
        ch7.setBounds(450,435,300,100);
        p2.add(l13);
        l13.setBounds(0,450,200,100);
        p2.add(r12);
        r12.setBounds(350,450,100,100);
        p2.add(ch8);
        ch8.setBounds(450,485,300,100);

        p2.add(l3);
        l3.setBounds(0,500,200,100);
        p2.add(mp4);
        p2.add(mp5);
        p2.add(l10);
        l10.setBounds(0,550,200,100);
        p2.add(r7);
        r7.setBounds(350,550,100,100);
        p2.add(ch9);
        ch9.setBounds(450,585,300,100);
        p2.add(l11);
        l11.setBounds(0,600,200,100);
        p2.add(r8);
        r8.setBounds(350,600,100,100);
        p2.add(ch10);
        ch10.setBounds(450,635,300,100);
        p2.add(l15);
        l15.setBounds(0,650,200,100);
        p2.add(r9);
        r9.setBounds(350,650,100,100);
        p2.add(ch11);
        ch11.setBounds(450,685,300,100);
        p2.add(l16);
        l16.setBounds(0,700,200,100);
        p2.add(r10);
        r10.setBounds(350,700,100,100);
        p2.add(ch12);
        ch12.setBounds(450,735,300,100);
        p2.add(l17);

        p3 = new JPanel();
        p3.setLayout(new GridLayout(1,1,10,10));
        p3.setBackground(Color.BLACK);
        p3.add(bt1);
        p3.add(bt2);


        setLayout(new BorderLayout(0,0));
        add(p1,"North");
        add(p2,"Center");
        add(p3,"South");



    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==bt2)
        {
            setVisible(false);
        }


    }
    public static void main(String args[])
    {
        new Shop_Buy().setVisible(true);
    }
}

