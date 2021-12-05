package chapter5.hidding;

public class Main {
	
	public static void getInfo(Animal a)
	{}

	public static void main(String[] args) {
		
		getInfo(new Poisson());
		
		Poisson p = new Poisson();
		Animal a = new Animal();
		a = new Poisson();
		//a=p; // UPCASTING OK
		p=(Poisson)a;   // DONWCASTING KO
		
		//a.info();
		/*a.getInfoAnimal();
		a.getInfoPoisson();
		System.out.println(Poisson.info());
		System.out.println(Animal.info());*/
		
		System.out.println("CC");

	}

}
