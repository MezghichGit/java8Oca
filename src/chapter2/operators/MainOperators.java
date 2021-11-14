package chapter2.operators;

public class MainOperators {

	public static void main(String[] args) {
		//part 1 : Unary operators
		int x = 10;
		int y = 20, z = 30;
		//int y = ++x;  //pre-increment
		/*int y = x++;  //post-increment
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
		
		//part 2 : Binary Operators : AND ; OR
		
	    //if ((x>y) & (++x>z)) System.out.println("OK");
		//if ((x>y) && (++x>z)) System.out.println("OK");
		/*
		if ((x>y) | (++x>z)) System.out.println("OK");
		//if ((z>++x) || (x<++y)) System.out.println("OK");
	    else System.out.println("NOT OK");
	    System.out.println("x = " + x);
	    System.out.println("y = " + y);*/
		
		// int k = ++x -2 *--y +4 *++x;
		
		//part 3 : Ternary Operator
		 //Long v =3L;
		 //int res = (x>y)?100:v;
		 System.out.println((x>y)?100:false);
		//System.out.println("res = "+ res);

	}

}
