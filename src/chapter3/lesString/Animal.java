package chapter3.lesString;

public class Animal {
	int id;

	@Override
	public boolean equals(Object obj) {
		Animal temp = (Animal) obj;
        return (this.id == temp.id);
    }
}
