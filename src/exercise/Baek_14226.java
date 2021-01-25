package exercise;

import java.util.*;

public class Baek_14226 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] d = new int[n+1][n+1];
		for(int i=0; i<=n; i++){
			Arrays.fill(d[i], -1);
		}
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);		// 화면에 이모티콘 하나
		q.add(0);		// 클립보드 0개
		d[1][0] = 0;	// 아직 한번도 이동안함
		while(!q.isEmpty()){
			int s = q.remove();
			int c = q.remove();
			if(d[s][s] == -1){			//클립보드 복사할건데~ 복사안했으면
				d[s][s] = d[s][c]+1;	// 이동횟수 1회 추가
				q.add(s); q.add(s);		// 위치 변경
			}
			if(s+c <=n && d[s+c][c] == -1){	
				// 화면 이모티콘 + 클립보드 이모티콘 갯수가 n개가 아직 안되고 클립보드에서 화면으로 복사를 아직 안했으면 
				d[s+c][c] = d[s][c] + 1;	// 이동횟수 1회 추가
				q.add(s+c); q.add(c);		// 위치 변경
			}
			if(s-1>=0 && d[s-1][c]== -1){
				// 화면 이모티콘 한개삭제하고 아직 안했으면
				d[s-1][c] = d[s][c] +1;		// 이동횟수 1회 추가
				q.add(s-1); q.add(c);		// 위치변경
			}
		}
		int ans = -1;
		for(int i=0; i<=n; i++){
			if(d[n][i] != -1){
				if(ans == -1 || ans > d[n][i]){
					ans = d[n][i];
				}
			}
		}
		System.out.println(ans);
			
		
	}
}
