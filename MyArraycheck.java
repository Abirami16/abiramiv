
public class ArrayValue2 {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		String st=args[0];
                System.out.println(st);
		int b=0;
		StringBuffer st1=new StringBuffer(st);
		String str=st1.reverse().toString();
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			b=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j) )
				{
					b++;
				}
			}
			if(b==0)
			{
				str1=str.charAt(i)+str1;
				
			}
		}
		System.out.println("The string after eliminating duplicate :"+str1);
	
	   }
	}


