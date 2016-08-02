import java.util.Scanner;
class Work
{
	boolean valid=false;
	public boolean getDays(String str)
	{
		if(str.equalsIgnoreCase("Monday") ||str.equalsIgnoreCase("TuesDay")||str.equalsIgnoreCase("WednesDay") ||str.equalsIgnoreCase("ThursDay") ||str.equalsIgnoreCase("FriDay") ||str.equalsIgnoreCase("SaturDay"))
		{
			valid=true;
		}
		return valid;
	}
}

public class WorkDay {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str=s.next();
		Work day1=new Work();
		System.out.println("The given day is working day : "+day1.getDays(str));
	}

}
