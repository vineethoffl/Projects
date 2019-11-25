package cfc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bmi {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bmi window = new bmi();
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
	public bmi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 451, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 4, 414, 32);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("BODY MASS INDEX");
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBodyMassIndex.setBounds(151, 11, 152, 14);
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(10, 41, 414, 254);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeightm = new JLabel("Height(m)");
		lblHeightm.setBounds(56, 49, 65, 14);
		panel_1.add(lblHeightm);
		
		JLabel lblWeightkg = new JLabel("Weight(Kg)");
		lblWeightkg.setBounds(56, 97, 65, 14);
		panel_1.add(lblWeightkg);
		
		JLabel label = new JLabel("");
		label.setBounds(122, 147, 74, 14);
		panel_1.add(label);
		JLabel label_1 = new JLabel("");
		label_1.setBounds(243, 147, 161, 14);
		panel_1.add(label_1);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setBounds(63, 147, 46, 14);
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblBmi);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a=Float.parseFloat(textField.getText());
				float b=Float.parseFloat(textField_1.getText());
				float c=b/(a*a);
				System.out.print(c);
				label.setText(String.valueOf(c));
				if(c<18.5f)
				{
					label_1.setText("under Weight");
				}
				else if(c>=18.5f && c<=24.9f)
				{
					label_1.setText("Normal Weight");
				}
				else if(c>=25f && c<=29.9f)
				{
					label_1.setText("Over Weight");
				}
				else
				{
					label_1.setText("Obese");
				}
				
			}
		});
		btnCalculate.setBounds(32, 196, 89, 34);
		panel_1.add(btnCalculate);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnNewButton.setBounds(169, 196, 89, 34);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		btnNewButton_1.setBounds(303, 196, 89, 34);
		panel_1.add(btnNewButton_1);
		
		
		
		
		
		textField = new JTextField();
		textField.setBounds(131, 39, 89, 34);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 87, 89, 34);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(10, 300, 414, 82);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBackground(Color.GREEN);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Underweight", "Normalweight", "Overweight", "Obese"},
				{"<18.5", "18.5 to 24.9", "24.9 to", ">30"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(21, 24, 383, 32);
		panel_2.add(table);
	}
}
