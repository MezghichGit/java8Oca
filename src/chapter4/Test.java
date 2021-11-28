package chapter4;

import java.io.Serializable;

public class Test implements Serializable{

	public static void main(String[] args) {
		Swan s = new Swan(-10);
		System.out.println(s.numberEggs);
		s.numberEggs = -200;

	}

}
