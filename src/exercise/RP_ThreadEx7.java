package exercise;

import javax.swing.JOptionPane;

class RP_ThreadEx7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP_ThreadEx7_1 th1 = new RP_ThreadEx7_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
	}
}

class RP_ThreadEx7_1 extends Thread{
	public void run(){
		for(int i=10; i>0; i--){
			System.out.println(i);
			try{
				sleep(1000);
			}catch(Exception e){}
		}
	}
}