class A extends Thread
{
	public void run()
	{
		for(int i=1;i<101;i++)
		{
		System.out.println("Odd"+i);
		}
         }
}
class B extends Thread{
	public void run()
	{
		for(int i=1;i<101;i++)
		{
		System.out.println("Even"+i);
		}
        }
}
class Main
{
	public static void main(String args[])
	{
	A o =new A();
	B e = new B();
	o.start();
	e.start();
	}

}
