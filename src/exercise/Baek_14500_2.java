package exercise;

import java.util.Scanner;

public class Baek_14500_2 {
	static int[][][] block = {
			{{0, 1}, {0, 2}, {0, 3}},
			{{1, 0}, {2, 0}, {3, 0}},
			
			{{1, 0}, {1, 1}, {1, 2}},
			{{0, 1}, {1, 0}, {2, 0}},
			{{0, 1}, {0, 2}, {1, 2}},
			{{1, 0}, {2, 0}, {2, -1}},
			
			{{0, 1}, {0, 2}, {-1, 2}},
			{{1, 0}, {2, 0}, {2, 1}},
			{{0, 1}, {0, 2}, {1, 0}},
			{{0, 1}, {1, 1}, {2, 1}},
			
			{{0, 1}, {1, 0}, {1, 1}},
			
			{{0, 1}, {-1, 1}, {-1, 2}},
			{{1, 0}, {1, 1}, {2, 1}},
			
			{{0, 1}, {1, 1}, {1, 2}},
			{{1, 0}, {1, -1}, {2, -1}},
			
			{{0, 1}, {0, 2}, {-1, 1}},
			{{0, 1}, {0, 2}, {1, 1}},
			
			{{1, 0}, {2, 0}, {1, 1}},
			{{1, 0}, {2, 0}, {1, -1}}	
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				a[i][j] = sc.nextInt();
			}
		} // 행별로 입력받기
		
		int ans = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				for(int k=0; k<19; k++){
					boolean ok = true;
					int sum = a[i][j];
					for(int l=0; l<3; l++){			// 여까진 도형별로 네개의 블록값을 구해본다.
						int x = i+block[k][l][0];
						int y = j+block[k][l][1];
						if(x>=0 && x<n && y>=0 && y<m){
							sum += a[x][y];
						} else{
							ok = true;
							break;
						}
					}
					if(ok==true && ans<sum) ans= sum;
					
				}
			}
		} // 여기가 도형구하는 마지막 for문
		System.out.println(ans);
	}
}
