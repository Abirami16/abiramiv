import java.util.Scanner;
public class CurrencyNotes {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int count=0;
		if(number>0)
		{
			
			if(number>=500)
			{
				count=count+number/500;
				number=number%500;
			}
			if(number>=100)
			{
				count=count+number/100;
				number=number%100;
			}
			if(number>=50)
			{
				count=count+number/50;
				number=number%50;
			}
			if(number>=10)
			{
				count=count+number/10;
				number=number%10;
			}
			count=count+number;
		}
		System.out.println(count);
	}

}
