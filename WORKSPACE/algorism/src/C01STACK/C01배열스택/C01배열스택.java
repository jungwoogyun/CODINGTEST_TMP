package C01STACK.C01�迭����;

 
public class C01�迭���� {
	
	private static int Top;
	private static int Size;
	
 
	public static void main(String[] args) {
		//--------------------------------------------------
		//�迭 ����
		//--------------------------------------------------		
		Size = 10;
		int [] StackArr = new int[Size];
			
		//--------------------------------------------------
		// Stack�� ���� �� �ʱ�ȭ ///////
		//--------------------------------------------------
		StackInit();

		//--------------------------------------------------
		// ������ �ֱ� ///////
		//--------------------------------------------------
		System.out.printf("---------------(1) PUSH() ----------------\n");
		SPush(StackArr,1);  SPush(StackArr,2);
		SPush(StackArr,3);  SPush(StackArr,4);
		SPush(StackArr,5);
		PrintStack(StackArr);
		//--------------------------------------------------
		// ������ ������ Ȯ�� ///////
		//--------------------------------------------------
		System.out.printf("---------------(2) PEEK() ----------------\n");
		System.out.printf("������ ������ : %d\n", SPeek(StackArr));
		//--------------------------------------------------
		// ������ ������ ///////
		//--------------------------------------------------
		System.out.printf("---------------(3) PEEK() ----------------\n");
		System.out.printf("1ȸ POP()! :"); SPop(StackArr);
		PrintStack(StackArr);
		System.out.printf("2ȸ POP()! :"); SPop(StackArr);
		PrintStack(StackArr);
		System.out.printf("3ȸ POP()! :"); SPop(StackArr);
		PrintStack(StackArr);
		System.out.printf("4ȸ POP()! :"); SPop(StackArr);
		PrintStack(StackArr);
		System.out.printf("5ȸ POP()! :"); SPop(StackArr);
		PrintStack(StackArr);
		System.out.printf("6ȸ POP()! :"); SPop(StackArr);
		PrintStack(StackArr);
		
	}
	
	
	
	//Stack Init
	static void StackInit(){
		Top = -1;
	}
	// ��ũ Null Ȯ�� �Լ�
	static boolean IsEmpty()
	{
		if (Top == -1)
			return true;
		else
			return false;
	}
	
	// ������(Top) ������ Ȯ�� �Լ�
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
	// PUSH �Լ� 
	static void SPush(int[] stackArr, int data)
	{
		// 1 new�� next�� top ����
		// 2 top �� new ���� 
		
		//01 OVERFLOW CHECK
		if(Size<Top) {
			System.out.println("OVERFLOW..");
			return ;
		}
		//02 Top++ ���ֱ�
		stackArr[++Top] = data;
		

	}

	// POP �Լ� 
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
