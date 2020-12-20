package exercise;

import java.util.*;

public class Baek_6603_2 {
	
	static ArrayList<Integer> lotto = new ArrayList<Integer>();
	
	public static void solve(int[] a, int index, int cnt){
		// cnt값이 6개가 될 때까지 재귀해야 한다는점
		// 오름 차순이어야 한다는 점
		if(cnt == 6){
			for(int x : lotto){
				System.out.print(x + " ");
			}
			System.out.println();
			return;
		}
		
		int n = a.length;
		if(index == n) return;
		
		lotto.add(a[index]);
		solve(a, index+1, cnt+1);
		lotto.remove(lotto.size()-1);
		solve(a, index+1, cnt);
		
		
	}
	
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	
    	while(true){
    		int n = sc.nextInt();
    		if(n == 0) break;
    		int[] a = new int[n];
    		int index = 0;
    		int cnt = 0;
    		
    		for(int i=0; i<n; i++){
    			a[i] = sc.nextInt();
    		}
    		
    		solve(a, 0, 0);
    	}
    }

}
