package cfc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class curr {

private JFrame frame;
private JTextField textField;
private JTextField textField_1;
public String s1,s2;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
curr window = new curr();
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
public curr() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.getContentPane().setBackground(new Color(255, 245, 238));
frame.setBounds(100, 100, 608, 551);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel lblCurrencyConverter = new JLabel("CURRENCY CONVERTER");
lblCurrencyConverter.setFont(new Font("Times New Roman", Font.BOLD, 16));
lblCurrencyConverter.setBounds(176, 11, 256, 57);
frame.getContentPane().add(lblCurrencyConverter);

JLabel lblInputCurrency = new JLabel("Select the Input currency");
lblInputCurrency.setFont(new Font("Tahoma", Font.BOLD, 12));
lblInputCurrency.setBounds(56, 102, 195, 14);
frame.getContentPane().add(lblInputCurrency);

JLabel lblOutputCurrency = new JLabel("Select the Output currency");
lblOutputCurrency.setFont(new Font("Tahoma", Font.BOLD, 12));
lblOutputCurrency.setBounds(56, 225, 195, 14);
frame.getContentPane().add(lblOutputCurrency);

JLabel lblAmount = new JLabel("Enter the Amount");
lblAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
lblAmount.setBounds(57, 163, 172, 14);
frame.getContentPane().add(lblAmount);

JLabel lblConvertedAmount = new JLabel("Converted Amount");
lblConvertedAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
lblConvertedAmount.setBounds(56, 357, 127, 14);
frame.getContentPane().add(lblConvertedAmount);

textField = new JTextField();
textField.setBounds(305, 151, 172, 40);
frame.getContentPane().add(textField);
textField.setColumns(10);

textField_1 = new JTextField();
textField_1.setColumns(10);
textField_1.setBounds(305, 345, 165, 40);
frame.getContentPane().add(textField_1);

JComboBox comboBox = new JComboBox();
comboBox.setBackground(Color.WHITE);
comboBox.setModel(new DefaultComboBoxModel(new String[] {"<          Select          >", "USD[United States Dollar]", "EUR[Euro]", "INR[Indian Rupee]", "JPY[Japanese Yen]", "CAD[Canadian Dollar]", "KRW[South Korean Won]"}));
comboBox.setBounds(305, 90, 165, 40);
frame.getContentPane().add(comboBox);

JComboBox comboBox_1 = new JComboBox();
comboBox_1.setBackground(Color.WHITE);
comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<          Select          >", "USD[United States Dollar]", "EUR[Euro]", "INR[Indian Rupee]", "JPY[Japanese Yen]", "CAD[Canadian Dollar]", "KRW[South Korean Won]"}));
comboBox_1.setBounds(305, 213, 165, 40);
frame.getContentPane().add(comboBox_1);

JButton btnCovert = new JButton("CONVERT");
btnCovert.setForeground(Color.RED);
btnCovert.setFont(new Font("Tahoma", Font.BOLD, 11));
btnCovert.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
s1=(String)comboBox.getSelectedItem();
s2=(String)comboBox_1.getSelectedItem();
String s=textField.getText();
if((s1.equals("USD[United States Dollar]"))&&(s2.equals("USD[United States Dollar]")))
{
textField_1.setText(s);
}
else if((s1.equals("USD[United States Dollar]"))&&(s2.equals("INR[Indian Rupee]")))
{
double a=Double.parseDouble(s);
double f=a*71.76;
String str=String.valueOf(f);
       textField_1.setText(str);
}else if((s1.equals("USD[United States Dollar]"))&&(s2.equals("EUR[Euro]")))
{
double a=Double.parseDouble(s);
double f=a*0.90;
String str=String.valueOf(f);
       textField_1.setText(str);
}
else if((s1.equals("USD[United States Dollar]"))&&(s2.equals("JPY[Japanese Yen]")))
{
double a=Double.parseDouble(s);
double f=a*108.59;
String str=String.valueOf(f);
       textField_1.setText(str);
}else if((s1.equals("USD[United States Dollar]"))&&(s2.equals( "CAD[Canadian Dollar]")))
{
double a=Double.parseDouble(s);
double f=a*1.33;
String str=String.valueOf(f);
       textField_1.setText(str);
}
else if((s1.equals("USD[United States Dollar]"))&&(s2.equals("KRW[South Korean Won]")))
{
double a=Double.parseDouble(s);
double f=a*1174.89;
String str=String.valueOf(f);
       textField_1.setText(str);
}



        if((s1.equals("INR[Indian Rupee]"))&&(s2.equals("INR[Indian Rupee]")))
{

textField_1.setText(s);
}else if((s1.equals("INR[Indian Rupee]"))&&(s2.equals("USD[United States Dollar]")))
{
    double a=Double.parseDouble(s);
    double f=a*0.014;
    String str=String.valueOf(f);
    textField_1.setText(str);
}
     else if((s1.equals("INR[Indian Rupee]"))&&(s2.equals("EUR[Euro]")))
{
   double a=Double.parseDouble(s);
   double f=a*0.013;
   String str=String.valueOf(f);
   textField_1.setText(str);
}else if((s1.equals("INR[Indian Rupee]"))&&(s2.equals("JPY[Japanese Yen]")))
{
   double a=Double.parseDouble(s);
   double f=a*1.51;
   String str=String.valueOf(f);
   textField_1.setText(str);
}else if((s1.equals("INR[Indian Rupee]"))&&(s2.equals("CAD[Canadian Dollar]")))
{
    double a=Double.parseDouble(s);
    double f=a*0.019;
    String str=String.valueOf(f);
    textField_1.setText(str);
}else if((s1.equals("INR[Indian Rupee]"))&&(s2.equals("KRW[South Korean Won]")))
{
   double a=Double.parseDouble(s);
   double f=a*16.38;
   String str=String.valueOf(f);
textField_1.setText(str);
}
       
       
       
       

        if((s1.equals("EUR[Euro]"))&&(s2.equals("EUR[Euro]")))
{

textField_1.setText(s);
}else if((s1.equals("EUR[Euro]"))&&(s2.equals("USD[United States Dollar]")))
{
    double a=Double.parseDouble(s);
    double f=a*1.11;
    String str=String.valueOf(f);
    textField_1.setText(str);
}
     else if((s1.equals("EUR[Euro]"))&&(s2.equals("INR[Indian Rupee]")))
{
   double a=Double.parseDouble(s);
   double f=a*79.54;
   String str=String.valueOf(f);
   textField_1.setText(str);
}else if((s1.equals("EUR[Euro]"))&&(s2.equals("JPY[Japanese Yen]")))
{
   double a=Double.parseDouble(s);
   double f=a*120.37;
   String str=String.valueOf(f);
   textField_1.setText(str);
}else if((s1.equals("EUR[Euro]"))&&(s2.equals("CAD[Canadian Dollar]")))
{
    double a=Double.parseDouble(s);
    double f=a*1.48;
    String str=String.valueOf(f);
    textField_1.setText(str);
}else if((s1.equals("EUR[Euro]"))&&(s2.equals("KRW[South Korean Won]")))
{
   double a=Double.parseDouble(s);
   double f=a*1302.86;
   String str=String.valueOf(f);
   textField_1.setText(str);
}
        if((s1.equals("JPY[Japanese Yen]"))&&(s2.equals("JPY[Japanese Yen]")))
{

textField_1.setText(s);
}else if((s1.equals("JPY[Japanese Yen]"))&&(s2.equals("USD[United States Dollar]")))
{
    double a=Double.parseDouble(s);
    double f=a*0.0092;
    String str=String.valueOf(f);
    textField_1.setText(str);
}
     else if((s1.equals("JPY[Japanese Yen]"))&&(s2.equals("INR[Indian Rupee]")))
{
   double a=Double.parseDouble(s);
   double f=a*0.66;
   String str=String.valueOf(f);
   textField_1.setText(str);
}else if((s1.equals("JPY[Japanese Yen]"))&&(s2.equals("EUR[Euro]")))
{
   double a=Double.parseDouble(s);
   double f=a*0.00083;
   String str=String.valueOf(f);
   textField_1.setText(str);
}else if((s1.equals("JPY[Japanese Yen]"))&&(s2.equals("CAD[Canadian Dollar]")))
{
    double a=Double.parseDouble(s);
    double f=a*0.012;
    String str=String.valueOf(f);
    textField_1.setText(str);
}else if((s1.equals("JPY[Japanese Yen]"))&&(s2.equals("KRW[South Korean Won]")))
{
   double a=Double.parseDouble(s);
   double f=a*10.83;
   String str=String.valueOf(f);
  textField_1.setText(str);
}
        if((s1.equals("CAD[Canadian Dollar]"))&&(s2.equals("CAD[Canadian Dollar]")))
{

textField_1.setText(s);
}else if((s1.equals("CAD[Canadian Dollar]"))&&(s2.equals("USD[United States Dollar]")))
{
    double a=Double.parseDouble(s);
    double f=a*0.75;
    String str=String.valueOf(f);
    textField_1.setText(str);
}
     else if((s1.equals("CAD[Canadian Dollar]"))&&(s2.equals("INR[Indian Rupee]")))
{
   double a=Double.parseDouble(s);
   double f=a*53.91;
   String str=String.valueOf(f);
   textField_1.setText(str);
}else if((s1.equals("CAD[Canadian Dollar]"))&&(s2.equals("JPY[Japanese Yen]")))
{
   double a=Double.parseDouble(s);
   double f=a*81.57;
   String str=String.valueOf(f);
   textField_1.setText(str);
}else if((s1.equals("CAD[Canadian Dollar]"))&&(s2.equals("EUR[Euro]")))
{
    double a=Double.parseDouble(s);
    double f=a*0.68;
    String str=String.valueOf(f);
    textField_1.setText(str);
}else if((s1.equals("CAD[Canadian Dollar]"))&&(s2.equals("KRW[South Korean Won]")))
{
   double a=Double.parseDouble(s);
   double f=a*883.21;
   String str=String.valueOf(f);
   textField_1.setText(str);
}
        if((s1.equals("KRW[South Korean Won]"))&&(s2.equals("KRW[South Korean Won]")))
{

textField_1.setText(s);
}else if((s1.equals("KRW[South Korean Won]"))&&(s2.equals("USD[United States Dollar]")))
{
    double a=Double.parseDouble(s);
    double f=a*0.00085;
    String str=String.valueOf(f);
    textField_1.setText(str);
}
     else if((s1.equals("KRW[South Korean Won]"))&&(s2.equals("INR[Indian Rupee]")))
{
   double a=Double.parseDouble(s);
   double f=a*0.061;
   String str=String.valueOf(f);
   textField_1.setText(str);
}else if((s1.equals("KRW[South Korean Won]"))&&(s2.equals("JPY[Japanese Yen]")))
{
   double a=Double.parseDouble(s);
   double f=a*0.092;
   String str=String.valueOf(f);
   textField_1.setText(str);
}else if((s1.equals("KRW[South Korean Won]"))&&(s2.equals("CAD[Canadian Dollar]")))
{
    double a=Double.parseDouble(s);
    double f=a*0.0011;
    String str=String.valueOf(f);
    textField_1.setText(str);
}else if((s1.equals("KRW[South Korean Won]"))&&(s2.equals("EUR[Euro]")))
{
   double a=Double.parseDouble(s);
   double f=a*0.00077;
   String str=String.valueOf(f);
   textField_1.setText(str);
}
       
       
       
       
       
       
       
       
       
        /*USD[United States Dollar]
        EUR[Euro]
        INR[Indian Rupee]
        JPY[Japanese Yen]
        CAD[Canadian Dollar]
        KRW[South Korean Won]*/

//if(comboBox_1.)

}
});
btnCovert.setBounds(309, 280, 89, 40);
frame.getContentPane().add(btnCovert);

JButton btnClear = new JButton("CLEAR");
btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
btnClear.setForeground(Color.RED);
btnClear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField.setText("");
textField_1.setText(" ");
}
});
btnClear.setBounds(311, 407, 87, 40);
frame.getContentPane().add(btnClear);
}
}