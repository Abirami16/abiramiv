import java.util.Scanner;


public class WordPresent {
	public static int compareStrings(String str,String str1)
	{
		if(str.contains(str1))
		{
			int val=str.indexOf(str1);
			return val;
		}
		else
		{
			return 1;
		}
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string ");
		String str=s.next();
		System.out.println("enter the string");
		String str1=s.next();
		System.out.println(compareStrings(str,str1));
		
	}

}
