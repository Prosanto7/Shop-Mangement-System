package sms;

import java.io.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Sales_Information extends JFrame
{
    private Container c;
    private JScrollPane scroll;
    private JComboBox productcombo;
    private JLabel idlabel,datelabel,namelabel,addresslabel,mobilenumlabel,productlabel,quantitylabel,amountlabel,totalpricelabel;
    private JTextField idtextfield,datetextfield,nametextfield,addresstextfield,mobilenumtextfield,quantitytextfield,amounttextfield,totalpricetextfield;
    private JTextArea showinfotextarea;
    private JButton submit,clear,show,home;
    private ImageIcon logo;
    
    private Font f = new Font("Times New Roman",Font.BOLD,16);
    private Cursor crsr = new Cursor(Cursor.HAND_CURSOR);
   
    
    private String[] rows = new String[20];
    
    private String[] options = {"","WFE-2A3-GDEL","WEX-3B0-GDXX","WFE-1B6-GDXX","WFE-3A7-GDEL","AWS-32-DEL","WXE-2B6-GDXX","WFE-2A3-XX"};
    
     
    Sales_Information()
    {  
        Frame();
        Container();
        frame_logo();
        Label();
        TextField();
        Button();
        Action_Listener();
    }
    
    public void Frame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250,100,1050,500);
        setTitle("SHOP MANAGEMENT SYSTEM");
    }
        
    public void Container()
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
        idlabel = new JLabel("Enter Sales ID");
        idlabel.setBounds(20, 30, 200, 30);
        idlabel.setFont(f);
        idlabel.setOpaque(true);
        idlabel.setBackground(Color.BLACK);
        idlabel.setForeground(Color.WHITE);
        idlabel.setHorizontalAlignment(JLabel.CENTER);
        c.add(idlabel);
        
        datelabel = new JLabel("Enter Date");
        datelabel.setBounds(20, 70, 200, 30);
        datelabel.setFont(f);
        datelabel.setOpaque(true);
        datelabel.setBackground(Color.BLACK);
        datelabel.setForeground(Color.WHITE);
        datelabel.setHorizontalAlignment(JLabel.CENTER);
        c.add(datelabel);
 
        
        namelabel = new JLabel("Enter Customer's Name");
        namelabel.setBounds(20, 110, 200, 30);
        namelabel.setFont(f);
        namelabel.setOpaque(true);
        namelabel.setBackground(Color.BLACK);
        namelabel.setForeground(Color.WHITE);
        namelabel.setHorizontalAlignment(JLabel.CENTER);
        c.add(namelabel);
      
        
        addresslabel = new JLabel("Enter Customer's Address");
        addresslabel.setBounds(20, 150, 200, 30);
        addresslabel.setFont(f);
        addresslabel.setOpaque(true);
        addresslabel.setBackground(Color.BLACK);
        addresslabel.setForeground(Color.WHITE);
        addresslabel.setHorizontalAlignment(JLabel.CENTER);
        c.add(addresslabel);
        
        
        mobilenumlabel = new JLabel("Enter Mobile Number");
        mobilenumlabel.setBounds(20, 190, 200, 30);
        mobilenumlabel.setFont(f);
        mobilenumlabel.setOpaque(true);
        mobilenumlabel.setBackground(Color.BLACK);
        mobilenumlabel.setForeground(Color.WHITE);
        mobilenumlabel.setHorizontalAlignment(JLabel.CENTER);
        c.add(mobilenumlabel);
        
        productlabel = new JLabel("Enter Product Model");
        productlabel.setBounds(20, 230, 200, 30);
        productlabel.setFont(f);
        productlabel.setOpaque(true);
        productlabel.setBackground(Color.BLACK);
        productlabel.setForeground(Color.WHITE);
        productlabel.setHorizontalAlignment(JLabel.CENTER);
        c.add(productlabel);
        
        
        quantitylabel = new JLabel("Enter Product Quantity");
        quantitylabel.setBounds(20, 270, 200, 30);
        quantitylabel.setFont(f);
        quantitylabel.setOpaque(true);
        quantitylabel.setBackground(Color.BLACK);
        quantitylabel.setForeground(Color.WHITE);
        quantitylabel.setHorizontalAlignment(JLabel.CENTER);
        c.add(quantitylabel);
        
        
        amountlabel = new JLabel("Enter Product Amount");
        amountlabel.setBounds(20, 310, 200, 30);
        amountlabel.setFont(f);
        amountlabel.setOpaque(true);
        amountlabel.setBackground(Color.BLACK);
        amountlabel.setForeground(Color.WHITE);
        amountlabel.setHorizontalAlignment(JLabel.CENTER);
        c.add(amountlabel);
        
        
        totalpricelabel = new JLabel("Total Price");
        totalpricelabel.setBounds(20, 350, 200, 30);
        totalpricelabel.setFont(f);
        totalpricelabel.setOpaque(true);
        totalpricelabel.setBackground(Color.BLACK);
        totalpricelabel.setForeground(Color.WHITE);
        totalpricelabel.setHorizontalAlignment(JLabel.CENTER);
        c.add(totalpricelabel);
        
    }
    
    public void TextField()
    {
        idtextfield = new JTextField();
        idtextfield.setBounds(250, 30, 200, 30);
        idtextfield.setFont(f);
        idtextfield.setHorizontalAlignment(JLabel.CENTER);
        c.add(idtextfield);
        
        datetextfield = new JTextField();
        datetextfield.setBounds(250, 70, 200, 30);
        datetextfield.setFont(f);
        datetextfield.setHorizontalAlignment(JLabel.CENTER);
        c.add(datetextfield);
        
        
        nametextfield = new JTextField();
        nametextfield.setBounds(250, 110, 200, 30);
        nametextfield.setFont(f);
        nametextfield.setHorizontalAlignment(JLabel.CENTER);
        c.add(nametextfield);
        
        
        addresstextfield = new JTextField();
        addresstextfield.setBounds(250, 150, 200, 30);
        addresstextfield.setFont(f);
        addresstextfield.setHorizontalAlignment(JLabel.CENTER);
        c.add(addresstextfield);
        
        
        mobilenumtextfield = new JTextField();
        mobilenumtextfield.setBounds(250, 190, 200, 30);
        mobilenumtextfield.setFont(f);
        mobilenumtextfield.setHorizontalAlignment(JLabel.CENTER);
        c.add(mobilenumtextfield);
        
        
        productcombo = new JComboBox(options);
        productcombo.setBounds(250, 230, 200, 30);
        productcombo.setEditable(true);
        productcombo.setFont(f);
        c.add(productcombo);
        
        
        quantitytextfield = new JTextField();
        quantitytextfield.setBounds(250, 270, 200, 30);
        quantitytextfield.setFont(f);
        quantitytextfield.setHorizontalAlignment(JLabel.CENTER);
        c.add(quantitytextfield);
        
        
        amounttextfield = new JTextField();
        amounttextfield.setBounds(250, 310, 200, 30);
        amounttextfield.setFont(f);
        amounttextfield.setHorizontalAlignment(JLabel.CENTER);
        c.add(amounttextfield);
        
        
        totalpricetextfield = new JTextField();
        totalpricetextfield.setBounds(250, 350, 200, 30);
        totalpricetextfield.setFont(f);
        totalpricetextfield.setHorizontalAlignment(JLabel.CENTER);
        c.add(totalpricetextfield);
        
        showinfotextarea = new JTextArea();
        showinfotextarea.setFont(f);
        scroll = new JScrollPane(showinfotextarea);
        scroll.setBounds(500, 30, 500, 350);
        c.add(scroll);
        
    }
    
    public void Button()
    {
        submit = new JButton("SUBMIT");
        submit.setBounds(250,400,100,50);
        submit.setFont(f);
        submit.setBackground(Color.DARK_GRAY);
        submit.setForeground(Color.WHITE);
        submit.setCursor(crsr);
        c.add(submit);
        
        
        clear = new JButton("CLEAR");
        clear.setBounds(120,400,100,50);
        clear.setFont(f);
        clear.setBackground(Color.DARK_GRAY);
        clear.setForeground(Color.WHITE);
        clear.setCursor(crsr);
        c.add(clear);
        
        
        show = new JButton("SHOW");
        show.setBounds(380,400,100,50);
        show.setFont(f);
        show.setBackground(Color.DARK_GRAY);
        show.setForeground(Color.WHITE);
        show.setCursor(crsr);
        c.add(show);
        
        
        home = new JButton("HOME");
        home.setBounds(510,400,100,50);
        home.setFont(f);
        home.setBackground(Color.DARK_GRAY);
        home.setForeground(Color.WHITE);
        home.setCursor(crsr);
        c.add(home);   
    }
    
    public void All_TestField_Clear()
    {
        idtextfield.setText("");
        datetextfield.setText("");
        nametextfield.setText("");
        addresstextfield.setText("");
        mobilenumtextfield.setText("");
        productcombo.setSelectedItem("");
        quantitytextfield.setText("");
        amounttextfield.setText("");
        totalpricetextfield.setText("");  
        showinfotextarea.setText("");
    
    }
    
    
    public void Action_Listener()
    {
        submit.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {   
                rows[0] = idtextfield.getText();
                rows[1] = datetextfield.getText();
                rows[2] = nametextfield.getText();
                rows[3] = addresstextfield.getText();
                rows[4] = mobilenumtextfield.getText();
                rows[5] = (String)productcombo.getSelectedItem();
                rows[6] = quantitytextfield.getText();
                rows[7] = amounttextfield.getText();
                rows[8] = totalpricetextfield.getText();
                
                //model.addRow(rows);
                if(rows[0].isEmpty()||rows[1].isEmpty()||rows[2].isEmpty()||rows[3].isEmpty()||rows[4].isEmpty()||rows[5].isEmpty()||rows[6].isEmpty()||rows[7].isEmpty()||rows[8].isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Please Enter All Values","Error",JOptionPane.ERROR_MESSAGE);
                }                  
                else
                {
                try
                {
                    File f = new File("Sales_Database.txt");
                   
                    PrintWriter p = new PrintWriter(new FileOutputStream(f,true));
                    p.append(idtextfield.getText()+","+datetextfield.getText()+","+nametextfield.getText()+","+addresstextfield.getText()+","+mobilenumtextfield.getText()+","+(String)productcombo.getSelectedItem()+","+quantitytextfield.getText()+","+amounttextfield.getText()+","+totalpricetextfield.getText()+"\n");
                    p.close();
                    
                    All_TestField_Clear();
                    
                    
                } 
                catch (FileNotFoundException ex) {}
            }
                
                 
            }
        });
                
        clear.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {
                All_TestField_Clear();
            }
        });
        
        home.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Home frame = new Home();
                frame.setVisible(true);
            }
            
        });
        
        show.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    BufferedReader br = new BufferedReader(new FileReader("Sales_Database.txt"));
                    String s="";
                    while((s=br.readLine())!=null)
                    {
                        String data[] = new String[0];
                        data=s.split(",");
                        for(int i=0;i<8;i++)
                        {
                            showinfotextarea.append(data[i]+"   ");
                        }
                        showinfotextarea.append("\n");
                    }
                 
                }
                catch(Exception ex)    {}
            }
        
        });
   
    }

    public static void main(String[] args) 
    {
        Sales_Information frame = new Sales_Information();
        frame.setVisible(true);           
    }
    
}
