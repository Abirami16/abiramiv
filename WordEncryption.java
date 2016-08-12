import java.util.Scanner;


public class Encryption1 {
  public static int key(char c)
  {
	  int count=1;
	  char countchar='a';
	  while(countchar!=c)
	  {
		  count++;
		  countchar++;
	  }
	  return count;
  }
  public static int key1(char c)
  {
	  int count=1;
	  char countchar='A';
	  while(countchar!=c)
	  {
		  count++;
		  countchar++;
	  }
	  return count;
  }
  
  public static char encry(int key,char c)
  {
	  int charValue=(int)c;
	  for(int i=0;i<key;i++)
	  {
	  if(charValue>97)
	  {
		  --charValue;
	  }
	  if(charValue==97)
	  {
		  charValue=122;
	  }
	  }
	  return (char)charValue;
  }
  public static char encry1(int key,char c)
  {
	  int charValue=(int)c;
	  for(int i=0;i<key;i++)
	  {
	  if(charValue>65)
	  {
		  --charValue;
	  }
	  if(charValue==65)
	  {
		  charValue=90;
	  }
	  }
	  return (char)charValue;
  }
  public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter string");
	  String input1=s.nextLine();
	  String []arr=input1.split(" ");
	  for(int i=0;i<arr.length;i++)
	  {
		  StringBuffer str=new StringBuffer(arr[i]);
		  int shiftKey=0;
		  if(str.charAt(str.length()-1)>=97)
		  {
		   shiftKey=key(str.charAt(str.length()-1));
		  }
		  else
		  {
			 shiftKey=key1(str.charAt(str.length()-1));  
		  }
		  for(int j=0;j<str.length()-1;j++)
		  {
			  char ch;
			  if(str.charAt(j)>=97)
			  {
			   ch=encry(shiftKey,str.charAt(j));
			  }
			  else
			  {
			  ch=encry1(shiftKey,str.charAt(j));
			  }
			  
			  str.replace(j,j+1,String.valueOf(ch));
			  
		  }
		  System.out.print(str +" ");
	  }
}
}
