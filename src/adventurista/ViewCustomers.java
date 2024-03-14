
package adventurista;


import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class ViewCustomers extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblAvailability;
	private JLabel lblCleanStatus;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblRoomNumber;
	private JLabel lblId;
        private JTextField search1;
        DefaultTableModel tdtm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCustomers frame = new ViewCustomers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

        
	public ViewCustomers() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(280, 100, 1200, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                Image i3 = i1.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0,450,626,201);
                add(l1);
                
                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                Image i5 = i4.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel l2 = new JLabel(i6);
                l2.setBounds(615,450,626,201);
                add(l2);
                
		
		table = new JTable();
		table.setBounds(0, 40, 1200, 350);
		contentPane.add(table);
                
                try{
                    Conn c = new Conn();
                        String displayCustomersql = "select * from bookhotel";
                        ResultSet rs = c.s.executeQuery(displayCustomersql);
                        table.setModel(DbUtils.resultSetToTableModel(rs));
                        
                }
                catch(Exception e1){
                        e1.printStackTrace();
                }
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
                
               
                btnNewButton.setBounds(450, 400, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
                
		
		lblAvailability = new JLabel("Username");
		lblAvailability.setBounds(20, 15, 69, 14);
		contentPane.add(lblAvailability);
		
		lblCleanStatus = new JLabel("Hotel");
		lblCleanStatus.setBounds(150, 15, 76, 14);
		contentPane.add(lblCleanStatus);
		
		lblNewLabel = new JLabel("Persons");
		lblNewLabel.setBounds(280, 15, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Days");
		lblNewLabel_1.setBounds(410, 15, 76, 14);
		contentPane.add(lblNewLabel_1);

		
		lblId = new JLabel("Ac/Non-AC");
		lblId.setBounds(500, 15, 90, 14);
		contentPane.add(lblId);
                
                JLabel l3 = new JLabel("Food");
		l3.setBounds(650, 15, 90, 14);
		contentPane.add(l3);
                
                JLabel l4 = new JLabel("ID");
		l4.setBounds(750, 15, 90, 14);
		contentPane.add(l4);
                
                JLabel l5 = new JLabel("ID Number");
		l5.setBounds(870, 15, 90, 14);
		contentPane.add(l5);
                
                JLabel l6 = new JLabel("Phone");
		l6.setBounds(980, 15, 90, 14);
		contentPane.add(l6);
                
                JLabel l7 = new JLabel("Price");
		l7.setBounds(1100, 15, 90, 14);
		contentPane.add(l7);
                
                getContentPane().setBackground(Color.WHITE);
	}

}