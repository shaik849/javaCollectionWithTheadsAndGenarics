package javacollections.generics;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAndStacks {
public static void main(String[] args) {
	Queue<Integer> q = new LinkedList<>();
	// for queue purpose because we don't have stack in java
	// Queue is not a class its an Interface which extends dequeue
    //	which implements linked list and array dequeue
	//Linked list also implements List interface
	//present stack also there in java
	q.offer(1);
	q.offer(2);
	q.offer(3);
	System.out.println(q.peek());
	System.out.println(q.poll());
	System.out.println(q.poll());
	System.out.println(q.isEmpty());
}
}
