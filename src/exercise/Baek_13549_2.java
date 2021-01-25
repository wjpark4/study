package exercise;

import java.util.*;
// 덱을 이용한 풀이
public class Baek_13549_2 {
	public static final int MAX = 1000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();			// 수빈이 위치
		int m = sc.nextInt();			// 동생 위치
		
		boolean[] c = new boolean[MAX];	// 방문했는지
		int[] d = new int[MAX];			// 지금까지 흐른 시간
		c[n] = true;					// 수빈이 지금자리는 방문했다.
		d[n] = 0;						// 시간은 안흐름
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(n);						// 일단 덱이 수빈이 위치 넣고
		while(!q.isEmpty()){
			int now = q.poll();			// 현재 위치 뽑아서 now에 넣어
			for(int next : new int[]{now*2, now-1, now+1}){
				if(next >= 0 && next<MAX){				// 배열의 범위 안에 있고
					if(c[next]  == false){				// 방문할 예정인 자리는 방문안했으면
						c[next] = true;					// 방문체크
						if(next == now * 2){
							q.addFirst(next);
							d[next] = d[now];
						}else{
							q.addLast(next);
							d[next] = d[now] +1;
						}
					}
				}
			}
		}
		System.out.println(d[m]);
	}//main
}
