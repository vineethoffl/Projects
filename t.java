package cfc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class t {

String t="";
private JFrame frame;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;
private JTextField textField_7;
private JTextField textField_8;
private JTextField textField_9;
private JTextField textField_10;
private JTextField textField_11;
private JTable table;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
t window = new t();
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
public t() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame =  new JFrame();
frame.getContentPane().setBackground(new Color(255, 240, 245));
frame.setBounds(100, 100, 1098, 686);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setToolTipText("");
panel.setBackground(new Color(176, 196, 222));
panel.setForeground(Color.LIGHT_GRAY);
panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
panel.setBounds(508, 87, 564, 421);
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblName = new JLabel("Name");
lblName.setBackground(Color.BLACK);
lblName.setForeground(new Color(0, 0, 0));
lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
lblName.setBounds(27, 50, 92, 20);
panel.add(lblName);

textField_4 = new JTextField();
textField_4.setColumns(10);
textField_4.setBounds(129, 46, 178, 32);
panel.add(textField_4);

JLabel lblFrom = new JLabel("From");
lblFrom.setToolTipText("");
lblFrom.setLabelFor(frame);
lblFrom.setForeground(new Color(0, 0, 0));
lblFrom.setFont(new Font("Tahoma", Font.BOLD, 14));
lblFrom.setBounds(10, 137, 92, 20);
panel.add(lblFrom);

JLabel lblTo = new JLabel("To");
lblTo.setBackground(new Color(240, 240, 240));
lblTo.setForeground(new Color(0, 0, 0));
lblTo.setFont(new Font("Tahoma", Font.BOLD, 14));
lblTo.setBounds(10, 191, 92, 20);
panel.add(lblTo);

JLabel lblDate = new JLabel("Date");
lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
lblDate.setBounds(10, 240, 92, 20);
panel.add(lblDate);

JLabel lblTime = new JLabel("Time");
lblTime.setFont(new Font("Tahoma", Font.BOLD, 12));
lblTime.setBounds(10, 297, 92, 20);
panel.add(lblTime);

textField_5 = new JTextField();
textField_5.setColumns(10);
textField_5.setBounds(78, 137, 111, 32);
panel.add(textField_5);

textField_6 = new JTextField();
textField_6.setColumns(10);
textField_6.setBounds(78, 191, 111, 32);
panel.add(textField_6);

textField_7 = new JTextField();
textField_7.setColumns(10);
textField_7.setBounds(78, 240, 111, 32);
panel.add(textField_7);

textField_8 = new JTextField();
textField_8.setColumns(10);
textField_8.setBounds(78, 297, 111, 32);
panel.add(textField_8);

JLabel lblTicketNumber = new JLabel("Ticket Number");
lblTicketNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
lblTicketNumber.setBounds(258, 137, 92, 20);
panel.add(lblTicketNumber);

JLabel lblPrice = new JLabel("Price");
lblPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
lblPrice.setBounds(258, 194, 92, 20);
panel.add(lblPrice);

JLabel lblRoute = new JLabel("Route");
lblRoute.setFont(new Font("Tahoma", Font.BOLD, 11));
lblRoute.setForeground(new Color(0, 0, 0));
lblRoute.setBounds(258, 243, 92, 20);
panel.add(lblRoute);

textField_9 = new JTextField();
textField_9.setColumns(10);
textField_9.setBounds(360, 133, 111, 32);
panel.add(textField_9);

textField_10 = new JTextField();
textField_10.setColumns(10);
textField_10.setBounds(360, 187, 111, 32);
panel.add(textField_10);

textField_11 = new JTextField();
textField_11.setColumns(10);
textField_11.setBounds(360, 235, 111, 32);
panel.add(textField_11);



JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(255, 240, 245));
panel_1.setBorder(new TitledBorder(null, "Ticketing System", TitledBorder.LEFT, TitledBorder.TOP, null, Color.WHITE));
panel_1.setForeground(Color.LIGHT_GRAY);
panel_1.setBounds(10, 11, 1062, 70);
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);

JLabel lblNewLabel = new JLabel("TICKET BOOKING");
lblNewLabel.setBackground(new Color(255, 240, 245));
lblNewLabel.setForeground(Color.BLACK);
lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel.setLabelFor(frame);
lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 32));
lblNewLabel.setBounds(10, 11, 1045, 48);
panel_1.add(lblNewLabel);

JPanel panel_2 = new JPanel();
panel_2.setBackground(new Color(255, 240, 245));
panel_2.setBounds(10, 87, 460, 421);
frame.getContentPane().add(panel_2);
panel_2.setLayout(null);

JLabel lblNewLabel_1 = new JLabel("Name");
lblNewLabel_1.setBounds(10, 29, 77, 27);
lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
panel_2.add(lblNewLabel_1);

