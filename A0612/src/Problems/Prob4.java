package Problems;
//4. main()를 보고 클래스 작성해라.

class Shape {
	public int x;
	public int y;
	public String sym;
	
	public Shape() {
		x = 3;
	}
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void pr(String sym) {
		this.sym = sym;
		System.out.println(sym);
	}
	
	public void show() {
		if(y==0) {
			for(int a = 0; a < x; a++) {
				System.out.print(sym);
			}
			System.out.println();
		}else {
			for(int i = 0; i < x; i++) {
				for(int j = 0; j < y; j++) {				
					System.out.print(sym);
				}
				System.out.println();
			}
		}
	}
}

public class Prob4 {

	public static void main(String[] args) {
		Shape s = new Shape();
		
		Shape s1 = new Shape(2,5);
		
		s.pr("@"); 
		
		s1.pr("#");
		
		s.show(); //@@@-> 1행 3열로 출력
		
		s1.show(); //#####->2행 5열로 출력
		
		//#####


	}
}
