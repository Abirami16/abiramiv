import java.util.Scanner;


public class ArrayCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i]==i)
			{
				System.out.println("The number "+arr[i]+" is same as the index position "+i);
			}
		}
	}

}
