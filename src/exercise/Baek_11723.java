package exercise;

import java.io.*;

public class Baek_11723 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = 20;
		int m = Integer.valueOf(bf.readLine());
		int s = 0;
		StringBuilder sb = new StringBuilder();
		
		while(m-- > 0){
			String[] Line = bf.readLine().split(" ");
			if(Line[0].equals("add")){
				int x = Integer.valueOf(Line[1]) -1;
				s = s | (1 << x);
			}else if(Line[0].equals("remove")){
				int x = Integer.valueOf(Line[1]) -1;
				s = s & ~(1 << x);
			}else if(Line[0].equals("check")){
				int x = Integer.valueOf(Line[1]) -1;
				int res = s & (1 << x);
				if(res == 0){
					sb.append("0\n");
				}else{
					sb.append("1\n");
				}
			}else if(Line[0].equals("toggle")){
				int x = Integer.valueOf(Line[1]) -1;
				s = s ^ (1 << x);
			}else if(Line[0].equals("all")){
				s = (1 << n) -1;
			}else if(Line[0].equals("empty")){
				s = 0;
			}
		}
		System.out.println(sb);
	}
}
