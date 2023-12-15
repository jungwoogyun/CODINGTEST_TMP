package C01STACK.C02객체스택;




class Node{
	int data;
	Node next;
}
public class C02스택_직접만들기 {

	//Top Pointer
	static Node Top;
	
	//main method
	public static void main(String[] args) {
		//--------------------------------------------------
		// Stack의 생성 및 초기화 ///////
		//--------------------------------------------------
		StackInit();

		//--------------------------------------------------
		// 데이터 넣기 ///////
		//--------------------------------------------------
		System.out.printf("---------------(1) PUSH() ----------------\n");
		SPush(1);  SPush(2);
		SPush(3);  SPush(4);
		SPush(5);
		PrintStack();
		//--------------------------------------------------
		// 마지막 데이터 확인 ///////
		//--------------------------------------------------
		System.out.printf("---------------(2) PEEK() ----------------\n");
		System.out.printf("마지막 데이터 : %d\n", SPeek());
		//--------------------------------------------------
		// 데이터 꺼내기 ///////
		//--------------------------------------------------
		System.out.printf("---------------(3) PEEK() ----------------\n");
		System.out.printf("1회 POP()! :"); SPop();
		PrintStack();
		System.out.printf("2회 POP()! :"); SPop();
		PrintStack();
		System.out.printf("3회 POP()! :"); SPop();
		PrintStack();
		System.out.printf("4회 POP()! :"); SPop();
		PrintStack();
		System.out.printf("5회 POP()! :"); SPop();
		PrintStack();
		System.out.printf("6회 POP()! :"); SPop();
		PrintStack();
		 
	}
	
	//Stack Init
	static void StackInit(){
		Top = null;
	}
	// 링크 Null 확인 함수
	static boolean IsEmpty()
	{
		if (Top == null)
			return true;
		else
			return false;
	}
	
	// 마지막(Top) 데이터 확인 함수
	static int SPeek()
	{
		if (IsEmpty()) {
			System.out.printf("Stack Memory Error!");
			System.exit(-1);
		}
		return Top.data;
	}
	static void PrintStack()
	{
		Node cur = Top;
		while (cur!=null)
		{
			System.out.printf("%d ",cur.data);
			cur = cur.next;
		}
		System.out.printf("\n");

	}
	// PUSH 함수 
	static void SPush(int data)
	{
		// 1 노드생성
		// 2 값넣기
		// 3 링크 NULL
		// 4 노드가 하나도 없을때
		// 5 노드가 하나이상 있을때
		// 5-1 new의 next에 top 대입
		// 5-2 top 에 new 대입 

		Node newNode = new Node();
		if (newNode == null)
		{
			System.out.printf("OverFlow!\n");
			System.exit(1);
		}
		newNode.data = data;
		newNode.next = null;

		if (Top == null){
			Top = newNode;
		}
		else{
			newNode.next = Top;
			Top = newNode;
		}	

	}

	// POP 함수 
	static void SPop()
	{

		// 1 노드 하나도 없을때
		// 2 노드 있을때
		// 2-1 Top 위치를 del에 저장
		// 2-2 Top 은 다음 위치로 이동
		// 2-3 del 을 free() 로 제거 

		if (Top == null){
			System.out.printf("UnderFlow!\n");
			return;
		}
		else
		{
			Node del = Top;
			Top = Top.next;
		}
	}

	
	
	
	
	
	
}
