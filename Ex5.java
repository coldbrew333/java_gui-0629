package java0629;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class Ex5 extends JFrame {
	private final JButton btnNewButton = new JButton("New button");
	private final JTextField textField = new JTextField();
	private  
	private
	public Ex5() {
		super("Ã¢Á¦¸ñ");
		textField.setBounds(39, 35, 116, 21);
		textField.setColumns(10);
		getContentPane().setBackground(new Color(204, 255, 204));
		setBackground(new Color(255, 204, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setLocationByPlatform(true);
		getContentPane().setLayout(null);
		btnNewButton.setBounds(58, 95, 97, 23);
		
		getContentPane().add(btnNewButton);
		
		getContentPane().add(textField);
		
	}
	public static void main(String[] args) {
		new Ex5();
	}
}
