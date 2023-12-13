package C02QUEUE;


import java.util.LinkedList;
import java.util.Queue;

public class C05큐_제공되는클래스사용하기 {
	
	//MAIN
	public static void main(String[] args) {
		//-----------------------------------------
		// Queue의 생성 및 초기화 ///////
		//-----------------------------------------
		Queue<Integer> myQueue = new LinkedList<>();
		
		//-----------------------------------------
		// 데이터 넣기 ///////
		//-----------------------------------------
		myQueue.add(1); 
		myQueue.add(2); 
		myQueue.add(3);  
		myQueue.add(4);  
		myQueue.add(5);  
		System.out.println();
		
		System.out.print("전체 : ");
		myQueue.stream().forEach(node->System.out.print(node+" ") );
		System.out.println();
		System.out.println("PEEK : " + myQueue.peek()); 
		

		//-----------------------------------------
		// 데이터 꺼내기 ///////
		//-----------------------------------------
		System.out.println("데이터 빼기 : " + myQueue.poll());
		System.out.println("데이터 빼기 : " + myQueue.poll());
		System.out.println("데이터 빼기 : " + myQueue.poll());
		System.out.println("데이터 빼기 : " + myQueue.poll());
		System.out.println("데이터 빼기 : " + myQueue.poll());
		System.out.println("데이터 빼기 : " + myQueue.poll());
		
		 
	}


	
}
