package C02QUEUE;


import java.util.Comparator;
import java.util.PriorityQueue;

public class C08��_�켱����ť {

	public static void main(String[] args) {
		  
//		//01 �⺻ �켱����ť(��������) 
//        // ������ �����ϴ� �켱���� ť ���� (�⺻�� ���� ���� ���� �켱����)
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//
//        // �켱���� ť�� ��� �߰�
//        priorityQueue.add(5);
//        priorityQueue.add(3);
//        priorityQueue.add(8);
//        priorityQueue.add(1);
//
//        // �켱���� ť���� ��� ������
//        while (!priorityQueue.isEmpty()) {
//            int element = priorityQueue.poll();
//            System.out.println("���� ���: " + element);
//        }
		
		//02 �⺻ �켱����ť(��������)
//        // ū ���� ���� �켱������ ���� �켱���� ť ����
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
//
//        // �켱���� ť�� ��� �߰�
//        priorityQueue.add(5);
//        priorityQueue.add(3);
//        priorityQueue.add(8);
//        priorityQueue.add(1);
//
//        // �켱���� ť���� ��� ������
//        while (!priorityQueue.isEmpty()) {
//            int element = priorityQueue.poll();
//            System.out.println("���� ���: " + element);
//        }
        
		
		//03 �켱���� ��������(���밪 ���� ��������)
		PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2) -> {
		      int first_abs = Math.abs(o1);
		      int second_abs = Math.abs(o2);
		      
		      if (first_abs == second_abs)
		        return o1 > o2 ? 1 : -1; 	// ���밪(-�� -> +��) �����
		      else
		        return first_abs - second_abs; 	//��������
			  });
      // �켱���� ť�� ��� �߰�
		MyQueue.add(-5);
		MyQueue.add(3);
		MyQueue.add(-8);
		MyQueue.add(1);

      // �켱���� ť���� ��� ������
      while (!MyQueue.isEmpty()) {
          int element = MyQueue.poll();
          System.out.println("���� ���: " + element);
      }
		
		
	}
	
}
