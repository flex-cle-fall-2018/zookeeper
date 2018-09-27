package zookeeper;

public class Zebra extends Animal {

	public Zebra(String name) {
		super(name);
	}

	public void run() {
		this.boredom -= 5;
	}
}
