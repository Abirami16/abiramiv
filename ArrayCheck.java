import java.util.Scanner;
public class ArrayCheck {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=s.next();
		int flag=0;
		StringBuffer st1=new StringBuffer(st);
		String str=st1.reverse().toString();
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			flag=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j) )
				{
					flag++;
				}
			}
			if(flag<1)
			{
				str1=str.charAt(i)+str1;
				
			}
		}
		System.out.println("The string after eliminating duplicate :"+str1);
	
	   }
	}


