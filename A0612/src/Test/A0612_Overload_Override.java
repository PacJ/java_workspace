package Test;

class AAA {
	public void ride() {
		System.out.println("오버라이딩 AAA");
	}
	
	public void load() {
		System.out.println("오버로딩 AAA");
	}
}

class BBB extends AAA{
	public void ride() { // 상속받은 메소드 오버라이딩(재정의)
		System.out.println("오버라이딩 BBB");
	}
	
	public void load(int b) { //오버로딩 -> 같은 함수의 변환(매개변수 추가)
		System.out.println(b + "오버로딩 BBB");
	}
	
	public void load(int b, int c) { //오버로딩 -> 같은 함수의 변환(매개변수 추가)
		System.out.println(b + "오버로딩 BBB");
	}
}

public class A0612_Overload_Override {

	public static void main(String[] args) {
		
		AAA a = new AAA(); //객체 생성
		a.ride();
		a.load();
		
		
		BBB b = new BBB();
		b.ride();
		b.load(10);
		//오버라이딩 vs 오버로딩
		
//		Overriding occurs when a subclass provides a different implementation of a method already defined in its superclass,
//		using the same method signature (name, return type, and parameters).
		
//		Overloading occurs when multiple methods in the same class have the same name but different parameters,
//		allowing for different variations of method calls within the class.

	}

}
