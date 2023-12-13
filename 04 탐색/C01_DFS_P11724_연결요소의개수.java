package C04Ž��;
import java.io.*;


import java.util.*;
public class C01_DFS_P11724_�������ǰ���{
  static ArrayList<Integer>[] A;
  static boolean visited[];
  public static void main(String[] args) throws IOException {
	 
	  //
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st = new StringTokenizer(br.readLine());
	 
	 int n = Integer.parseInt(st.nextToken());	//����� ����
	 int m = Integer.parseInt(st.nextToken());	//������ ����
	 A = new ArrayList[n + 1];					//��������Ʈ �迭 ũ�� ����(index�� 1����)
	 visited = new boolean[n + 1];				//�湮���� �迭 ũ������(index�� 1����)
    
    for (int i = 1; i < n + 1; i++) {  
      A[i] = new ArrayList<Integer>();			//��������Ʈ i��°���� ArrayList��ü�� �ʱ�ȭ
    }
    
    
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());	//���۳��
      int e = Integer.parseInt(st.nextToken());	//���۳��κ��� ����Ǵ� ���
      A[s].add(e);  //�����ϱ�
      A[e].add(s);	//�����ϱ�
    }
    
    int count = 0;
    
    for (int i = 1; i < n + 1; i++) {
      if (!visited[i])	//�湮���� �ʾҴٸ� 
      {  
        count++;	//�����Ұ��� Count����
        DFS(i);		//DFSȣ��
      }
    }
    
    System.out.println(count);
  }

  //---------------------------------  
  static void DFS(int v) {
    if (visited[v]) {
      return;
    }
    visited[v] = true;
    for (int i : A[v]) {
      if (visited[i] == false) { 
        DFS(i);
      }
    }
    
  }
  //---------------------------------
  
}
