public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int number1=Integer.parseInt(args[0]);
 int number2=Integer.parseInt(args[1]);
 System.out.println("the range of odd number is");
 for(int i=number1;i<number2;i++)
 {
	 if(!(i%2==0))
	 {
		 System.out.println(i);
	 }
 }
	}

}
