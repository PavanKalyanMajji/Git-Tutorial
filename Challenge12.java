package programs;

public class Challenge12 {
	public static void printFactors(int number) {
		System.out.println("Prime Factors are: ");
		if(number>1) {
			for(int i=2;i<number;i++) {
				if(number%i==0) 
					System.out.print(i+" ");
			}
		}else
			System.out.println("Invalid Number");
	}
	public static void main(String[] args) {
		printFactors(20);
	}
}
