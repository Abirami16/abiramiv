
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number=Integer.parseInt(args[0]);
		 int number1=number;
		 int num;
		 int reverse=0;
		 while(number>0)
		 {
			num=number%10;
			number=number/10;
			reverse=reverse*10+num;
		 }
		 if(number1==reverse)
		 {
		    System.out.println("The given number is palindrome");
		 }
		 else
		 {
			 System.out.println("The given number is not a palindrome");
		 }
			 
	}
	}


