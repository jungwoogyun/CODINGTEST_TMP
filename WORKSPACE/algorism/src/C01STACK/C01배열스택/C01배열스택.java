package C01STACK.C01배열스택;

 
public class C01배열스택 {
	
	private static int Top;
	private static int Size;
	
 
	public static void main(String[] args) {
		//--------------------------------------------------
		//배열 생성
		//--------------------------------------------------		
		Size = 10;
		int [] StackArr = new int[Size];
			
		//--------------------------------------------------
		// Stack의 생성 및 초기화 ///////
		//--------------------------------------------------
		StackInit();

		//--------------------------------------------------
		// 데이터 넣기 ///////
		//--------------------------------------------------
		System.out.printf("---------------(1) PUSH() ----------------\n");
		SPush(StackArr,1);  SPush(StackArr,2);
		SPush(StackArr,3);  SPush(StackArr,4);
		SPush(StackArr,5);
		PrintStack(StackArr);
		//--------------------------------------------------
		// 마지막 데이터 확인 ///////
		//--------------------------------------------------
		System.out.printf("---------------(2) PEEK() ----------------\n");
		System.out.printf("마지막 데이터 : %d\n", SPeek(StackArr));
		//--------------------------------------------------
		// 데이터 꺼내기 ///////
		//--------------------------------------------------
		System.out.printf("---------------(3) PEEK() ----------------\n");
		System.out.printf("1회 POP()! :"); SPop(StackArr);
		PrintStack(StackArr);
		System.out.printf("2회 POP()! :"); SPop(StackArr);
		PrintStack(StackArr);
		System.out.printf("3회 POP()! :"); SPop(StackArr);
		PrintStack(StackArr);
		System.out.printf("4회 POP()! :"); SPop(StackArr);
		PrintStack(StackArr);
		System.out.printf("5회 POP()! :"); SPop(StackArr);
		PrintStack(StackArr);
		System.out.printf("6회 POP()! :"); SPop(StackArr);
		PrintStack(StackArr);
		
	}
	
	
	
	//Stack Init
	static void StackInit(){
		Top = -1;
	}
	// 링크 Null 확인 함수
	static boolean IsEmpty()
	{
		if (Top == -1)
			return true;
		else
			return false;
	}
	
	// 마지막(Top) 데이터 확인 함수
	static int SPeek(int[] stackArr)
	{			
		return stackArr[Top];
	}
	static void PrintStack(int[] stackArr)
	{
		for(int i=0;i<=Top;i++)
			System.out.printf("%d ",stackArr[i]);
		System.out.printf("\n");

	}
	// PUSH 함수 
	static void SPush(int[] stackArr, int data)
	{
		// 1 new의 next에 top 대입
		// 2 top 에 new 대입 
		
		//01 OVERFLOW CHECK
		if(Size<Top) {
			System.out.println("OVERFLOW..");
			return ;
		}
		//02 Top++ 값넣기
		stackArr[++Top] = data;
		

	}

	// POP 함수 
	static void SPop(int[] stackArr)
	{

		//01 UNDERFLOW CHECK
		if(Top<0) {
			System.out.println("UNDERFLOW..");
			return ;
		}
		Top--;	
	
	}
	

	

	
	
}
