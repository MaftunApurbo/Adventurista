

package adventurista;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class ViewPackage extends JFrame implements ActionListener {
    JButton back;
    String username;
    ViewPackage(String username){
        this.username=username;
        setBounds(450,200,900,450);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel text = new JLabel("View Package Details");
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setBounds(60,0,300,30);
        add(text);
        
        JLabel lblusername= new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername= new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblpackage= new JLabel("Package Name");
        lblpackage.setBounds(30,90,150,25);
        add(lblpackage);
        
        JLabel labelpackage= new JLabel();
        labelpackage.setBounds(220,90,150,25);
        add(labelpackage);
        
        JLabel lblnumber= new JLabel("Total Persons");
        lblnumber.setBounds(30,130,150,25);
        add(lblnumber);
        
        JLabel labelpersons= new JLabel();
        labelpersons.setBounds(220,130,150,25);
        add(labelpersons);
        
        JLabel lblname= new JLabel("ID");
        lblname.setBounds(30,170,150,25);
        add(lblname);
        
        JLabel labelid= new JLabel();
        labelid.setBounds(220,170,150,25);
        add(labelid);
        
        JLabel lblgender= new JLabel("ID Number");
        lblgender.setBounds(30,210,150,25);
        add(lblgender);
        
        JLabel labelnumber= new JLabel();
        labelnumber.setBounds(220,210,150,25);
        add(labelnumber);
        
        JLabel lblcountry= new JLabel("Phone");
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);
        
        JLabel labelphone= new JLabel();
        labelphone.setBounds(220,250,150,25);
        add(labelphone);
        
        JLabel lbladdress= new JLabel("Price");
        lbladdress.setBounds(30,290,150,25);
        add(lbladdress);
        
        JLabel labelprice= new JLabel();
        labelprice.setBounds(220,290,150,25);
        add(labelprice);
        
       
        
        
        back= new JButton("Back");
        back.setBounds(130,360,100,25);
        back.setBackground(Color.BLACK);
        back.setFont(new Font("Tahoma", Font.BOLD,14));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/view.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 20, 500, 400);
        add(image);
        
        try{
            Conn c=new Conn();
            String query="select * from bookpackage where username='"+username+"'";
            ResultSet rs=c.s.executeQuery(query);
            
            while(rs.next()){
               labelusername.setText(rs.getString("username"));
               labelpackage.setText(rs.getString("package"));
               labelid.setText(rs.getString("id"));
               labelnumber.setText(rs.getString("number"));
               labelprice.setText(rs.getString("price"));
               labelphone.setText(rs.getString("phone"));
               labelpersons.setText(rs.getString("persons"));
              
            }
        
        }catch(Exception e){
        e.printStackTrace();
        }
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String[] args) {
        new ViewPackage("");
    }
}
