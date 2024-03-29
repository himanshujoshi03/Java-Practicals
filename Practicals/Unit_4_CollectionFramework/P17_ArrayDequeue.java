package Unit_4_CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/*
The ArrayDeque in Java provides a way to apply re-sizable array in addition to the implementation of the Dequeue interface.
It is also known as Array Double Ended Queue or Array Deck.
This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue. 
*/

public class P17_ArrayDequeue {

	public static void main(String[] args) {

		// Creating and initializing dequeue and Declaring object of integer type
		Deque<Integer> de_que = new ArrayDeque<Integer>();

		// Adding custom elements
		de_que.add(10);
		de_que.add(20);
		de_que.add(30);
		de_que.add(50);
		de_que.add(40);

		// Iterating using for each loop
		for (Integer element : de_que) {
			// Print the corresponding element
			System.out.println("Element : " + element);
		}

		// Clearing all elements using clear() method
		de_que.clear();

		// Inserting at the start
		de_que.addFirst(564);
		de_que.addFirst(291);

		// Inserting at end
		de_que.addLast(24);
		de_que.addLast(14);

		for (Iterator itr = de_que.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}

	}

}