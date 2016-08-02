import java.util.Scanner;


public class Compare {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first string");
	String str1=s.next();
	System.out.println("Enter the second string");
	String str2=s.next();
	if(str1.equalsIgnoreCase(str2))
	{
		System.out.println("The two strings are equal");
	}
	else
	{
		System.out.println("The two strings are not equal");
	}
}
}
