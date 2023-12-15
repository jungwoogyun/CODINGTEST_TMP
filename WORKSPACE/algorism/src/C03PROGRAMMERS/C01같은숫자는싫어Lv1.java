package C03PROGRAMMERS;

import java.util.ArrayList;
import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12906

public class C01같은숫자는싫어Lv1 {


	public static void main(String[] args) {
        
		
		int arr[] = {1,1,3,3,0,1,1};
		int result [] =  solution(arr);
		for(int i : result)
			System.out.print(i + " ");
		System.out.println();
		
		int arr2[] = {4,4,4,3,3};
		int result2[] = solution(arr2);
		for(int i : result2)
			System.out.print(i + " ");
		System.out.println();

	}
	

    public static int[] solution(int []arr) {
        int[] answer = {};
        
        
        //---------------------------------------------
        //01 ArrayList
        //---------------------------------------------
//        // 연속적으로 나타나는 숫자를 제거하고 남은 수들을 저장할 리스트
//        ArrayList<Integer> resultList = new ArrayList<>();
//        resultList.add(arr[0]);
//
//        // 배열을 순회하면서 연속적으로 나타나는 숫자를 제거
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] != arr[i - 1]) {
//                resultList.add(arr[i]);
//            }
//        }
//        // ArrayList를 배열로 변환
//        answer = new int[resultList.size()];
//        for (int i = 0; i < resultList.size(); i++) {
//            answer[i] = resultList.get(i);
//        }
//		 return answer;
        
        
        //---------------------------------------------
        int a=arr[0];
        for(int i=1;i<arr.length;i++) {
        	if(arr[i]==a)
        		arr[i]=-1;
        	else
        		a = arr[i];
        }
       
        return Arrays.stream(arr).filter(x-> x!=-1).toArray();
    
     
    }
    
    
    

        
     
 
}
