package chapter3.QCM3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		//int numFish = 4;
		String numFish = "4";
		String fish = numFish + 1;
		int tab[] = new int[3];
		int tab2[]= {10,4,3,8};
		
		 Set<String> names = new TreeSet<>();
		 names.add("fish");
		 names.add("meat");
		 names.add("oca");
		 names.add("java");
		 //System.out.println(names);
		 for(String e : names)
		 {
			 System.out.println(e);
		 }
	}

}
