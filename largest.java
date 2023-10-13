import java.util.*;
class largest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements");
  		
		for( int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			}
                  int l=a[0];
			for( int i=0;i<n;i++)
			{
			if(a[i]>l)
			{
			l=a[i];
			}
			}
		System.out.println("Largest element is:"+ l );
	}
} 

