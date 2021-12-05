package chapter5.LesInterfaces;

public interface Imprimante {

	public static final int MAX_AGE = 100;
	public void imprimer();
	
	public default void imprimer2() {}
	
	public default void imprimer3() {}
}
