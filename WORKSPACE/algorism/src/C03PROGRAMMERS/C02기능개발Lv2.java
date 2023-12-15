package C03PROGRAMMERS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//QUEUE
//https://school.programmers.co.kr/learn/courses/30/lessons/42586
	
public class C02기능개발Lv2 {
	
	public static void main(String[] args) {
        int[] progresses = {99, 96, 94};
        int[] speeds = {1, 3, 4};

        int[] answer = solution(progresses, speeds);

        System.out.println(Arrays.toString(answer));
	}
	
	
	public static int[] solution(int[] progresses, int[] speeds) {
        // 남은 작업 일수를 저장하는 Queue
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
        	
        	int val = 0;
        	if( (100-progresses[i])%speeds[i] != 0)
        		val = (int)Math.ceil( (double)(100 - progresses[i]) / speeds[i] );
        	else
        		val = (100 - progresses[i]) / speeds[i];
        	
        	queue.add( val);
        }
        
        // 배포되는 기능의 개수를 저장하는 변수
        int count = 1;
        int prev = queue.poll();
        
        ArrayList<Integer> list = new ArrayList();
        while(true) {
        	
        	if(prev<queue.peek()) {
        		list.add(count);
        		count=1;
        		prev=queue.poll();
        	}else {
        		count++;
        		queue.poll();
        	}
        	
        	if(queue.isEmpty()) {
        		list.add(count);
        		break;
        	} 	
        }
        
        
        
        return list.stream().mapToInt(i->i).toArray();
       
    }
    
    
	
}
