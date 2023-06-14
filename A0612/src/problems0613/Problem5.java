package problems0613;

//5. equals(두 원의 면적이 같은지 비교), toString메소드를 사용하여 완성시켜라.
//(반지름이 30임)

class Circle {
	int rad;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int rad) {
		this.rad = rad;
	}
	
	public String toString() {
		return rad + "";
	}
	
	public boolean equals(Object obj) { //Object ob = new Circle();
		if(this.rad==((Circle)obj).rad) {
			return true;
		} else {
			return false;
		}
	}
}

public class Problem5 {

	public static void main(String[] args) {
		Circle a=new Circle(30);

		Circle b=new Circle(30);

		System.out.println("반지름"+a);

		System.out.println("반지름"+b); // 객체 출력 시 toString 자동호출

		if(a.equals(b)) { //객체비교 -> 주소값
			System.out.println("같은 원"); 
		}

		else {
			System.out.println("다른 원");
		}
	}

}
