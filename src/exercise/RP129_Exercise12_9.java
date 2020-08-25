package exercise;

import java.util.*;

class RP129_Exercise12_9 {
	Vector words = new Vector();
	String[] data = {"�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī"};
	
	int interval = 2 * 1000;			// 2��
	
	RP129_WordGenerator wg = new RP129_WordGenerator();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP129_Exercise12_9 game = new RP129_Exercise12_9();
		
		game.wg.start();
		
		Vector words = game.words;
		
		while(true){
			System.out.println(words);
			String prompt = ">>";
			System.out.print(prompt);
			
			// ȭ�����κ��� ���δ����� �Է¹޴´�.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			
			int index = words.indexOf(input);
			
			if(index!= -1){
				words.remove(index);
			}
		}
	}
	
	class RP129_WordGenerator extends Thread{
		public void run(){
			while(true){
				int rand = (int)(Math.random() * data.length);
				words.add(data[rand]);
				
				try{
					Thread.sleep(interval);
				}catch(Exception e){}
			}
			
		}
	}
}

