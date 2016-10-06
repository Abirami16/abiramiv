import java.util.*;

import java.lang.*;

import java.io.*;

class RepeatFind
{

	public static void main (String[] args)
	{

		Scanner s=new Scanner(System.in);

		int size=s.nextInt();

		int regNumber[]=new int[size];

		int newArray[]=new int[size];

		int count=0;

		int size1=0;

		for(int i=0;i<size;i++)

		{

		    regNumber[i]=s.nextInt();

		}

		for(int i=0;i<size;i++)

		{

		    for(int j=i+1;j<size;j++)

		    {

		        if(regNumber[i]==regNumber[j])

		        {

		            count++;

		            regNumber[j]=0000;

		        }

		    }

		    if(count>0 && regNumber[i]!=0000)

		    {

		        newArray[size1]=regNumber[i];

		        size1++;

		    }

		    count=0;

		}
		
                for(int i=0;i<size1;i++)

		{

		    System.out.println(newArray[i]);

		}

	 }

   }
