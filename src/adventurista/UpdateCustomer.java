
package adventurista;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class UpdateCustomer extends JFrame implements ActionListener{
    
    JLabel labelusername, labelname;
    JComboBox comboid;
    JTextField tfnumber, tfcountry, tfaddress, tfphone, tfemail,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton add, back;
    String username;
    
    UpdateCustomer(String username){
        this.username=username;
        setBounds(500,200,750,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel ibltext = new JLabel("Update Personal Details");
        ibltext.setBounds(50,0,300,25);
        ibltext.setFont(new Font("tahoma",Font.PLAIN,20));
        add(ibltext);
        
        JLabel iblusername = new JLabel("Username");
        iblusername.setBounds(30,50,150,25);
        add(iblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel ibid = new JLabel("ID");
        ibid.setBounds(30,90,150,25);
        add(ibid);
        
        tfid = new JTextField();
        tfid.setBounds(220, 90, 150, 25);
        add(tfid);
        
        JLabel iblnumber = new JLabel("Number");
        iblnumber.setBounds(30,130,150,25);
        add(iblnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(220, 130, 150, 25);
        add(tfnumber);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,170,150,25);
        add(lblname);
        
        labelname = new JLabel();
        labelname.setBounds(220,170,150,25);
        add(labelname);
        
        JLabel iblgender = new JLabel("Gender");
        iblgender.setBounds(30,210,150,25);
        add(iblgender);
        
        tfgender = new JTextField();
        tfgender.setBounds(220, 210, 150, 25);
        add(tfgender);
        
        JLabel iblcountry = new JLabel("Country");
        iblcountry.setBounds(30,250,150,25);
        add(iblcountry);
        
        tfcountry = new JTextField();
        tfcountry.setBounds(220, 250, 150, 25);
        add(tfcountry);
        
        JLabel ibladdress = new JLabel("Address");
        ibladdress.setBounds(30,290,150,25);
        add(ibladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(220, 290, 150, 25);
        add(tfaddress);
        
        JLabel iblphone = new JLabel("Phone");
        iblphone.setBounds(30,330,150,25);
        add(iblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(220, 330, 150, 25);
        add(tfphone);
        
        JLabel iblemail = new JLabel("Email");
        iblemail.setBounds(30,370,150,25);
        add(iblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(220, 370, 150, 25);
        add(tfemail);
        
        add= new JButton("Update");
        add.setBounds(70,430,100,25);
        add.setBackground(Color.BLACK);
        add.setFont(new Font("Tahoma", Font.BOLD,14));
        add.setForeground(Color.white);
        add.addActionListener(this);
        add(add);
        
        back= new JButton("Back");
        back.setBounds(220,430,100,25);
        back.setBackground(Color.BLACK);
        back.setFont(new Font("Tahoma", Font.BOLD,14));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(300, 100, 450, 300);
        add(image);
        
        try{
            Conn c= new Conn();
           ResultSet rs= c.s.executeQuery("select * from customer where username='"+username+"' ");
           while(rs.next()){
               labelusername.setText(rs.getString("username"));
               labelname.setText(rs.getString("name"));
               tfid.setText(rs.getString("id"));
               tfnumber.setText(rs.getString("number"));
               tfgender.setText(rs.getString("gender"));
               tfcountry.setText(rs.getString("country"));
               tfaddress.setText(rs.getString("address"));
               tfphone.setText(rs.getString("phone"));
               tfemail.setText(rs.getString("email"));
               
           }
        
        }
        catch(Exception e){
            e.printStackTrace();
        
        }
        
        setVisible(true);
        
        
    }
    public void  actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
             String username=labelusername.getText();
             String id= tfid.getText();
             String number= tfnumber.getText();
             String name= labelname.getText();
             String gender= tfgender.getText();
             String country= tfcountry.getText();
             String address=tfaddress.getText();
             String phone=tfphone.getText();
             String email=tfemail.getText();
             
             try{
                 Conn c= new Conn();
                 String query="update customer set username='"+username+"',id='"+id+"',number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
                 c.s.executeUpdate(query);
                 
                 JOptionPane.showMessageDialog(null, "Customer Details Updated Succesfully");
                 setVisible(false);
             }
             catch(Exception e){
                 e.printStackTrace();
             }
             
        }
        else{
            setVisible(false);
            
        }
    }
    public static void main(String[] args) {
        new UpdateCustomer("");
    }
}


    

