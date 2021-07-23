package operators;

public class TernaryOperator {
	public static void main(String[] args) {
		int x=10,y=30,z=5;
		int maxValue= x>y&&x>z?x:(y>z)?y:z;
		System.out.println(maxValue);
	}
}
