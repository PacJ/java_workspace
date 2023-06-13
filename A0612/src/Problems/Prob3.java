package Problems;

// Tv클래스와main()를 보고 Tv클래스를 상속받은 Tv1클래스를작성해라.

class Tv{
	private int size;
	
	Tv(int size) {
		this.size=size; 
		}
	
	protected int getsize() {
		return size; 
		}
}

class Tv1 extends Tv{
	String brand;

	Tv1(int size) {
		super(size);
	}
	
	Tv1(int size, String brand) {
		super(size);
		this.brand = brand;
	}
	
	public void show() {
		System.out.println(brand + " " + getsize() + " 인치Tv");
	}
	
}

public class Prob3 {

	public static void main(String[] args) {
		Tv1 t=new Tv1(20, "삼성"); 
		
		t.show(); //삼성 20인치 Tv 출력
	}


}
