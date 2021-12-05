package chapter6;

public class MainThrowThrows {

	
	public static void SetAge(int a) throws NullPointerException
	{
		if(a<0)
			throw new IllegalArgumentException("L age n'est pas pas valide");
	   System.out.println("Age Valide Merci");
	}
	public static void division(int x, int y) throws RuntimeException // we declare
	{
		//System.out.println("x/y = "+(x/y));
		throw new ArithmeticException();
		
	}
	public static void main(String[] args) {
		//try {
		SetAge(10);
		//}
		//catch(Exception e)
		//{
		//	System.out.println(e.getMessage());
		//}
		/*
		try {  // we handle
		division(3, 0);
		}
	   catch(ArithmeticException | NullPointerException e)
		{
		System.out.println("Probleme "+ e.getMessage());
		}*/

	}

}
