package cfc;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.*
;
import java.awt.Color;public class temp {
	private JFrame frame;
	private JTextField ip;
	private JTextField op;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temp window = new temp();
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
	public temp() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 450, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel inp = new JLabel("Input");
		inp.setBounds(61, 22, 79, 22);
		inp.setBackground(new Color(240, 240, 240));
		inp.setForeground(Color.BLACK);
		inp.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(inp);
		ip = new JTextField();
		ip.setBounds(150, 18, 109, 35);
		frame.getContentPane().add(ip);
		ip.setColumns(10);
		JLabel lblInputScale = new JLabel("Input Scale");
		lblInputScale.setBounds(28, 79, 92, 22);
		lblInputScale.setForeground(Color.BLUE);
		lblInputScale.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		frame.getContentPane().add(lblInputScale);
		JLabel lblOutputScale = new JLabel("Output Scale");
		lblOutputScale.setBounds(248, 80, 92, 21);
		lblOutputScale.setForeground(Color.BLUE);
		lblOutputScale.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		frame.getContentPane().add(lblOutputScale);
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(58, 290, 82, 22);
		lblOutput.setForeground(Color.BLACK);
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblOutput);
		op = new JTextField();
		op.setBounds(152, 286, 115, 35);
		frame.getContentPane().add(op);
		op.setColumns(10);
		JRadioButton c1 = new JRadioButton("Celcius");
		c1.setBounds(31, 124, 109, 28);
		c1.setForeground(Color.BLACK);
		c1.setBackground(Color.CYAN);
		c1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(c1);
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JRadioButton f1 = new JRadioButton("Fahrenheit");
		f1.setBounds(31, 170, 109, 28);
		f1.setBackground(Color.CYAN);
		f1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(f1);
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JRadioButton k1 = new JRadioButton("Kelvin");
		k1.setBounds(31, 216, 109, 22);
		k1.setBackground(Color.CYAN);
		k1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(k1);
		ButtonGroup G = new ButtonGroup();
		G.add(c1);
		G.add(f1);
		G.add(k1);
		k1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JRadioButton c2 = new JRadioButton("Celcius");
		c2.setBackground(Color.GREEN);
		c2.setBounds(248, 129, 110, 23);
		c2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(c2);
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=ip.getText();
				float b=Float.parseFloat(a);
		if(c1.isSelected())
				{
					op.setText(ip.getText());
				}
		else if(f1.isSelected())
		{
			float c=(b-32)*0.55f;
			String d=String.valueOf(c);
			op.setText(d);
		}
		else if(k1.isSelected())
		{
			float c=b-273.15f;
			String d=String.valueOf(c);
			op.setText(d);
		}
			}
		});
		JRadioButton f2 = new JRadioButton("Fahrenheit");
		f2.setBackground(Color.GREEN);
		f2.setBounds(249, 176, 109, 22);
		f2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(f2);
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=ip.getText();
				float b=Float.parseFloat(a);
		if(c1.isSelected())
				{
			float c=(b*1.8f)+32;
			String d=String.valueOf(c);	
			op.setText(d);
				}
		else if(f1.isSelected())
		{
			op.setText(ip.getText());
		}
		else if(k1.isSelected())
		{
			float c=(float)(b*(9/5f))-459.67f;
			String d=String.valueOf(c);
			op.setText(d);
		}
			}
		});
		JRadioButton k2 = new JRadioButton("Kelvin");
		k2.setBackground(Color.GREEN);
		k2.setBounds(248, 216, 109, 22);
		k2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(k2);
		ButtonGroup G1 = new ButtonGroup();
		G1.add(c2);
		G1.add(f2);
		G1.add(k2);
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(Color.RED);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBackground(new Color(240, 240, 240));
		btnClear.setBounds(309, 286, 92, 35);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ip.setText("");
				op.setText("");
	G.clearSelection();
	G1.clearSelection();
			}
		});
		frame.getContentPane().add(btnClear);
		k2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=ip.getText();
				float b=Float.parseFloat(a);
		if(c1.isSelected())
				{
			float c=b+273.15f;
			String d=String.valueOf(c);	
			op.setText(d);
				}
		else if(f1.isSelected())
		{
			float c=(float)(b+459.67f)*(5/9);
			String d=String.valueOf(c);
			op.setText(d);
		}
		else if(k1.isSelected())
		{
			op.setText(ip.getText());
		}
			}
		});
	}
}