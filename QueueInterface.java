//Queue interface in Collection framework - FIFO
//is implemented by LinkedList, ArrayDequeue and Priority Queue.

import java.util.*;

class QueueInterface{
	public static void main(String args[]){
		//Implementation using Linkedlist
		Queue<Integer> q = new LinkedList<>();

		//add element
		q.offer(12);          //similar to q.add()
		q.offer(10);
		q.offer(5);

		//print queue
		System.out.println(q);

		//peek - gives element which will be removed next
		System.out.println(q.peek());

		//poll - removes element
		q.poll();                  //similar to q.remove()
		System.out.println(q);


//------------------------------------------------------------------//


		//Implementation using Priority Queue
		Queue<Integer> q2 = new PriorityQueue<>();

		//By default Priority of smallest element is high....so it is removed first

		//add element
		q2.offer(1000);          //similar to q.add()
		q2.offer(200);
		q2.offer(3000);
		q2.offer(300);


		//print queue
		System.out.println(q2);

		//peek - gives element which will be removed next
		System.out.println(q2.peek());

		//poll - removes element
		q2.poll();                  //similar to q.remove()
		System.out.println(q2);

		//To set the priority of max number as highest we use comparator method
		Queue<Integer> q3 = new PriorityQueue<>(Comparator.reverseOrder());

		q3.offer(1000);          //similar to q.add()
		q3.offer(200);
		q3.offer(30);
		q3.offer(300);


		//print queue
		System.out.println(q3);

		//peek - gives element which will be removed next
		System.out.println(q3.peek());

		//poll - removes element
		q3.poll();                  //similar to q.remove()
		System.out.println(q3);


//------------------------------------------------------------------//
		//Implementation using ArrayDeque - Doubly Ended queue
		//can delete and add elements from both sides
		//Realife example - Sliding Window

		Deque<Integer> q4 = new ArrayDeque<>();
		q4.offerFirst(1);          //similar to q.addFirst() and q.addLast()
		q4.offerLast(2);	
		q4.offerFirst(3);
		q4.offerLast(4);


		//print queue
		System.out.println(q4);

		//peek - gives element which will be removed next
		System.out.println(q4.peekFirst());    //give element at first position
		System.out.println(q4.peekLast());	   //give element at last position

		//poll - removes element
		q4.pollFirst();                  //similar to q.remove()
		System.out.println(q4);
		q4.pollLast();						//removes element at last position
		System.out.println(q4);

	}
}