package chapter4;

public class Animal {
 private int age;
 String espece; // default; package private
 protected String nom;
 public String pays;
 
 public double prix;
 
 public void info()
 {
	 System.out.println(this.age + this.espece + this.nom + this.pays);
 }
 
public Animal() {
	 System.out.println("Constructeur par Default");
 }
 public Animal(int age) {
	 //System.out.println(this);
	 this();
	 System.out.println("Constructeur avec 1 param");
	 
 }
 
 public Animal(int age, String nom) {
	 this(10);
	 System.out.println("Constructeur avec 2 params");
 }
 
 public Animal(int ...age) {
	// this(10);
	// System.out.println("Constructeur avec 2 params");
 }
 public  void info2() {
	// this();
 }
}
