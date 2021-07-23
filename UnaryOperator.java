package operators;

public class UnaryOperator {
	public static void main(String[] args) {
		int y=+15;//(+) unary plus 
		int z=-15;//(-) unary minus
		System.out.println("The value of y:"+y+" and z is: "+z);
		int x=10;
		System.out.println("the value of x is: "+x++);
		System.out.println("The value of X is: "+x);//post increment 
		System.out.println("The value of x is: "+ ++x);//pre increment 
		System.out.println("The value of x is: "+x--);
		System.out.println("The value of x is: "+x);//post decrement 
		System.out.println("The value of x is: "+ --x);//pre decrement 
	}
}
