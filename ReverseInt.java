import java.util.Scanner;


public class ReverseInt {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=s.nextInt();
	int num=number;
	int sum=0;
	while(number>0)
	{
		int c=number%10;
		number=number/10;
		sum=sum*10+c;
	}
	System.out.println("The reverse number is "+sum);
}
}
