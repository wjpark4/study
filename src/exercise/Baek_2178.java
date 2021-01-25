package exercise;

import java.util.*;

class Pair_2178{
	int x;
	int y;
	Pair_2178(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Baek_2178 {
	public static final int[] dx = {0, 0, 1, -1};	// 행이동
	public static final int[] dy = {1, -1, 0, 0};	// 열이동
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		sc.nextLine();
		
		for(int i=0; i<n; i++){
			String s = sc.nextLine();
			for(int j=0; j<m; j++){
				a[i][j] = s.charAt(j) - '0';
			}
		}
		boolean[][] check = new boolean[n][m];
		int[][] dist = new int[n][m];
		
		Queue<Pair_2178> q = new LinkedList<Pair_2178>();
		dist[0][0] = 1;
		check[0][0] = true;
		q.add(new Pair_2178(0, 0));
		while(!q.isEmpty()){
			Pair_2178 p = q.remove();
			int x = p.x;
			int y = p.y;
			// 1. 배열의 범위
			// 2. 연결통로인지
			// 3. 방문하였는지
			for(int k=0; k<4; k++){
				int nx = x + dx[k];
				int ny = y + dy[k];
				if(nx>=0 && nx<n && ny>=0 && ny<m){
					if(a[nx][ny]==1 && check[nx][ny]==false){
						q.add(new Pair_2178(nx, ny));
						dist[nx][ny] = dist[x][y] + 1;
						check[nx][ny] = true;
					}
				}
			}
		}
		System.out.println(dist[n-1][m-1]);
	}
}
