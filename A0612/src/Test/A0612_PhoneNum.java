package Test;

import java.util.Scanner;

class PhoneNum{
	String name;
	String phone;
	
	PhoneNum(String n, String p){
		name = n;
		phone = p;
	}
	
	void show() {
		System.out.println("이름: " + name);
		System.out.println("번호 : " + phone);
	}
}

class School extends PhoneNum {
	String major;
	
	School(String n, String p, String major) {
		super(n,p);
		this.major = major;
	}
	
	void show() { //오버라이딩
		super.show();
		System.out.println("전공 : " + major);
	}
}

class Worker extends PhoneNum {
	String grade;
	
	Worker(String n, String p, String g) {
		super(n,p);
		grade=g;
	}
	
	void show() { //오버라이딩
		super.show(); // 이름, 번호
		System.out.println("직급 : " + grade);
	}
}

class Arr {
	PhoneNum [] arr; //객체배열 선언
	int n;
	
	public Arr(int n) {
		arr=new PhoneNum[n]; // 배열 생성코드
		n=0;
	}
	
	void add(PhoneNum p) {
		arr[n++]=p; //친구 추가
	}
	
	void friend(char ch) {
		Scanner s = new Scanner(System.in);
			System.out.println("이름 : ");
			String name = s.next();
			
			System.out.println("번호 : ");
			String num = s.next();
			
			switch(ch) {
			case 'A':
				System.out.println("전공 : ");
				String major=s.next();
				
				//PhoneNum p = new School(name, num, major)
				add(new School(name, num, major));
				break;
				
			case 'B':
				System.out.println("직급 : ");
				String grade=s.next();
				
				//PhoneNum p = new Worker(name, num, grade)
				add(new Worker(name, num, grade));
				break;
			}
	}
	
	void all() {
		for(int i=0; i<n; i++) {
			arr[i].show();
		}
	}
}
public class A0612_PhoneNum {

	public static void main(String[] args) {
		Arr ar = new Arr(3);
		
		while(true) {
			System.out.println("A. 학교 친구 정보");
			System.out.println("B. 직장 동료 정보");
			System.out.println("C. 종료");
			System.out.println("D. 출력");
			System.out.println("문자 입력");
			
			Scanner s = new Scanner(System.in);
			char c = s.next().charAt(0);
			
			switch(c) {
			case 'A':
				ar.friend(c);
				break;
			case 'B':
				ar.friend(c);
				break;
			case 'C':
				System.out.println("종료.");
				return;
			case 'D':
				ar.all();
				
			}
		}
	}

}
