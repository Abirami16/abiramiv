package guvi;

import java.util.Scanner;

public class Print {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("input :");
	System.out.println("Enter the number");
	int givennum=s.nextInt();
	int val1=0;
	int val2=0;
	int val3=1;
	int val4=0;
	int val5=0;
	int val6=0;
	for(int i=1;i<givennum;i++)
	{
		val1=i;
		val2=i;
		val3=val1*val3;
		while(val2!=0)
		{
			
			val4=val2%10;
			val3=val3*val4;
			val2=val2/10;
		}
		if(val3==givennum)
		{
			val6=1;
			val5=i;
		}
		val3=1;
	}	
	System.out.println("output : ");
	if(val6==1)
	{
		System.out.println(givennum+" having a seed value "+val5);
	
    }
	else
	{
		System.out.println("It has no seed");
	}

   }
}
