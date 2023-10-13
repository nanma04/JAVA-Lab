class Fibanocci
{
	public static void main(String args[])
	{	
		int i;
		int n=10;
		int firstTerm=0;
		int secTerm=1;
		for(i=1;i<=n;i++)
		{
			System.out.println(firstTerm+" ");
			int nextTerm = firstTerm+secTerm;
			firstTerm=secTerm;
			secTerm=nextTerm;
		}
	}
}
