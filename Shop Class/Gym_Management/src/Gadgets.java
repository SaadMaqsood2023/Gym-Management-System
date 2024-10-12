/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gadgets extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6;
    JPanel p1,p2;


    Gadgets() {

        super("EXERCISE");
        setSize(800,700);
        setLocation(0,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        Font f = new Font("Calibri", Font.BOLD, 18);

        JLabel l1= new JLabel("");
        Imageicon i1 = new ImageIcon();
        Image im1 = i1.getItmage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        l1.setIcon(new ImageIcon(im1));

        JLabel l2= new JLabel("");
        Imageicon i2 = new ImageIcon();
        Image im2 = i2.getItmage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        l1.setIcon(new ImageIcon(im2));

        JLabel l3= new JLabel("");
        Imageicon i3 = new ImageIcon();
        Image im3 = i3.getItmage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        l3.setIcon(new ImageIcon(im3));

        JLabel l4= new JLabel("");
        Imageicon i4 = new ImageIcon();
        Image im4 = i4.getItmage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        l1.setIcon(new ImageIcon(im4));

        JLabel l5= new JLabel("");
        Imageicon i5 = new ImageIcon();
        Image im5 = i5.getItmage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        l5.setIcon(new ImageIcon(im5));

        JLabel l6= new JLabel("");
        Imageicon i6 = new ImageIcon();
        Image im6 = i6.getItmage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        l6.setIcon(new ImageIcon(im6));

        p1.setLayout(new GridLayout(2, 3, 10, 10));

        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);

        l1.setBackground(Color.BLACK);
        l2.setBackground(Color.BLACK);
        l3.setBackground(Color.BLACK);
        l4.setBackground(Color.BLACK);
        l5.setBackground(Color.BLACK);
        l6.setBackground(Color.BLACK);

        l1.setForeground(Color.RED);
        l2.setForeground(Color.YELLOW);
        l3.setForeground(Color.YELLOW);
        l4.setForeground(Color.YELLOW);
        l5.setForeground(Color.WHITE);
        l6.setForeground(Color.WHITE);


    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==bt2)
        {
            setVisible(false);
        }


    }

    public static void main(String args[]) {
        new Gadgets().setVisible(true);
    }
}
*/