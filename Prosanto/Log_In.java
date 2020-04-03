
package sms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Log_In extends JFrame
{  
    private Container c;
    private JLabel userlabel,passwordlabel;
    private JTextField usertextfield;
    private JPasswordField passwordfield;
    private JButton submit,clear;
    private ImageIcon logo;
    
    private Font f = new Font("Times New Roman",Font.BOLD,16);
    private Cursor crsr = new Cursor(Cursor.HAND_CURSOR);
    
    
    
    Log_In()
    {  
        Frame();
        container();
        frame_logo();
        Label();
        TextField();
        Button();
        Action_Listener();
    }
    
    public void Frame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250,100,500,500);
        setTitle("SHOP MANAGEMENT SYSTEM");
    }
        
    public void container()
    {
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.LIGHT_GRAY);
    }
    
    public void frame_logo()
    {
        logo = new ImageIcon(this.getClass().getResource("shopping-cart.png"));
        this.setIconImage(logo.getImage());
    }
    
    public void Label()
    {
        userlabel = new JLabel("Enter Your Username");
        userlabel.setBounds(20, 100, 200, 40);
        userlabel.setFont(f);
        userlabel.setOpaque(true);
        userlabel.setBackground(Color.BLACK);
        userlabel.setForeground(Color.WHITE);
        userlabel.setHorizontalAlignment(JLabel.CENTER);
        c.add(userlabel);
        
        passwordlabel = new JLabel("Enter Your Password");
        passwordlabel.setBounds(20, 150, 200, 40);
        passwordlabel.setFont(f);
        passwordlabel.setOpaque(true);
        passwordlabel.setBackground(Color.BLACK);
        passwordlabel.setForeground(Color.WHITE);
        passwordlabel.setHorizontalAlignment(JLabel.CENTER);
        c.add(passwordlabel);
    }
    
    public void TextField()
    {
        usertextfield = new JTextField();
        usertextfield.setBounds(250, 100, 200, 40);
        usertextfield.setFont(f);
        usertextfield.setHorizontalAlignment(JLabel.CENTER);
        c.add(usertextfield);
        
        passwordfield = new JPasswordField();
        passwordfield.setBounds(250, 150, 200, 40);
        passwordfield.setHorizontalAlignment(JLabel.CENTER);
        c.add(passwordfield);
    }
    
    public void Button()
    {
        submit = new JButton("SUBMIT");
        submit.setBounds(250,210,100,50);
        submit.setFont(f);
        submit.setBackground(Color.DARK_GRAY);
        submit.setForeground(Color.WHITE);
        submit.setCursor(crsr);
        c.add(submit);
        
        
        clear = new JButton("CLEAR");
        clear.setBounds(120,210,100,50);
        clear.setFont(f);
        clear.setBackground(Color.DARK_GRAY);
        clear.setForeground(Color.WHITE);
        clear.setCursor(crsr);
        c.add(clear);
    
    }
    
    public void Action_Listener()
    {
        submit.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {   
                String s1 = usertextfield.getText();
                String s2 = passwordfield.getText();
                 if(s1.isEmpty()||s2.isEmpty())
                 {
                    JOptionPane.showMessageDialog(null, "Please Inter All Values","ERROR",JOptionPane.ERROR_MESSAGE);
                 }
                 else
                 {
                    if("prosanto".equals(s1)&&"123".equals(s2))
                    {
                         dispose();
                         Home frame = new Home();
                         frame.setVisible(true);   
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Wrong Value","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                 }
            }
        });
        
        
        clear.addActionListener(new ActionListener()
        {
        
            public void actionPerformed(ActionEvent e)
            {
                usertextfield.setText("");
                passwordfield.setText("");
            }
        });
    
    }
     
    public static void main(String[] args) 
    {
        Log_In frame = new Log_In();
        frame.setVisible(true);           
    }
}
