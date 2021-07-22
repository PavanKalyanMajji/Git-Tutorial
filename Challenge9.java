package programs;

public class Challenge9 {
	public static int getEvenDigitSum(int number) {
		if(number>0) {
			int sum=0,temp=0;
			while(number!=0) {
				temp=number%10;
				number=number/10;
				if(temp%2==0) {
					sum+=temp;
				}
			}
			return sum;
		}else 
			return -1;
	}
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(52656));
	}
}
