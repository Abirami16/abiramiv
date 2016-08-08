import java.util.Scanner;


public class OrderWords {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		String []arr=str.split(" ");
		System.out.println("The reversed word is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[arr.length-1-i]+" ");
		}

	}

}
