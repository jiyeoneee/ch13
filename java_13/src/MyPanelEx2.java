import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

class MyPanelEx2 extends JFrame{
	private MyPanel mypanel = new MyPanel();
	public MyPanelEx2()
	{
		setTitle("���� 0.5�� �������� �̵�"); //Ÿ��Ʋ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		setContentPane(mypanel); 
		Container c = getContentPane();
		c.addMouseListener(new Mouse());
		setVisible(true);
		setSize(500, 500); //500X 500������ ����
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED); 
			g.drawOval(20,20,80,80); 
		}
	}
	public static void main(String[] args) {
		new MyPanelEx2();
	}
}
class Mouse implements MouseListener{
	public void mouseClicked(MouseEvent e) { //���콺�̺�Ʈ
		JPanel g = (JPanel)e.getSource();
		int x = (int)(Math.random()*300); //�����Լ� ����
		int y = (int)(Math.random()*300);
		g.setLocation(x, y);
	}
	 public void mouseEntered(MouseEvent e) {
	 }
	 public void mouseExited(MouseEvent e) {
	 }
	 public void mousePressed(MouseEvent e) {
	 }
	 public void mouseReleased(MouseEvent e) { 
	 }
}