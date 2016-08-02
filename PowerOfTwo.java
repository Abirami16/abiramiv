import java.util.Scanner;

class PowerNum
{
	public boolean getPower(int num)
	{
		boolean flag=false;
		for(int i=0;i<num;i++)
		{
			int result=(int)Math.pow(2,i);
			if(result==num)
			{
				flag=true;
				break;
			}
		}
		return flag;
	}
}
public class PowerTwo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		PowerNum obj=new PowerNum();
		if(obj.getPower(number))
		{
			System.out.println("The given number is a power of two");
		}
		else
		{
			System.out.println("The given number is not a power of two");
		}
	}

}
