package operators;

public class LogicalOperator {
	public static void notOperator() {
		int a=10,b=20;
		System.out.println("return type after Not Operator: "+ !(a>b));
		System.out.println("return type after Not Operator: "+ !(a<b));
	}
	public static void main(String[] args) {
		int x=10,y=20;
		if(x<y && y>x)
			System.out.println("if cond1 and cond2 is true then only it will excute");
		else if(x>y && y>x)
			System.out.println("if cond1 and cond2 is true then only it will excute");
		else if(x<y || x>y)
			System.out.println("if one of cond1 is true then only it will excute");
		
		notOperator();
	}
}
