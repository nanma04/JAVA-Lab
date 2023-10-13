import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int start,end,flag=1;
		System.out.println("Input the string");
		String s1=sc.next();
		start=0;
		end=s1.length()-1;
		while(start<end)
			{
			if(s1 .charAt(start)!=s1.charAt(end))
				{
				flag=0;
				}
			start++;
			end--;
			}
		if(flag==1)
		System.out.println("Palindrome");
		else
		System.out.println("not");
	}
}

