import java.util.Scanner;
class Check
{
	public static void main(String args[])
		{
			System.out.println("Enter a number");
			Scanner sc=new Scanner(System.in);
			int n;
			n=sc.nextInt();
			if(n%2==0)
			{
			System.out.println("even");
			}
			else
			{
			System.out.println("odd");
			}
		}
}
