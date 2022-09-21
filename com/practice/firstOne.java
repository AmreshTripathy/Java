package com.practice;

import java.util.Hashtable;
import java.util.Iterator;

import java.util.Set;

class firstOne {

	public static void main(String[] args) {
		Hashtable t = new Hashtable();
		t.put(null, 1);
		Set s = t.keySet();
		Iterator iter = s.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
