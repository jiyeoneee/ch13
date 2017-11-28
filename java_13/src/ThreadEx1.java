import java.util.Scanner;

public class ThreadEx1{

	static public void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 키나 입력>> "); // 아무 키나 입력
		sc.nextLine();
		
		Thread thread = new Thread(new CountingThread());	
		thread.start();
	}
}

class CountingThread implements Runnable {
	@Override  //오버라이딩
	public void run() {
		System.out.println("스레드 실행 시작");		
		for(int i=1; i<11; i++)  //반복문 (1에서 10까지 출력)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("스레드 종료"); //10이되면 스레드 종료
	}
}
