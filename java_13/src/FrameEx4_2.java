import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class FrameEx4_2 extends JFrame { 
	private JLabel la = new JLabel("���� ���̺�"); //JLabel������ ������Ʈ
	runnable thread; 
	Thread th; 
	FrameEx4_2() { 
		this.setTitle("�����ϴ� ���̺� �����"); //Ÿ��Ʋ����
 		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		thread = new runnable(); 
 		th = new Thread(thread); //��ü����
 		this.add(la); 
		this.setVisible(true); 
		this.setSize(300, 300); 
 		th.start(); //����
 	} 
 	class runnable implements Runnable{ 
 		public void run() { 
 			while(true) {  //�ݺ����� ���̵ɶ����� �ݺ�
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

