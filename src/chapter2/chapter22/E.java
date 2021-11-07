package chapter2.chapter22;

import static chapter1.Animal.affichage;
import static chapter1.Animal.nb;
import chapter1.Animal;
import chapter1.Personne;
import chapter2.A;

public class E {
	public static void somme(int ...s) {}
	public final static void main(String ... args) {
	  final int x=10;
	 // x = 15;
		somme();
		somme(10);
		somme(10,14);
		/*A a = new A();
		System.out.println(nb);
		affichage();*/
		final Personne  p1 = new Personne();
		Personne p2 = new Personne();
		Personne p3 = new Personne();
		//p1 = p3;  // Operation impossible car final
		p2=null;
		
		System.gc();
		for(int i=0; i<1000;i++) {System.out.println(i);}
		System.out.println("Suite du programme...");
	}

}
