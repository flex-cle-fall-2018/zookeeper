package zookeeper;

public abstract class Animal {
	
	private String name;
	protected int hunger = 0;
	protected int thirst = 0;
	protected int boredom = 0;
	
	public Animal(String name) {
		this.name = name;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}
	
	public void tick() {
		this.hunger++;
		this.thirst++;
	}

	public void receiveFood() {
		this.hunger -= 5;
	}

	public void receiveWater() {
		this.thirst -= 5;
	}

	public String getName() {
		return name;
	}

}
