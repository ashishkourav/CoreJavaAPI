package com.java8feature;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class DataResponse {
	public static void main(String[] args) {
		List<String> as = new ArrayList<String>();
		List<String> as1 = Collections.synchronizedList(new CopyOnWriteArrayList<String>());
		as1.add("A");
		as1.add("B");
		as1.add("E");
		as1.add("D");
		as1.add("C");
		Iterator<String> as01 = as1.iterator();

		synchronized (as01) {
			while (as01.hasNext()) {
				System.out.println(as01.next());
				as1.remove(1);
			}
			System.out.println("Synchnonized List " + as1);

		}

	}
}
