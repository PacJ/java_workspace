package Test;

class In {
	private int num;
	
	public In(int num) {
		this.num = num;
	}
	
	public String toString() {
		return num+"";
	}
}


public class A0612_toString {

	public static void main(String[] args) {

		In i = new In(4);
		System.out.println(i.toString()); //객체를 문자열로 변경->toString
	}

}
