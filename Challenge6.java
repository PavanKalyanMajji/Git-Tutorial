package programs;

public class Challenge6 {
	public static void main(String[] args) {
		int count=1,sum=0;
		System.out.print("Numbers which are Divisible 3 and 5 are: ");
		for(int i=1;i<1000;i++) {
			if(i%3==0 && i%5==0) {
				sum+=i;
				System.out.print(i+" ");
				if(count>=5)
					break;
				count++;
				
			}	
		}
		System.out.println("\nsum of numbers: "+sum);
	}
}
