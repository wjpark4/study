package exercise;

import java.util.*;

public class Baek_14888_Re {
	static boolean next_permutation(int[] a){
		int i = a.length-1;
        while (i > 0 && a[i-1] >= a[i]) {
            i -= 1;
        }

        if (i <= 0) {
            return false;
        }

        int j = a.length-1;
        while (a[j] <= a[i-1]) {
            j -= 1;
        }

        int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;

        j = a.length-1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }
        return true;
	}
	public static int calc(int[] a, int[] b){
		int n = a.length;
		int ans = a[0];
		for(int i=1; i<n; i++){
			if(b[i-1] == 0){
				ans = ans + a[i];
			} else if(b[i-1] == 1){
				ans = ans - a[i];
			} else if(b[i-1] == 2){
				ans = ans * a[i];
			} else{
				ans = ans / a[i];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();					// n개로 이루어진 수열
		}
		int[] b = new int[n-1];					// b는 연산자임. b의 값은 연산자 결정. b크기는 연산자 갯수
		int m = 0;
		for(int i=0; i<4; i++){
			int cnt = sc.nextInt();					// 연산자별 카운트 개수
			for(int k=0; k<cnt; k++){
				b[m++] = i;							// m은 ?? 연산자 위치라고해야하나 몇번쨰 위치에 자리한 연산자인지
			}
		}
		Arrays.sort(b);
		ArrayList<Integer> result = new ArrayList<>();
		do{
			int temp = calc(a, b);
			result.add(temp);
		}while(next_permutation(b));
		Collections.sort(result);
		m = result.size();						// 여기서의 m은 
		System.out.println();
		
	}

}
