package programs;

public class Fish extends Animal{
	private int eyes;
	private int head;
	private int tail;
	public Fish(String name, String body, int size, int brain, int weight,int eyes,int head,int tail) {
		super(name,body,size,brain,weight);
		this.eyes=eyes;
		this.head=head;
		this.tail=tail;
		System.out.println("Aniaml Name: "+name);
		System.out.println("Aniaml Body: "+body);
		System.out.println("Aniaml Size: "+size+"cm");
		System.out.println("Animal Brain: "+brain);
		System.out.println("Animal Weight: "+weight+"kg");
		System.out.println("Animal Head: "+head);
		System.out.println("Animal Eyes: "+eyes);
		System.out.println("Animal Tail: "+tail);
	}
	public void fishMovesSlow(int slow) {
		System.out.println("Fish moves slow: "+slow+"Kmphr");
	}
	public void fishMovesFast(int speed) {
		System.out.println("Fish moves fast: "+speed+"Kmphr");
	}
	public void move(int slow,int speed) {
		fishMovesSlow(2);
		fishMovesFast(5);
	}
	public void eat(String item) {
		super.eat(item);
	}
}
