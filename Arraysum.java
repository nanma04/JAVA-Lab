 import java.util.*;
class Arraysum
{
public static void main(String args[])
{
	System.out.println("Enter array size");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int i;

	System.out.println("Enter num");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int sum=0;
	for(i=0;i<n;i++)
	{
		sum +=a[i];
	}

	System.out.println("The sum is"+sum);
}
}
