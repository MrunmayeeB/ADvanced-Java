//ArrayList in Java Collection Framework

import java.util.*;

class ArrayListClass{
	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<>();
		
		//Add at last
		list.add(1);
		list.add(2);
		list.add(3);

		//Add at given index(index,element)
		list.add(2,50);

		//Print list
		System.out.println(list);

		//size of list
		System.out.println(list.size());

		//Add all elements from one list to another
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.addAll(list);
		System.out.println(list2);

		//Get particular element at index
		System.out.println(list.get(1));

		//check element is present
		if(list.contains(50))
			{
				System.out.println("true");
			}
		else 
			{
				System.out.println("false");
			}

		//Access elemet one by one
			for(int i=0;i<list.size();i++)
			{
				System.out.print(list.get(i)+" ");
			}
		System.out.println();

		//Removes element at given index
		list.remove(1);
		System.out.println(list);

		//Remove an element...removes 3
		list.remove(Integer.valueOf(3));
		System.out.println(list);

		//Insert or Replace a new element at particular position
		list.set(1,1000);
		System.out.println(list);

		list.clear();
		System.out.println(list);
	}
}