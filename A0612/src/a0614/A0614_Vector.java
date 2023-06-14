package a0614;

import java.util.Vector;

public class A0614_Vector {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(3);
		v.add(5);
		v.add(15938);
		v.add(0,20);
		
		System.out.println(v);
		
		for(Integer i : v) {
			System.out.println(i);
		}
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

	}

}
