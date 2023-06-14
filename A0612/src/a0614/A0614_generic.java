package a0614;

class Java {
	String title;
	Java(String t) {
		this.title = t;
	}
	
	void show() {
		System.out.println(title);
	}
}

class DB {
	int n;
	DB(int n) {
		this.n = n;
	}
	
	void pr() {
		System.out.println(n);
	}
}

class Program<T> { //모형자 <>:제네릭 기호
	
	public T t;

	void in(T t) {
		this.t=t;
	}
	
	T get() {
		return t;
	}
	 
}

public class A0614_generic {

	public static void main(String[] args) {
		//제네릭(generic)
		//컬렉션 구조 프레임워크가 제네릭으로 되어있다.
		Program<Java> p = new Program<Java>();
		p.in(new Java("java"));
		
		Java j = p.get();
		j.show();
		
		Program<DB> d = new Program<DB>();
		d.in(new DB(3));
		
		DB h = d.get();
		h.pr();
	}

}
