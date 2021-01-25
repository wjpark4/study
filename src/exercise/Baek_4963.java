package exercise;

import java.util.*;
class Pair_4963{
	int x;
	int y;
	Pair_4963(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Baek_4963 {
	public static final int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
	public static final int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
	
	public static void bfs(int[][] a, int[][] group, int x, int y, int cnt, int n, int m){
		Queue<Pair_4963> q = new LinkedList<Pair_4963>();
		q.add(new Pair_4963(x, y));
		group[x][y] = cnt;
		while(!q.isEmpty()){
			Pair_4963 p = q.remove();
			x = p.x;
			y = p.y;
			for(int k=0; k<8; k++){
				int nx = x + dx[k];
				int ny = y + dy[k];
				
				// 1. 배열의 범위
				// 2. 인접해 있는가
				// 3. 방문하였는가
				if(nx >=0 && nx<n && ny>=0 && ny<m){
					if(a[nx][ny]==1 && group[nx][ny]==0){
						q.add(new Pair_4963(nx, ny));
						group[nx][ny] = cnt;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			
			int m = sc.nextInt();		// 얘가 너비고
			int n = sc.nextInt();		// 얘가 높이다 행렬과 헷갈릴 수 있따.
			
			if(n==0 && m==0) break;
			int a[][] = new int[n][m];
			
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					a[i][j] = sc.nextInt();
				}
			}
			
			int cnt = 0;					// 섬의 개수
			int[][] group = new int[n][m];	// 방문했는지 여부
			
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					if(a[i][j]==1 && group[i][j]==0){
						bfs(a, group, i, j, ++cnt, n, m);
					}
				}
			}
			
			System.out.println(cnt);
		}
		
		
		
	}

}
