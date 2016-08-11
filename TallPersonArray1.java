import java.util.Scanner;
public class MemberTallestArray{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr1[]=new int[50];
		for(int i=0;i<50;i++)
		{
			arr1[i]=Integer.parseInt(args[i]);
		}
                for(int i=0;i<50;i++)
                {
        	   for(int j=i+1;j<50;j++)
        	    {
        		if(arr1[i]>arr1[j])
        		{
        			int var;
        			var=arr1[i];
        			arr1[i]=arr1[j];
        			arr1[j]=var;
        		}
        	     }
                }
               System.out.println("The height of 4th tallest student is : "+arr1[3]);
               System.out.println("Give the position to find the height of  member");
               int po=s.nextInt();
               System.out.println("The height of "+po+"th  person is : "+arr1[po-1]);
              
         }

}