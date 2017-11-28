import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class FrameEx4_1 extends JFrame{
	public FrameEx4_1() {
		setTitle("진동하는 프레임 만들기"); //프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		
		setSize(300,300); //사이즈 지정
		setLocation(100,100);
		setVisible(true);
		
		VibratingThread thread = new VibratingThread(this);
		thread.start(); //thread 실행 시작
	}

	class VibratingThread extends Thread {
		Component c;
		public VibratingThread(Component c) {
			this.c = c;
		}
		
		public void run() {
			Random random = new Random();
			int x = c.getX();
			int y = c.getY();
			
			while(true) { //while문이 참이될 때까지 반복
				try {
					Thread.sleep(10);
				}
				catch(InterruptedException e){return;}
				int sign = 1;
				if(random.nextBoolean()) sign = 1;
				else sign = -1;
				int tmpX = x + random.nextInt(5)*sign;  //랜덤함수 지정
				if(random.nextBoolean()) sign = 1;
				else sign = -1;
				int tmpY = y + random.nextInt(5)*sign;
		
				c.setLocation(tmpX, tmpY);
			}
		}
	}
	public static void main(String [] args) {
		new FrameEx4_1();
	}
} 