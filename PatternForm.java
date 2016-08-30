package guvi;
import java.util.Scanner;
public class PatternForm {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String arr[]=str.split("");
		for(int i=0;i<str.length();i++)
		{
			if(!(str.charAt(i)>=48 && str.charAt(i)<57))
			{
				arr[i]="$";
			}
		}
		int count=0;
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			
			if(!(arr[i].equals("$")))
			{
				count=Integer.parseInt(arr[i]);
				for(int j=0;j<count;j++)
				{
					System.out.print(str.charAt(k));
				}
				k=k+2;
			}
		}
	}
}


