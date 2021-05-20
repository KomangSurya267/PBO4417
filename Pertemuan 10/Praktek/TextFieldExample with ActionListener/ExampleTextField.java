/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampletextfield;
import java.awt.*;  
import java.awt.event.*; 
/**
 *
 * @author Toshiba
 */
public class ExampleTextField extends Frame implements ActionListener{  
    TextField tf1,tf2,tf3;  
    Button b1,b2;  
    ExampleTextField(){  
        tf1=new TextField();  
        tf1.setBounds(50,50,150,20);  
        tf2=new TextField();  
        tf2.setBounds(50,100,150,20);  
        tf3=new TextField();  
        tf3.setBounds(50,150,150,20);  
        tf3.setEditable(false);   
        b1=new Button("+");  
        b1.setBounds(50,200,50,50);  
        b2=new Button("-");  
        b2.setBounds(120,200,50,50);  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        add(tf1);add(tf2);add(tf3);add(b1);add(b2);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()==b1){  
            c=a+b;  
        }else if(e.getSource()==b2){  
            c=a-b;  
        }  
        String result=String.valueOf(c);  
        tf3.setText(result);  
    }  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ExampleTextField();
    }
    
}
