import java.util.Scanner;

public class ReplaceNumber {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=s.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the elements");
	for(int i=0;i<size;i++)
	{
		arr[i]=s.nextInt();
	}
	int max=0;
	for(int i=0;i<arr.length-1;i++)
	{
		max=arr[i+1];
		for(int j=i+1;j<arr.length;j++)
		{
			
			if(max<arr[j])
			{
				max=arr[j];
			}
		}
		arr[i]=max;
	}
	arr[arr.length-1]=0;
	System.out.println("The resultant array");
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	}
}
}
