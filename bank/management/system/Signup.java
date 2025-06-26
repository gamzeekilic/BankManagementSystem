package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Signup extends JFrame {
    JTextField textName;
    JTextField textFname;
    Random ran = new Random();
    long first4;
    String first;

    Signup() {
        super("Application form");
        this.first4 = this.ran.nextLong() % 9000L + 1000L;
        this.first = " " + Math.abs(this.first4);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bankk.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 180, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(3, 5, 200, 180);
        this.add(image);
        JLabel label1 = new JLabel("APPLICATION FROM NO" + this.first);
        label1.setBounds(200, 25, 600, 40);
        label1.setFont(new Font("Raleway", 1, 40));
        this.add(label1);
        this.add(label1);
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Ralway", 1, 29));
        label3.setBounds(370, 80, 600, 30);
        this.add(label3);
        JLabel labelName = new JLabel("Name");
        labelName.setFont(new Font("Raleway", 1, 20));
        labelName.setBounds(108, 190, 100, 30);
        this.add(labelName);
        this.textName = new JTextField();
        this.textName.setFont(new Font("Raleway", 1, 12));
        this.textName.setBounds(300, 190, 400, 30);
        this.add(this.textName);
        JLabel labelfName = new JLabel("Father's Name");
        labelfName.setFont(new Font("Raleway", 1, 20));
        labelfName.setBounds(108, 240, 200, 30);
        this.add(labelfName);
        this.textFname = new JTextField();
        this.textFname.setFont(new Font("Raleway", 1, 12));
        this.textFname.setBounds(300, 240, 400, 30);
        this.add(this.textFname);
        JLabel DOB = new JLabel("Date Of Birth");
        DOB.setFont(new Font("Raleway", 1, 20));
        DOB.setBounds(108, 290, 200, 30);
        this.add(DOB);
        this.getContentPane().setBackground(new Color(216, 191, 216));
        this.setLayout((LayoutManager)null);
        this.setSize(850, 800);
        this.setLocation(360, 40);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Signup();
    }
}
