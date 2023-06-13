package problems0613;

//1. 다음 main함수를 보고 작성해라.

//실행 결과) 멋진 신세계 올더스 헉슬리
//더 해빙 작가 미상
//생성자 호출!! 

class Book {
	public String title;
	public String author;
	
	public Book() {
		System.out.println("생성자 호출!!");
	}
	
	public Book(String title) {
		this.title = title;
		this.author = "작가미상";
		System.out.println(title + " " + author);
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		System.out.println(title + " "  + author);
	}
}

public class Problem1 {

	public static void main(String[] args) {
		Book b1=new Book("멋진 신세계", "올더스 헉슬리");

		Book b2=new Book("더 해빙");

		Book b3=new Book();
	}

}
