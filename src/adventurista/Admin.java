
package adventurista;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Admin extends JFrame{
    String username;
    public static void main(String[] args) {
        new Admin("").setVisible(true);
    }
    
    public Admin(String username) {
        super("Adventurista");
	this.username = username;
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.png"));
        Image i2 = i1.getImage().getScaledInstance(1600, 750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1600, 750); 
        add(NewLabel);
        
        JLabel l1 = new JLabel("Adventurista");
	l1.setForeground(Color.blue);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 55));
	l1.setBounds(700, 35, 1700, 100);
	NewLabel.add(l1);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu m1 = new JMenu("CUSTOMER");
        m1.setForeground(Color.BLUE);
	menuBar.add(m1);
		
      
        
        JMenuItem mi2 = new JMenuItem("DESTINATIONS");
	m1.add(mi2);
        
        JMenuItem mi3 = new JMenuItem("VIEW CUSTOMER DETAILS");
	m1.add(mi3);
     
       
        
        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Destinations().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewCustomers().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
        
		
	JMenu m2 = new JMenu("PACKAGES");
        m2.setForeground(Color.RED);
	menuBar.add(m2);
        
        JMenuItem mi6 = new JMenuItem("CHECK PACKAGE");
	m2.add(mi6);
        
     
        mi6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckPackage().setVisible(true);
                }catch(Exception e ){}
            }
	});
          
        JMenu m3 = new JMenu("HOTELS");
        m3.setForeground(Color.BLUE);
	menuBar.add(m3);
        
        
        JMenuItem mi9 = new JMenuItem("VIEW HOTELS");
	m3.add(mi9);
        
       
        
      
	mi9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckHotels().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
         JMenu m6 = new JMenu("UTILITY");
        m6.setForeground(Color.RED);
	menuBar.add(m6);
        
        JMenuItem mi13 = new JMenuItem("NOTEPAD");
	m6.add(mi13);
        
        JMenuItem mi14 = new JMenuItem("CALCULATOR");
	m6.add(mi14);
        
        mi13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){ }
            }
	});
        
        
        mi14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){ }
            }
	});
        
        
        
        
       
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}