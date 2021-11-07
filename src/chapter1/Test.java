package chapter1;

import chapter2.*;
import chapter2.A;
import chapter2.chapter22.*;
import chapter3.*;
import chapter1.Animal; // redondant
import java.lang.String; // redondant


class Test {

	public static void main(String[] args) {
		String ch;
		 A a = new  A();
		 chapter3.B b = new chapter3.B();
		C c = new C();
		E e = new E();
		H h = new H();
		System.out.println(Animal.nb);
		//System.out.println(Animal.nb);
		Animal a1 = new Animal();
		System.out.println("**********");
		Animal a2 = new Animal();
		/*int x = 10; // type primitif
		Animal a1 = new Animal();  // type reference
		a1.info();
		Animal a2 = new Animal();
		System.out.println(a1.name);
		System.out.println(a1.nais);
		System.out.println(Animal.nb);
		System.out.println(a1.nb);
		Animal.affichage();*/
		/*System.out.println(x);
		System.out.println(a1);
		System.out.println(a1.toString());*/
		
		/*
		byte x = 10;
		System.out.println(x);
		int y = 10_000_000;
		double k = 1_2.5;
		int h = 011;
		System.out.println(h);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);*/

	}

}


