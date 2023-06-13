package Problems;

import java.util.Scanner;

//3. 다음 Circle클래스를 활용하여 Circle 객체배열을 생성하고,
// 5개의 원 반지름을 입력받아 배열에저장한 후, 원의 면적의 합을 출력해라.
class Circle{
	private double r;
	Circle(double r){
		this.r = r;
	}
	
	double area() {
		return 3.14*r*r;
	}
}

public class Prob {

	public static void main(String[] args) {
		Circle[] arr = new Circle[5];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			arr[i] = new Circle(input);
			System.out.println(arr[i].area());
			sum += arr[i].area();
		}
		
		System.out.println(sum);
	}

}
