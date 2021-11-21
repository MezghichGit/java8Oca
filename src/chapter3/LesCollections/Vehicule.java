package chapter3.LesCollections;

public abstract interface Vehicule {
	 public static final int max=220;
	 public abstract void deplacement(); // méthode abstraite
	 
	 public default void sarreter() {
		 System.out.println("STOP");
	 }
	 
	 public static void sarreter2() {
		 System.out.println("STOP");
	 }

}
