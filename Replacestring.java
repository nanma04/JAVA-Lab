import java.util.*;
class Replacestring
{
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Input the string");
	String s1=sc.nexttime();

	System.out.println("Enter the character to be replaced");
	char x=sc.next().charAt(0);
	System.out.println("Before replcement"+s1);
	String s2=s1.replace(x,y);
	System.out.println("New string"+s2);
	}
}
