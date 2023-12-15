package C03PROGRAMMERS;

import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/12909

//스택
public class C03올바른괄호L2 {

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
        // 스택을 생성합니다.
        Stack<Character> stack = new Stack<>();

        // 문자열을 순회하면서 괄호를 처리합니다.
        for (char c : s.toCharArray()) {
            // '(' 문자를 만나면 스택에 푸시합니다.
            if (c == '(') {
                stack.push(c);
            }
            // ')' 문자를 만나면 스택에서 팝합니다.
            else {
                // 스택이 비어있으면 올바른 괄호가 아닙니다.
                if (stack.isEmpty()) {
                    return false;
                }
                // 짝이 맞지 않는 괄호이면 올바른 괄호가 아닙니다.
                if (stack.pop() != '(') {
                    return false;
                }
            }
        }

        // 스택이 비어있으면 올바른 괄호입니다.
        return stack.isEmpty();
    }
}
