class Reverse
{
	public static void main(String args[])
	{
		int rev= 0;
		for(int num = 123; num > 0;num=num/10)
		{
		   int m =num%10;
		  rev = rev * 10 + m;
		}
	System.out.println(rev);
	}
}
