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
               System.out.println("Give the position to find the height of  member");
               int po=s.nextInt();
               System.out.println("The height of the given person is : "+arr1[po]);
               System.out.println("The height of shortest student is : "+arr1[49]);

         }

}