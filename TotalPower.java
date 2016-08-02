import java.util.Scanner;


public class Power1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the given number ");
		int num=s.nextInt();
		int num1=num;
		int sum=0;
		int count=0;
		while(num1>0)
		{
			num1=num1/10;
			count++;
		}
		while(num>0)
		{
			int y=num%10;
			num=num/10;
			sum=sum+(int)Math.pow(y,count);
		}
		System.out.println("The result is " +sum);
	}

}
