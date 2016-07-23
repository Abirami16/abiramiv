
public class NumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int number=Integer.parseInt(args[0]);
     int count=0;
     while(number>0)
     {
    	 count++;
    	 number=number/10;
     }
     System.out.println("The number of digits in a number is" +count);
	}

}
