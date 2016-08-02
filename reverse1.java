import java.util.Scanner;


public class Reverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=s.next();
		String str2=str1;
		StringBuffer str3=new StringBuffer(str2);
		System.out.println("The reversed string is");
		System.out.println(str3.reverse());
	}

}
