import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class FrameEx4_2 extends JFrame { 
	private JLabel la = new JLabel("진동 레이블"); //JLabel에대한 컴포넌트
	runnable thread; 
	Thread th; 
	FrameEx4_2() { 
		this.setTitle("진동하는 레이블 만들기"); //타이틀지정
 		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		thread = new runnable(); 
 		th = new Thread(thread); //객체생성
 		this.add(la); 
		this.setVisible(true); 
		this.setSize(300, 300); 
 		th.start(); //시작
 	} 
 	class runnable implements Runnable{ 
 		public void run() { 
 			while(true) {  //반복문이 참이될때까지 반복
 				try { 
 					la.setLocation(20,10); 
 					Thread.sleep(1); 
 					la.setLocation(10,20); 
 					Thread.sleep(1); 
 					la.setLocation(10,10); 
 					Thread.sleep(1); 
 					la.setLocation(20,20); 
 					Thread.sleep(1); 
 				}  
 				catch(InterruptedException e) {return;} 
 				} 
 			} 
 		}
 	public static void main(String[] args) { 
 		new FrameEx4_2(); 
	} 
 } 

