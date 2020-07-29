package exercise;

import java.util.*;

class RP_ScannerEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);				// Scanner(InputStream source)
		String input = "";
		do{
			System.out.println("원하는 값을 입력하세요. 입력을 마치려면 Q를 입력하세요. ->");
			// 입력한 값을 라인 단위로 읽어 온다.
			input = scan.nextLine();
			System.out.println("입력하신 값은 " + input + "입니다.");
		}while(!input.equalsIgnoreCase("Q"));
		
		System.out.println("프로그램을 종료합니다.");
	}
}
