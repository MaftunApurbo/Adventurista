
package adventurista;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener{
    
    JLabel labelusername, labelname;
    JComboBox comboid;
    JTextField tfnumber, tfcountry, tfaddress, tfphone, tfemail;
    JRadioButton rmale,rfemale;
    JButton add, back;
    String username;
    AddCustomer(String username){
        this.username=username;
        setBounds(450,200,650,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel iblusername = new JLabel("Username");
        iblusername.setBounds(30,50,150,25);
        add(iblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel ibid = new JLabel("ID");
        ibid.setBounds(30,90,150,25);
        add(ibid);
        
        comboid = new JComboBox(new String[]{"Passport", "NID","Driving Licence"});
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
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
        
        rmale = new JRadioButton("Male");
        rmale.setBounds(220, 210, 70, 25);
        rmale.setBackground(Color.WHITE);
        add(rmale);
        
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300, 210, 70, 25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
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
        
        add= new JButton("Add");
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
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(300, 40, 450, 420);
        add(image);
        
        try{
            Conn c= new Conn();
           ResultSet rs= c.s.executeQuery("select * from account where username='"+username+"' ");
           while(rs.next()){
               labelusername.setText(rs.getString("username"));
               labelname.setText(rs.getString("name"));
               
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
             String id= (String)comboid.getSelectedItem();
             String number= tfnumber.getText();
             String name= labelname.getText();
             String gender= null;
             if(rmale.isSelected()){
                 gender="Male";
             }
             else{
                 gender="Female";
             }
             String country= tfcountry.getText();
             String address=tfaddress.getText();
             String phone=tfphone.getText();
             String email=tfemail.getText();
             
             try{
                 Conn c= new Conn();
                 String query="insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                 c.s.executeUpdate(query);
                 
                 JOptionPane.showMessageDialog(null, "Customer Details Uploaded Succesfully");
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
        new AddCustomer("");
    }
}


    

