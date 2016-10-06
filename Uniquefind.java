import java.util.Scanner;

import java.io.*;

class UniqueFind
{

	public static void main (String[] args)
	{

		Scanner s=new Scanner(System.in);

		int size=s.nextInt();

		int number[]=new int[size];

		int arrayVal[]=new int[size];

		int count=0;

		int size1=0;

		for(int i=0;i<size;i++)

		{

		    number[i]=s.nextInt();

		}

		for(int i=0;i<size;i++)

		{

		    for(int j=i+1;j<size;j++)

		    {

		        if(number[i]==number[j])

		        {

		            count++;

		            number[j]=0000;

		        }

		    }

		    if(count==1 && number[i]!=0000)

		    {

		        arrayVal[size1]=number[i];

		        size1++;

		    }

		    count=0;

		}

		for(int i=0;i<size1;i++)

		{

		    System.out.println(arrayVal[i]);

		}

            }

       }
