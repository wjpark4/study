package exercise;

import java.util.*;

public class Baek_1182_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i=1; i<(1<<n); i++) {
            int sum = 0;
            System.out.println("i가 " + i + "일 때");
            
            for (int k=0; k<n; k++) {
                if ((i&(1<<k)) != 0) {
                    sum += a[k];
                    System.out.println("k값 : " + k + " a[k] : " + a[k] + " sum : " + sum);
                }
            }
            if (sum == s) {
                ans += 1;
            }
        }
        System.out.println(ans);
	}
}
