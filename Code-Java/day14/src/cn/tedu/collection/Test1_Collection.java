package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test1_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c = new ArrayList<Integer>();
		c.add(100);
		c.add(200);
		c.add(300);
		System.out.println(c);
		//c.clear();
		System.out.println(c.contains(200));
		System.out.println(c.equals(200));
		System.out.println(c.hashCode());
		System.out.println(c.remove(200));
		System.out.println(c.size());
		Object[] os = c.toArray();
		System.out.println(Arrays.toString(os));
		System.out.println("-----------------------");
		//
		Collection<Integer> c2 = new ArrayList<Integer>();
		c2.add(111);
		c2.add(222);
		c2.addAll(c);
		System.out.println(c2);
		System.out.println(c2.containsAll(c));
		System.out.println(c2.removeAll(c));
		//System.out.println(c2);
		//System.out.println(c2.retainAll(c));
		System.out.println(c2);
		//Iterator<E>
		Iterator<Integer> it = c2.iterator();
		while(it.hasNext()) {
			Integer inte = it.next();
			System.out.println(inte);
		}
	}

}
