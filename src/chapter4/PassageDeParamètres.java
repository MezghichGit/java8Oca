package chapter4;

public class PassageDeParam�tres {

	public static void permut(int a, int b)
	{
		System.out.println("Avant ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		int temp=0;
		temp = a;
		a = b;
		b= temp;
		System.out.println("After ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	public static void modifString(String ch)
	{
		//ch = ch.concat("-ocp");
		ch.concat("-ocp");
	}
	
	public static void modifStringBuilder(StringBuilder sb)
	{
		sb.append("-ocp");
	}
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("oca");
		modifStringBuilder(s);
		System.out.println(s);
		//String s = "oca";
		//modifString(s); // passage de param�tres ch = s
		//System.out.println(s);
		/*int x = 10; int y = 20;
		permut(x,y); // passage de param�tres a = x, b = y
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/

	}

}
