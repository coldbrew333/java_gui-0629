package java0629;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


//<F1>Ű�� �Է� ������ ����Ʈ ���� ������ �ʷϻ�����, %Ű�� �Է� ������ ��������� ����
public class Ex3 extends JFrame {
private JLabel la=new JLabel();
	public Ex3() {
		super("KeyCodeȮ�� :F1Ű�� �ʷϻ�,%Ű�� �����");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(la);
		
		c.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				la.setText(e.getKeyCode()+"Ű�� �ԷµǾ���");
				if(e.getKeyChar()=='%') {//�Էµ�Ű�� '%'����Ȯ��
					c.setBackground(Color.yellow);
				}else if(e.getKeyCode()==KeyEvent.VK_F1) {
					c.setBackground(Color.GREEN);
				}
			}
		
		});
		
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
	}
	public static void main(String[] args) {
	 new Ex3();

	}//main

}
