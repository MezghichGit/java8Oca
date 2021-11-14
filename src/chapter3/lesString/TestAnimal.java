package chapter3.lesString;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.id = 10;
		Animal a2 = new Animal();
		a2.id = 10;
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));  // ==

	}

}
