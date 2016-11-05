import java.util.*;

import java.lang.*;

import java.io.*;

class Stringpalindrome
{

	public static void main (String[] args)
 
	{

	        Scanner s=new Scanner(System.in);

		String inputString=s.next();

		int length1=inputString.length();

		String subString1="";

		String subString2="";

		int check=0;

		int indexposition=0;

		for(int i=0;i<length1/2;i++)

		{

		subString1=inputString.charAt(i)+"";

		subString2=inputString.charAt(length1-1-i)+"";

		if(!(subString1.equals(subString2)))

		{

		    indexposition=length1-1-i;

		    check=1;

		    break;

		}

		}

		if(check==1)

		{

		    System.out.println(indexposition);

		}

	}

}
