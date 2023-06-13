package Test;

class Music {
	public String state;
	public String singer;
	public String title;
	
	public Music() {
	}
	
	public Music(String title) {
		this("Off", "unknown", title); //다른 생성자 호출하는 this
	}
	
	public Music(String state, String singer) {
		this.state = state;
		this.singer = singer;
	}
	
	public Music(String state, String singer, String title) {
		this.state = state;
		this.singer = singer;
		this.title = title;
	}
}

public class A0613_This {

	public static void main(String[] args) {
		Music m = new Music("On", "BTS");
		System.out.println(m.title + " " + m.state + " " + m.singer);
		
		Music m1 = new Music("Butter");
		System.out.println(m1.title+" " + m1.state + " " + m1.singer);
	}

}
