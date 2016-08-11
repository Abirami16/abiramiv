import java.util.Scanner;
public class SingleElement {
   public static void main(String[] args) {
		Scanner sinput=new Scanner(System.in);
		System.out.println("Enter the size");
		int arraySize=sinput.nextInt();
		System.out.println("Enter the elements");
		int iparr[]=new int[arraySize];
		boolean val=false;
		int a=0;
		for(int i=0;i<arraySize;i++)
		{
			iparr[i]=sinput.nextInt();
		}
		for(int i=0;i<iparr.length;i++)
		{
			val=false;
			for(int j=0;j<iparr.length;j++)
			{
				if(iparr[i]==iparr[j] && i!=j)
				{
					val=true;
					break;
				}
			}
			if(!val)
			{
				System.out.println("The unrepeated element in the array is "+iparr[i]);
		    
                       }
	     
               }

	  }

    }
