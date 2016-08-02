import java.util.Scanner;


public class Multiplication {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number ");
	int num=s.nextInt();
	System.out.println("Enter the range");
	int num1=s.nextInt();
	for(int i=1;i<=num1;i++)
	{
		int result=i*num;
		System.out.println(i+"x"+num +"="+result);
	}
	
}
}
