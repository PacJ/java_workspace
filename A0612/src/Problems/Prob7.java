package Problems;

import java.util.Scanner;

//7. 두 개 배열에서 영어단어를 입력받아 한글을 출력하는 프로그램
//“stop"을 입력하면 프로그램을 종료시켜라. (while(true), equals() 사용)
//실행결과) 영어 단어 입력: book
//책
//영어 단어 입력: stop

public class Prob7 {

	public static void main(String[] args) {

	String eng[]={"student","book","future","note"};
	
	String kor[]={"학생","책","미래","노트"};
	
	Scanner sc = new Scanner(System.in);
	
	
	while(true) {
		System.out.println("영어 단어 입력:");
		String input = sc.next();
		if(input.equals("stop")) {
			System.out.println("종료");
			System.exit(0);
		}
		switch (input) {
		case "student":
			System.out.println("학생");
			break;
		case "book":
			System.out.println("책");
			break;
		case "future":
			System.out.println("미래");
			break;
		case "note":
			System.out.println("노트");
			break;
		default:
			System.out.println("일치하는 단어를 찾지 못했습니다.");
		}
		
	}
}

}
