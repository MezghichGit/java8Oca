package chapter6;

public class MainException {

	public static void main(String[] args) {
		Object obj = new Integer(2);
		Double d = (Double) obj;
		int x = 10; int y =0;
		int tab[] = {10,2,6};
		String ch = null;
		try {
		System.out.println("x/y = "+ (x/y));
		System.out.println(tab[2]);
		System.out.println(ch.length());
		}
		
		
		catch(ArithmeticException e)
		{
			System.out.println("Probl�me division par z�ro : "+e.getMessage());
			return; // sortie imm�diate de la m�thode
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Probl�me d'index de tableau");
			e.printStackTrace();
		}
		
		catch(Exception e)
		{
			System.out.println("Probl�me :" +e.getMessage());
			e.printStackTrace();
		}
	
		finally{
		System.out.println("Suite du programme...");
		}
		

	}

}
