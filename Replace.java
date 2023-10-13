import java.util.*;
class Replace
{
	public static void main(String args[])
	{
		System.out.print("Enetr limit:");
		Scanner num=new Scanner(System.in);
		int n,i;
		n=num.nextInt();
		int a[]= new int[n];
		for(i=0;i<n;i++)

		{
		System.out.println("Enter elements");
		a[i]=num.nextInt();
		}

		System.out.println("Enter the number to be replaced");
		int p=num.nextInt();
		System.out.println("Enter the new number");
		int q=num.nextInt();
		for(i=0;i<n;i++)
		{
		if(a[i]==p)
		a[i]=q;
		}

		for(i=0;i<n;i++)
		{
		System.out.println(a[i]);
		}
	}
}
