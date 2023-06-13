package Test;

import java.util.Scanner;

public class A0612_Scanner {
	
	// 두 값 중 큰 값 리턴
	static int big(int c, int d) {
		
		return c > d ? c : d;
	}
	
	// 7개중 제일 큰 값 리턴
	static int biggest(int[] arr) {
		int max = 0;
		for(int i = 0; i<arr.length; i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int c=s.nextInt();
		int d=s.nextInt();
		
		System.out.println(big(c,d)); //입력한 두 수 중 큰값리턴(삼항 조건연산자)
		
		
		//입력된 7개의 값 중 큰 값 리턴
		int a[] = new int[7];
		
		for(int i=0; i<a.length; i++) {
			a[i]=s.nextInt();
			
			}
		System.out.println(biggest(a));
		
		}
	}
