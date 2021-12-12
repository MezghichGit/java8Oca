package revision;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s ="";
		if(sb == s) {}
		//if(s.equals(sb)) {}
		if(!sb.equals(s)) {
			System.out.println("NO");
		}
		else if(sb.toString().equals(s))
		{
			System.out.println("Match 2");
		}

	}

}
