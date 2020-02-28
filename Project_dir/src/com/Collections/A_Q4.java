package com.Collections;
import java.util.HashMap;
import java.util.Iterator;
public class A_Q4 {

	public static void main(String[] args) {
		HashMap<DOB, String> hm=new HashMap<>();
		hm.put(new DOB(5, 2, 1997), "ABC");
		hm.put(new DOB(10, 7, 1996), "DEF");
		hm.put(new DOB(5, 2, 1997), "GHI");
		Iterator<DOB> i=hm.keySet().iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(hm.get(new DOB(5, 2, 1997)));
	}

}
