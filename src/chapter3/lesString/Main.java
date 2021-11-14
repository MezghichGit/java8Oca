package chapter3.lesString;

public class Main {

	public static void main(String[] args) {
		
		String s1 = "oca";  // litteral; Pool
		String s2 = new String("oca"); // via constructeur; Heap
		String s3 = "oca";
		String s4 = new String("oca");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println("**********");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		/*
		String ch = "oca";
		StringBuilder sb = new StringBuilder("oca");
		ch.concat("-ocp");
		sb.append("-ocp");
		ch = ch.concat("ocp");
		System.out.println(ch);
		System.out.println(sb);
		 	*/
	}

}
