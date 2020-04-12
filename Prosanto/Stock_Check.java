
package sms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static javax.swing.BorderFactory.createMatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Stock_Check extends JFrame
{
    private Container container;
    private ImageIcon logo,shop_name_button_icon,create_sales_invoice_button_icon,create_purchase_invoice_button_icon,logout_button_icon,home_button_icon,daily_income_cost_button_icon,stock_check_button_icon,due_check_button_icon,staff_attendence_button_icon,settings_button_icon;
    private JLabel null_label,product_type_label,model_number_label;
    private JComboBox product_type_combobox,model_number_combobox;
    private JTextField show_quantity_textfield,total_item_textfield;
    private JPanel horizontal_panel,vertical_panel,main_panel,output_panel;
    private JButton shop_name_button,create_sales_invoice_button,create_purchase_invoice_button,logout_button,home_button,daily_income_cost_button,stock_check_button,due_check_button,staff_attendence_button,settings_button;
    private Cursor hand_cursor = new Cursor(Cursor.HAND_CURSOR);
    private String product_type[] = new String[100];
    
    
    Stock_Check()
    {  
        setFrame();
        setContainer();
        setIcons();
        setPanels();
        setButtons();
        setMainPanel();
        setOutputPanel();
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
        
        main_panel = new JPanel();
        main_panel.setLayout(new BorderLayout(70,50));
        main_panel.setBackground(Color.WHITE);
        container.add(main_panel,BorderLayout.CENTER);

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
        home_button.setFont(new Font("Arial",Font.PLAIN,16));
        home_button.setBackground(Color.DARK_GRAY);
        home_button.setForeground(Color.WHITE);
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
        stock_check_button.setFont(new Font("Arial",Font.BOLD,16));
        stock_check_button.setBackground(Color.LIGHT_GRAY);
        stock_check_button.setForeground(Color.BLACK);
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
   
    public void setMainPanel()
    {
        null_label = new JLabel();
        main_panel.add(null_label,BorderLayout.NORTH);
        
        null_label = new JLabel();
        main_panel.add(null_label,BorderLayout.EAST);
        
        null_label = new JLabel();
        main_panel.add(null_label,BorderLayout.WEST);
        
        null_label = new JLabel();
        main_panel.add(null_label,BorderLayout.SOUTH);
        
        output_panel = new JPanel();
        output_panel.setLayout(new GridLayout(6,1));
        output_panel.setCursor(hand_cursor);
        output_panel.setBackground(Color.WHITE);
        main_panel.add(output_panel,BorderLayout.CENTER);

    }
    
    
    public void setOutputPanel()
    {
        
        product_type_label = new JLabel("Product Type");
        product_type_label.setBackground(Color.WHITE);
        product_type_label.setFont(new Font("Arial",Font.BOLD,14));
        output_panel.add(product_type_label);
        
        setProductTypeElements();
        product_type_combobox = new JComboBox(product_type);
        product_type_combobox.setFont(new Font("Arial",Font.BOLD,14));
        output_panel.add(product_type_combobox);
        
        model_number_label = new JLabel("Model Number");
        model_number_label.setBackground(Color.WHITE);
        model_number_label.setFont(new Font("Arial",Font.BOLD,14));        
        output_panel.add(model_number_label);
        
        model_number_combobox = new JComboBox();
        model_number_combobox.setEnabled(false);
        model_number_combobox.setFont(new Font("Arial",Font.BOLD,14));
        output_panel.add(model_number_combobox);
        
        show_quantity_textfield = new JTextField();
        show_quantity_textfield.setFont(new Font("Arial",Font.BOLD,14));
        show_quantity_textfield.setEditable(false);
        show_quantity_textfield.setBackground(Color.WHITE);
        output_panel.add(show_quantity_textfield);
        
        total_item_textfield = new JTextField();
        total_item_textfield.setFont(new Font("Arial",Font.BOLD,14));
        total_item_textfield.setEditable(false);
        total_item_textfield.setBackground(Color.WHITE);
        output_panel.add(total_item_textfield);
        
    }
    
    
    public void setProductTypeElements()
    {
        try{                    
                BufferedReader br = new BufferedReader(new FileReader("pruduct_type_&_model_list.txt"));
                String s;
                int i = 1;
                product_type[0]="";
                while((s=br.readLine())!=null)
                {
                    product_type[i] = s.substring(0, s.indexOf(","));
                    i++;
                }
                
            }catch(Exception ex){}
    }
    
    
    public int getRemainingQuantity(String model_number,String filename)
    {
        boolean found = false;
        int modelCount = 0;
        
        if(model_number==null||"".equals(model_number))
        {
            return 0;
        } 
        else
        {
        
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            int s = 0;
            String text="";
            
            while((s=br.read())!=-1)
            {
                text = text + (char)s;
            }
            
            
            Pattern pattern = Pattern.compile(model_number);
            Matcher matcher = pattern.matcher(text);
            
            
            while(matcher.find())
            {
                int i;
                String mn="";             
                
                for(i=(matcher.end()+1);text.charAt(i)!=(char)44;i++)
                {
                    mn = mn + text.charAt(i);
                }
                
                modelCount = modelCount+Integer.parseInt(mn);               
                found = true;
            }
      
            }catch(Exception e){System.out.println(e);}
            
            if(!found)
            {
                return 0;
            }
            else
            {
                return modelCount;
            }
            
        }   
    } 
    
    
    public int getTotalStock(String model_number,String purchase_filename,String sales_filename)
    {
    
        int product_sold = getRemainingQuantity(model_number,sales_filename);
        int product_purchased = getRemainingQuantity(model_number,purchase_filename);
        
        return (product_purchased-product_sold);
    
    }
    
    
    public void setActionListeners()
    {
        product_type_combobox.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                model_number_combobox.setEnabled(true);
                model_number_combobox.removeAllItems();
                model_number_combobox.addItem("");
                
                try{                    
                BufferedReader br = new BufferedReader(new FileReader("pruduct_type_&_model_list.txt"));
                String s,result="",answer="";
     
                while((s=br.readLine())!=null)
                {
                    if(product_type_combobox.getSelectedItem().equals(s.substring(0, s.indexOf(","))))
                    {
                        result = s.substring(s.indexOf(",")+1, s.length());    
                    }
                }
         
                char demo[] = result.toCharArray();
                int i=0,model_count=0;
                
                while(i!=demo.length)
                {
                    answer = answer + demo[i];
                    if(demo[i]=='.')
                    {
                        model_number_combobox.addItem(answer);
                        model_count = model_count + getTotalStock(answer,"Purchase_Database.txt","Sales_Database.txt");
                        answer="";
                    }
                    i++;
                }
                
                total_item_textfield.setText("Total "+product_type_combobox.getSelectedItem()+"  =  "+model_count);
                                
                
            }catch(Exception ex){System.out.println(ex);}
               
            }
  
        });
        
        
        model_number_combobox.addActionListener(new ActionListener()
        {     
            public void actionPerformed(ActionEvent e)
            {
                show_quantity_textfield.setText(""+getTotalStock((String)model_number_combobox.getSelectedItem(),"Purchase_Database.txt","Sales_Database.txt"));
            }
        });
        
        
        
        create_sales_invoice_button.addActionListener(new ActionListener()
        {     
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Create_Sales_Invoice frame = new Create_Sales_Invoice();
                frame.setVisible(true);
            }
        });
        
        
        create_purchase_invoice_button.addActionListener(new ActionListener()
        {     
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Create_Purchase_Invoice frame = new Create_Purchase_Invoice();
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
        
        
        home_button.addActionListener(new ActionListener()
        {     
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Home frame = new Home();
                frame.setVisible(true);
            }
        });
        
    }
    
  
    public static void main(String[] args) 
    {
        Stock_Check frame= new Stock_Check();
        frame.setVisible(true);           
    }
}
