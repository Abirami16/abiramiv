import java.util.Scanner;


public class WordReverse1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				StringBuffer rev=new StringBuffer(arr[i]);
				String str3=rev.reverse().toString();
				System.out.print(str3 +" ");
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		

	}

}
