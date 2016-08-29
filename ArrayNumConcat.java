package guvi;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMaxNumConcat {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		System.out.println("Enter the array elements");
		ArrayList<Integer> obj1=new ArrayList<Integer>();
		for(int i=0;i<size;i++)
		{
			obj1.add(s.nextInt());
		}
		ConcatMaxNum(obj1);
	}
	
	public static void ConcatMaxNum(ArrayList<Integer> obj)
	{
		int arr[]=new int[obj.size()];
		for(int i=0;i<obj.size();i++)
		{
			arr[i]=obj.get(i).intValue();
		}
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int count=0;
		String str="";
		for(int i=0;i<arr.length;i++)
		{
			int no1=arr[i];
			int no2=0;
			while(no1>0)
			{
				count++;
				no2=no1%10;
				no1=no1/10;
				str=str+no2;
				if(count%3==0)
				{
					str=str+",";
				}
			}
		}
		StringBuffer str1=new StringBuffer(str);
		System.out.println(str1.reverse());
	}
	}
