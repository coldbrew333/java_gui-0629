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
		super("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setLocationByPlatform(true);//운영체제가 위치시키는곳
		
		
		//레이블이 자유룝게 위치하도록 배치관리자 제거
	Container c	=getContentPane();
	c.setLayout(null);
	
	la.setSize(100,20);
	la.setLocation(50,50);
	c.add(la);
	
	setVisible(true);
	
	c.addKeyListener(new KeyAdapter() {

		@Override
		public void keyPressed(KeyEvent e) {
			//레이블의 현재좌표위치에서 단위픽셀 만큼 화살표 키 방향으로 레이블 좌표 이동시키기
			//getX() getY()현재좌표 값 가져오기
			//setLocation(x,y)좌표 설정하기
			
		
			
			
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
