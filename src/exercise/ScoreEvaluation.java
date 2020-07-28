package exercise;

import java.util.*;

class ScoreEvaluation {
	static ArrayList record = new ArrayList();
	static Scanner s = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			switch(displayMenu()){
				case 1: 
					inputRecord();
					break;
				case 2:
					deleteRecord();
					break;
				case 3:
					sortRecord();
					break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			}
		}
	}
	
	
	// 메뉴를 보여주는 메서드
	static int displayMenu(){
		System.out.println("******************************************************");
		System.out.println("*            성적 관리 프로그램                                                                *");
		System.out.println("*                 version 1.0                        *");
		System.out.println("*            excerpt from Java                       *");
		System.out.println("******************************************************");
		System.out.println();
		System.out.println();
		System.out.println(" 1. 학생성적 입력하기 ");
		System.out.println();
		System.out.println(" 2. 학생성적 삭제하기 ");
		System.out.println();
		System.out.println(" 3. 학생성적 정렬하여보기(이름순, 성적순)");
		System.out.println();
		System.out.println(" 4. 프로그램 종료");
		System.out.println();
		System.out.println();
		System.out.print("원하는 메뉴를 선택하세요.(1~4)");
		
		int menu = 0;
		
		do{
			try{
			menu = Integer.parseInt(s.nextLine().trim());
			if(menu >= 1 && menu <= 4){
				break;
			}else{
				throw new Exception();
			}
		}catch(Exception e){
			System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요.");
			System.out.print("원하는 메뉴를 선택하세요.(1~4)");
		}
	}while(true);
	return menu;
}
	static void inputRecord(){
		System.out.println("1. 학생성적 입력하기");
		System.out.println("이름, 학번, 국어성적, 영어성적, 수학성적'의 순서로 공백없이 입력하세요.");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
		
		while(true){
			System.out.print(">>");
			
			try{
				String input = s.nextLine().trim();
				
				if(!input.equalsIgnoreCase("q")){
					Scanner s2 = new Scanner(input).useDelimiter(",");
					
					record.add(new Student1162(s2.next(), s2.next(), s2.nextInt(), s2.nextInt(), s2.nextInt()));
					System.out.println("잘입력되었습니다. 입력을 마치려면 q를 입력하세요.");
				}else{
					return;
				}
			}catch(Exception e){
				System.out.println("입력오류입니다. 이름, 학번, 국어성적, 영어성적" + ", 수학성적'의 순서로 입력하세요.");
			}
		}
	}
	
	// 데이터를 삭제하는 메서드
	static void deleteRecord(){
		while(true){
			displayRecord();
			System.out.println("삭제하고자 하는 데이터의 학번을 입력하세요. (q: 메인화면)");
			System.out.println(">>");
			
			try{
				String input = s.nextLine().trim();
				
				if(!input.equalsIgnoreCase("q")){
					int length = record.size();
					boolean found = false;
					
					for(int i=0; i<length; i++){
						Student1162 student = (Student1162)record.get(i);
						if(input.equals(student.studentNo)){
							found = true;
							record.remove(i);
						}
					} // for(int i=0; i<length; i++)
					
					if(found){
						System.out.println("삭제되었습니다.");
					}else{
						System.out.println("일치하는 데이터가 없습니다.");
					}
				}else{
					return;
				}
			} catch(Exception e){
				System.out.println("입력오류입니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 데이터를 정렬하는 메서드
	static void sortRecord(){
		while(true){
			System.out.print(" 정렬기준을 선택하세요. (1:이름순 2:총점순 3:메인메뉴) : ");
			
			int sort = 0;
			
			do{
				try{
					sort = Integer.parseInt(s.nextLine());
					if(sort >= 1 && sort <=3){
						break;
					}else{
						throw new Exception();
					}
				}catch(Exception e){
					System.out.println("유효하지 않은 입력값입니다. 다시 입력해주세요.");
					System.out.print(" 정렬기준을 선택하세요. (1: 이름순 2: 총정순 3: 메인메뉴) : ");
				}
			}while(true);
			
			if(sort==1){
				Collections.sort(record, new NameAscending1162());
				displayRecord();
			}else if(sort==2){
				Collections.sort(record, new TotalDescending1162());
				displayRecord();
			}else{
				return;
			}
		} // while(true);
	}
	
	
	// 데이터 목록을 보여주는 메서드
	static void displayRecord(){
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		
		System.out.println();
		System.out.println("이름  번호  국어  영어  수학  총점  ");
		System.out.println("===================================");
		
		int length = record.size();
		
		if(length > 0){
			for(int i=0; i<length; i++){
				Student1162 student = (Student1162)record.get(i);
				System.out.println(student);
				koreanTotal += student.koreanScore;
				mathTotal += student.mathScore;
				englishTotal += student.englishScore;
				total += student.total;
			}
		} else{
			System.out.println();
			System.out.println(" 데이터가 없습니다.");
			System.out.println();
		}
		
		System.out.println("====================================");
		System.out.println("총점 : "
				+ Student1162.format(koreanTotal+"", 11, Student1162.RIGHT)
				+ Student1162.format(englishTotal+"", 6, Student1162.RIGHT)
				+ Student1162.format(mathTotal+"", 6, Student1162.RIGHT)
				+ Student1162.format(total+"", 8, Student1162.RIGHT));
		System.out.println();
	}
}

// 오름차순으로 정렬하는데 사용되는 클래스
class NameAscending1162 implements Comparator{
	public int compare(Object o1, Object o2){
		if(o1 instanceof Student1162 && o2 instanceof Student1162){
			Student1162 s1 = (Student1162)o1;
			Student1162 s2 = (Student1162)o2;
			
			return (s1.name).compareTo(s2.name);
		}
		return -1;
	}
}

class TotalDescending1162 implements Comparator{
	public int compare(Object o1, Object o2){
		if(o1 instanceof Student1162 && o2 instanceof Student1162){
			Student1162 s1 = (Student1162)o1;
			Student1162 s2 = (Student1162)o2;
			
			return (s1.total < s2.total)? 1: (s1.total == s2.total ? 0 : -1);
		}
		return -1;
	}
}

class Student1162 implements Comparable{
	final static int LEFT = 0;
	final static int CENTER = 1;
	final static int RIGHT = 2;
	
	String name="";
	String studentNo = "";
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;
	int total = 0;
	
	Student1162(String name, String studentNo, int koreanScore, int mathScore, int englishScore){
		this.name = name;
		this.studentNo = studentNo;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		total = koreanScore + mathScore + englishScore;
	}
	
	public String toString(){
		return format(name, 4, LEFT)
				+ format(studentNo, 4, RIGHT)
				+ format(""+koreanScore, 6, RIGHT)
				+ format(""+mathScore, 6, RIGHT)
				+ format(""+englishScore, 6, RIGHT)
				+ format(""+total, 8, RIGHT);
	}
	
	static String format(String str, int length, int alignment){
		int diff = length - str.length();
		if(diff < 0) return str.substring(0, length);
		
		char[] source = str.toCharArray();
		char[] result = new char[length];
		
		// 배열 result를 공백으로 채운다.
		for(int i=0; i<result.length; i++)
			result[i] = ' ';
		
		switch(alignment){
		case CENTER : 
			System.arraycopy(source, 0, result, diff/2, source.length);
			break;
		case RIGHT :
			System.arraycopy(source, 0, result, diff, source.length);
			break;
		case LEFT : 
			default:
				System.arraycopy(source, 0, result, 0, source.length);
		}
		return new String(result);
	}
	
	public int compareTo(Object obj){
		int result = -1;
		if(obj instanceof Student1162){
			Student1162 tmp = (Student1162)obj;
			result = (this.name).compareTo(tmp.name);
		}
		return result;
	}
	
}