package chapter2.statements;

import java.util.concurrent.atomic.AtomicInteger;

enum Semaine {Lundi,Mardi};
public class MainStatement {
		
	public static void main(String[] args) {
		//System.out.println(Semaine.Lundi);
		/*
		out: for(int i=0; i<10;i++)
		{
			for(int j=0; j<10;j++)
			{
				if(j==5) continue out;
				System.out.println("i = "+i+" j="+j);
			}
		}
		System.out.println("Suite du programme...");*/
		/*
		int tab[] = {10,3,25,14};
		String names[] = {"amine","emna","makrem","monji"};
		
		/*for(int i=0; i<tab.length;i++) {
			System.out.println(tab[i]);
		}*/
		/*for(int x : tab) // enhanced loop
			System.out.println(x);
		
		for(String name : names) // enhanced loop
			System.out.println(name);
		System.out.println("******************");
		
		Etudiant etudiants[] = {new  Etudiant("monji",40), new Etudiant("Ali",25)};
		*/
		
		/*for(Etudiant etudiant : etudiants) // enhanced loop
			//System.out.println(etudiant);
		     System.out.println(etudiant.toString());*/
		
		int level = 12;
		final int x = 20;
		final AtomicInteger x2 = new AtomicInteger(12);
		switch(level)
		{
		case 1 : case 12 : System.out.println("Basique"); break;
		case 10 :  System.out.println("Moyen"); break;
		//case x2 :  System.out.println("Pro"); break;
		default : System.out.println("Don't know..");
		}
		//info("oca");
	}
	
	public static void info(String v,String fr)
	{
		final String val = "oca";
		final String framework =fr;
		switch (v)
		{
		case val : System.out.println("OCA"); break;
		case "ocp" : System.out.println("OCP"); break;
		//case framework : System.out.println("Spring"); break;
		
		}
	}

}
