package C02QUEUE;



class QNode{
	int data;
	QNode next;
}
class QPointer{
	QNode front;
	QNode rear;
}
public class C04큐_직접만들기 {
	
	//MAIN
	public static void main(String[] args) {
		//-----------------------------------------
		// Queue의 생성 및 초기화 ///////
		//-----------------------------------------
		QPointer q = new QPointer();
		Init(q);

		//-----------------------------------------
		// 데이터 넣기 ///////
		//-----------------------------------------
		Enq(q, 1);  Enq(q, 2);
		Enq(q, 3);  Enq(q, 4);
		Enq(q, 5);
		PrintQ(q);

		//-----------------------------------------
		// 데이터 꺼내기 ///////
		//-----------------------------------------
		System.out.printf("Deq() 1회 : "); Deq(q); PrintQ(q);
		System.out.printf("Deq() 2회 : "); Deq(q); PrintQ(q);
		System.out.printf("Deq() 3회 : "); Deq(q); PrintQ(q);
		System.out.printf("Deq() 4회 : "); Deq(q); PrintQ(q);
		System.out.printf("Deq() 5회 : "); Deq(q); PrintQ(q);
		 
	}

	//
	static void Init(QPointer pq)
	{
		pq.front = null;
		pq.rear = null;
	}
	//
	static boolean Empty(QPointer pq) {
		if (pq.front == null)
			return true;
		else
			return false;
	}
	//
	static int QPeek(QPointer pq)
	{
		if (Empty(pq))
		{
			System.out.printf("Queue Memory Error!");
			System.exit(-1);
		}
		return pq.front.data;
	}
	//
	static void PrintQ(QPointer pq)
	{
		QNode cur = pq.front;
		
		while (cur!=null)
		{
			System.out.printf("%d ", cur.data);
			cur = cur.next;
		}
		System.out.printf("\n");
	}
	//
	static void Enq(QPointer pq, int data)
	{
		//1 새노드
		//2 데이터 값
		//3 링크 초기화
		//5 노드 하나도 없을때
		//6 노드 하나이상 있을때
		//6-1 rear의 next에 new 대입
		//6-2 rear의 위치를 new 로 지정 
		QNode newNode = new QNode();
		if (newNode == null)
			System.exit(1);

		newNode.data = data;
		newNode.next = null;

		if (pq.front == null)
		{
			pq.front = newNode;
			pq.rear = newNode;
		}
		else
		{
			pq.rear.next = newNode;
			pq.rear = newNode;
		}
		
	}
	//
	static void Deq(QPointer pq)
	{
		//1 노드가 없는경우
		//2 노드가 있는경우
		//2-1 front 의 노드 주소를 del에 담는다
		//2-2 front 를 next위치로 이동시킨다
		//2-3 del를 free()한다

		if (pq.front == null)
			return ;
		
		QNode del = pq.front;
		pq.front = pq.front.next;
	}
	
}
