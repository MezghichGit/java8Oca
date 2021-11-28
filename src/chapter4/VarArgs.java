package chapter4;

public class VarArgs {

	
	public static void info(int tab[]) {}
	public static void somme(int ... tab)
	{
		int som=0;
		for(int e : tab)
		{
			som+=e;
		}
		System.out.println("som = "+som);
	}
	public static void main(String ... args) {
		//info(10,2,4);
		System.out.println(args.length);
		somme();
		somme(10);
		somme(10,10);
		somme(10,10,10);
		int []tab = {10,14};
		somme(tab);

	}

}
