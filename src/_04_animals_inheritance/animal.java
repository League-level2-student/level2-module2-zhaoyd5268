package _04_animals_inheritance;

public class animal {
	String name;
	String color;
	boolean isgirl;

	animal(String name, String color, boolean isgirl) {
		this.name = name;
		this.color = color;
		this.isgirl = isgirl;
	}

	public void printName() {
		System.out.println("The animal's name is " + name);
	}

	public void play() {
		System.out.println(name + " is playing!");
	}

	public void eat() {
		System.out.println(name + " is eating!");
	}

	public void sleep() {
		System.out.println(name + " is sleeping!");
	}

}
