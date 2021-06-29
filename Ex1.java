package java0629;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex1 extends JFrame {
	
	JLabel la =new JLabel("hello");//멤버변수
	
	
	
	public Ex1() {//생성자 생성
		//창모양 만들기
		super("창제목");//상위클래스(JFrame)에 기본생성자가 존재 하기 때문에 
				//string Title 은 setTitle("창제목")과 같다.->수정자 중간중간 제목이 바뀔때 사용
	
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setLocationByPlatform(true);
		
		Container c=getContentPane();//컨탠트팬은 이미 배치 관리자 보더 레이아웃이 들어가있다.
		c.setLayout(null);//컨탠트팬영역 배치 관리자 삭제
		
		la.setOpaque(true);//레이블에 배경색이 보이도록 설정(Opaque불투명속성)
		la.setBackground(Color.ORANGE);
		la.setSize(50,10);
		la.setLocation(30,30);//컨텐트 팬 영역기준 좌측 상단 꼭지점 (0,0)이다.
		c.add(la);
		
		c.addMouseListener(new MouseAdapter() {//마우스 리스터는 추상메소드 5개 있음

			@Override
			public void mousePressed(MouseEvent e) {
				int x=e.getX();//마우스 클릭 X좌표
				int y=e.getY();//마우스 클릭 Y좌표
			System.out.println(x+","+y);
			
			la.setLocation(x, y);//레이블 위치를 x,y로 이동
			
	 //마우스 버튼 구분하기
	switch (e.getButton()) {
	case MouseEvent.BUTTON1: System.out.println("BUTTON1눌러짐");break;
	case MouseEvent.BUTTON2: System.out.println("BUTTON2눌러짐");break;
	case MouseEvent.BUTTON3: System.out.println("BUTTON3눌러짐");break;
	}
		
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==1) {
					System.out.println("한번 클릭됨");
				}else if(e.getClickCount()==2) {//더블클릭
					System.out.println("더블 클릭됨");
				}
			}
			
			
		
		});//new MouseAdapter() 이미 구현했고 익명의 클래스가 비어있기  때문에 수정 할수있음
			//람다식 불가
		
		
		
		setVisible(true);
	
	
	}
	public static void main(String[] args) {
		
		new Ex1();//객체 생성
	}//main

}
