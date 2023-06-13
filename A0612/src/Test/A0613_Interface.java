package Test;

interface Addin{
	
	public int add(int a, int b);
	public int add(int a); // 오버로딩
	
	default void pr() {
		System.out.println("히히");
	}
}

interface B {
	public int subtract(int a, int b);
	public int subtract(int a);
	
	default void br() {
		System.out.println("자고싶다");
	}
}

class Add implements Addin, B {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int add(int a) {
		return a;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public int subtract(int a) {
		return a;
	}
	
}

public class A0613_Interface {

	public static void main(String[] args) {

		Add a = new Add();
		System.out.println(a.add(2, 5));
		a.pr();
	}

}
