package exercise;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

class ScannerEx4 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Score1161 score = new Score1161();
		Scanner sc = new Scanner(new File("scoreData.txt"));
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			
			score.add(sc2.next(), sc2.next(), sc2.nextInt(), sc2.nextInt(), sc2.nextInt());
		}
		score.displayList();
	}
}

class Score1161{
	ArrayList record = new ArrayList();
	
	int koreanTotal = 0;
	int mathTotal = 0;
	int englishTotal = 0;
	
	void add(String name, String studentNo, int koreanScore, int mathScore, int englishScore){
		Student1161 s = new Student1161(name, studentNo, koreanScore, mathScore, englishScore);
		
		record.add(s);
		koreanTotal += s.koreanScore;
		mathTotal += s.mathScore;
		englishTotal += s.englishScore;
	}
	
	int getSubjectTotal(){
		return koreanTotal + mathTotal + englishTotal;
		
	}
	void displayList(){
		if(record.size() == 0){
			System.out.println("ǥ���� �����Ͱ� �����ϴ�.");
			return;
		}
		System.out.println("�̸�   ��ȣ   ����   ����   ����    ����");
		System.out.println("=================================");
		
		for(int i=0; i<record.size(); i++)
			System.out.println((Student1161)record.get(i));
		
		System.out.println("=================================");
		System.out.println(Student1161.format(""
				+ record.size(), 2, Student1161.RIGHT) + "�� ���� : "
				+ Student1161.format(""+koreanTotal, 5, Student1161.RIGHT)
				+ Student1161.format(""+mathTotal, 6, Student1161.RIGHT)
				+ Student1161.format(""+englishTotal, 6, Student1161.RIGHT)
				+ Student1161.format(""+getSubjectTotal(), 8, Student1161.RIGHT)
				);
	}
}

class Student1161{
	final static int LEFT = 0;
	final static int CENTER = 1;
	final static int RIGHT = 2;
	
	String name = "";
	String studentNo = "";
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;
	
	Student1161(String name, String studentNo, int koreanScore, int mathScore, int englishScore){
		this.name = name;
		this.studentNo = studentNo;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}
	
	int getTotal(){
		return koreanScore + mathScore + englishScore;
	}
	
	public String toString(){
		return format(name, 4, LEFT)
				+ format(studentNo, 4, RIGHT)
				+ format(""+koreanScore, 6, RIGHT)
				+ format(""+mathScore, 6, RIGHT)
				+ format(""+englishScore, 6, RIGHT)
				+ format(""+getTotal(), 8, RIGHT);
	}
	
	static String format(String str, int length, int alignment){
		int diff = length - str.length();
		if(diff < 0) return str.substring(0, length);
		
		char[] source = str.toCharArray();
		char[] result = new char[length];
		// �迭 result�� �������� ä���.
		for(int i=0; i<result.length; i++)
			result[i] = ' ';
		
		switch(alignment){
			case CENTER :
				System.arraycopy(source, 0, result, diff/2, source.length);
				break;
			case RIGHT :
				System.arraycopy(source, 0, result, diff, source.length);
			case LEFT : 
			default:
				System.arraycopy(source, 0, result, 0, source.length);
		}
		return new String(result);
	}
	
}


