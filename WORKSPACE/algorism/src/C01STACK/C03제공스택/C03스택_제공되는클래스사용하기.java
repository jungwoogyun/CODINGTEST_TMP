package C01STACK.C03��������;


import java.util.Stack;

public class C03����_�����Ǵ�Ŭ��������ϱ� {
	
	public static void main(String[] args) {
		
		
		Stack<Integer> stack = new Stack<>();
		
		//--------------------------------------------------
		// ������ �ֱ� ///////
		//--------------------------------------------------
		System.out.printf("---------------(1) PUSH() ----------------\n");
		stack.push(1);
		stack.push(1);  stack.push(2);
		stack.push(3);  stack.push(4);
		stack.push(5);
		
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();
		
		//--------------------------------------------------
		// ������ ������ Ȯ�� ///////
		//--------------------------------------------------
		System.out.printf("---------------(2) PEEK() ----------------\n");
		System.out.printf("������ ������ : %d\n", stack.peek());
		//--------------------------------------------------
		// ������ ������ ///////
		//--------------------------------------------------
		System.out.printf("---------------(3) PEEK() ----------------\n");
		System.out.printf("1ȸ POP()! :"); stack.pop();
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();
		
		System.out.printf("2ȸ POP()! :"); stack.pop();
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();

		System.out.printf("3ȸ POP()! :"); stack.pop();
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();

		System.out.printf("4ȸ POP()! :"); stack.pop();
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();

		System.out.printf("5ȸ POP()! :"); stack.pop();
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();

		System.out.printf("6ȸ POP()! :"); stack.pop();
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();
	}

}
