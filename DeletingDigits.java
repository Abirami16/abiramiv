import java.util.Scanner;


public class DeletingDigits {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
		System.out.println("enter the deleting range");
		int del=s.nextInt();
		for(int i=0;i<del-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
