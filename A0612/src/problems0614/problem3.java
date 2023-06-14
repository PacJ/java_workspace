package problems0614;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		
		System.out.println("배열의 크기를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			int grade = (int)(Math.random()*100);
			arr[i] = grade;
			System.out.println(arr[i] + " 점");
		}
		
		for(int k: arr) {
			System.out.println(k + " 점");
		}

	}

}
