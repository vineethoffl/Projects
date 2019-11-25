package swingsample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;

public class swing {

	private JFrame frame;
	private JTextField textField;
	private JButton btnSubmit;
	private JLabel label;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing window = new swing();
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
	public swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setBounds(38, 48, 69, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(38, 91, 69, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(142, 42, 113, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		label = new JLabel("");
		label.setBounds(125, 194, 126, 22);
		frame.getContentPane().add(label);
		passwordField = new JPasswordField();
		passwordField.setBounds(142, 84, 113, 29);
		frame.getContentPane().add(passwordField);
		
		btnSubmit = new JButton("Login");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=""+new String(passwordField.getPassword());
			if(textField.getText().equals("VINEETH")&&str.equals("oops "))
					label.setText("success");
					else
						label.setText("unsuccessfull");
			}
				
		});
		btnSubmit.setBounds(152, 124, 76, 29);
		frame.getContentPane().add(btnSubmit);
		
		
		
		
	}
}
