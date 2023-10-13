import java.util.*;
class Smallest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
int i;
		System.out.println("Enetr the number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter a elements");
		for(i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		int s=a[0];
		for(i=0;i<n;i++)
		{
		if(a[i]<s)
			{
			s=a[i];
			}
		}
		System.out.println("Smallest element is"+ s);
	}
}
