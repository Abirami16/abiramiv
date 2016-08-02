import java.util.Scanner;


public class SortedOrder {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=s.nextInt();
		System.out.println("enter the elements");
		int num[]=new int[size];
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			num[i]=Integer.parseInt(s.next());
			
		}
	    for(int i=0;i<size-1;i++)
	    {
	    	if(num[i]>num[i+1])
	    	{
	    		flag=true;
	    		break;
	    	}
	    }
	    if(!flag)
	    {
	    	System.out.println("The array is in sorted order");
	    }
	    else
	    {
	    	System.out.println("The array is not in the sorted order");
	    }
	}
	}

