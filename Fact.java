
public class Fact {
public static void main(String[] args) {
	int number=Integer.parseInt(args[0]);
	int fact=1;
	for(int i=1;i<=number;i++)
	{
		fact=fact*i;
	}
	System.out.println("The factorial is " +fact);
}
}
