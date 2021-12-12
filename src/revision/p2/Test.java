package revision.p2;

import revision.p1.Acc;

public class Test extends Acc{

	public static void main(String[] args) {
		Test a = new Test();
		//a.r
		a.s = 10;
		float x = 12.5F;
		int count = 0;
		int tab [] = {2010,2014,2015,2003};
		for(int e : tab)
		{
			if(e != 2014)
			{
				System.out.println("Ok");
				
				break;
				count++;
				
			}
		}

	}

}
