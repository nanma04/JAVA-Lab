import java.util.*;
class Seclarge
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
System.out.println("Enetr limit");
	int n=sc.nextInt();

	int a[]=new int[n];
System.out.println("eNTER ELEMENTS");
int i;
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();
	System.out.println("The second largest element is"+a[n-2]);

	}	
}
