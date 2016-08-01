import java.util.Scanner;


public class Words {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String arr[]=str.split(" ");
		int count=arr.length;
		System.out.println("The number of words in the given line is " +count);

	}

}
