package java0629;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex1 extends JFrame {
	
	JLabel la =new JLabel("hello");//�������
	
	
	
	public Ex1() {//������ ����
		//â��� �����
		super("â����");//����Ŭ����(JFrame)�� �⺻�����ڰ� ���� �ϱ� ������ 
				//string Title �� setTitle("â����")�� ����.->������ �߰��߰� ������ �ٲ� ���
	
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setLocationByPlatform(true);
		
		Container c=getContentPane();//����Ʈ���� �̹� ��ġ ������ ���� ���̾ƿ��� ���ִ�.
		c.setLayout(null);//����Ʈ�ҿ��� ��ġ ������ ����
		
		la.setOpaque(true);//���̺� ������ ���̵��� ����(Opaque������Ӽ�)
		la.setBackground(Color.ORANGE);
		la.setSize(50,10);
		la.setLocation(30,30);//����Ʈ �� �������� ���� ��� ������ (0,0)�̴�.
		c.add(la);
		
		c.addMouseListener(new MouseAdapter() {//���콺 �����ʹ� �߻�޼ҵ� 5�� ����

			@Override
			public void mousePressed(MouseEvent e) {
				int x=e.getX();//���콺 Ŭ�� X��ǥ
				int y=e.getY();//���콺 Ŭ�� Y��ǥ
			System.out.println(x+","+y);
			
			la.setLocation(x, y);//���̺� ��ġ�� x,y�� �̵�
			
	 //���콺 ��ư �����ϱ�
	switch (e.getButton()) {
	case MouseEvent.BUTTON1: System.out.println("BUTTON1������");break;
	case MouseEvent.BUTTON2: System.out.println("BUTTON2������");break;
	case MouseEvent.BUTTON3: System.out.println("BUTTON3������");break;
	}
		
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==1) {
					System.out.println("�ѹ� Ŭ����");
				}else if(e.getClickCount()==2) {//����Ŭ��
					System.out.println("���� Ŭ����");
				}
			}
			
			
		
		});//new MouseAdapter() �̹� �����߰� �͸��� Ŭ������ ����ֱ�  ������ ���� �Ҽ�����
			//���ٽ� �Ұ�
		
		
		
		setVisible(true);
	
	
	}
	public static void main(String[] args) {
		
		new Ex1();//��ü ����
	}//main

}
