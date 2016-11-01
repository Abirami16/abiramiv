import java.util.*;

import java.lang.*;

import java.io.*;


class MatrixVal
{

	public static void main (String[] args)
	{

		Scanner s=new Scanner(System.in);

		int rowSize=s.nextInt();

		int colSize=s.nextInt();

		int matrixval1[][]=new int[rowSize][colSize];

		int matrixval[][]=new int[rowSize][colSize];


		for(int i=0;i<rowSize;i++)

		{

		    for(int j=0;j<colSize;j++)

		    {

		        matrixval[i][j]=s.nextInt();

		    }

		}

		int count=0;

		int count1=0;

	        for(int i=0;i<rowSize;i++)

		{

		    count=0;

		    for(int j=0;j<colSize;j++)

		    {

		        if(matrixval[i][j]==0)

		        {

		            count=i+1;

		            count1=j+1;

		            break;

		        }

		        else

		        {

		            matrixval1[i][j]=1;

		        }

	             }

		    if(count>0)

		    {
 
		        for(int k=0;k<colSize;k++)

		        {

		        matrixval1[count-1][k]=0;

   		        matrixval1[k][count1-1]=0;

		        }


		     }

		  
             }

		for(int i=0;i<rowSize;i++)

		{

		    for(int j=0;j<colSize;j++)

		    {

		       System.out.print(matrixval1[i][j]);

		    }

		    System.out.println(" ");

		}

	    
	
           }

      
     }
