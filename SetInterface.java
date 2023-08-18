//Set interface in Collection framework - Unordered(No indexing)
//is implemented by HashSet, TreeSet, LinkedHashSet
//No duplicates allowed
//HasSet - All operations with O(1) time complexity(insert,delete,search)

import java.util.*;

class SetInterface{
	public static void main(String args[]){
		//Implementation using HashSet
		Set<Integer> set = new HashSet<>();

		//insert new element
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);

		//print all elements in unordered way
		System.out.println(set);

		//removes particular element
		set.remove(40);
		set.remove(30);
		System.out.println(set);

		//check if set is empty or not
		if(set.isEmpty())
		{
			System.out.println("true");
		}

		//size of set
		System.out.println(set.size());

		//clear
		set.clear();
		System.out.println(set);

//------------------------------------------------------------------//

		//Implementation using LinkedHasSet
		Set<Integer> set1 = new LinkedHashSet<>();
		//All above functions
		//Linked order is preserved - insertion order

		set1.add(20);
		set1.add(10);
		set1.add(30);
		set1.add(50);
		set1.add(40);

		System.out.println(set1);

//------------------------------------------------------------------//
		
		//Implementation using TreeSet
		Set<Integer> set2 = new TreeSet<>();
		//All above functions
		//Sorted order

		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(40);
		set2.add(50);

		System.out.println(set2);
	}
}