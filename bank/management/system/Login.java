package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1;
    JButton button2;
    JButton button3;

    Login() {
        super("bank management system");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bankk.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(170, 10, 100, 100);
        this.add(image);
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.jpg"));
        Image ii2 = ii1.getImage().getScaledInstance(108, 120, 1);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(300, 300, 100, 100);
        this.add(iimage);
        this.label1 = new JLabel("WELCOME TO ATM");
        this.label1.setForeground(Color.black);
        this.label1.setFont(new Font("Avantgarde", 1, 20));
        this.label1.setBounds(130, 100, 450, 40);
        this.add(this.label1);
        this.label2 = new JLabel("Card No:");
        this.label2.setForeground(Color.black);
        this.label2.setFont(new Font("Ralway", 1, 12));
        this.label2.setBounds(100, 130, 375, 30);
        this.add(this.label2);
        this.textField2 = new JTextField(15);
        this.textField2.setBounds(160, 140, 120, 30);
        this.textField2.setFont(new Font("Arial", 1, 14));
        this.add(this.textField2);
        this.label3 = new JLabel("PIN:");
        this.label3.setFont(new Font("Ralway", 1, 12));
        this.label3.setForeground(Color.black);
        this.label3.setBounds(100, 180, 375, 30);
        this.passwordField3 = new JPasswordField(15);
        this.passwordField3.setBounds(160, 180, 120, 30);
        this.passwordField3.setFont(new Font("Arial", 1, 14));
        this.add(this.passwordField3);
        this.button1 = new JButton("CLEAR");
        this.button1.setFont(new Font("Arial", 1, 7));
        this.button1.setForeground(Color.WHITE);
        this.button1.setBackground(Color.black);
        this.button1.setBounds(150, 220, 60, 20);
        this.button1.addActionListener(this);
        this.add(this.button1);
        this.button2 = new JButton("SIGN IN");
        this.button2.setFont(new Font("Arial", 1, 7));
        this.button2.setForeground(Color.WHITE);
        this.button2.setBackground(Color.black);
        this.button2.setBounds(220, 220, 60, 20);
        this.button2.addActionListener(this);
        this.add(this.button2);
        this.button3 = new JButton("SIGN UP");
        this.button3.setFont(new Font("Arial", 1, 7));
        this.button3.setForeground(Color.WHITE);
        this.button3.setBackground(Color.black);
        this.button3.setBounds(150, 250, 130, 20);
        this.button3.addActionListener(this);
        this.add(this.button3);
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backlog.jpg"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, 1);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        this.add(iiimage);
        this.setLayout((LayoutManager)null);
        this.setSize(420, 420);
        this.setLocation(450, 200);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() != this.button1) {
                if (e.getSource() == this.button2) {
                    this.textField2.setText("");
                    this.passwordField3.setText("");
                } else if (e.getSource() == this.button3) {
                }
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}