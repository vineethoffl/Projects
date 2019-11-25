package cfc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class tkt {
	public String s1,s2,s3;

	private JFrame frame;
	private JTextField tf1;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JLabel label;
	private JTextField tf5;
	private JLabel lblFrom;
	private JLabel lblTo;
	private JLabel lblFrom_1;
	private JLabel lblTime;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;
	private JTextField tf9;
	private JLabel lblTicketNo;
	private JLabel lblPrice;
	private JLabel lblRoute;
	private JTextField tf10;
	private JTextField tf11;
	private JTextField tf12;
	private JComboBox cb1;
	private JComboBox cb2;
	private JComboBox cb3;
	private JLabel lblTax;
	private JLabel lblDate;
	private JLabel lblTotal;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JButton btnTotal;
	private JButton btnReset;
	private JButton btnExit;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tkt window = new tkt();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tkt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(250, 240, 230));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.setBounds(100, 100, 958, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("TICKET BOOKING");
		lblTicketBooking.setForeground(new Color(0, 0, 0));
		lblTicketBooking.setBounds(299, 0, 440, 73);
		lblTicketBooking.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frame.getContentPane().add(lblTicketBooking);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(42, 84, 94, 28);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		frame.getContentPane().add(lblName);
		
		tf1 = new JTextField();
		tf1.setBounds(138, 83, 191, 34);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(419, 70, 513, 405);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		label = new JLabel("Name");
		label.setForeground(new Color(0, 0, 0));
		label.setBounds(29, 24, 64, 28);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panel.add(label);
		
		tf5 = new JTextField();
		tf5.setBounds(94, 23, 181, 35);
		tf5.setColumns(10);
		panel.add(tf5);
		
		lblFrom = new JLabel("From");
		lblFrom.setBounds(29, 96, 64, 22);
		lblFrom.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel.add(lblFrom);
		
		lblTo = new JLabel("To");
		lblTo.setBounds(29, 145, 40, 22);
		lblTo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel.add(lblTo);
		
		lblFrom_1 = new JLabel("Date");
		lblFrom_1.setBounds(29, 198, 64, 22);
		lblFrom_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel.add(lblFrom_1);
		
		lblTime = new JLabel("Time");
		lblTime.setBounds(29, 245, 64, 22);
		lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel.add(lblTime);
		
		tf6 = new JTextField();
		tf6.setBounds(94, 94, 130, 28);
		tf6.setColumns(10);
		panel.add(tf6);
		
		tf7 = new JTextField();
		tf7.setBounds(94, 143, 130, 28);
		tf7.setColumns(10);
		panel.add(tf7);
		
		tf8 = new JTextField();
		tf8.setBounds(94, 196, 130, 28);
		tf8.setColumns(10);
		panel.add(tf8);
		
		tf9 = new JTextField();
		tf9.setBounds(94, 243, 130, 28);
		tf9.setColumns(10);
		panel.add(tf9);
		
		lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setBounds(263, 93, 64, 28);
		lblTicketNo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel.add(lblTicketNo);
		
		lblPrice = new JLabel("Price");
		lblPrice.setBounds(263, 142, 84, 28);
		lblPrice.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel.add(lblPrice);
		
		lblRoute = new JLabel("Route");
		lblRoute.setBounds(263, 195, 64, 28);
		lblRoute.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel.add(lblRoute);
		
		tf10 = new JTextField();
		tf10.setBounds(346, 90, 130, 28);
		tf10.setColumns(10);
		panel.add(tf10);
		
		tf11 = new JTextField();
		tf11.setBounds(346, 145, 130, 28);
		tf11.setColumns(10);
		panel.add(tf11);
		
		tf12 = new JTextField();
		tf12.setBounds(346, 196, 130, 28);
		tf12.setColumns(10);
		panel.add(tf12);
		
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirm.setForeground(new Color(50, 205, 50));
		btnConfirm.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnConfirm.setBounds(220, 309, 101, 35);
		panel.add(btnConfirm);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 486, 922, 98);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(434, 5, 0, 0);
		panel_1.add(table_1);
		
		table = new JTable();
		table.setBounds(439, 5, 0, 0);
		panel_1.add(table);
		
		table_2 = new JTable();
		table_2.setBounds(10, 5, 902, 45);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No.Of Seats", "Time", "Date", "Ac/Non AC", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		panel_1.add(table_2);
		
		JRadioButton std = new JRadioButton("Standared");
		std.setBounds(159, 140, 109, 23);
		frame.getContentPane().add(std);
		std.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton st = new JRadioButton("Single Ticket");
		st.setBounds(27, 140, 109, 23);
		frame.getContentPane().add(st);
		st.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton ad = new JRadioButton("Adult");
		ad.setBounds(27, 176, 109, 23);
		frame.getContentPane().add(ad);
		ad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton fc = new JRadioButton("First Class");
		fc.setBounds(299, 140, 109, 23);
		frame.getContentPane().add(fc);
		fc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton ac = new JRadioButton("Ac");
		ac.setBounds(159, 176, 109, 23);
		frame.getContentPane().add(ac);
		ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton sl = new JRadioButton("Sleeper");
		sl.setBounds(299, 176, 109, 23);
		frame.getContentPane().add(sl);
		ButtonGroup G1 = new ButtonGroup();
		G1.add(sl);
		G1.add(std);
		G1.add(fc);
		G1.add(ac);
		sl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton cl = new JRadioButton("Child");
		cl.setBounds(27, 212, 109, 23);
		frame.getContentPane().add(cl);
		ButtonGroup G = new ButtonGroup();
		G.add(cl);
		G.add(ad);
		G.add(st);
		cl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		cb1 = new JComboBox();
		cb1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"        From", "Kottayam", "Trivandrum", "Kozhikkod"}));
		cb1.setBounds(27, 242, 109, 38);
		frame.getContentPane().add(cb1);
		
		cb2 = new JComboBox();
		cb2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"      To", "Kottayam", "Trivandrum", "Kozhikkod"}));
		cb2.setBounds(159, 242, 109, 38);
		frame.getContentPane().add(cb2);
		
		cb3 = new JComboBox();
		cb3.setFont(new Font("Tahoma", Font.BOLD, 14));
		cb3.setForeground(new Color(0, 0, 0));
		cb3.setModel(new DefaultComboBoxModel(new String[] {"     Seats", "1", "2", "3", "4", "5"}));
		cb3.setBounds(299, 242, 109, 38);
		frame.getContentPane().add(cb3);
		
		lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTax.setBounds(42, 299, 64, 22);
		frame.getContentPane().add(lblTax);
		
		lblDate = new JLabel("Sub Total");
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblDate.setBounds(42, 340, 82, 22);
		frame.getContentPane().add(lblDate);
		
		lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTotal.setBounds(42, 380, 64, 22);
		frame.getContentPane().add(lblTotal);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(159, 297, 130, 28);
		frame.getContentPane().add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(159, 338, 130, 28);
		frame.getContentPane().add(tf3);
		
		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(159, 378, 130, 28);
		frame.getContentPane().add(tf4);
		
		btnTotal = new JButton("TOTAL");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=(String)cb1.getSelectedItem();
				s2=(String)cb2.getSelectedItem();
				s3=(String)cb3.getSelectedItem();
				float a=Float.parseFloat(s3);
				if(s1.contentEquals("Kottayam") && s2.contentEquals("Trivandrum") ||s2.contentEquals("Kottayam") && s1.contentEquals("Trivandrum"))
				{
				tf2.setText("8");
				if(std.isSelected())
				{
					float b=120*a;
					float c=b+8;
					String St=String.valueOf(b);
					String St1=String.valueOf(c);
					tf3.setText(St);
					tf4.setText(St1);
				}
				else if(fc.isSelected())
				{
					float b=140*a;
					float c=b+8;
					String St=String.valueOf(b);
					String St1=String.valueOf(c);
					tf3.setText(St);
					tf4.setText(St1);	
				}
				else if(ac.isSelected())
				{
					float b=200*a;
					float c=b+8;
					String St=String.valueOf(b);
					String St1=String.valueOf(c);
					tf3.setText(St);
					tf4.setText(St1);	
				}
				else
				{
					float b=160*a;
					float c=b+8;
					String St=String.valueOf(b);
					String St1=String.valueOf(c);
					tf3.setText(St);
					tf4.setText(St1);	
				}
				
						
				}
				else if(s1.contentEquals("Kottayam") && s2.contentEquals("Kozhikkod") ||s2.contentEquals("Kozhikkod") && s1.contentEquals("Kottayam"))
				{
				tf2.setText("10");
				if(std.isSelected())
				{
					float b=125*a;
					float c=b+10;
					String St=String.valueOf(b);
					String St1=String.valueOf(c);
					tf3.setText(St);
					tf4.setText(St1);
				}
				else if(fc.isSelected())
				{
					float b=150*a;
					float c=b+10;
					String St=String.valueOf(b);
					String St1=String.valueOf(c);
					tf3.setText(St);
					tf4.setText(St1);	
				}
				else if(ac.isSelected())
				{
					float b=250*a;
					float c=b+10;
					String St=String.valueOf(b);
					String St1=String.valueOf(c);
					tf3.setText(St);
					tf4.setText(St1);	
				}
				else
				{
					float b=200*a;
					float c=b+10;
					String St=String.valueOf(b);
					String St1=String.valueOf(c);
					tf3.setText(St);
					tf4.setText(St1);	
				}
				}
				
				else
				{
				tf2.setText("15");
				if(std.isSelected())
				{
					float b=150*a;
					float c=b+15;
					String St=String.valueOf(b);
					String St1=String.valueOf(c);
					tf3.setText(St);
					tf4.setText(St1);
				}
				else if(fc.isSelected())
				{
					float b=200*a;
					float c=b+15;
					String St=String.valueOf(b);
					String St1=String.valueOf(c);
					tf3.setText(St);
					tf4.setText(St1);	
				}
				else if(ac.isSelected())
				{
					float b=400*a;
					float c=b+15;
					String St=String.valueOf(b);
					String St1=String.valueOf(c);
					tf3.setText(St);
					tf4.setText(St1);	
				}
				else
				{
					float b=300*a;
					float c=b+10;
					String St=String.valueOf(b);
					String St1=String.valueOf(c);
					tf3.setText(St);
					tf4.setText(St1);	
				}
				
				}
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTotal.setForeground(new Color(0, 0, 0));
		btnTotal.setBounds(27, 429, 94, 34);
		frame.getContentPane().add(btnTotal);
		
		btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				tf6.setText("");
				tf7.setText("");
				tf8.setText("");
				tf9.setText("");
				tf10.setText("");
				tf11.setText("");
				tf12.setText("");
			}
			
		});
		btnReset.setForeground(new Color(255, 0, 0));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBounds(159, 429, 94, 34);
		frame.getContentPane().add(btnReset);
		
		btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setForeground(new Color(0, 0, 255));
		btnExit.setBounds(286, 429, 94, 34);
		frame.getContentPane().add(btnExit);
		
		separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(27, 413, 382, 5);
		frame.getContentPane().add(separator);
   }
}