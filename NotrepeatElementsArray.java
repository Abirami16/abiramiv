import java.util.Scanner;
public class UnrepeatedValInArray {
   public static void main(String[] args) {
		Scanner si=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sinput.nextInt();
		System.out.println("Enter the elements of an array");
		int arrele[]=new int[size];
		int count=0;
		for(int i=0;i<size;i++)
		{
			iparr[i]=si.nextInt();
		}
                int val=arrele.length;
		for(int i=0;i<val;i++)
		{
			count=0;
			for(int j=0;j<val;j++)
			{
				if(arrele[i]==arrele[j] && i!=j)
				{
					count=1;
					break;
				}
			}
			if(count==0)
			{
				System.out.println("The unique element which is present in the given array  is"+arrele[i]);
		    
                       }
	     
               }

	  }

    }
