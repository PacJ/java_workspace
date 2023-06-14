package a0614;

class Th extends Thread{
	
	String name;
	Th(String n) {
		name = n;
	}
	
	public void run() { // Thread의 메인 메소드. Thread 실행 시작.
		for(int i = 0; i < 10 ; i ++) {
			System.out.println(name);
			try {
				// sleep은 Thread의 메소드로 try/catch block으로 묶어줘야 한다.
				sleep(100);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Thimp implements Runnable {
	String name;
	Thimp(String n) {
		name = n;
	}
	
	public void run() { // Thread의 메인 메소드. Thread 실행 시작.
		for(int i = 0; i < 10 ; i ++) {
			System.out.println(name);
			try {
				System.out.println("Implemented Thread" + " " + i + name);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class A0614_Thread {

	public static void main(String[] args) {
		// 스레드 객체 생성하는 두가지
		//1. Thread 클래스 사용
		//2. Runnable 인터페이스 사용
		
		Th t = new Th("스레드1");
		Th t2 = new Th("스레드2");
		
		// Runnable 인터페이스 사용 시 Thread Class를 생성해서 따로 할당 한 후 start로 실행.
		Thimp th = new Thimp("스임1");
		Thread th1 = new Thread(th);
		Thimp td = new Thimp("스임2");
		Thread td1 = new Thread(td);
		
//		t.start();
//		t2.start();
		
		th1.start();
		td1.start();

	}

}
