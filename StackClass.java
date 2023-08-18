//Stack Class in Collection Framework-LIFO

import java.util.*;

class StackClass{
	public static void main(String args[]){
		Stack<String> names = new Stack<>();

		//push elemet in stack
		names.push("Mrunmayee");
		names.push("Umesh");
		names.push("Omkar");

		System.out.println(names);

		//peek-get top element from stack
		System.out.println(names.peek());

		//pop- remove from top
		names.pop();
		System.out.println(names);

		//check if stack is empty
		if(names.isEmpty())
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}

		//Get particular element at index
		System.out.println(names.get(1));
	}
}