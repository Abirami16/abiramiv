import java.util.*;

import java.lang.*;

import java.io.*;


class ArrayNumbers
{

	public static void main (String[] args)
	{

		Scanner s=new Scanner(System.in);

		int sizeOfArray=s.nextInt();

		int arrayElements[]=new int[sizeOfArray];

		for(int i=0;i<sizeOfArray;i++)

		{

		    arrayElements[i]=s.nextInt();

		}

		int count=0;

		for(int i=0;i<sizeOfArray;i++)

		{

		    count=0;

                   for(int j=i+1;j<sizeOfArray;j++)

		   {

		     if(arrayElements[i]==arrayElements[j])

		     {

		      count=1;

		      break;

		     }

	            }

	           if(count==1)

       	           {

	              System.out.println(arrayElements[i]);

	              break;

        	   }

		}

	    }

     }
