import java.util.*;

import java.lang.*;

import java.io.*;

class StringDouble
{

	public static void main (String[] args)
 
	{

	    
    Scanner s=new Scanner(System.in);

		String inputString=s.next();

		int length1=inputString.length();

		String subString1=inputString.substring(0,length1/2);

		String subString2=inputString.substring(length1/2,length1);

		if(subString1.equals(subString2))

		{

		    System.out.println("The string is a double string");

		}

		else

		{

		    System.out.println("The string is not a double string");

		}

	}

}
