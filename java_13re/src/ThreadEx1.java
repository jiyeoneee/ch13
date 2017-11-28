import java.util.Scanner;

public class ThreadEx1{

	static public void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ƹ� Ű�� �Է�>> "); // �ƹ� Ű�� �Է�
		sc.nextLine();
		
		Thread thread = new Thread(new CountingThread());	
		thread.start();
	}
}

class CountingThread implements Runnable {
	@Override  //�������̵�
	public void run() {
		System.out.println("������ ���� ����");		
		for(int i=1; i<11; i++)  //�ݺ��� (1���� 10���� ���)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("������ ����"); //10�̵Ǹ� ������ ����
	}
}
