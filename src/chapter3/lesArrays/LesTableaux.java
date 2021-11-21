package chapter3.lesArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LesTableaux {

	public static void main(String[] args) {
		// declaration d'un tableau
		/*int tab[];
		int [] tab2;*/
		// declaration et initialisation
		//int tab[] = {10,20,36};
		//System.out.println(tab[0]);
		/*
		int tab[] = new int [2];
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		String names1[] = new String[4];
		names1[0] = "patrick";
		names1[1] = "patrick1";
		names1[2] = "patrick2";
		names1[3] = "patrick3";
		String names[] = {"amine","ali","med"};
		//System.out.println(names[0]);
		//System.out.println(names[1]);
		
		for(String name : names)
			System.out.println(name);
		*/
		/*
		int tab[][] = new int[3][];
		tab[0] = new int[4];
		tab[1] = new int[2];
		tab[2] = new int[5];
		tab[2][4] = 20;
		System.out.println(tab);
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		System.out.println(tab[1].toString());
		System.out.println(tab[1].hashCode());*/
		
		int []t[] = {{10,4},{1,8,6},{2,1,7,8,3}};
		System.out.println(t.length);
		System.out.println(t[0].length);
		System.out.println(t[1].length);
		System.out.println(t[2].length);
		System.out.println(t[0][0]);
		String ch;
		//int tab[] = {10,20,14,3};
		int tab[] = {1,2,4};
		//Arrays.sort(tab);
		// 3 10 14 20
		//Arrays.sort(t);
		//System.out.println(Arrays.toString(t));
		//System.out.println(Arrays.binarySearch(tab, 13));
		//Planet []planets = {new Planet(1,"venus"),new Planet(2,"earth")};
		ArrayList<Planet>planets = new ArrayList<>();
		planets.add(new Planet(1,"venus"));
		planets.add(new Planet(2,"earth"));

		System.out.println(planets);

	}

}
