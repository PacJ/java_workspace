package problems0613;

//4. 실수 9.5를 객체화(박싱) 시켜라.
//4.1) 객체화 시킨 9.5를 문자열로 변경해라.
//4.2) 문자열로 변경한 9.5를 기본형값으로 언박싱해라.

public class Problem4 {

	public static void main(String[] args) {
		Double j = new Double(9.5); // 박싱
		Double i = 9.5; // 오토박싱
		
		String its = Double.toString(i);
		System.out.println(its);
		
		double dts = Double.parseDouble(its);
		System.out.println(dts);

	}

}
