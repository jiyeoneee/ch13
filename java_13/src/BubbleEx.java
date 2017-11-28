import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BubbleEx extends JFrame{
	public BubbleEx() {
		setTitle("���� ����"); //Ÿ��Ʋ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		
		GamePanel p = new GamePanel();
		setContentPane(p);
		setSize(300,300);	//����������
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new BubbleEx();
	}
}
class GamePanel extends JPanel {
	public GamePanel() {
		setLayout(null);
		addMouseListener(new MouseAdapter() { //���콺�������߰�
			public void mousePressed(MouseEvent e) {
				BubbleThread bubbleThread = new BubbleThread(e.getX(), e.getY());
				bubbleThread.start(); //����
			}
		});
	}
	
	class BubbleThread extends Thread {
		JLabel bubble;
		public BubbleThread(int bubbleX, int bubbleY) {
			ImageIcon img = new ImageIcon("images/bubble.jpg"); //�̹��� ����
			bubble = new JLabel(img);
			bubble.setSize(img.getIconWidth(),img.getIconWidth());
			bubble.setLocation(bubbleX, bubbleY);
			add(bubble); // GamePanel�� add()
			repaint();
		}
		
		public void run() { //����
			while(true) {
				int x = bubble.getX() ;
				int y = bubble.getY() - 5;
				if(y < 0) {
					remove(bubble);
					repaint();
					return; 
				}
				bubble.setLocation(x, y);
				repaint();
				try {
					sleep(200);
				}
				catch(InterruptedException e) {}
			}
		}
	}
}