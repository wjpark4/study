package exercise;

import java.io.*;
import java.util.*;

class RP_Exercise11_20 {
	static ArrayList record = new ArrayList();		// ���������͸� ������ ����
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			switch(displayMenu()){
				case 1:
					inputRecord();
					break;
				case 2: 
					displayRecord();
					break;
				case 3:
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
			}
		}
	}
	
	// menu�� �����ִ� �޼���
	static int displayMenu(){
		System.out.println("************************************************************");
		System.out.println("*                   ���� ���� ���α׷�                                                              *");
		System.out.println("************************************************************");
		System.out.println();
		System.out.println("1. �л����� �Է��ϱ�");
		System.out.println();
		System.out.println("2. �л����� ����");
		System.out.println();
		System.out.println("3. ���α׷� ����");
		System.out.println();
		System.out.print("���ϴ� �޴��� �����ϼ���. (1~3) : ");
		
		int menu = 0;
		
		// ���� 1
		do{
			try{
				menu = Integer.parseInt(s.nextLine().trim());
				if(menu >= 1 && menu <=3){
					break;
				}else{
					throw new Exception();
				}
			}catch(Exception e){
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			System.out.println("���ϴ� �޴��� �����ϼ���. (1~3) : ");
		}while(true);
		
		return menu;
	}	// public static int displayMenu(){
	
	// �����͸� �Է¹޴� �޼���
	static void inputRecord(){
		System.out.println("1. �л����� �Է��ϱ�");
		System.out.println("�̸�, ��, ��ȣ, �����, �����, ���м���'�� ������ ������� �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
		
		while(true){
			System.out.print(">>");
			// ���� 2
			
			try{
				String input = s.nextLine().trim();
				
				if(!input.equalsIgnoreCase("q")){
					Scanner s2 = new Scanner(input).useDelimiter(",");
					record.add(new RP1120_Student(s2.next(), s2.nextInt(), s2.nextInt(),
							s2.nextInt(), s2.nextInt(), s2.nextInt()));
					System.out.println("�� �ԷµǾ����ϴ�. �Է��� ��ġ���� q�� �Է��ϼ���");
					
					
				}else{
					return;
				}
			}catch(Exception e){
				System.out.println("�Է¿����Դϴ�. �̸�, ��, ��ȣ, �����, �����, ���м����� ������ �Է��ϼ���.");
			}
			
			
		} // while��
	} // inputRecord�޼��� ��
	
	// ������ ����� �����ִ� �޼���
	static void displayRecord(){
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		
		int length = record.size();
		
		if(length > 0){
			System.out.println();
			System.out.println("�̸� �� ��ȣ ���� ���� ���� ���� ��� ������� �ݵ��");
			System.out.println("=================================================");
			for(int i=0; i<length; i++){
				RP1120_Student student = (RP1120_Student) record.get(i);
				System.out.println(student);
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal += student.eng;
				total += student.total;
			}
			
			System.out.println("=================================================");
			System.out.println("���� : " + koreanTotal + " " + englishTotal + " " + mathTotal + " " + total);
			System.out.println();
		}else{
			System.out.println("=================================================");
			System.out.println("�����Ͱ� �����ϴ�.");
			System.out.println("=================================================");
		}
	}
	
}// exercise Ŭ����

class RP1120_Student implements Comparable{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	int schoolRank;
	int classRank;			// �ݵ��
	
	RP1120_Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor+eng+math;
	}
	
	int getTotal(){
		return total;
	}
	
	float getAverage(){
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	
	public int compareTo(Object o){
		if(o instanceof RP1120_Student){
			RP1120_Student tmp = (RP1120_Student)o;
			return tmp.total - this.total;
			
		}else{
			return -1;
		}
	}
	
	public String toString(){
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage()
				+","+schoolRank
				+","+classRank;
	}
}