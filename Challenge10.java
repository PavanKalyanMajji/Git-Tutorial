package programs;

public class Challenge10 {
	public boolean hasSharedDigit(int firstNumber,int secondNumber) {
		if(firstNumber>=10 && firstNumber<=99 && secondNumber>=10 && secondNumber<=99) {
			if(firstNumber%10==secondNumber%10 || firstNumber%10== secondNumber/10)
				return true;
			else if(firstNumber/10==secondNumber%10 || firstNumber/10== secondNumber/10)
				return true;
			else
				return false;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Challenge10 c=new Challenge10();
		System.out.println(c.hasSharedDigit(25,50));
	}
}