textField = new JTextField();
textField.setBounds(97, 32, 265, 27);
panel_2.add(textField);
textField.setColumns(10);

JSeparator separator = new JSeparator();
separator.setBounds(10, 67, 450, 2);
panel_2.add(separator);

JSeparator separator_3 = new JSeparator();
separator_3.setBounds(0, 209, 460, 5);
panel_2.add(separator_3);

JRadioButton rdbtnNewRadioButton = new JRadioButton("First Class");
rdbtnNewRadioButton.setBounds(330, 76, 103, 23);
panel_2.add(rdbtnNewRadioButton);

JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
rdbtnSingleTicket.setBounds(20, 76, 92, 23);
panel_2.add(rdbtnSingleTicket);

JRadioButton rdbtnAdult = new JRadioButton("Adult");
rdbtnAdult.setBounds(22, 105, 90, 23);
panel_2.add(rdbtnAdult);

JRadioButton radioButton = new JRadioButton("Standared");
radioButton.setBounds(180, 76, 103, 23);
panel_2.add(radioButton);

JRadioButton rdbtnAc = new JRadioButton("AC");
rdbtnAc.setBounds(331, 115, 102, 23);
panel_2.add(rdbtnAc);

JRadioButton rdbtnNonac = new JRadioButton("Sleeper");
rdbtnNonac.setBounds(180, 115, 103, 23);
panel_2.add(rdbtnNonac);

JRadioButton rdbtnChild = new JRadioButton("Child");
rdbtnChild.setBounds(22, 140, 90, 23);
panel_2.add(rdbtnChild);

JComboBox comboBox = new JComboBox();
comboBox.setModel(new DefaultComboBoxModel(new String[] {"  From  ", "Kozhikkode", "Malappuram", "Ernakkulam"}));
comboBox.setBounds(20, 170, 92, 28);
panel_2.add(comboBox);

JComboBox comboBox_1 = new JComboBox();
comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"  To", "Kozhikkode", "Malappuram", "Ernakkulam"}));
comboBox_1.setBounds(180, 170, 100, 28);
panel_2.add(comboBox_1);

JComboBox comboBox_2 = new JComboBox();
comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
comboBox_2.setBounds(327, 170, 106, 28);
panel_2.add(comboBox_2);

JSeparator separator_2 = new JSeparator();
separator_2.setBounds(0, 332, 460, 2);
panel_2.add(separator_2);

JLabel lblTax = new JLabel("Tax");
lblTax.setBounds(22, 231, 92, 20);
panel_2.add(lblTax);

JLabel lblSubTotal = new JLabel("Sub Total");
lblSubTotal.setBounds(20, 270, 92, 20);
panel_2.add(lblSubTotal);

JLabel lblTotal = new JLabel("Total");
lblTotal.setBounds(22, 301, 92, 20);
panel_2.add(lblTotal);

textField_1 = new JTextField();
textField_1.setBounds(97, 228, 182, 27);
panel_2.add(textField_1);
textField_1.setColumns(10);

textField_2 = new JTextField();
textField_2.setColumns(10);
textField_2.setBounds(97, 262, 182, 27);
panel_2.add(textField_2);

textField_3 = new JTextField();
textField_3.setColumns(10);
textField_3.setBounds(97, 294, 182, 27);
panel_2.add(textField_3);

ButtonGroup g=new ButtonGroup();
ButtonGroup g1=new ButtonGroup();
g.add(rdbtnAdult);
g.add(rdbtnChild);
System.out.print(rdbtnAdult.getText());
g1.add(rdbtnAc);
g1.add(rdbtnNonac);
g1.add(radioButton);
g1.add(rdbtnNewRadioButton);
g1.add(rdbtnSingleTicket);
JButton btnTotal = new JButton("Total");
btnTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
btnTotal.setForeground(new Color(0, 0, 0));
btnTotal.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
   
