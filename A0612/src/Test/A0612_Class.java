package Test;

class Profile {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Profile() {
		
	}
	
	public Profile(int age) {
		this.age = age;
	}
	
	public Profile(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void show() {
		System.out.println(age + " " + name);
		
	}
}

public class A0612_Class {

	public static void main(String[] args) {
		
		Profile p1 = new Profile();
		Profile p2 = new Profile(39, "Keanu");
		Profile p3 = new Profile(35);
		
		p1.setAge(22);
		p1.setName("원박");
		
		p1.show();
		p2.show();
		p3.show();

	}

}
