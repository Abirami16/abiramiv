
public class NaturalSum {

 public static void main(String[] args) {
		// TODO Auto-generated method stub
  int number=Integer.parseInt(args[0]);
  int sum=0;
  for(int i=0;i<=number;i++)
  {
	  sum=sum+i;
  }
  System.out.println("the sum of natural numbers are " +sum);
	}

}
