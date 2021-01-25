package exercise;

import java.util.*;
/*
class Pair{
	int x;
	int y;
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Bexercise {
	public static final int[] dx = {0, 0, 1, -1};
	public static final int[] dy = {1, -1, 0, 0};
	public static void dfs(int[][] a, int[][] group, int x, int y, int cnt, int n){
		group[x][y] = cnt;
		for(int k=0; k<4; k++){
			int nx = x+dx[k];
			int ny = y+dy[k];
			
			// 1. 배열의 범위 확인
			// 2. 연결되어있나
			// 3. 방문했나
			if(0<=nx && nx<n && 0<=ny && ny<n){
				if(a[nx][ny]==1 && group[nx][ny]==0){
					dfs(a, group, nx, ny, cnt, n);
				}
			}
		}
	}
	public static void bfs(int[][] a, int[][] group, int x, int y, int cnt, int n){
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(x, y));
		group[x][y] = cnt;
		while(!q.isEmpty()){
			Pair p = q.remove();
			x = p.x;
			y = p.y;
			for(int k=0; k<4; k++){
				int nx = x + dx[k];
				int ny = y + dy[y];
				
				// 1. 배열의 범위 
				// 2. 연결되어있나
				// 3. 방문했나
				if(nx>=0 && nx<n && ny>=0 && ny<n){
					if(a[nx][ny]==1 && group[nx][ny]==0){
						q.add(new Pair(nx, ny));
						group[nx][ny]=cnt;
					}
				}
			}
		}
	}
	
	//public static void bfs(int[][])

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		sc.nextLine();
		
		for(int i=0; i<n; i++){
			String s = sc.nextLine();
			for(int j=0; j<n; j++){
				a[i][j] = s.charAt(j)-'0';
			}
		}
		int cnt = 0;
		int[][] group = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(a[i][j]==1 && group[i][j]==0){
					dfs(a, group, i, j, ++cnt, n);
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
*/
class Pairc {
    int x;
    int y;
    Pairc(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Bexercise {
    public static final int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
    public static final int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};
    public static void bfs(int[][] a, int[][] group, int x, int y, int cnt, int n, int m) {
        Queue<Pairc> q = new LinkedList<Pairc>();
        q.add(new Pairc(x, y));
        group[x][y] = cnt;
        while (!q.isEmpty()) {
            Pairc p = q.remove();
            x = p.x;
            y = p.y;
            for (int k=0; k<8; k++) {
                int nx = x+dx[k];
                int ny = y+dy[k];
                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (a[nx][ny] == 1 && group[nx][ny] == 0) {
                        q.add(new Pairc(nx, ny));
                        group[nx][ny] = cnt;
                    }
                }
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int[][] a = new int[n][m];
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int cnt = 0;
            int[][] group = new int[n][m];
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    if (a[i][j] == 1 && group[i][j] == 0) {
                        bfs(a, group, i, j, ++cnt, n, m);
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
