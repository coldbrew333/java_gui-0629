package java0629;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;

import javax.swing.SwingConstants;

public class Ex6 extends JFrame {
	private final JLabel lblNewLabel = new JLabel("0");
	private final JLabel lblNewLabel_1 = new JLabel("0");
	private final JLabel lblNewLabel_2 = new JLabel("0");
	private final JLabel lblNewLabel_3 = new JLabel("시작합니다");




	public Ex6() {
		super("Open Challenge");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setLocationByPlatform(true);
		
		Container c=getContentPane();
		c.setLayout(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel.setBackground(new Color(255, 51, 255));
		lblNewLabel.setBounds(26, 42, 57, 15);
		lblNewLabel.setOpaque(true);
		
		getContentPane().add(lblNewLabel);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(255, 51, 255));
		lblNewLabel_1.setBounds(122, 42, 57, 15);
		lblNewLabel_1.setOpaque(true);
		
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(new Color(255, 51, 255));
		lblNewLabel_2.setBounds(215, 42, 57, 15);
		lblNewLabel_2.setOpaque(true);
		
		getContentPane().add(lblNewLabel_2);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(77, 135, 131, 15);
		
		getContentPane().add(lblNewLabel_3);
		
		
	
	c.addKeyListener(new KeyAdapter() {

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			int	randomNum1 =(int)(Math.random()*3+1);
			int	randomNum2 =(int)(Math.random()*3+1);
			int	randomNum3 =(int)(Math.random()*3+1);
			lblNewLabel.setText(String.valueOf(randomNum1));
			lblNewLabel_1.setText(String.valueOf(randomNum2));
			lblNewLabel_2.setText(String.valueOf(randomNum3));
			
			if(randomNum1==randomNum2&&randomNum2==randomNum3) {
				lblNewLabel_3.setText("축하합니다~");
			}else {
				lblNewLabel_3.setText("아쉽네요~");
			}
			
			
			}
		}
	
	
	
	});
		
		
		
		
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
	
		new Ex6();
}

}