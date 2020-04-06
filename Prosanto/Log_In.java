
package sms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.BorderFactory.createMatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Log_In extends JFrame
{  
    private Container container;
    private JPanel picture_panel,component_panel;
    private JLabel picture_label,header_label,username_label,password_label,null_label;
    private JTextField username_textfield;
    private JPasswordField password_field;
    private JButton login_button;
    private GridLayout grid_layout;
    private ImageIcon logo,display_picture,login_button_icon;
    
    
    private Cursor crsr = new Cursor(Cursor.HAND_CURSOR);
    
    
    
    Log_In()
    {  
        setFrame();
        setContainer();
        setIcons();
        setLayouts();
        setPanels();
        setPicturePanel();
        setComponetPanel();
        setActionListeners();
    }
    
    public void setFrame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 500);
        this.setLocationRelativeTo(null);
        setTitle("SHOP MANAGEMENT SYSTEM");
    }
    
    public void setContainer()
    {
         container = this.getContentPane();
         container.setLayout(null);
         container.setBackground(Color.white);
    }
      
    public void setIcons()
    {
        logo = new ImageIcon(this.getClass().getResource("/Pictures/shopping-cart.png"));
        this.setIconImage(logo.getImage());
        
        
        
        login_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/login_button_icon.png"));
        display_picture = new ImageIcon(this.getClass().getResource("/Pictures/display_picture.png"));

        
    }
    
    public void setLayouts()
    {
        grid_layout = new GridLayout();
        grid_layout.setRows(11);
        
    
    }
    
    
    
    public void setPanels()
    {
        picture_panel = new JPanel();
        picture_panel.setBounds(90, 80, 320, 320);
        picture_panel.setBackground(Color.white);
        container.add(picture_panel);
        

        component_panel = new JPanel();
        component_panel.setBounds(500, 20, 275, 370);
        component_panel.setLayout(grid_layout);
        component_panel.setBackground(Color.white);
        container.add(component_panel);
    
    }
    

    public void setPicturePanel()
    {
        picture_label = new JLabel(display_picture);
        picture_panel.add(picture_label);
    
   
    }
    
    
    
    
    
    public void setComponetPanel()
    {
        header_label = new JLabel("User Login");
        header_label.setHorizontalAlignment(JLabel.CENTER);
        header_label.setFont(new Font("Arial",Font.BOLD,30));
        component_panel.add(header_label);
        
        
        null_label = new JLabel();
        component_panel.add(null_label);
        null_label = new JLabel();
        component_panel.add(null_label);
        
        
        username_label = new JLabel("Username");
        username_label.setForeground(Color.GRAY);
        username_label.setFont(new Font("Arial",Font.BOLD,20));
        component_panel.add(username_label);
        
        
        username_textfield = new JTextField();
        username_textfield.setFont(new Font("Arial",Font.BOLD,16));
        username_textfield.setForeground(Color.black);
        username_textfield.setBorder(createMatteBorder(0,0,2,0,Color.blue));
        component_panel.add(username_textfield);
        
        
        null_label = new JLabel();
        component_panel.add(null_label);
        
        
        password_label = new JLabel("Password");
        password_label.setForeground(Color.GRAY);
        password_label.setFont(new Font("Arial",Font.BOLD,20));
        component_panel.add(password_label);
        
        
        password_field = new JPasswordField();
        password_field.setForeground(Color.black);
        password_field.setBorder(createMatteBorder(0,0,2,0,Color.blue));
        component_panel.add(password_field);
        
        
        null_label = new JLabel();
        component_panel.add(null_label);
        null_label = new JLabel();
        component_panel.add(null_label);
        
        
        login_button = new JButton(login_button_icon);
        login_button.setBorder(null);
        login_button.setBackground(Color.white);
        component_panel.add(login_button);   
    }
    
    
    public void setActionListeners()
    {
        
        
        
        
    }
     
    public static void main(String[] args) 
    {
        Log_In frame = new Log_In();
        frame.setVisible(true);           
    }
}
