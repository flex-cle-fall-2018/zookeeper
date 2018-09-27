package zookeeper;

public class Penguin extends Animal {

	public Penguin(String name) {
		super(name);
	}

	public void swim() {
		this.boredom -= 5;
	}
}
