package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionnalInetr {
	
	public static String name= new String("oca");

	public static void main(String[] args) {
		//Predicate p;
		/*
		ImpPred p = new ImpPred();
		p.test(null);
		p.info();
		Prediction.affichage();*/
		
		Prediction p1 = ch->ch.length()==4;
		Calcul c1 = (double a, double b)->{return a+b;};
		Calcul c2 = (a,b)-> a*b;
		Calcul c3 = (a,b)-> {
						   if(b==0) return  -100;
							else return (a/b);
						};
		System.out.println(c1.operation(2, 6));
		/*
		Prediction p2 = (String ch)->{return ch.contains("a");};
		String nom="ocaocp";
		System.out.println(p1.test(nom));
		System.out.println(p2.test(nom));*/
		/*Stream<String> stream = Stream.of("black bear", "gbrown bear", "grizzly");
		long count = stream.filter(s -> s.startsWith("g")).count(); //
		System.out.println(count); */
		//System.out.println(stream.count()); 
		
		List<String> names = new ArrayList<>();
		names.add("oca");
		names.add("ocp");
		names.add("java");
		names.add("jee");
		/*for(String e: names)
		{
			if(e.startsWith("o"));
			names.remove(e); // Exception
		}*/
		// (String x)->{return x.startsWith("j");}
		System.out.println(names); 
		names.removeIf((String x)->{
			return x.startsWith("j");
			});
		System.out.println(names); 

	}

}
