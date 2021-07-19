package programs;

public class AnimalMain {
	public static void main(String[] args) {
		System.err.println("Dog:-");
		Dog d=new Dog("Dog","1",2,1,30,2,4,1,"Dont Know :)");
		d.eat("Chicken");
		d.move(15,5);
		System.err.println("Fish:-");
		Fish f=new Fish("Fish","1",40,1,5,2,1,1);
		f.move(2, 30);
		f.eat("Corn Powder");
	}
}