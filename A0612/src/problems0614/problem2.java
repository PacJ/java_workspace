package problems0614;

import java.util.Scanner;

abstract class Calc {
	double op1;
	double op2;
	
	void set(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	abstract double calculate();
}

class Add extends Calc {

	@Override
	double calculate() {
		return op1 + op2;
	}
	
}

class Sub extends Calc {

	@Override
	double calculate() {
		return op1 - op2;
	}
	
}

class Mul extends Calc {

	@Override
	double calculate() {
		return op1 * op2;
	}
	
}

class Div extends Calc {

	@Override
	double calculate() {
		return op1 / op2;
	}
	
}

public class problem2 {

	public static void main(String[] args) {
		
		System.out.println("두 연산자와 피연산자를 입력하시오.");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("첫번째 연산자:");
			double d1 = Double.parseDouble(sc.next());
			
			System.out.println("두번째 연산자:");
			double d2 = Double.parseDouble(sc.next());
			
			System.out.println("피연산자 입력:");
			String op = sc.next();
			
			Calc calc = null;
			switch(op) {
			case "+":
				calc = new Add();
//				Add add = new Add();
//				add.set(d1, d2);
//				System.out.println(add.calculate());
				break;
			case "-":
				calc = new Sub();
//				Sub sub = new Sub();
//				sub.set(d1, d2);
//				System.out.println(sub.calculate());
				break;
			case "*":
				calc = new Mul();
//				Mul mul = new Mul();
//				mul.set(d1, d2);
//				System.out.println(mul.calculate());
				break;
			case "/":
				calc = new Div();
//				Div div = new Div();
//				div.set(d1, d2);
//				System.out.println(div.calculate());
				break;
			}
			
			calc.set(d1, d2);
			System.out.println(calc.calculate());
			
			System.out.println("종료 하시려면 quit을 입력해주세요.");
			String quit = sc.next();
			if(quit.equals("quit")) {
				System.out.println("종료합니다.");
				System.exit(0);
			} else {
				continue;
			} 
		}

	}

}
