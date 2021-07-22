package programs;

public class Challenge7 {
	public static boolean isOdd(int start) {
		if(start>0) {
			if(start%3==0)
				return true;
			else
				return false;
		}else
			return false;
	}
	public static int sumOdd(int start,int end) {
		if(start<end) {
			int sum=0;
			for(;start<=end;start++) {
				if(isOdd(start)==true) 
					sum+=start;
			}
			return sum;
		}else
			return -1;
	}
	public static void main(String[] args) {
		System.out.println(sumOdd(3,10));
	}
}
