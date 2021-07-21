package programs;

public class AreaCricleAndRectangle {
	final double pi=3.14;
	public void area(double radius) {
		if(radius>-1) {
			double area =pi*(radius*radius);
			System.out.println("Area of circle: "+area);
		}
		else {
			System.out.println("invalid value: "+radius);
		}
	}
	public void area(double h,int b) {
		if(h>-1 && b>-1) {
			double area=(h*b)/2;
			System.out.println("Area of Triangle: "+area);
		}
		else {
			System.out.println("Invalid values: "+h+ " "+b);
		}
		
	}
}
