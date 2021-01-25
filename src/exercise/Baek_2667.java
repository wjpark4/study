package exercise;

import java.util.*;

class Pairb{
	int x;
	int y;
	Pairb(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Baek_2667 {
	public static final int[] dx = {1, -1, 0, 0};		// 좌우 탐색
	public static final int[] dy = {0, 0, 1, -1};		// 상하 탐색
	public static void bfs(int[][] a, int[][] group, int x, int y, int cnt, int n){
		Queue<Pairb> q = new LinkedList<Pairb>();
		q.add(new Pairb(x, y));
		group[x][y] = cnt;
		while(!q.isEmpty()){
			Pairb p = q.remove();
			x = p.x;
			y = p.y;
			for(int k=0; k<4; k++){
				int nx = x+dx[k];
				int ny = y+dy[k];
				
				// 1. 배열의 조건을 만족하는지(out of index, etc..)
				// 2. 단지가 연결이 되었는지
				// 3. 방문을 하지 않은 곳이었을 때
				if(0 <= nx && nx < n &&  0 <= ny && ny < n){
					if(a[nx][ny] == 1 && group[nx][ny] == 0){
						q.add(new Pairb(nx, ny));
						group[nx][ny] = cnt;
					}
				}
			}
			
		}
	}
	/*
	public static void dfs(int[][] a, int[][] group, int x, int y, int cnt, int n){
		group[x][y] = cnt;
		for(int k=0; k<4; k++){
			int nx = x+dx[k];
			int ny = y + dy[k];
			if(0 <= nx && nx < n && 0 <= ny && ny <n){
				if(a[nx][ny] == 1 && group[nx][ny] == 0){
					dfs(a, group, nx, ny, cnt, n);
				}
			}
		}
	}
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[][] a = new int[n][n];					// 단지 정보를 담고 있는 배열
		for(int i=0; i<n; i++){
			String s = sc.nextLine();
			for(int j=0; j<n; j++){
				a[i][j] = s.charAt(j) - '0';
			}
		}
		int cnt = 0;
		int[][] group = new int[n][n];				// 얘는 방문정보일까? 맞는듯 boolean으로 써도되겠다. 123으로 안넣을거면
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(a[i][j] == 1 && group[i][j] == 0){
					bfs(a, group, i, j, ++cnt, n);
				}
			}
		}
		int[] ans = new int[cnt];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(group[i][j] != 0){
					ans[group[i][j]-1] += 1;
				}
			}
		}
		Arrays.sort(ans);
		System.out.println(cnt);
		for(int i=0; i<cnt; i++){
			System.out.println(ans[i]);
		}
	}
}
