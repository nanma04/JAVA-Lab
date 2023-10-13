import java.util.*;
class Search
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int i,flag=0;
		System.out.println("Enter the character to be searched");
		char x=sc.next().charAt(0);
		for(i=0;i<s.lenth();i++)
		{
			if(s.charAt(i)==x)
			{
			flag=1;
			break;
			}
		}

		if(flag==1)
		{
		System.out.println("The character "+x+"is presnt");
		}
		else
		System.out.println("NOT");
	}
}
