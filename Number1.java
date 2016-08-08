import java.util.Scanner;


public class Number1 {
	public static String mul(long num,long num1)
	{
		return String.valueOf((num*num1));
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two values");
		String num=s.next();
		String num1=s.next();
		try{
		String sum=mul(Long.parseLong(num),Long.parseLong(num1));
		System.out.println("The sum is "+sum);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		}

}
