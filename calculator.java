package cfc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.lang.Math;
public class calculator {
	public String Str1;
	public String Str2;
	private JFrame frame;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =  new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setForeground(Color.WHITE);
		lblEdit.setBounds(10, 0, 31, 17);
		frame.getContentPane().add(lblEdit);
		
		JLabel lblView = new JLabel("View");
		lblView.setForeground(Color.WHITE);
		lblView.setBounds(47, 1, 37, 14);
		frame.getContentPane().add(lblView);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setForeground(Color.WHITE);
		lblHelp.setBackground(Color.WHITE);
		lblHelp.setBounds(88, 1, 37, 14);
		frame.getContentPane().add(lblHelp);
		
		tf = new JTextField();
		tf.setBounds(10, 17, 414, 30);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JButton Sqrt = new JButton("sqrt");
		Sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Str1=tf.getText();
				float res1=Float.parseFloat(Str1);
				float res=(float)Math.sqrt(res1);
				tf.setText(String.valueOf(res));
			}
		});
		Sqrt.setBounds(2, 83, 63, 39);
		frame.getContentPane().add(Sqrt);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Str1=tf.getText();
				float res1=Float.parseFloat(Str1);
				
				float res=(float)(1/res1);
				tf.setText(String.valueOf(res));
				
			}
		});
		btnx.setBounds(67, 83, 65, 39);
		frame.getContentPane().add(btnx);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=tf.getText();
				float s1=Float.parseFloat(str);
				float s2=(float)Math.sin(s1*(float)Math.PI/180);
				String s3=String.valueOf(s2);
				tf.setText(s3);
			}
		});
		btnSin.setBounds(135, 84, 65, 37);
		frame.getContentPane().add(btnSin);
		
		JButton b7 = new JButton("7");
		b7.setBounds(210, 81, 45, 37);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText().concat(b7.getText()));
			}
		});
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b8.getText()));
			}
		});
		b8.setBounds(265, 81, 45, 37);   
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.setBounds(320, 81, 49, 37);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText().concat(b9.getText()));
			}
		});
		frame.getContentPane().add(b9);
		
		JButton div = new JButton("/");
		div.setForeground(Color.RED);
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Str1=tf.getText();
				tf.setText("");
				Str2=div.getText();
			}
		});
		div.setBounds(379, 80, 45, 39);
		frame.getContentPane().add(div);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b4.getText()));
			} 
		});
		b4.setBounds(209, 124, 49, 37);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b5.getText()));
			}
		});
		b5.setBounds(265, 124, 45, 37);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.setBounds(320, 122, 49, 37);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText().concat(b6.getText()));
			}
		});
		frame.getContentPane().add(b6);
		
		JButton mul = new JButton("*");
		mul.setForeground(Color.RED);
		mul.setBounds(379, 124, 45, 37);
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Str1=tf.getText();
				tf.setText("");
				Str2=mul.getText();
			}
		});
		frame.getContentPane().add(mul);
		
		JButton b1 = new JButton("1");
		b1.setBounds(210, 171, 45, 36);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText().concat(b1.getText()));
			}
		});
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b2.getText()));
			}
		});
		b2.setBounds(265, 170, 45, 39);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b3.getText()));
			}
		});
		b3.setBounds(320, 168, 49, 39);
		frame.getContentPane().add(b3);
		
		JButton sub = new JButton("-");
		sub.setForeground(Color.RED);
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Str1=tf.getText();
				tf.setText("");
				Str2=sub.getText();
			}
		});
		sub.setBounds(379, 168, 45, 39);
		frame.getContentPane().add(sub);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText().concat(b0.getText()));
			}
		});
		b0.setBounds(210, 214, 45, 37);
		frame.getContentPane().add(b0);
		
		JButton b10 = new JButton(".");
		b10.setBounds(265, 214, 45, 37);
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText().concat(b10.getText()));
			}
		});
		frame.getContentPane().add(b10);
		
		JButton eq = new JButton("=");
		eq.addActionListener(new ActionListener() {
			     public void actionPerformed(ActionEvent e) {
				float res1=Float.parseFloat(Str1);
				float res2=Float.parseFloat(tf.getText());
				if(Str2.equals("+"))
				{
					float res=res1+res2;
					tf.setText(String.valueOf(res)); 
				} 
				else if(Str2.equals("-")) 
				{
					float res=res1-res2;
					tf.setText(String.valueOf(res));
				}
				else if(Str2.equals("*"))
				{
					float res=res1*res2;
					tf.setText(String.valueOf(res));
				}
				else if(Str2.equals("/"))
				{
					float res=res1/res2;
					tf.setText(String.valueOf(res));
				}
				else if(Str2.equals("%"))
				{
					float res=res1%res2;
					tf.setText(String.valueOf(res));
				}
				else if(Str2.equals("x^y"))
				{
					float res=(float)Math.pow(res1,res2);
					tf.setText(String.valueOf(res));
				}
			}
		});
		eq.setBounds(320, 214, 49, 37);
		frame.getContentPane().add(eq);
		
		JButton add = new JButton("+");
		add.setForeground(Color.RED);
		add.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			Str1=tf.getText();  
			tf.setText("");
			Str2=add.getText();
			}
		});
		add.setBounds(379, 214, 45, 37);
		frame.getContentPane().add(add);
		   
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=tf.getText();
				float s1=Float.parseFloat(str);
				float s2=(float)Math.cos(s1*(float)Math.PI/180);
				String s3=String.valueOf(s2);
				tf.setText(s3);
			}
		});
		btnCos.setBounds(135, 127, 66, 37);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=tf.getText();
				float s1=Float.parseFloat(str);
				float s2=(float)Math.tan(s1*(float)Math.PI/180);
				String s3=String.valueOf(s2);
				tf.setText(s3);
			}
		});
		btnTan.setBounds(134, 171, 66, 36);
		frame.getContentPane().add(btnTan);
		
		JButton btnSec = new JButton("sec");
		btnSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=tf.getText();
				float s1=Float.parseFloat(str);
				float s2=(float)Math.cos(s1*(float)Math.PI/180);
				String s3=String.valueOf(1/s2);
				tf.setText(s3);
			}
		});
		btnSec.setBounds(134, 214, 66, 37);
		frame.getContentPane().add(btnSec);
		
		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=tf.getText();
				float s1=Float.parseFloat(str);
				float s2=(float)Math.log(s1);
				String s3=String.valueOf(s2);
				tf.setText(s3);
			}
		});
		btnExp.setBounds(67, 127, 65, 36);
		frame.getContentPane().add(btnExp);
		
		JButton btnLn = new JButton("ln");
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=tf.getText();
				float s1=Float.parseFloat(str);
				float s2=(float)Math.log(s1);
				String s3=String.valueOf(s2);
				tf.setText(s3);
			}
		});
		btnLn.setBounds(67, 171, 65, 37);
		frame.getContentPane().add(btnLn);
		
		JButton fact = new JButton("n!");
		fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Str1=tf.getText();
				int fact=Integer.parseInt(Str1);
		int f=1;
		for(int i=1;i<=fact;i++)
		{
			f=f*i;
		}
		tf.setText(String.valueOf(f));
				
			}
		});
		fact.setBounds(67, 216, 63, 35);
		frame.getContentPane().add(fact);
		
		JButton mod = new JButton("%");
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Str1=tf.getText();
				tf.setText("");
				Str2=mod.getText();
			}
		});
		mod.setBounds(2, 124, 63, 42);
		frame.getContentPane().add(mod);
		
		JButton xy = new JButton("x^y");
		xy.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Str1=tf.getText();
				tf.setText("");
				Str2=xy.getText();
				
			} 
		});
		xy.setBounds(2, 170, 63, 37);
		frame.getContentPane().add(xy);
		
		JButton x2 = new JButton("x^2");
		x2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Str1=tf.getText();
				float res1=Float.parseFloat(Str1);
				
				float res=(float)res1*res1;
				tf.setText(String.valueOf(res));
			}
		});
		x2.setBounds(2, 216, 63, 35);
		frame.getContentPane().add(x2);
		
		JLabel lblScientific = new JLabel("Scientific");
		lblScientific.setForeground(Color.WHITE);
		lblScientific.setBounds(10, 58, 74, 14);
		frame.getContentPane().add(lblScientific);
		
		JLabel lblStandared = new JLabel("Standared");
		lblStandared.setForeground(Color.WHITE);
		lblStandared.setBounds(210, 58, 75, 14);
		frame.getContentPane().add(lblStandared);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
			}
		});
		btnClear.setBounds(320, 54, 104, 23);
		frame.getContentPane().add(btnClear);
	}
}
