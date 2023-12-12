package Queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.offer(12);
		priorityQueue.offer(18);
		priorityQueue.offer(21);
		priorityQueue.offer(18);
		priorityQueue.offer(19);
		priorityQueue.offer(20);
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.remove());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.remove());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.remove());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.remove());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.remove());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.remove());
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.poll());
		
	}

}
