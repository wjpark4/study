package exercise;

import javax.swing.JOptionPane;

class RP_ThreadEx8 {
	static boolean inputCheck = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP_ThreadEx8_1 th1 = new RP_ThreadEx8_1();
		RP_ThreadEx8_2 th2 = new RP_ThreadEx8_2();
		th1.start();
		th2.start();

	}
}

class RP_ThreadEx8_1 extends Thread{
	public void run(){
		System.out.println("10�� �ȿ� ���� �Է��ؾ� �մϴ�.");
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		RP_ThreadEx8.inputCheck = true;
		System.out.println("�Է°��� " + input + "�Դϴ�.");
	}
}

class RP_ThreadEx8_2 extends Thread{
	public void run(){
		for(int i=9; i>=0; i--){
			if(RP_ThreadEx8.inputCheck) return;
			System.out.println(i);
			
			try{
				sleep(1000);
			}catch(InterruptedException e){}
		}
		System.out.println("10�� ���� ���� �Էµ��� �ʾ� �����մϴ�.");
		System.exit(0);
	}
}