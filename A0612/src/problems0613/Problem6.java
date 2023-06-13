package problems0613;

//6. main()를 보고 인터페이스를 작성해라. 
//(인터페이스명은 Re, 모든 메소들들을 인터페이스안에서 선언하고
//		show함수는 default로 설정,area는 abstract로 설정)

//실행결과) 사각형!!
//면적 200 

interface Re {
	public int area();
	
	default void show() {
		System.out.println("사각형!");
	}
}

class Rec implements Re {
	public int x;
	public int y;

	public Rec() {

	}
	
	public Rec(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int area() {
		return x * y;
	}


	
}

public class Problem6 {

	public static void main(String[] args) {
		Re r=new Rec(10,20);

		r.show(); //"사각형!!" 출력

		System.out.println("면적" + r.area());

	}

}
