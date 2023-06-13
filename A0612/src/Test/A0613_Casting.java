package Test;

class Personne{
	
	String name;

	Personne(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println(name);
	}
}

class Student1 extends Personne {

	Student1(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println(name);
	}
	
}


public class A0613_Casting {

	public static void main(String[] args) {
		
		//업캐스팅 다운캐스팅 -> 다형성, 상속
		Personne p = new Student1("길동"); //upcasting(Student1을 생성하고, Personne p 에 담는다)
		p.show();
		
		Student1 s = (Student1)p; // downcasting
		
		System.out.println(s.name);
		

	}

}
