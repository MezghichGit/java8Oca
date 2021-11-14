package chapter2.statements;

public class Etudiant {
	String nom;
	int age;
	public Etudiant(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + "]";
	}

}
