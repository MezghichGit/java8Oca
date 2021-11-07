package chapter1;

import java.util.Date;

public class Animal extends Object{
	String name; // variable d'instance
	Date nais;// variable d'instance
	public static int nb; //variable de classe
	 public Animal(){
		System.out.println("Constructeur");
	}
	
	 // Bloc d'initialisation d'instance
	{
		System.out.println("Bloc d'instance 1");
	}
	public void info() // méthode d'instance
	{
		int k=10; // variable locale
		System.out.println(k);
		 // nb  : Oui/Non
		System.out.println(nb);
		 //name : Oui/Non
		System.out.println(name);
	}
	
	 // Bloc d'initialisation d'instance
	{
		System.out.println("Bloc d'instance 2");
	}
	
	 // Bloc d'initialisation de classe
	static{
		System.out.println("Bloc static");
	}
	public static void affichage() // méthode de classe
	{
	    // nb : Oui/Non
		System.out.println(nb);
		//name  : Oui/Non
		Animal a = new Animal();
		System.out.println(a.name);
	}

}
