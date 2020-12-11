package exercise;

import java.util.*;
// 여기서 중요한 사실은 나는 JAVA 책의 static부분을 다시 봐야해 로컬변수 적용범위
public class Baek_10972 {
	public static boolean next_permutation(int[] a){
		int i = a.length - 1;				// 맨 끝에서부터 시작할 배열번호
		while(i>0 && a[i-1] >= a[i]){		// 배열이 끝부터 시작해서 내림차순으로 되어있는지 확인
			i -= 1;
		}
		
		if(i <= 0){							// 배열 맨앞까지 갔을때도 모두 내림차순이면 더이상 다음수가 없으므로 false
			return false;
		}
		
		int j = a.length-1;
		while(a[j] <= a[i-1]){				// 일단 내림 차순이 아님시점의 값이 맨 뒤의 값과 비교하여 큰지 확인. 크면 못바꾸니까 글고 맨뒤의 값만 비교하면 됨. 어차피 뒤쪽은 내림차순이라
			j -= 1;
		}
		
		int temp = a[i-1];					// 바로 바꾸기 시전
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length - 1;					// 이제 바꾼 이후로 뒤쪽 순열정리해야 되니까 다시 j를 초기화한다.
		while(i<j) {						// 원래 뒤쪽은 내림차순이었으므로 다시 비교할 필요가 없다. 바로 바꾼다.
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i += 1;
			j -= 1;
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		if(next_permutation(a)){
			for(int i=0; i<n; i++){
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}else{
			System.out.println("-1");
		}
	}
}
