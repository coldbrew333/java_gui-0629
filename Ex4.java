package java0629;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex4 extends JFrame {

	private JLabel la = new JLabel("HELLO");
	
	final int Move_UNIT =10;
	public Ex4() {
		super("��,��,��,�� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setLocationByPlatform(true);//�ü���� ��ġ��Ű�°�
		
		
		//���̺��� ������� ��ġ�ϵ��� ��ġ������ ����
	Container c	=getContentPane();
	c.setLayout(null);
	
	la.setSize(100,20);
	la.setLocation(50,50);
	c.add(la);
	
	setVisible(true);
	
	c.addKeyListener(new KeyAdapter() {

		@Override
		public void keyPressed(KeyEvent e) {
			//���̺��� ������ǥ��ġ���� �����ȼ� ��ŭ ȭ��ǥ Ű �������� ���̺� ��ǥ �̵���Ű��
			//getX() getY()������ǥ �� ��������
			//setLocation(x,y)��ǥ �����ϱ�
			
		
			
			
		int keyCode =e.getKeyCode();
			
		switch(keyCode) {
		case KeyEvent.VK_UP:
			
			la.setLocation(la.getX(),la.getY()-Move_UNIT);
			break;
case KeyEvent.VK_DOWN:
			
			la.setLocation(la.getX(),la.getY()+Move_UNIT);
			break;
case KeyEvent.VK_LEFT:
	
	la.setLocation(la.getX()-Move_UNIT,la.getY());
	break;
case KeyEvent.VK_RIGHT:
	
	la.setLocation(la.getX()+Move_UNIT,la.getY());
	break;
			
			
		}
			
		
		}
	
	
	
	});
	
	c.setFocusable(true);
	c.requestFocus();
		
	}
	public static void main(String[] args) {
		new Ex4();

	}

}
