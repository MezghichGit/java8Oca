package chapter4;

public class Main {

	// Optional specifier : static, final, abstract
	public static void info(int x) throws Exception{  // méthode de classe
		//throw new Exception();
		System.out.println("Info");
		return;
	}
	
	public  int somme(int x, int y) {  // méthode d'instance
		return x+y;

	}
	
	public void affiche()
	{
		somme(2,3);
	}
	public static void main(String[] args) throws Exception{
		/*
		Main.info(20);
		info(2);
		Main m = new Main();
		m.somme(10, 10);*/
		Animal a= new Animal();
		System.out.println(a.espece);
		System.out.println(a.nom);
		System.out.println(a.pays);
		
	}

}
