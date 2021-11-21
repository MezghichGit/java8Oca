package chapter3.LesStrings;

public class MainString {

	public static void main(String[] args) {
		/*String ch1 = "oca";
		// 
		ch1 =	ch1.concat("-ocp");
		System.out.println(ch1);
		StringBuilder sb = new StringBuilder(ch1);
		sb.append("-ocp");
		System.out.println(sb);
		StringBuffer sbf = new StringBuffer(ch1);
		sbf.append("-ocp");
		System.out.println(sbf);*/
		
		/*String ch = "oca";
		StringBuilder sb = new StringBuilder(ch);
		sb.reverse();
		sb.insert(0, "ocp");
		ch = sb.toString();
		System.out.println(ch);*/
		/*StringBuffer sf = new StringBuffer("oca");
		StringBuilder sb = new StringBuilder(sf);*/
		/*
		String ch="";
		for(char x ='a'; x<'z';x++)
			{
			 	ch= ch + x;
			 	System.out.println(ch + " "+ch.hashCode());
			}
		System.out.println("final ch : " + ch);
	*/
		/*
		StringBuilder ch=new StringBuilder();
		for(char x ='a'; x<'z';x++)
			{
			 	ch.append(x);
			 	System.out.println(ch + " "+ch.hashCode());
			}
		System.out.println("final ch : " + ch);
		 */
		/*int three = 3;
		String four = "4";
		System.out.println("c"+1 + 2 + three + four); 
		String ch = "Java language".substring(1,5);
		System.out.println(ch);*/
		//String ch="\t a b c ";
		//System.out.print(ch+"\n" +"b");
		//System.out.println(ch.trim());
		/*StringBuilder sb1 = new StringBuilder(8);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("abcabcabc");
		System.out.println(sb1.length());
	    System.out.println(sb1.capacity());*/
		/*
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		System.out.println(sb);
		System.out.println(sub);*/
		StringBuilder sb = new StringBuilder("abcdef");
		sb.delete(0, sb.length()-1);  // 0 - 5
		System.out.println(sb);
	}

}
