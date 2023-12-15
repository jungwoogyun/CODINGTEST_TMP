package C03PROGRAMMERS;

import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/12909

//����
public class C03�ùٸ���ȣL2 {

	public static void main(String[] args) {
	       String s = "()()";
	        System.out.println(solution(s)); // true

	        s = "(())()";
	        System.out.println(solution(s)); // true

	        s = "())(";
	        System.out.println(solution(s)); // false

	        s = "(()(";
	        System.out.println(solution(s)); // false

	}


	
    static boolean solution(String s) {
        // ������ �����մϴ�.
        Stack<Character> stack = new Stack<>();

        // ���ڿ��� ��ȸ�ϸ鼭 ��ȣ�� ó���մϴ�.
        for (char c : s.toCharArray()) {
            // '(' ���ڸ� ������ ���ÿ� Ǫ���մϴ�.
            if (c == '(') {
                stack.push(c);
            }
            // ')' ���ڸ� ������ ���ÿ��� ���մϴ�.
            else {
                // ������ ��������� �ùٸ� ��ȣ�� �ƴմϴ�.
                if (stack.isEmpty()) {
                    return false;
                }
                // ¦�� ���� �ʴ� ��ȣ�̸� �ùٸ� ��ȣ�� �ƴմϴ�.
                if (stack.pop() != '(') {
                    return false;
                }
            }
        }

        // ������ ��������� �ùٸ� ��ȣ�Դϴ�.
        return stack.isEmpty();
    }
}
