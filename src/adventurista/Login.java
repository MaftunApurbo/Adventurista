package adventurista;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
    JButton login, signup, password;
    JTextField  tfusername;
    JPasswordField tfpassword;
    
    
    Login(){
        setSize(900,400);
        setLocation(350,200);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        JPanel p1= new JPanel();
        p1.setBackground(new Color(131,193,148));
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(100,100,200,200);
        p1.add(image);
        
        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        JLabel lblusername= new JLabel("Username");
        lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font("SAN SERIF", Font.BOLD,20));
        p2.add(lblusername);
        
        tfusername =new JTextField();
        tfusername.setBounds(60,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblpassword= new JLabel("Password");
        lblpassword.setBounds(60,100,100,25);
        lblpassword.setFont(new Font("SAN SERIF", Font.BOLD,20));
        p2.add(lblpassword);
        
        tfpassword =new JPasswordField();
        tfpassword.setBounds(60,140,300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        login= new JButton("Login");
        login.setBounds(60,190,125,30);
        login.setBackground(new Color(131,193,148));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(131,193,148)));
        login.addActionListener(this);
        p2.add(login);
        
        signup= new JButton("Sign Up");
        signup.setBounds(200,190,125,30);
        signup.setBackground(new Color(131,193,148));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(131,193,148)));
        signup.addActionListener(this);
        p2.add(signup);
        
        password= new JButton("Forgot Password?");
        password.setBounds(130,230,130,30);
        password.setBackground(new Color(131,193,148));
        password.setForeground(Color.WHITE);
        password.setBorder(new LineBorder(new Color(131,193,148)));
        password.addActionListener(this);
        p2.add(password);
        
       
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
           
            try{
                
                String username= tfusername.getText();
                String pass=  tfpassword.getText();
                
                if(username.equals("admin")&&pass.equals("admin")){
                    setVisible(false);
                    new Admin(username);
                }
                else{
                String query= "select * from account where username ='"+username+"' AND password ='"+pass+"'";

                Conn c = new Conn();
                c.s.executeQuery(query);
                
                 ResultSet rs=   c.s.executeQuery(query);
             
             if(rs.next()){
                 setVisible(false);
                 new Loading(username);
             
             }
             else{
                 JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
             }
                }
                
             
            }
            catch(Exception e){
                e.printStackTrace();
            
            }
        }
        else if (ae.getSource()==signup){
            setVisible(false);
            new Signup();
        
        }
        else if (ae.getSource()==password){
            setVisible(false);
            new ForgetPassword();
        
        }
    
    }
    public static void main(String[] args) {
        new Login();
    }
}
