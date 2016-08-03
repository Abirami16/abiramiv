import java.util.Scanner;


public class DigitSum {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int sum=0;
		int digit=0;
		int count=0;
		while(num>0)
		{
			digit=num%10;
			num=num/10;
			count++;
		
		for(int i=1;i<=count;i++)
		{
			sum=digit+sum;
			
		}
		}
		System.out.println(sum);
	}

}
