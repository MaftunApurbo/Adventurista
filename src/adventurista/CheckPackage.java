
package adventurista;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckPackage extends JFrame{
    public static void main(String[] args) {
      new CheckPackage().setVisible(true);
    }

    CheckPackage() {    
      setBounds(550, 220, 900, 600);  
      setVisible(true);
      String[] package1 = new String[]{"package1.jpg","Cox's Bazar","6 days and 7 Nights", "Bus Ticket", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Open Bar", "Guide", "BOOK NOW", "Summer Special", "BDT 6000 only"};
      String[] package2 = new String[]{"package2.jpg","Chittagong & Bandarban","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Bus Ticket", "Welcome drinks on Arrival", "Night Safari", "Full Day hike Guide", "Jungle Dinner", "BOOK NOW", "Winter Special", "BDT 7000 only"};
      String[] package3 = new String[]{"package3.jpg","Sylhet","6 days and 5 Nights", "Return Airfare", "CNG and Tour cost", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 3 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "BDt 10000 only"};
      String[] package4 = new String[]{"package4.jpg","Rangamati","3 days and 4 Nights", "House Boat", "Boat games, Swiming Things", "Welcome drinks on Arrival", "Daily Buffet", "Guide", "BBQ Dinner", "BOOK NOW", "Winter Special", "BDT 8000 only"};
      String[] package5 = new String[]{"package5.jpg","Dhaka","6 days and 7 Nights", "Bus Ticket", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Open Bar", "Guide", "BOOK NOW", "Summer Special", "BDT 6000 only"};
      String[] package6 = new String[]{"package6.jpg","Rajshahi","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Bus Ticket", "Welcome drinks on Arrival", "Night Safari", "Full Day hike Guide", "Jungle Dinner", "BOOK NOW", "Winter Special", "BDT 7000 only"};
      String[] package7 = new String[]{"package7.jpg","Khulna","6 days and 5 Nights", "Return Airfare", "CNG and Tour cost", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 3 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "BDt 10000 only"};
      String[] package8 = new String[]{"package8.jpg","Barishal","3 days and 4 Nights", "House Boat", "Boat games, Swiming Things", "Welcome drinks on Arrival", "Daily Buffet", "Guide", "BBQ Dinner", "BOOK NOW", "Winter Special", "BDT 8000 only"};
      String[] package9 = new String[]{"package9.jpg","Mymenshing","6 days and 7 Nights", "Bus Ticket", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Open Bar", "Guide", "BOOK NOW", "Summer Special", "BDT 6000 only"};
      String[] package10 = new String[]{"package10.jpg","Rangpur","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Bus Ticket", "Welcome drinks on Arrival", "Night Safari", "Full Day hike Guide", "Jungle Dinner", "BOOK NOW", "Winter Special", "BDT 7000 only"};
      
      JTabbedPane tabbedPane = new JTabbedPane();
      JPanel p1 = createPackage(package1);
      tabbedPane.addTab("Package 1", null, p1);
      
      JPanel p2 = createPackage(package2);
      tabbedPane.addTab("Package 2", null, p2);
      
      JPanel p3 = createPackage(package3);
      tabbedPane.addTab("Package 3", null, p3);
      
      JPanel p4 = createPackage(package4);
      tabbedPane.addTab("Package 4", null, p4);
      
      JPanel p5 = createPackage(package5);
      tabbedPane.addTab("Package 5", null, p5);
      
      JPanel p6 = createPackage(package6);
      tabbedPane.addTab("Package 6", null, p6);
      
      JPanel p7 = createPackage(package7);
      tabbedPane.addTab("Package 7", null, p7);
      
      JPanel p8 = createPackage(package8);
      tabbedPane.addTab("Package 8", null, p8);
      
      JPanel p9 = createPackage(package9);
      tabbedPane.addTab("Package 9", null, p9);
      
      JPanel p10 = createPackage(package10);
      tabbedPane.addTab("Package 10", null, p10);
      
      
      add(tabbedPane, BorderLayout.CENTER);    
   }
    
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
      
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[0]));
        Image i3 = i1.getImage().getScaledInstance(550, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(400,0,450,420);
        p1.add(l1);

        JLabel lblName = new JLabel(pack[1]);
        lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblName.setBounds(50, 5, 350, 53);
        p1.add(lblName);

        JLabel l3 = new JLabel(pack[2]);
        l3.setForeground(Color.RED);
        l3.setBounds(35, 70, 200, 14);
        p1.add(l3);

        JLabel lblId = new JLabel(pack[3]);
        lblId.setForeground(Color.BLUE);
        lblId.setBounds(35, 110, 200, 14);
        p1.add(lblId);

        JLabel l2 = new JLabel(pack[4]);
        l2.setForeground(Color.RED);
        l2.setBounds(35, 150, 200, 14);
        p1.add(l2);

        JLabel lblName_1 = new JLabel(pack[5]);
        lblName_1.setForeground(Color.BLUE);
        lblName_1.setBounds(35, 190, 200, 14);
        p1.add(lblName_1);

        JLabel lblGender = new JLabel(pack[6]);
        lblGender.setForeground(Color.RED);
        lblGender.setBounds(35, 230, 200, 14);
        p1.add(lblGender);

        JLabel lblCountry = new JLabel(pack[7]);
        lblCountry.setForeground(Color.BLUE);
        lblCountry.setBounds(35, 270, 200, 14);
        p1.add(lblCountry);

        JLabel lblReserveRoomNumber = new JLabel(pack[8]);
        lblReserveRoomNumber.setForeground(Color.RED);
        lblReserveRoomNumber.setBounds(35, 310, 200, 14);
        p1.add(lblReserveRoomNumber);

        JLabel lblCheckInStatus = new JLabel(pack[9]);
        lblCheckInStatus.setForeground(Color.BLUE);
        lblCheckInStatus.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblCheckInStatus.setBounds(35, 400, 200, 30);
        p1.add(lblCheckInStatus);

        JLabel lblDeposite = new JLabel(pack[10]);
        lblDeposite.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblDeposite.setBounds(35, 460, 400, 40);
        p1.add(lblDeposite);
        
        JLabel la1 = new JLabel(pack[11]);
        la1.setForeground(Color.RED);
        la1.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        la1.setBounds(600, 460, 400, 40);
        p1.add(la1);
        
        return p1;
    }
}
