package C03PROGRAMMERS;

import java.util.ArrayList;
import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12906

public class C01�������ڴ½Ⱦ�Lv1 {


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
//        // ���������� ��Ÿ���� ���ڸ� �����ϰ� ���� ������ ������ ����Ʈ
//        ArrayList<Integer> resultList = new ArrayList<>();
//        resultList.add(arr[0]);
//
//        // �迭�� ��ȸ�ϸ鼭 ���������� ��Ÿ���� ���ڸ� ����
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] != arr[i - 1]) {
//                resultList.add(arr[i]);
//            }
//        }
//        // ArrayList�� �迭�� ��ȯ
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
