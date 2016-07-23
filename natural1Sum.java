public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=Integer.parseInt(args[0]);
		 int sum=0;
		 if(number>0)
		 {
		 sum=((number*(number-1))/2);
		 }
		 System.out.println("the sum of natural numbers are " +sum);
			
	}
	}