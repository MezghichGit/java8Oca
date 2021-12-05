package chapter5.part1;

import java.io.IOException;

public class Animal {
	public String name = "Animal";
	public Animal() {
		System.out.println("Constructeur par défaut Animal");
	}
	
	public Animal(int a) {
		System.out.println("Constructeur Animal avec 1 param");
	}
	
	public Animal affichage() throws IOException
	{
		//System.out.println("Animal");
		return new Animal();
	}
	
	public Number calcul() throws IOException
	{
		//System.out.println("Animal");
		return 10.5;
	}
}
