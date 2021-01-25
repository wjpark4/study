package exercise;

import java.util.*;

public class Baek_1697 {
	public static final int MAX = 100000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		boolean[] check = new boolean[MAX];
		int[] dist = new int[MAX];
		check[n] = true;
		dist[n] = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);
		
		while(!q.isEmpty()){
			int now = q.remove();
			
			// 배열의 범위
			// 방문했는지
			if(now-1 >= 0){
				if(check[now-1] == false){
					q.add(now-1);
					check[now-1]=true;
					dist[now-1] = dist[now]+1;
				}
			}
			if(now+1 < MAX){
				if(check[now+1] == false){
					q.add(now+1);
					check[now+1]=true;
					dist[now+1] = dist[now]+1;
				}
			}
			if(now*2 < MAX){
				if(check[now*2] == false){
					q.add(now*2);
					check[now*2]=true;
					dist[now*2] = dist[now]+1;
				}
			}
		}
		System.out.println(dist[m]);
	}
}
