class Hellothread extends Thread{
	String name;
	int n;

	Hellothread(String name,int n)
	{
		this.name = name;
		this.n = n;
	}

	public void run()
	{
		try{
			for(int i=1;i<=n;i++)
			{
				System.out.println(name+" "+i);
			}
		}
		catch(Exception e)
		{

		}
	}
}

class PrintHello{
	public static void main(String args[]){
		Hellothread obj = new Hellothread("Hello",10);
		obj.start();
	}
}