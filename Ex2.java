package java0629;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex2 extends JFrame{
	
	private JLabel[] lblKey;//�迭���� ����
	
	
	public Ex2() {
		super("Ű �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setLocationByPlatform(true);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		lblKey = new JLabel[3];
		lblKey[0] = new JLabel(" getKeyCode() ");
		lblKey[1] = new JLabel(" getKeyChar() ");
		lblKey[2] = new JLabel(" getKeyText() ");
		
		
		for(int i=0; i<lblKey.length;i++) {
			c.add(lblKey[i]);
			lblKey[i].setOpaque(true);
			lblKey[i].setBackground(Color.CYAN);
		
		}//for
		
		c.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("keyTyped");//�����Է½ø� ��Ÿ����.
			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("keyPressed");
				
				int keyCode=e.getKeyCode();//Ű �ڵ�
				char keyChar=e.getKeyChar();//Ű ���ڰ�
				String keyText = e.getKeyText(keyCode);//Ű �̸� ���ڿ� ǥ��(�ڵ忡���� ��ȯ���� ��)
			
				lblKey[0].setText(Integer.toString(keyCode));//String.vlaueOf(keyCode);
				lblKey[1].setText(Character.toString(keyChar));//String.valueOf(keyChar);
				lblKey[2].setText(keyText);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("keyReleased");
			}
		
		
		
		});
		
		
		setVisible(true);
		c.setFocusable(true);//��Ŀ�� ������ �ְ� ����
		c.requestFocus();//��Ŀ�� �ֱ�
	}//public Ex2
	
	
	
	public static void main(String[] args) {
		new Ex2();
	}//main

}
