package a0614;

import java.util.HashMap;
import java.util.Map;

public class A0614_Map {
	
	public static void main(String[] args) {
		
		Map<Integer, String> h = new HashMap<Integer, String>();
		
		h.put(1, "aa");
		h.put(2, "bb");
		
		System.out.println(h.get(1));
		System.out.println(h.get(2));  
		

	}

}
