
package sms;

import java.awt.BorderLayout;
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
import javax.swing.JPanel;


public class Home extends JFrame
{
    private Container container;
    private ImageIcon logo,shop_name_button_icon,create_sales_invoice_button_icon,create_purchase_invoice_button_icon,logout_button_icon,home_button_icon,daily_income_cost_button_icon,stock_check_button_icon,due_check_button_icon,staff_attendence_button_icon,settings_button_icon;
    private JPanel horizontal_panel,vertical_panel;
    private JButton shop_name_button,create_sales_invoice_button,create_purchase_invoice_button,logout_button,home_button,daily_income_cost_button,stock_check_button,due_check_button,staff_attendence_button,settings_button;
    private Cursor hand_cursor = new Cursor(Cursor.HAND_CURSOR);
    
    Home()
    {  
        setFrame();
        setContainer();
        setIcons();
        setPanels();
        setButtons();
        setActionListeners();
    }
    
    public void setFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(880, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("SHOP MANAGEMENT SYSTEM");
    }
        
    public void setContainer()
    {
        container = this.getContentPane();
        container.setLayout(new BorderLayout());
        container.setBackground(Color.white);
    }
    
    public void setIcons()
    {
        logo = new ImageIcon(this.getClass().getResource("/Pictures/shopping-cart.png"));
        this.setIconImage(logo.getImage());
        
        shop_name_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/shop_name_button_icon.png"));
        create_sales_invoice_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/create_sales_invoice_button_icon.png"));
        create_purchase_invoice_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/create_purchase_invoice_button_icon.png"));
        logout_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/logout_button_icon.png"));  
        home_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/home_button_icon.png"));
        daily_income_cost_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/daily_income_cost_button_icon.png"));
        stock_check_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/stock_check_button_icon.png"));
        due_check_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/due_check_button_icon.png"));
        staff_attendence_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/staff_attendence_button_icon.png"));
        settings_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/settings_button_icon.png"));
    }   
    
    
    public void setPanels()
    {
        horizontal_panel = new JPanel();
        horizontal_panel.setLayout(new GridLayout(1,3));
        horizontal_panel.setCursor(hand_cursor);
        container.add(horizontal_panel,BorderLayout.NORTH);
        
        vertical_panel = new JPanel();
        vertical_panel.setLayout(new GridLayout(6,1));
        vertical_panel.setCursor(hand_cursor);
        container.add(vertical_panel,BorderLayout.WEST);
        
    }
    
    
    public void setButtons()
    {
        shop_name_button = new JButton("Shop Name");
        shop_name_button.setFont(new Font("Arial",Font.PLAIN,16));
        shop_name_button.setBackground(Color.DARK_GRAY);
        shop_name_button.setForeground(Color.WHITE);
        shop_name_button.setFocusPainted(false);
        horizontal_panel.add(shop_name_button);
        
        
        create_sales_invoice_button = new JButton("Create Sales Invoice");
        create_sales_invoice_button.setFont(new Font("Arial",Font.PLAIN,16));
        create_sales_invoice_button.setBackground(Color.DARK_GRAY);
        create_sales_invoice_button.setForeground(Color.WHITE);
        create_sales_invoice_button.setFocusPainted(false);
        horizontal_panel.add(create_sales_invoice_button);
        
      
        create_purchase_invoice_button = new JButton("Create Purchase Invoice");
        create_purchase_invoice_button.setFont(new Font("Arial",Font.PLAIN,16));
        create_purchase_invoice_button.setBackground(Color.DARK_GRAY);
        create_purchase_invoice_button.setForeground(Color.WHITE);
        create_purchase_invoice_button.setFocusPainted(false);
        horizontal_panel.add(create_purchase_invoice_button);
        
    
        logout_button = new JButton("Log Out");
        logout_button.setFont(new Font("Arial",Font.PLAIN,16));
        logout_button.setBackground(Color.DARK_GRAY);
        logout_button.setForeground(Color.WHITE);
        logout_button.setIcon(logout_button_icon);
        logout_button.setFocusPainted(false);
        horizontal_panel.add(logout_button);
           
 
        home_button = new JButton(" Home");
        home_button.setFont(new Font("Arial",Font.BOLD,16));
        home_button.setBackground(Color.LIGHT_GRAY);
        home_button.setForeground(Color.BLACK);
        home_button.setIcon(home_button_icon);
        home_button.setFocusPainted(false);
        vertical_panel.add(home_button);
        
   
        daily_income_cost_button = new JButton(" Daily Income Cost ");
        daily_income_cost_button.setFont(new Font("Arial",Font.PLAIN,16));
        daily_income_cost_button.setBackground(Color.DARK_GRAY);
        daily_income_cost_button.setForeground(Color.WHITE);
        daily_income_cost_button.setIcon(daily_income_cost_button_icon);
        daily_income_cost_button.setFocusPainted(false);
        vertical_panel.add(daily_income_cost_button);
        
 
        stock_check_button = new JButton(" Stock Check");
        stock_check_button.setFont(new Font("Arial",Font.PLAIN,16));
        stock_check_button.setBackground(Color.DARK_GRAY);
        stock_check_button.setForeground(Color.WHITE);
        stock_check_button.setIcon(stock_check_button_icon);
        stock_check_button.setFocusPainted(false);
        vertical_panel.add(stock_check_button);
        
     
        due_check_button = new JButton(" Due Check");
        due_check_button.setFont(new Font("Arial",Font.PLAIN,16));
        due_check_button.setBackground(Color.DARK_GRAY);
        due_check_button.setForeground(Color.WHITE);
        due_check_button.setIcon(due_check_button_icon);
        due_check_button.setFocusPainted(false);
        vertical_panel.add(due_check_button);
       
       
        staff_attendence_button = new JButton(" Staff Attendence");
        staff_attendence_button.setFont(new Font("Arial",Font.PLAIN,16));
        staff_attendence_button.setBackground(Color.DARK_GRAY);
        staff_attendence_button.setForeground(Color.WHITE);
        staff_attendence_button.setIcon(staff_attendence_button_icon);
        staff_attendence_button.setFocusPainted(false);
        vertical_panel.add(staff_attendence_button);
        
     
        settings_button = new JButton(" Settings");
        settings_button.setFont(new Font("Arial",Font.PLAIN,16));
        settings_button.setBackground(Color.DARK_GRAY);
        settings_button.setForeground(Color.WHITE);
        settings_button.setIcon(settings_button_icon);
        settings_button.setFocusPainted(false);
        vertical_panel.add(settings_button);      
    }
   
    public void setActionListeners()
    {
        create_sales_invoice_button.addActionListener(new ActionListener()
        {     
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Create_Sales_Invoice frame = new Create_Sales_Invoice();
                frame.setVisible(true);
            }
        });
        
        
        logout_button.addActionListener(new ActionListener()
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
