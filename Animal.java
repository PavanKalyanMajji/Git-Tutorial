package programs;

public class Animal {
	private String name;
	private String body;
	private int size;
	private int brain;
	private int weight;
	public Animal(String name, String body, int size, int brain, int weight) {
		this.name = name;
		this.body = body;
		this.size = size;
		this.brain = brain;
		this.weight = weight;
	}
	public String getName(String name) {
		return this.name=name;
	}
	public String getBody(String body) {
		return this.body=body;
	}
	public int getSize(int size) {
		return this.size=size;
	}
	public int getBrain(int brain) {
		return this.brain=brain;
	}
	public int getWeight(int weight) {
		return this.weight=weight;
	}
	public void eat(String item) {
		System.out.println("Animal eats: "+item);
	}
	public void move(int speed,int walks) {
		System.out.println("Animal() method from animal calss Speed: "+speed);
	}
}
