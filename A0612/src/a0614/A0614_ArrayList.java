package a0614;

import java.util.ArrayList;

class Profile {
	public String id;
	public int age;
	
	public Profile() {
	}
	
	public Profile(String id, int age) {
		this.id = id;
		this.age = age;
	}
}

public class A0614_ArrayList {

	public static void main(String[] args) {
		
		//List Interface -> <>
		ArrayList<Profile> a = new ArrayList<Profile>();
		
		a.add(new Profile("aa", 12));
		a.add(new Profile("bb", 21));
		a.add(new Profile("cc", 99));
		
		for(int i = 0; i<a.size(); i++) {
			System.out.println(a.get(i)); // 주소값 출력
			Profile b = a.get(i);
			System.out.print(b.id + " " + b.age + "\n");
		}

	}

}
