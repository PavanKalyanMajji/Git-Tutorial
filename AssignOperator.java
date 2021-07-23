package operators;

public class AssignOperator {
	public static void main(String[] args) {
		int x=10;//(=) is simple assign opertaor 
		x+=x;//(+=)
		System.out.println("After += the value of x is: "+x);
		x-=x;//(-=)
		System.out.println("After -= the value of x is: "+x);
		int y=20;
		y/=y;//(/=)
		System.out.println("After /= the value of y is: "+y);
		int z=35;
		z%=6;
		System.out.println("After %= the value of z is: "+z);
	}
}
