package programs;

public class NumberEquals {
	public void printEqual(int num1,int num2,int num3) {
		 if(num1<0  || num2<0 || num3<0) {
				System.out.println("Invalid numbers");
		 }else if(num1==num2){
				 	if(num2==num3) {
					 	System.out.println("All numbers are equal");
				 	}else {
				 		System.out.println("Neither all are equal or different");
				 	}
		 		}else if(num2==num3){
		 			System.out.println("Neither all are equal or different");
		 		}else {
		 			System.out.println("All numbers are not equal");
		 		}
		 
	
	}
	public static void main(String[] args) {
		NumberEquals ne=new NumberEquals();
		ne.printEqual(10, 10, 10);
	}
}
