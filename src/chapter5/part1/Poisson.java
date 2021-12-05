package chapter5.part1;

import java.io.IOException;

public class Poisson extends Animal{
	public String name = "Poisson";
	
	public Poisson() {
		super(10);
		
		
	 // appel par d�faut au constructeur de la classe m�re
		System.out.println("Constructeur par d�faut Poisson");
		
	}
	//super();
	
	public void info()
	{
		System.out.println(super.name+" "+this.name);
	}
	
	@Override
	public Poisson affichage() throws IOException
	{
		//super.affichage();
		System.out.println("Poisson");
		return new Poisson();
	}
	@Override
	public Double calcul() throws IOException
	{
		//System.out.println("Animal");
		return (double)10;
	}
}
