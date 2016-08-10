package guvi;

import java.util.Scanner;

public class CheckingEqualAvgOfArray {

	
	public static void main(String[] args) {
		
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int sizeValue=ss.nextInt();
		int arrval[]=new int[sizeValue];
		int oval1=0;
		int oval2=0;
		int co=0;
		int co1=0;
		System.out.println("please enter the elements to an  array");
		for(int i=0;i<sizeValue;i++)
		{
			arrval[i]=ss.nextInt();
		}
		int halfsize=arrval.length/2;
		for(int i=0;i<halfsize;i++)
		{
		  oval1=arrval[i]+oval1;
		  co++;
		}
		int avgop1=oval1/co;
		int halfsize1=arrval.length/2;
		for(int i=halfsize1;i<sizeValue;i++)
		{
		  oval2=arrval[i]+oval2;
		  co1++;
		}
		int avgop2=oval2/co1;
		if(avgop1==avgop2)
		{
			System.out.println("The parts are having equal average");
		}
		else
		{
			System.out.println("The two  parts are having different average");
		}
	}

}
