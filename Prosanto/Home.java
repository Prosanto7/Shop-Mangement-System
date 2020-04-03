
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

public class Home extends JFrame
{
    private Container c;
    private JButton Sales_Info,Purchase_Info,Log_Out;
    private ImageIcon logo;
    
    private Font f = new Font("Times New Roman",Font.BOLD,16);
    private Cursor crsr = new Cursor(Cursor.HAND_CURSOR);
    
    
    
    Home()
    {  
        Frame();
        container();
        frame_logo();
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
    
    
    public void Button()
    {
        Purchase_Info = new JButton("PURCHASE INFORMATION");
        Purchase_Info.setBounds(100,50,250,100);
        Purchase_Info.setFont(f);
        Purchase_Info.setBackground(Color.DARK_GRAY);
        Purchase_Info.setForeground(Color.WHITE);
        Purchase_Info.setCursor(crsr);
        c.add(Purchase_Info);
        
        
        Sales_Info = new JButton("SALES INFORMATION");
        Sales_Info.setBounds(100,170,250,100);
        Sales_Info.setFont(f);
        Sales_Info.setBackground(Color.DARK_GRAY);
        Sales_Info.setForeground(Color.WHITE);
        Sales_Info.setCursor(crsr);
        c.add(Sales_Info);
        
        
        Log_Out = new JButton("LOG OUT");
        Log_Out.setBounds(100,290,250,100);
        Log_Out.setFont(f);
        Log_Out.setBackground(Color.DARK_GRAY);
        Log_Out.setForeground(Color.WHITE);
        Log_Out.setCursor(crsr);
        c.add(Log_Out);
    
    }
    
    public void Action_Listener()
    {
        Sales_Info.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {   
                dispose();
                Sales_Information frame = new Sales_Information();
                frame.setVisible(true);   
            }
        });
        
        
        Purchase_Info.addActionListener(new ActionListener()
        {
        
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Purchase_Information frame = new Purchase_Information();
                frame.setVisible(true);  
            } 
        });
        
        Log_Out.addActionListener(new ActionListener()
        {
        
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Log_In frame = new Log_In();
                frame.setVisible(true);  
            } 
        });
        
        
    
    }
    
    
    
    
    
    public static void main(String[] args) 
    {
        Home frame= new Home();
        frame.setVisible(true);           
    }
}
