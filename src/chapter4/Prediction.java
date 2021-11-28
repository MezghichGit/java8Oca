package chapter4;

@FunctionalInterface
public interface Prediction {

	
	public boolean test(String s);
	
	default public void info() {
		System.out.println("Coucou");
	}
	
	static public void affichage()
	{
		System.out.println("static");
	}
}
