package problems0614_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

//6. HashMap으로 이름과 나이를 입력받아 3명의 값을 저장한다.
//저장한 후 나이가 가장 많은 사람의 이름을 출력해라. 

public class Problem6 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
			int oldest = 0;
			String oldestName = "";
		
			Scanner sc = new Scanner(System.in);
			for(int i = 0; i < 3; i++) {
			
			System.out.println("이름을 입력해주세요.");
			String name = sc.next();
			
			System.out.println("나이를 입력해주세요.");
			int age = sc.nextInt();
			
			map.put(name, age);
			
				if(map.get(name) > oldest) {
					oldest = map.get(name);
					oldestName = name;
				}
			}
			System.out.println(oldestName);
			
	}

}
