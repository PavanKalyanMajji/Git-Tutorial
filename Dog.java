package programs;

public class Dog extends Animal{
	private int eyes;
	private int legs;
	private int tail;
	private String coat;
	public Dog(String name, String body, int size, int brain, int weight,int eyes,int legs,int tail,String coat) {
		super(name,body,size,brain,weight);
		this.eyes=eyes;
		this.legs=legs;
		this.tail=tail;
		this.coat=coat;
		System.out.println("Aniaml Name: "+name);
		System.out.println("Aniaml Body: "+body);
		System.out.println("Aniaml Size: "+size+"m");
		System.out.println("Animal Brain: "+brain);
		System.out.println("Animal Weight: "+weight+"kg");
		System.out.println("Animal Eyes: "+eyes);
		System.out.println("Animal legs: "+legs);
		System.out.println("Animal Tail: "+tail);
		System.out.println("Animal coart: "+coat);
	}
	public void chew() {
		System.out.println("Dog will chew");
	}
	public void eat(String item) {
		chew();
		super.eat(item);
	}
	public void walk(int walks) {
		System.out.println("Dog walks at A speed in Kmphr: "+walks);
	}
	public void run(int runs) {
		System.out.println("Dog runs at A speed in Kmphr: "+runs);
	}
	public void move(int runs,int walks) {
		System.err.println("Dog walks and Runs:-");
		walk(walks);
		run(runs);
		
	}
}
