
public class Number1 {
public static String mul(long num1,long num2)
{
return String.valueOf((num1*num2));
}
public static void main(String[] args) {
System.out.println("Enter the two values");
String num1=args[0];
String num2=args[1];
try{
String mul1=mul(Long.parseLong(num),Long.parseLong(num1));
System.out.println("The multiplication of two number is "+mul1);
}catch(Exception e)
{
System.out.println("The entered type is invalid");
}
}
}