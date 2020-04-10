
package sms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Create_Sales_Invoice extends JFrame
{
    private Container container;
    private ImageIcon logo,home_button_icon,create_sales_invoice_button_icon,create_purchase_invoice_button_icon,logout_button_icon,clear_button_icon,add_to_cart_button_icon,print_button_icon,save_button_icon;
    private JPanel horizontal_panel_top,main_panel,horizontal_panel_bottom,input_panel,output_panel;
    private JLabel null_label,date_label,sales_id_label,customer_name_label,customer_address_label,customer_mobile_number_label,product_type_label,model_number_label,quantity_label,per_item_price_label,payment_label,paid_label,due_label;
    private JTextField date_textfield,sales_id_textfield,customer_name_textfield,customer_address_textfield,customer_mobile_number_textfield,quantity_textfield,per_item_price_textfield,payment_textfield,paid_textfield,due_textfield;
    private JButton home_button,create_sales_invoice_button,create_purchase_invoice_button,logout_button,clear_button,add_to_cart_button,print_button,save_button;
    private JComboBox product_type_combobox,model_number_combobox;
    private Cursor hand_cursor = new Cursor(Cursor.HAND_CURSOR);
    
    
    private String product_type[] = new String[100];
    
    
    Create_Sales_Invoice()
    {  
        setFrame();
        setContainer();
        setIcons();
        setPanels();
        setButtons();
        setInputPanel();
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
        container.setLayout(new BorderLayout(15,0));
        container.setBackground(Color.white);
    }
    
    public void setIcons()
    {
        logo = new ImageIcon(this.getClass().getResource("/Pictures/shopping-cart.png"));
        this.setIconImage(logo.getImage());
        
        home_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/home_button_icon.png"));
        create_sales_invoice_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/create_sales_invoice_button_icon.png"));
        create_purchase_invoice_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/create_purchase_invoice_button_icon.png"));
        logout_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/logout_button_icon.png"));   
        clear_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/clear_button_icon.png"));
        add_to_cart_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/add_to_cart_button_icon.png"));
        print_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/print_button_icon.png"));
        save_button_icon = new ImageIcon(this.getClass().getResource("/Pictures/save_button_icon.png"));
    }   
    
    
    public void setPanels()
    {
        null_label = new JLabel("");
        container.add(null_label,BorderLayout.WEST);
        null_label = new JLabel("");
        container.add(null_label,BorderLayout.EAST);
        
        
        horizontal_panel_top = new JPanel();
        horizontal_panel_top.setLayout(new GridLayout(1,4));
        horizontal_panel_top.setCursor(hand_cursor);
        container.add(horizontal_panel_top,BorderLayout.NORTH);
        
        horizontal_panel_bottom = new JPanel();
        horizontal_panel_bottom.setLayout(new GridLayout(1,4));
        horizontal_panel_bottom.setCursor(hand_cursor);
        container.add(horizontal_panel_bottom,BorderLayout.SOUTH);
        
        main_panel = new JPanel();
        main_panel.setLayout(new GridLayout(1,2));
        container.add(main_panel,BorderLayout.CENTER);
        
        input_panel = new JPanel();
        input_panel.setLayout(new GridLayout(12,2));
        main_panel.add(input_panel);
        
        output_panel = new JPanel();
        output_panel.setLayout(new BorderLayout());
        main_panel.add(output_panel);
    }
    
    
    public void setButtons()
    {
        home_button = new JButton("Home");
        home_button.setFont(new Font("Arial",Font.PLAIN,16));
        home_button.setBackground(Color.DARK_GRAY);
        home_button.setForeground(Color.WHITE);
        home_button.setIcon(home_button_icon);
        home_button.setFocusPainted(false);
        horizontal_panel_top.add(home_button);
        
        
        create_sales_invoice_button = new JButton("Create Sales Invoice");
        create_sales_invoice_button.setFont(new Font("Arial",Font.BOLD,16));
        create_sales_invoice_button.setBackground(Color.LIGHT_GRAY);
        create_sales_invoice_button.setForeground(Color.BLACK);
        create_sales_invoice_button.setFocusPainted(false);
        horizontal_panel_top.add(create_sales_invoice_button);
        
        create_purchase_invoice_button = new JButton("Create Purchase Invoice");
        create_purchase_invoice_button.setFont(new Font("Arial",Font.PLAIN,16));
        create_purchase_invoice_button.setBackground(Color.DARK_GRAY);
        create_purchase_invoice_button.setForeground(Color.WHITE);
        create_purchase_invoice_button.setFocusPainted(false);
        horizontal_panel_top.add(create_purchase_invoice_button);
        
        
        logout_button = new JButton("Log Out");
        logout_button.setFont(new Font("Arial",Font.PLAIN,16));
        logout_button.setBackground(Color.DARK_GRAY);
        logout_button.setForeground(Color.WHITE);
        logout_button.setIcon(logout_button_icon);
        logout_button.setFocusPainted(false);
        horizontal_panel_top.add(logout_button); 
        
        
        clear_button = new JButton("Clear");
        clear_button.setFont(new Font("Arial",Font.PLAIN,16));
        clear_button.setBackground(Color.DARK_GRAY);
        clear_button.setForeground(Color.WHITE);
        clear_button.setIcon(clear_button_icon);
        clear_button.setFocusPainted(false);
        horizontal_panel_bottom.add(clear_button);
        
        add_to_cart_button = new JButton("Add To Cart");
        add_to_cart_button.setFont(new Font("Arial",Font.PLAIN,16));
        add_to_cart_button.setBackground(Color.DARK_GRAY);
        add_to_cart_button.setForeground(Color.WHITE);
        add_to_cart_button.setIcon(add_to_cart_button_icon);
        add_to_cart_button.setFocusPainted(false);
        horizontal_panel_bottom.add(add_to_cart_button);
        
        
        print_button = new JButton("Print");
        print_button.setFont(new Font("Arial",Font.PLAIN,16));
        print_button.setBackground(Color.DARK_GRAY);
        print_button.setForeground(Color.WHITE);
        print_button.setIcon(print_button_icon);
        print_button.setFocusPainted(false);
        horizontal_panel_bottom.add(print_button);
        
        save_button = new JButton("Save");
        save_button.setFont(new Font("Arial",Font.PLAIN,16));
        save_button.setBackground(Color.DARK_GRAY);
        save_button.setForeground(Color.WHITE);
        save_button.setIcon(save_button_icon);
        save_button.setFocusPainted(false);
        horizontal_panel_bottom.add(save_button);
    }
    
    public void setInputPanel()
    {
        input_panel.setBackground(Color.WHITE);
        
        sales_id_label = new JLabel("Id");
        sales_id_label.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(sales_id_label);
        sales_id_textfield = new JTextField();
        sales_id_textfield.setEditable(false);
        sales_id_textfield.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(sales_id_textfield);
        setId();
        
        
        date_label = new JLabel("Date & Time");
        date_label.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(date_label);
        date_textfield = new JTextField();
        date_textfield.setEditable(false);
        date_textfield.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(date_textfield);
        setDate();
        
        
        customer_name_label = new JLabel("Enter Customer's Name");
        customer_name_label.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(customer_name_label);
        customer_name_textfield = new JTextField();
        customer_name_textfield.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(customer_name_textfield);
        
        
        customer_address_label = new JLabel("Enter Customer's Address");
        customer_address_label.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(customer_address_label);
        customer_address_textfield = new JTextField();
        customer_address_textfield.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(customer_address_textfield);
        
        
        customer_mobile_number_label = new JLabel("Enter Mobile Number");
        customer_mobile_number_label.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(customer_mobile_number_label);
        customer_mobile_number_textfield = new JTextField();
        customer_mobile_number_textfield.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(customer_mobile_number_textfield);
        
        
        product_type_label = new JLabel("Enter Product's Type");
        product_type_label.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(product_type_label);
        setProductTypeElements();
        product_type_combobox = new JComboBox(product_type);
        product_type_combobox.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(product_type_combobox);
        
        
        
        model_number_label = new JLabel("Enter Product's Model");
        model_number_label.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(model_number_label);
        model_number_combobox = new JComboBox();
        model_number_combobox.setEnabled(false);
        model_number_combobox.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(model_number_combobox);
        
        
        quantity_label = new JLabel("Enter Product's Quantity");
        quantity_label.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(quantity_label);
        quantity_textfield = new JTextField("");
        quantity_textfield.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(quantity_textfield);
        
        
        per_item_price_label = new JLabel("Enter Per Item Price");
        per_item_price_label.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(per_item_price_label);
        per_item_price_textfield = new JTextField("");
        per_item_price_textfield.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(per_item_price_textfield);
        
        
        payment_label = new JLabel("Product's Payment");
        payment_label.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(payment_label);
        payment_textfield = new JTextField("");
        payment_textfield.setFont(new Font("Arial",Font.BOLD,14));
        payment_textfield.setEditable(false);
        input_panel.add(payment_textfield);
        
        
        paid_label = new JLabel("Enter Paid Amount");
        paid_label.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(paid_label);
        paid_textfield = new JTextField("");
        paid_textfield.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(paid_textfield);
        
        
        due_label = new JLabel("Due Amount");
        due_label.setFont(new Font("Arial",Font.BOLD,14));
        input_panel.add(due_label);
        due_textfield = new JTextField("");
        due_textfield.setFont(new Font("Arial",Font.BOLD,14));
        due_textfield.setEditable(false);
        input_panel.add(due_textfield);
  
    }
    
    public void setOutputPanel()
    {
       output_panel.setBackground(Color.GRAY);
    }
    
    public void setId()
    {
    try{
          BufferedReader br = new BufferedReader(new FileReader("Sales_Database.txt"));
          String s = "",temp="";
          while((s=br.readLine())!=null)
          {
              temp=s;
          }

          sales_id_textfield.setText(""+(Integer.parseInt(temp.substring(0, 5))+1));
            
            
        }catch(Exception e){}
    
    
    }
    
    
    
    
    public void setDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy E hh:mm:ss a");
        Date date = new Date();
        date_textfield.setText(sdf.format(date));
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
    
    

    public boolean check_digit(char character)
    {
       if(character!='0'&&character!='1'&&character!='2'&&character!='3'&&character!='4'&&character!='5'&&character!='6'&&character!='7'&&character!='8'&&character!='9'&&character!=(char)8&&character!=(char)10)
        {    
            JOptionPane.showMessageDialog(null, "Please Enter Valid Digits");
            return true; 
        }
       else
       {
           return false;
       }
    }
    
    
    public boolean check_money_digit(char character)
    {
       if(character!='0'&&character!='1'&&character!='2'&&character!='3'&&character!='4'&&character!='5'&&character!='6'&&character!='7'&&character!='8'&&character!='9'&&character!=(char)8&&character!=(char)10&&character!=(char)46)
        {    
            JOptionPane.showMessageDialog(null, "Please Enter Valid Digits");
            return true; 
        }
       else
       {
           return false;
       }
    }
    
    public void setPayment()
    {
             try{ 
                int answer = Math.round(Float.parseFloat(quantity_textfield.getText())*Float.parseFloat(per_item_price_textfield.getText()));
                        
                if(answer>1000000000)
                {
                    JOptionPane.showMessageDialog(null, "Please Do Not Enter Large Digits");
                    quantity_textfield.setText("");
                    per_item_price_textfield.setText("");
                    payment_textfield.setText("");
                }
                        else
                        {
                            payment_textfield.setText(""+answer);
                        }              
               
               }catch(Exception e)  {}
    }
    
    
    
    public void setDue()
    {
            try{ 
                int answer = Math.round(Float.parseFloat(payment_textfield.getText())-Float.parseFloat(paid_textfield.getText()));
                        
                if(answer>1000000000)
                {
                    JOptionPane.showMessageDialog(null, "Please Do Not Enter Large Digits");
                    
                    paid_textfield.setText("");
                    due_textfield.setText("");
                }
                else
                {
                    due_textfield.setText(""+answer);
                }              
               
               }catch(Exception e)  {}

    }
    
    
    public boolean check_all_filled_up()
    {
        if("".equals(sales_id_textfield.getText())||"".equals(date_textfield.getText())||"".equals(customer_name_textfield.getText())||"".equals(customer_address_textfield.getText())||"".equals(customer_mobile_number_textfield.getText())||"".equals(product_type_combobox.getSelectedItem())||"".equals(model_number_combobox.getSelectedItem())||"".equals(quantity_textfield.getText())||"".equals(per_item_price_textfield.getText())||"".equals(payment_textfield.getText())||"".equals(paid_textfield.getText())||"".equals(due_textfield.getText()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    
    public void setActionListeners()
    {
        customer_name_textfield.addKeyListener(new KeyListener()
        {
            public void keyTyped(KeyEvent ke){    
            }

            public void keyPressed(KeyEvent ke) 
            {
                char demo[] = customer_name_textfield.getText().toCharArray();
                
                int i=0;            
                
                while(i!=customer_name_textfield.getText().length())
                {        
                    if((demo[i]<'a'||demo[i]>'z')&&(demo[i]<'A'||demo[i]>'Z')&&demo[i]!=(char)32&&demo[i]!=10)
                    {
                        JOptionPane.showMessageDialog(null, "Please Enter Valid Name (not invalid characters)");
                        customer_name_textfield.setText(""); 
                        break;
                    }
                    else
                    {
                        i++;
                    }                    
                }    
            }

            public void keyReleased(KeyEvent ke) {
            }
        
        });
        
        
        
        customer_mobile_number_textfield.addKeyListener(new KeyListener()
        {
           
            public void keyTyped(KeyEvent ke){    
            }

            public void keyPressed(KeyEvent ke) 
            {
                if(check_digit(ke.getKeyChar()))
                {
                    customer_mobile_number_textfield.setText("");
                }
                
                if(customer_mobile_number_textfield.getText().length()>10)
                {
                   JOptionPane.showMessageDialog(null, "Please Enter Valid Mobile Number (not more than 11 digits)");
                   customer_mobile_number_textfield.setText("");
                }
            }

            public void keyReleased(KeyEvent ke) {
            }
        
        });
        
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
                int i=0;
                
                while(i!=demo.length)
                {
                    answer=answer+demo[i];
                    if(demo[i]=='.')
                    {
                        model_number_combobox.addItem(answer);
                        answer="";
                    }
                    i++;
                }              
            }catch(Exception ex){}
               
            }
  
        });
        
        
        
        quantity_textfield.addKeyListener(new KeyListener()
        { 
            public void keyTyped(KeyEvent ke){    
            }

            public void keyPressed(KeyEvent ke) 
            {   
                if(check_digit(ke.getKeyChar()))
                {
                    quantity_textfield.setText("");
                }                 
            }

            public void keyReleased(KeyEvent ke) 
            { 
                setPayment();
                setDue();
            }
            
        });
        
        
        per_item_price_textfield.addKeyListener(new KeyListener()
        { 
            public void keyTyped(KeyEvent ke){  
            }

            public void keyPressed(KeyEvent ke) 
            {  
                if(check_money_digit(ke.getKeyChar()))
                {
                    per_item_price_textfield.setText("");
                    payment_textfield.setText("");
                }  
            }

            public void keyReleased(KeyEvent ke) 
            {
                String input_text = per_item_price_textfield.getText();
                
                char demo[] = input_text.toCharArray();
                
                int i = 0,count=0;
                
                while(i!=input_text.length())
                {
                    if(demo[i]=='.')
                    {
                        count++;
                    }
                    i++;
                }
             
                if(count>1)
                {
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Digits");
                    per_item_price_textfield.setText("");
                }    
                else
                {   
                    setPayment();
                    setDue();
                }
             }
            
        
        });
        
        
        
        paid_textfield.addKeyListener(new KeyListener()
        {
           
            public void keyTyped(KeyEvent ke){    
            }

            public void keyPressed(KeyEvent ke) 
            {
                if(check_money_digit(ke.getKeyChar()))
                {
                    paid_textfield.setText("");
                }
            }

            public void keyReleased(KeyEvent ke) 
            {
                {
                String input_text = paid_textfield.getText();
                
                char demo[] = input_text.toCharArray();
                
                int i = 0,count=0;
                
                while(i!=input_text.length())
                {
                    if(demo[i]=='.')
                    {
                        count++;
                    }
                    i++;
                }
             
                if(count>1)
                {
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Digits");
                    paid_textfield.setText("");
                }    
                else
                {    
                    setPayment();
                    setDue();
                }
             }
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
        
        
        logout_button.addActionListener(new ActionListener()
        {     
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Log_In frame = new Log_In();
                frame.setVisible(true);
            }
        });
        
        
        clear_button.addActionListener(new ActionListener()
        {     
            public void actionPerformed(ActionEvent e)
            {
                sales_id_textfield.setText("");
                customer_name_textfield.setText("");
                customer_address_textfield.setText("");
                customer_mobile_number_textfield.setText("");
                product_type_combobox.setSelectedItem("");
                model_number_combobox.setSelectedItem("");
                quantity_textfield.setText("");
                per_item_price_textfield.setText("");
                payment_textfield.setText("");
                paid_textfield.setText("");
                due_textfield.setText("");
            }
        });  
        
        add_to_cart_button.addActionListener(new ActionListener()
        {     
            public void actionPerformed(ActionEvent e)
            {
                if(check_all_filled_up())
                {
                    JOptionPane.showMessageDialog(null, "Please Enter All Information");
                }
                else
                {
                    
                    
                    product_type_combobox.setSelectedItem("");
                    model_number_combobox.setSelectedItem("");
                    quantity_textfield.setText("");
                    per_item_price_textfield.setText("");
                    payment_textfield.setText("");
                    paid_textfield.setText("");
                    due_textfield.setText("");
                }
            }
        });  
        
    }
    
  
    public static void main(String[] args) 
    {
        Create_Sales_Invoice frame = new Create_Sales_Invoice();
        frame.setVisible(true);           
    }
}
