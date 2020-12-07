package exercise;

import java.util.Scanner;

public class Baek_14500_2_Re {
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
		int ans = 0;
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				a[i][j] = sc.nextInt();
			}
		} // 여기까지 모든 배열의 수를 입력받았다.
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				for(int k=0; k<19; k++){			// 모든 도형의 가짓수다
					boolean ok = true;
					int sum = a[i][j];
					for(int l=0; l<3; l++){
						int x = i+block[k][l][0];
						int y = j+block[k][l][1];
						if(x >=0 && x<n && y >=0 && y<m){
							sum += a[x][y];
						}else{
							ok = false;
							break;
						}
					}
					if(ok == true && sum>ans){
						ans=sum;
					}
					
				}
			}
		}
		
		System.out.println(ans);
	}

}
