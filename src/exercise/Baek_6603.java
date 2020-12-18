package exercise;

import java.util.*;
public class Baek_6603 {
	static boolean next_permutation(int[] a){
		int i = a.length-1;
		while(i>0 && a[i-1] >= a[i]){
			i -= 1;
		}
		
		if(i <= 0){
			return false;
		}
		
		int j = a.length-1;
		while(a[j] <= a[i-1]){
			j -= 1;
		}
		
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length-1;
		while(i<j){
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i += 1;
			j -= 1;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int[] a = new int[n];
			for(int i=0; i<n; i++){
				a[i] = sc.nextInt();
			}
			int[] d = new int[n];				// 리스트에 포함될 6개의 숫자
			for(int i=0; i<n; i++){
				if(i < n-6) d[i] = 0;
				else d[i] = 1;
			}
			ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
			do{
				ArrayList<Integer> cur = new ArrayList<>();
				for(int i=0; i<n; i++){
					if(d[i] == 1){
						cur.add(a[i]);
					}
				}
				ans.add(cur);
			}while(next_permutation(d));
			// 여기 위까지가 모든 경우의 수를 ArrayList 안에 넣은거야
			
			Collections.sort(ans, new Comparator<ArrayList<Integer>>(){
				public int compare(ArrayList<Integer> l1, ArrayList<Integer> l2){
					int n = l1.size();
					int m = l2.size();
					int i=0;
					while(i < n && i < m){
						int t1 = l1.get(i);
						int t2 = l2.get(i);
						if(t1 < t2) return -1;			// 음수를 왼쪽으로 정렬할거야 여기서 정렬하는게 아니고 sort에서 이거보고 정렬
						else if(t1 > t2) return 1;
						i += 1;
					}
					if(i == n && i!=m) return -1;		// 그럴일은 없겠지만 리스트 길이가 긴쪽을 뒤로 둔다.
					else if(i != n && i==m) return 1;
					return 0;
				}
			});
			for(ArrayList<Integer> v : ans){
				for(int x : v){
					System.out.print(x + " ");
				}
				System.out.println();
			}
			System.out.println();
			
		}
	}
}
