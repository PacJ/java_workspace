package a0614;

import java.util.ArrayList;
import java.util.Iterator;

public class A0614_Iterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(53);
		list.add(3);
		list.add(4);
		
		Iterator<Integer> it = list.iterator();
		// ctrl + shift + o = import all
		
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}

	}

}
