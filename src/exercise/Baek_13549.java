package exercise;

import java.util.*;
//큐로 푼 소스
public class Baek_13549 {
	public static final int MAX = 1000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				// 수빈이 위치
		int m = sc.nextInt();				// 동생 위치
		boolean[] c = new boolean[MAX];		// 방문했는가
		int[] d = new int[MAX];				// 가중치합인가
		c[n] = true;						// 일단 수빈이 위치는 방문찍고
		d[n] = 0;							// 움직이지 않았으니 가중치 일단 0
		Queue<Integer> q = new LinkedList<Integer>();			// (순)가중치 0짜리
		Queue<Integer> next_queue = new LinkedList<Integer>();	// (걷)가중치 1짜리
		q.add(n);							// 수빈이 큐에 넣고
		
		while(!q.isEmpty()){				// 큐가 비지 않았다면
			int now = q.remove();			// BFS시작
			for(int next : new int[]{now*2, now-1, now+1}){	// 순, 앞걷, 뒤걷 하나씩 할건데
				if(next >= 0 && next<MAX){	// 배열의 범위이고
					if(c[next] == false){	// 방문안했으면
						c[next] = true;		// 방문찍고
						if(now*2 == next){	// 만약 next가 순간이동이면
							q.add(next);	// 큐에 넣고
							d[next] = d[now];		// 방문횟수는 늘리지 않아
						} else{
							next_queue.add(next);	// 순간이동이 아니면
							d[next] = d[now]+1;		// 방문횟수 1늘려
						}
					}
				}
			}
			if(q.isEmpty()){						// 큐가 비었으면 이제 다음 큐가 맨 앞큐가 되는거지
				q = next_queue;
				next_queue = new LinkedList<Integer>();
			}
		}
		System.out.println(d[m]);
	}
}
