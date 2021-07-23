package operators;

public class RelationalOperator {
	public static void main(String[] args) {
		int x=20,y=20;
		if(x>y)
			System.out.println("X is greater than Y");
		else if(x<y)
			System.out.println("Y is Greater than x");
		else if(x==y)
			System.out.println("X is equla to Y");
		else if(x!=y)
			System.out.println("X is not equal to y");
		else if(x>=y)
			System.out.println("X is greater than or equal to y");
		else
			System.out.println("Y is Greater than or equal to x");
	}
}
