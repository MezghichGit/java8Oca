package chapter5.hidding;

public class Poisson extends Animal{
	/*
	@Override*/
	public  static String info()
	{
		return "Poisson";
	}
	
	
	public void getInfoPoisson()
	{
		System.out.println("affichage :" +info());
	}
	
	public void getInfoAnimal()
	{
		System.out.println("affichage :"+ info());
	}
}
