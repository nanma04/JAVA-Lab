import java.util.Scanner;
class Nsum
{
	public static void main(String args[])
	{
		System.out.println("Enter the limit");
		Scanner sc = new Scanner(System.in);
		int n;
		int i;
		n=sc.nextInt();
		int sum;
		sum=0;
		for(i=1;i<=n;i++)
		{
		sum=sum+i;
		}
		System.out.println(sum);
	}
}
