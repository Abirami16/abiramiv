
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number=Integer.parseInt(args[0]);
		 int num;
		 int reverse=0;
		 while(number>0)
		 {
			num=number%10;
			number=number/10;
			reverse=reverse*10+num;
		 }
		 System.out.println("the reverse number is" +reverse);
	}

}
