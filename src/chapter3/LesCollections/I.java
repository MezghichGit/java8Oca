package chapter3.LesCollections;

public interface I {
	//abstract void a();
	 public default void a() {
		System.out.println("A");
		
	}
    abstract void b();

}