if((!g1.isSelected(null)) && (!g.isSelected(null)))
{
String a=(String)comboBox.getSelectedItem();
String b=(String)comboBox_1.getSelectedItem();
float c=Float.parseFloat((String)comboBox_2.getSelectedItem());
g1.getSelection();
String age="";
String st="";
float tax=0;
        float total=0;
        float fa=0;
       

if((a.equals("Kozhikkode")) && (b.equals("Ernakkulam"))||(a.equals("Ernakkulam")) && (b.equals("Kozhikkode")))
{
        fa=290f;
}
if((a.equals("Kozhikkode")) && (b.equals("Malappuram"))||(a.equals("Malappuram")) && (b.equals("Kozhikkode")))
{
        fa=45f;
}
if((a.equals("Ernakkulam")) && (b.equals("Malappuram"))||(a.equals("Malappuram")) && (b.equals("Ernakkulam")))
{
        fa=248f;
}

if(rdbtnAdult.isSelected())
{
 if(radioButton.isSelected())
{
 t="Standared";
 fa=fa;
 tax=fa*5/100;
 total=(fa+tax)*c;
}
else if(rdbtnAc.isSelected())
{
t="Ac";
 fa=fa*150/100;
 tax=fa*10/100;
 total=(fa+tax)*c;
}
else if(rdbtnNonac.isSelected())
{
t="Sleeper";
fa=fa*130/100;
tax=fa*7/100;
total=(fa+tax)*c;
}
else if(rdbtnNewRadioButton.isSelected())
{
t="FirstClass";
 fa=fa*180/100;
 tax=fa*15/100;
 total=(fa+tax)*c;
}
}
else
{
if(radioButton.isSelected())
{
t="Standared";
 fa=fa*50/100;
 tax=fa*2/100;
 total=(fa+tax)*c;
}
else if(rdbtnAc.isSelected())
{
t="Ac";
 fa=(fa*50/100)*50/100;
 tax=fa*5/100;
 total=(fa+tax)*c;
}
else if(rdbtnNonac.isSelected())
{
t="Sleeper";
fa=(fa*50/100)*30/100;
 tax=fa*3/100;
 total=(fa+tax)*c;
}
else if(rdbtnNewRadioButton.isSelected())
{
t="First Class";
 fa=(fa*50/100)*80/100;
 tax=fa*10/100;
 total=(fa+tax)*c;
}
}
        textField_1.setText(String.valueOf(tax));
        textField_2.setText(String.valueOf(fa));
        textField_3.setText(String.valueOf(total));
        Random rand = new Random();
        int rand_int1 = rand.nextInt(10000);
        textField_9.setText(String.valueOf(rand_int1));
        textField_10.setText(String.valueOf(total));
        textField_4.setText(textField.getText());
        textField_5.setText((String)comboBox.getSelectedItem());
        textField_6.setText((String)comboBox_1.getSelectedItem());
       
       
       //time
       
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime now = LocalDateTime.now();
        textField_7.setText(dtf.format(now));
        textField_8.setText(tf.format(now));
        textField_11.setText("Any");

}



}
});
btnTotal.setBounds(33, 361, 103, 36);
panel_2.add(btnTotal);

JButton btnConfirm = new JButton("Confirm");
btnConfirm.setForeground(new Color(50, 205, 50));
btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 11));
btnConfirm.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
DefaultTableModel model=(DefaultTableModel)table.getModel();
model.addRow(new String[]
{
textField_4.getText(),
textField_9.getText(),
textField_5.getText(),
textField_6.getText(),
(String)comboBox_2.getSelectedItem(),
textField_7.getText(),
textField_8.getText(),
t,
textField_10.getText()


});

}
});
btnConfirm.setBounds(214, 359, 103, 39);
panel.add(btnConfirm);

JButton btnReset = new JButton("Reset");
btnReset.setForeground(new Color(255, 0, 0));
btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
btnReset.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
   g1.clearSelection();
g.clearSelection();
JTextField temp=null;
for(Component c:panel.getComponents()) {
if(c.getClass().toString().contains("javax.swing.JTextField")) {
System.out.println(c.getClass().toString().contains("javax.swing.JTextField"));
temp=(JTextField)c;
temp.setText("");
}
}
for(Component c:panel_2.getComponents()) {
if(c.getClass().toString().contains("javax.swing.JTextField")) {
System.out.println(c.getClass().toString().contains("javax.swing.JTextField"));
temp=(JTextField)c;
temp.setText("");
}
}

}
});
btnReset.setBounds(194, 361, 103, 36);
panel_2.add(btnReset);

JButton btnExit = new JButton("Exit");
btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
btnExit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
System.exit(0);
}
});
btnExit.setBounds(358, 361, 92, 36);
panel_2.add(btnExit);

JPanel panel_3 = new JPanel();
panel_3.setBackground(Color.WHITE);
panel_3.setBounds(10, 512, 1062, 125);
frame.getContentPane().add(panel_3);
panel_3.setLayout(null);

table = new JTable();
table.setModel(new DefaultTableModel(
new Object[][] {
{"Name", "Booking No", "From", "To", "No. of seat", "Time", "Date", "Ac/Non-Ac", "Price"},
},
new String[] {
"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
}
));
table.getColumnModel().getColumn(0).setPreferredWidth(92);
table.getColumnModel().getColumn(2).setPreferredWidth(87);
table.getColumnModel().getColumn(3).setPreferredWidth(86);
table.setBounds(10, 11, 1042, 103);
panel_3.add(table);
}
}

