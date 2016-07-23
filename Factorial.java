
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number=Integer.parseInt(args[0]);
		 int result=1;
		 for(int i=1;i<=number;i++)
		 {
			  result=result*i;
		 }
		 System.out.println("the factorial of the given number is" +result);
	}

}
