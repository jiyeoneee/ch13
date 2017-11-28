import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class FrameEx4_1 extends JFrame{
	public FrameEx4_1() {
		setTitle("�����ϴ� ������ �����"); //�������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		
		setSize(300,300); //������ ����
		setLocation(100,100);
		setVisible(true);
		
		VibratingThread thread = new VibratingThread(this);
		thread.start(); //thread ���� ����
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
			
			while(true) { //while���� ���̵� ������ �ݺ�
				try {
					Thread.sleep(10);
				}
				catch(InterruptedException e){return;}
				int sign = 1;
				if(random.nextBoolean()) sign = 1;
				else sign = -1;
				int tmpX = x + random.nextInt(5)*sign;  //�����Լ� ����
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