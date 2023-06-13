package problems0613;

//6. 인터페이스 Po를 만들고 추상메소드 pr을 만들어라. 상속받아 구현해라.
//실행 결과) java책은30000원
//python

interface Po {
	void pr(String lang);
	void pr(int price, String lang);
}

class Point implements Po {
	public int price;
	public String lang;
	
	public Point() {
		
	}
	
	public Point(String lang) {
		this.lang = lang;
	}
	
	public Point(int price, String lang) {
		this.price = price;
		this.lang = lang;
	}
	
	@Override
	public void pr(int price, String lang) {
		System.out.println(lang + "책은" + price + "원");
	}

	@Override
	public void pr(String lang) {
		System.out.println(lang);
	}

}

public class Problem2 {

	public static void main(String[] args) {
		Po p=new Point();

		p.pr(30000,"java"); 

		p.pr("python");

	}

}
