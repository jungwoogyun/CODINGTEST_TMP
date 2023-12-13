package C02QUEUE;


import java.util.Deque;
import java.util.LinkedList;


public class C07��_�����Ǵ�Ŭ��������ϱ� {
	
	public static void main(String[] args) {
		
		Deque<Integer> mydeque = new LinkedList<>();
		mydeque.addFirst(1);
		mydeque.addFirst(2);
		mydeque.addFirst(3);
		mydeque.addFirst(4);
		
		for(Integer i : mydeque) {
			System.out.printf(i + " ");
		}
		System.out.println();
		
		mydeque.addLast(5);
		mydeque.addLast(6);
		mydeque.addLast(7);
		mydeque.addLast(8);
		
		for(Integer i : mydeque) {
			System.out.printf(i + " ");
		}
		System.out.println();
		
		System.out.println("peekFirst : " +mydeque.peekFirst());
		System.out.println("peekLast : " +mydeque.peekLast());
		System.out.println("pollFirst : " +mydeque.pollFirst());
		for(Integer i : mydeque) {
			System.out.printf(i + " ");
		}
		System.out.println();
		System.out.println("pollLast : " +mydeque.pollLast());
		for(Integer i : mydeque) {
			System.out.printf(i + " ");
		}
		System.out.println();

	}

}
