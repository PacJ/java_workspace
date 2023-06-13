package problems0613;

import java.util.InputMismatchException;
import java.util.Scanner;

//3. 5개 정수를 입력받아 합을 구하는 프로그램.
//만약, 정수를 아닌 문자를 입력할 때 발생하는 InputMismatchException예외를 처리하여 다시 입력받도록 작성해라.
//실행 결과) 1번째 정수: 1
//2번째 정수: a
//다시 입력해라. 정수아니다.
//2번째 정수 : 2
//3번째 정수 : 3
//4번째 정수: 4
//5번째 정수: 5 
//총합: 15

class Mis extends InputMismatchException {
	public Mis() {
		super("다시 입력해라. 정수아니다.");
	}
}

public class Problem3 {

	public static void main(String[] args) {
		
			try {
				int n = in();
				System.out.println(n);
				System.out.println("총합" + n);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		

	}
	
	public static int in() throws Mis {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			boolean valid = false;
			while(!valid) {
				try {
					String input = sc.next();
					System.out.println(i+1 + "번째 정수:" + input);
					
					if (!input.matches("-?\\d+")) {
                        throw new Mis();
                    }
					
					int num = Integer.parseInt(input);
					
					sum += num;
					valid = true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
				}
			}
		}
		return sum;
	}

}
