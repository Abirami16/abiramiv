import java.util.Scanner;


public class PowerNo {

	public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=s.nextInt();
			String str=String.valueOf(num);
			String str1=str;
			String []str3=str1.split("");
			int sum=0,i=0;
			for( i=0;i<str3.length-1;i++)
			{
				  
			       sum=(int)Math.pow(Integer.parseInt(str3[i]),Integer.parseInt(str3[i+1]))+sum;
			       
			}
			if(i==str3.length-1)
			{
				sum=sum+(int)Math.pow(Integer.parseInt(str3[i]),0);
			}
			System.out.println("The result is " +sum);
			}
			

	}


