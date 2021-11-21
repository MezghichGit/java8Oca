package chapter3.lesArrays;

public class Planet {
	int moons;
	String name;
	public Planet(int moons, String name) {
		super();
		this.moons = moons;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Planet [moons=" + moons + ", name=" + name + "]";
	}

}
