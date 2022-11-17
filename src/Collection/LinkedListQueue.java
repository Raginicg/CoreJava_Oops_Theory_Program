package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue 
{
	public static void main(String[] args) 
	{
		Queue<Integer> queue=new LinkedList<>();
		queue.add(7);
		queue.offer(1);
		System.out.println("queue"+ queue);
	}
}
