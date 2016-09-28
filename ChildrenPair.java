import java.util.*;

class ChildrenCount
{
	

public static void main (String[] args)
 
	{

        
        Scanner s=new Scanner(System.in);
      
  int childrenCount=s.nextInt();

      
  int pairOfChildren=0;

        

        for(int i=0;i<2*childrenCount;i++)

       
  {

            
  if(i!=2*childrenCount-1)

          
     {
               
     
               System.out.println(++pairOfChildren);

            
   }

        
  }


        

     }




}
