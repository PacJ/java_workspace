package Test;

class Cal {
	public Cal() {
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static int div(int a, int b) {
		return a / b;
	}
}

public class A0613_StaticMethod {

	public static void main(String[] args) {
		int a = Cal.add(10,5); //합 => 객체 생성 없이 클래스부터 직접접근이 가능하다 -> static 메소드
		int b = Cal.div(10,5); //몫
		System.out.println(a + " " + b);

	}

}
