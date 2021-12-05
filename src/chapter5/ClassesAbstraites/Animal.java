package chapter5.ClassesAbstraites;

public abstract class Animal {
	int age;
	String espece;

	public void manger() {
		System.out.println("Jai faim");
	}

	public abstract  void seDeplacer() ;
}
