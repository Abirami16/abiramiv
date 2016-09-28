class Candies

{
public static void main (String[] args)
 
{

  
  Scanner s=new Scanner(System.in);

  int childrenCount=s.nextInt();

  int rating[]=new int[childrenCount];

  
int temp=0;

  

  for(int i=0;i<childrenCount;i++)

  {

      rating[i]=s.nextInt();

  }

  
  for(int i=0;i<childrenCount;i++)

  {

      for(int j=i+1;j<rating.length;j++)

      {

          if(rating[i]>rating[j])

          {
 
          temp=rating[j];

          rating[j]=rating[i];

          rating[i]=temp;

          }

      }

  }

  
  int sum=0;

  int val=1;

  
  for(int i=0;i<rating.length;i++)

  {

      
if(i>=1)

      {

          if(rating[i]!=rating[i-1])

          {

             val++;
 
          }

      }

      sum=sum+val;

   }

  
   System.out.println(sum);

 }




}
