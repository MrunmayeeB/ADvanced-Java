//Creating a thread using thread class

class Demothread extends Thread{
	
	public void run()  //overriding run method
	{

	}
}

class MultithreadingDemo{
	public static void main(String args[]){
		Demothread t1 = new Demothread();            //creating thread objects
		Demothread t2 = new Demothread();
		t1.start();		//invokes run method
		t2.start();

		System.out.println(t1.currentThread().getId());   //getting thread id
		System.out.println(t2.getName());				  //getting thread name

	}
}