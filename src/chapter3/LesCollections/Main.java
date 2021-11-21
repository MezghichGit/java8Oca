package chapter3.LesCollections;

public class Main {

	public static void main(String[] args) {
		Imp p = new Imp();
		p.a();
		p.b();
		p.c();
		p.d();
		
		Test t = new Imp();
		t=p;
		t.a(); t.b(); t.c();
		Imp2 im = new Imp2();
		t = im;

	}

}
