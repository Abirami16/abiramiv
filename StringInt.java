import java.util.Scanner;


public class StringInt {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string ");
	String str=s.next();
	int number=Integer.parseInt(str);
	System.out.println("The number is "+number);
}
}
