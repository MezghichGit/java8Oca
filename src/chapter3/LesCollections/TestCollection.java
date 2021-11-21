package chapter3.LesCollections;

import java.util.ArrayList;
import java.util.List;

import chapter1.Animal;

public class TestCollection {

	public static void main(String[] args) {
		/*Animal a = new Animal();
		List<String>l = new ArrayList();
		//l.add(a);
		l.add("oca");
		l.add("10");
		l.add("true");
		for(Object o : l)
		{
			String temp = (String)o;
			System.out.println(temp.length());
		}*/
		
		/*List<String> names = new ArrayList<>();
		names.add("Ali");
		names.add("Mohsen");
		System.out.println(names);*/
		//System.out.println(res+ " "+res2);
		List<Short> li = new ArrayList<>();
		li.add(new Short((short)20));
		li.add((short)12);   // AutoBoxing - Boxing
		int x = li.get(0);  // Unboxing
		System.out.println(li);

	}

}
