package programs;

public class Challenge8 {
	public static int sumFirstAndLastDigit(int number) {
		if(number>0) {
			int lastNumber=number%10,firstNumber=0;
			while(number>10) {
				firstNumber=number/10;
				number=number/10;
			}
			return firstNumber+lastNumber;
		}else
			return -1;
	}
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(156));
	}
}
