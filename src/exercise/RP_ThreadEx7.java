package exercise;

import javax.swing.JOptionPane;

class RP_ThreadEx7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP_ThreadEx7_1 th1 = new RP_ThreadEx7_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
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