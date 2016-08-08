import java.util.Scanner;


public class ArrayString {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		String []arr;
		arr=new String[size];
		String new1="";
		String new2="";
		String result="";
		int k=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=s.next();
		}
		new1=arr[0];
		int len;
		for(int i=1;i<arr.length;i++)
		{
			new2=arr[i];
			if(new1.length()<new2.length())
			{
				len=new1.length();
			}
			else
			{
				len=new2.length();
			}
			for(int j=1;j<len;j++)
			{
				k=j;
				if(!(new1.charAt(j)==new2.charAt(j)))
						{
					    break;
						}
			}
			result=arr[i].substring(0,k);
			
		}
		System.out.println("reslt : "+result);
	}

}
