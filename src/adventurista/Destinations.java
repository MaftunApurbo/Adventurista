
package adventurista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Destinations extends JFrame implements ActionListener{
   
    JButton back, notepad,deletePersonalDetails,calculators,addPersonalDetails,payments,viewbookedhotel,bookhotels,destinations,viewhotels,viewpackages, bookpackages,viewPersonalDetails,updatePersonalDetails,checkpackages;
    Destinations(){
        
        setBounds(0, 0, 1800, 1200);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 103));
        p1.setBounds(0,0, 1600, 65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Destinations");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);//
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0,65, 300, 800);
        add(p2);
        
        addPersonalDetails = new JButton("Dhaka");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        addPersonalDetails.addActionListener(this);   
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Rajshahi");
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        updatePersonalDetails.addActionListener(this); 
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("Rangpur");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("Barishal");
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        checkpackages = new JButton("Sylhet");
        checkpackages.setBounds(0, 200, 300, 50);
        checkpackages.setBackground(new Color(0, 0, 102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma",Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0, 0, 0, 60));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackages = new JButton("Chittagong");
        bookpackages.setBounds(0, 250, 300, 50);
        bookpackages.setBackground(new Color(0, 0, 102));
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont(new Font("Tahoma",Font.PLAIN, 20));
        bookpackages.setMargin(new Insets(0, 0, 0, 60));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);
        
        viewpackages = new JButton("Khulna");
        viewpackages.setBounds(0, 300, 300, 50);
        viewpackages.setBackground(new Color(0, 0, 102));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont(new Font("Tahoma",Font.PLAIN, 20));
        viewpackages.setMargin(new Insets(0, 0, 0, 60));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);
        
        viewhotels = new JButton("Mymenshing");
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 0, 0, 60));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotels = new JButton("Cox's Bazar");
        bookhotels.setBounds(0, 400, 300, 50);
        bookhotels.setBackground(new Color(0, 0, 102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont(new Font("Tahoma",Font.PLAIN, 20));
        bookhotels.setMargin(new Insets(0, 0, 0, 60));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        
        back = new JButton("Back");
        back.setBounds(0, 450, 300, 50);
        back.setBackground(new Color(0, 0, 102));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.PLAIN, 20));
        back.setMargin(new Insets(0, 0, 0, 60));
        back.addActionListener(this);
        p2.add(back);
       
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.png"));
        Image i5 = i4.getImage().getScaledInstance(1000, 800, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(350, 0, 1000, 800);
        add(image); 
        
        JLabel text = new JLabel("Adventurista");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.blue);
        text.setFont(new Font("Raleway",Font.PLAIN,55));
        image.add(text);

        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetails){
           new Dhaka();
            
        }
        else if(ae.getSource()==viewPersonalDetails){
            
            new Rangpur();
        }
        else if(ae.getSource()==updatePersonalDetails){
           
            new Rajshahi();
        }
        else if(ae.getSource()==checkpackages){
           new Sylhet();
        }
        else if(ae.getSource()==bookpackages){
           new Chitagong();
        }
        else if(ae.getSource()==viewpackages){
           
            new Khulna();
        }
        else if(ae.getSource()==viewhotels){
           new Mymenshing();
            
        }
        else if(ae.getSource()==back){
            setVisible(false);
            
        }
        else if(ae.getSource()==bookhotels){
            new Cox();
            
        }
        
    else if(ae.getSource()==deletePersonalDetails){
            
            new Barishal();
        }
    
    }
    public static void main(String[] args) {
        new Destinations();
    }
    
}
