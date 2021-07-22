package programs;

public class Challenge13 {
	public static void numberToWords(int number) {
		if(number>1) {
			//133
			int temp=0,temp2=0;
			while(number!=0) {
				temp=temp*10+number%10;
				number=number/10;
			}
			while(temp!=0) {
				temp2=temp2*10+temp%10;
				temp=temp/10;
				if(temp2>10) {
					while(temp2/10!=0) {
						temp2=temp2%10;
					}
				}
				switch(temp2) {
				case 1: System.out.print("ONE"+" ");
						break;
				case 2: System.out.print("TWO"+" ");
						break;
				case 3: System.out.print("THREE"+" ");
						break;
				case 4: System.out.print("FOUR"+" ");
						break;
				case 5: System.out.print("FIVE"+" ");
						break;
				case 6: System.out.print("SIX"+" ");
						break;
				case 7: System.out.print("SEVEN"+" ");
						break;
				case 8: System.out.print("EIGHT"+" ");
						break;
				case 9: System.out.print("NINE"+" ");
						break;
				default: System.out.print("ZERO"+" ");
				}
			}
		}else
			System.out.println("Invalid Value");
	}
	public static void main(String[] args) {
		numberToWords(1589);
	}
}
