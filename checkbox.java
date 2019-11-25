package cfc;

import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class checkbox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkbox window = new checkbox();
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
	public checkbox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(94, 170, 200, 39);
		frame.getContentPane().add(label);

		
		JCheckBox chc = new JCheckBox("C++");
		chc.setBackground(new Color(245, 222, 179));
		chc.setBounds(146, 61, 97, 23);
		chc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(chc);
		chc.addItemListener(new ItemListener(){
			 public void itemStateChanged(ItemEvent e)
			 {
				 label.setText("C++ "+(e.getStateChange()==1?"Checked":"Unchecked"));
			 }
		});
		
		JCheckBox chj = new JCheckBox("Java");
		chj.setBackground(new Color(245, 222, 179));
		chj.setBounds(146, 107, 97, 23);
		chj.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(chj);
		chj.addItemListener(new ItemListener(){
			 public void itemStateChanged(ItemEvent e)
			 {
				 label.setText("Java "+(e.getStateChange()==1?"Checked":"Unchecked"));
			 }
		});
		
		}
}
