package C04Ž��;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class C02_BFS_P2178_�̷�Ž��{
	
	
	static int[] dx = { 0, 1, 0, -1 }; 	//	  
	static int[] dy = { 1, 0, -1, 0 };	//	
	//dx[0],dy[0] : 0,1		�Ʒ��� �̵�
	//dx[1],dy[1] : 1,0		������ �̵�
	//dx[2],dy[2] : 0,-1	���� �̵�
	//dx[3],dy[3] : -1,0	���� �̵�
	
	//�湮 ��� �迭
	static boolean[][] visited;
  
	static int[][] A;
	static int N, M;//��(N)  ��(M)
  
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    
    A = new int[N][M];
    
    visited = new boolean[N][M];
    
    //������ �޾Ƽ� A�迭�� ����
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      String line = st.nextToken();	//���� �ޱ�
      
      for (int j = 0; j < M; j++) {
        A[i][j] = Integer.parseInt(line.substring(j, j + 1));
      }
    }

    //BFS ����
    BFS(0, 0);
    //?
    System.out.println(A[N - 1][M - 1]);	//BFS�� ������ ���� �ش���ǥ�� ������ DepthLevel���� Ȯ��
  }

  //
  public static void BFS(int i, int j) {
		
	  	//ť
	    Queue<int[]> queue = new LinkedList<>();
	    queue.offer(new int[] { i, j });
	    while (!queue.isEmpty()) {
	    	//���� ��ġ Ȯ��
	    	int now[] = queue.poll();
	    	//�湮 ��� �����
	    	visited[i][j] = true;
	    	
	    	//k �� 4������������ �����¿� Ž������
	    	for (int k = 0; k < 4; k++) {
		        int x = now[0] + dx[k];//����x��ǥ���� k��ŭ�̵�
		        int y = now[1] + dy[k];//����y��ǥ���� k��ŭ�̵�
		        
		        if (x >= 0 && y >= 0 && x < N && y < M)	//�迭 ������ ������� Ȯ��  
		        { 	
		          if (A[x][y] != 0 && !visited[x][y]) // A[x][y] != 0 �̸� �ȵǰ� �湮�ߴ� �迭�̸� �ȵȴ�
		          { 	
		        	  //������ ���Դٸ� �̵������� ���̴�!
		        	  visited[x][y] = true;				//�湮��� ����
		        	  A[x][y] = A[now[0]][now[1]] + 1; 	//�湮���ڸ�A[x][y]�� DepthLevel��(0,1,2..)�� ����   	
		        	  queue.add(new int[] { x, y });	//queue�� ���� �湮�� ��ġ ����
		          }
		        }
		        
	    	}
	    }
  }
}
