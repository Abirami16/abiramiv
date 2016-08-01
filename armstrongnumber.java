import java.util.Scanner;


public class Armstrong {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int number1=number;
		String str=String.valueOf(number);
		int len=str.length();
		int x=0;
		int sum=0;
		while(number>0)
		{
			x=number%10;
			number=number/10;
			sum=sum+(int)Math.pow(x,3);
		}
		if(sum==number1)
		{
			System.out.println("The given number is an armstrong number");
		}
		else
		{
			System.out.println("The given number is not an armstrong number");
		}

	}

}
