//Map interface in Collection framework - HashMap,TreeMap
//key-values pair
//HashMap - All operations with O(1) time complexity(insert,delete,search)
//Duplicate keys are not allowed, Values can be duplicate

import java.util.*;

class MapInterface{
	public static void main(String args[]){
		Map<String,Integer> map = new HashMap<>();

		//insert
		map.put("Mrunmayee",19);
		map.put("Omkar",21);
		map.put("Umesh",49);

		System.out.println(map);

		//if we repeat the key, value is updated
		map.put("Omkar",50);

		System.out.println(map);

		//search - check if key is contained in map
		if(map.containsKey("Umesh"))
		{
			System.out.println("true");
		}

		//get function-returns value of key if key is present else returns null
		System.out.println(map.get("Mrunmayee"));

		//remove an entry
		map.remove("Omkar");
		System.out.println(map);

		//size of map
		System.out.println(map.size());

		//Iterate through Map
		//different for loop
		for(Map.Entry<String,Integer> e : map.entrySet())    //ex for(int val : collection)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}

		//keyset - makes set of all keys
		Set<String> keys = map.keySet();
		System.out.println(keys);

		//to get their values
		for(String key : keys)
		{
			System.out.println(map.get(key));
		}



//------------------------------------------------------------------//

		//Implementation using TreeMap
		Map<String,Integer> tree = new TreeMap<>();
		//All above functions
		//Sorted order - sorts on basis of keys

		tree.put("Omkar",21);
		tree.put("Umesh",49);
		tree.put("Mrunmayee",19);
		

		System.out.println(tree);

	}
}