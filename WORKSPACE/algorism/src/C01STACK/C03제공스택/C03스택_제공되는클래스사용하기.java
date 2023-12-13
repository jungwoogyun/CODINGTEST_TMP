package C01STACK.C03제공스택;


import java.util.Stack;

public class C03스택_제공되는클래스사용하기 {
	
	public static void main(String[] args) {
		
		
		Stack<Integer> stack = new Stack<>();
		
		//--------------------------------------------------
		// 데이터 넣기 ///////
		//--------------------------------------------------
		System.out.printf("---------------(1) PUSH() ----------------\n");
		stack.push(1);
		stack.push(1);  stack.push(2);
		stack.push(3);  stack.push(4);
		stack.push(5);
		
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();
		
		//--------------------------------------------------
		// 마지막 데이터 확인 ///////
		//--------------------------------------------------
		System.out.printf("---------------(2) PEEK() ----------------\n");
		System.out.printf("마지막 데이터 : %d\n", stack.peek());
		//--------------------------------------------------
		// 데이터 꺼내기 ///////
		//--------------------------------------------------
		System.out.printf("---------------(3) PEEK() ----------------\n");
		System.out.printf("1회 POP()! :"); stack.pop();
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();
		
		System.out.printf("2회 POP()! :"); stack.pop();
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();

		System.out.printf("3회 POP()! :"); stack.pop();
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();

		System.out.printf("4회 POP()! :"); stack.pop();
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();

		System.out.printf("5회 POP()! :"); stack.pop();
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();

		System.out.printf("6회 POP()! :"); stack.pop();
		stack.stream().forEach(node->{System.out.printf(node+" ");});
		System.out.println();
	}

}
