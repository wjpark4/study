package exercise;
import java.util.*;

class Result implements Comparable<Result>{
	Integer[] a;
	Result(ArrayList<Integer> a){
		this.a = a.toArray(new Integer[a.size()]);
	}
	int get(int index){
		return (int)this.a[index];
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Result){
			Result that = (Result)obj;
			int n = this.a.length;
			for(int i=0; i<n; i++){
				if(this.a[i] != that.a[i]){
					return false;
				}
			}
			return true;
		} else{
			return false;
		}
	}
	public int compareTo(Result that){
		int n = this.a.length;
		for(int i=0; i<n; i++){
			if(this.a[i] == that.a[i]) continue;
			if(this.a[i] < that.a[i]) return -1;
			if(this.a[i] > that.a[i]) return 1;
		}
		return 0;
	}
}

public class Baek_15663 {
	static boolean[] check = new boolean[10];
	static int[] a = new int[10];
	static int[] num = new int[10];
	static ArrayList<Result> d = new ArrayList<>();
	static void go(int index, int n, int m){
		if(index == m){
			ArrayList<Integer> temp = new ArrayList<>();
			for(int i=0; i<m; i++){
				temp.add(num[a[i]]);
			}
			d.add(new Result(temp));
			return;
		}
		for(int i=0; i<n; i++){
			if(check[i]) continue;
			check[i] = true;
			a[index] = i;
			go(index+1, n, m);
			check[i] = false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=0; i<n; i++){
			num[i] = sc.nextInt();
		}
		Arrays.sort(num, 0, n);
		go(0, n, m);
		Collections.sort(d);					// sort를 하면 왜 중복 list가 지워지는가
		StringBuilder sb = new StringBuilder();
		System.out.println(d.size());
		for(int i=0; i<d.size(); i++){
			if(i==0 || !d.get(i).equals(d.get(i-1))){	// 중복은 여기서 지워진다. 다만 sort를 뺴면 같은 숫자조합이 연달아 정렬되지 않기 떄문에 지워지지 않는것
				for(int j=0; j<m; j++){
					sb.append(d.get(i).get(j));
					if(j != m-1) sb.append(' ');
				}
				sb.append('\n');
			}
		}
		System.out.print(sb);
	}
}
