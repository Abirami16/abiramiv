import java.util.Scanner;


public class Reverse1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	StringBuffer str1=new StringBuffer(str);
	str1.reverse();
	System.out.println("the reverse string is "+str1);
	String str2="";
	for(int i=0;i<str1.length();i++)
	{
		if(str1.charAt(i)=='a' || str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
		{
			continue;
		}
		else
		{
			str2=str2+String.valueOf(str1.charAt(i));
		}
	}
	System.out.println("the string without vowels " +str2);
}
}
