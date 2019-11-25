package cfc;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class cc {

	private JFrame frame;
	private JTable table;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf1;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;
	private JTextField tf9;
	private JTextField tf10;
	private JTextField tf11;
	private JTextField tf12;
	private JTextField tf13;
	private JTextField tf14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cc window = new cc();   
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
	public cc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 1002, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 461, 381);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(481, 11, 473, 381);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea ta = new JTextArea();
		ta.setBackground(new Color(255, 228, 196));
		ta.setForeground(new Color(0, 0, 0));
		ta.setBounds(10, 22, 453, 306);
		panel_1.add(ta);
		
		JButton clr = new JButton("CLEAR");
		clr.setForeground(new Color(255, 0, 0));
		clr.setFont(new Font("Tahoma", Font.BOLD, 13));
		clr.setBounds(167, 339, 106, 32);
		panel_1.add(clr);
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ta.setText("");
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("Maths");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel.setBounds(260, 25, 81, 23);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("English");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(260, 78, 81, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Biology");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2.setBounds(260, 125, 81, 28);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Computer");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_3.setBounds(260, 164, 81, 24);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Chemistry");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_4.setBounds(260, 206, 81, 23);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Physics");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_5.setBounds(260, 251, 81, 26);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tamil");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_6.setBounds(260, 293, 81, 29);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Malayalam");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_7.setBounds(260, 335, 81, 23);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Student ID");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_8.setBounds(10, 28, 81, 17);
		panel.add(lblNewLabel_8);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblFirstName.setBounds(10, 78, 81, 23);
		panel.add(lblFirstName);
		
		JLabel lblNewLabel_9 = new JLabel("Surname");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_9.setBounds(10, 118, 67, 29);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Student Code");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_10.setBounds(10, 166, 81, 20);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Total Score");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_11.setBounds(10, 240, 81, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Average");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_12.setBounds(10, 288, 81, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Ranking");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_13.setBounds(10, 332, 81, 20);
		panel.add(lblNewLabel_13);
		
		tf2 = new JTextField();
		tf2.setBounds(111, 69, 99, 32);
		panel.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(111, 116, 99, 32);
		panel.add(tf3);
		tf3.setColumns(10);

		
		JComboBox cb = new JComboBox(new DefaultComboBoxModel(new String[] {"      Select    ", "KGR401", "KGR402", "KGR403", "KGR404", "KGR405"}));
		//String []k= {""
		cb.setBounds(113, 164, 97, 32);
		panel.add(cb);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(111, 19, 99, 32);
		panel.add(tf1);
		
		tf4 = new JTextField();
		tf4.setEditable(false);
		tf4.setColumns(10);
		tf4.setBounds(111, 231, 99, 32);
		panel.add(tf4);
		
		tf5 = new JTextField();
		tf5.setEditable(false);
		tf5.setColumns(10);
		tf5.setBounds(111, 277, 99, 32);
		panel.add(tf5);
		
		tf6 = new JTextField();
		tf6.setEditable(false);
		tf6.setColumns(10);
		tf6.setBounds(111, 326, 99, 32);
		panel.add(tf6);
		
		tf7 = new JTextField();
		tf7.setColumns(10);
		tf7.setBounds(352, 25, 99, 32);
		panel.add(tf7);
		
		tf8 = new JTextField();
		tf8.setColumns(10);
		tf8.setBounds(352, 69, 99, 32);
		panel.add(tf8);
		
		tf9 = new JTextField();
		tf9.setColumns(10);
		tf9.setBounds(352, 116, 99, 32);
		panel.add(tf9);
		
		tf10 = new JTextField();
		tf10.setColumns(10);
		tf10.setBounds(352, 161, 99, 32);
		panel.add(tf10);
		
		tf11 = new JTextField();
		tf11.setColumns(10);
		tf11.setBounds(352, 204, 99, 32);
		panel.add(tf11);
		
		tf12 = new JTextField();
		tf12.setColumns(10);
		tf12.setBounds(352, 248, 99, 32);
		panel.add(tf12);
		
		tf13 = new JTextField();
		tf13.setColumns(10);
		tf13.setBounds(352, 291, 99, 32);
		panel.add(tf13);
		
		tf14 = new JTextField();
		tf14.setColumns(10);
		tf14.setBounds(352, 332, 99, 32);
		panel.add(tf14);
	
		
		table = new JTable();
		table.setBounds(10, 416, 976, 64);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{" Student Id", "Course Code", "Maths", "English", " Biology", " Computer", " Chemistry", " Physics", " Tamil", " Malayalm", " Total Score", "Avarage", " Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		frame.getContentPane().add(table);
		
		
		JButton btnNewButton = new JButton("Add Report");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(60, 179, 113));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a=tf7.getText();
				float a1=Float.valueOf(a);
				String b=tf8.getText();
				float b1=Float.valueOf(b);
				String c=tf9.getText();
				float c1=Float.valueOf(c);
				String d=tf9.getText();
				float d1=Float.valueOf(d);
				String e=tf9.getText();
				float e1=Float.valueOf(e);
				String f=tf9.getText();
				float f1=Float.valueOf(f);
				String g=tf9.getText();
				float g1=Float.valueOf(g);
				String h=tf9.getText();
				float h1=Float.valueOf(h);
				String i=tf4.getText();
		         float i1=a1+b1+c1+d1+e1+f1+g1+h1;
				float  j=i1/8;
				tf4.setText(String.valueOf(i1));
				tf5.setText(String.valueOf(j));
				String i11=String.valueOf(i1);
				String j11=String.valueOf(j);
				String n=tf1.getText();
				String m=tf2.getText();
				String o=tf3.getText();
				String p=(String)cb.getSelectedItem();
				String r;
				
				
				 if(a1<30 || b1<30 || c1<30 || d1<30 || e1<30 || f1<30 || g1<30 || h1<30)
				{
					tf6.setText("Fail");
					r="Fail";
				}
				else
				{
					tf6.setText("Pass");
					r="Pass";
				}
				
				 String[] row = { n, p, a, b,c, d, e, f, g, h, i11, j11,r};
				 DefaultTableModel model = (DefaultTableModel) table.getModel();
				   model.addRow(row);
				 
			}
		});
		
		
		btnNewButton.setBounds(94, 503, 105, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1)
				{
				if(table.getRowCount()==0)
				{
				JOptionPane.showMessageDialog(null, "NO data to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				else {
				JOptionPane.showMessageDialog(null, "Select a row to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				}
				else {
				model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(245, 503, 105, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("Show Report");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ta.append("Student Record\n"
						+ "Student Name :\t\t"+tf2.getText()+" "+tf3.getText()+"\n"
						+ "======================================\n"
						+ "Math:\t\t" + tf7.getText()
						+ "\nEnglish:\t\t" + tf8.getText()
						+ "\nBiology:\t\t" + tf9.getText()
						+ "\nComputer:\t\t" + tf10.getText()
						+ "\nChemistry:\t\t" + tf11.getText()
						+ "\nPysics:\t\t" + tf12.getText()
						+ "\nTamil:\t\t" + tf13.getText()
						+ "\nMalayalam:\t\t" + tf14.getText()
						+"\n======================================"
						+ "\nTotal SCore:\t\t" + tf4.getText()
						+ "\nAverage:\t\t" + tf5.getText()
						+ "\nRanking:\t\t" + tf6.getText() + "\n"
						);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(new Color(138, 43, 226));
		btnNewButton_2.setBounds(393, 503, 117, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_3.setForeground(new Color(255, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(548, 503, 105, 35);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Reset");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
				tf13.setText("");
				tf14.setText("");	
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setBounds(706, 503, 105, 35);
		frame.getContentPane().add(btnNewButton_4);
		
		
		
		
		
		
	}
}
