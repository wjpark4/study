package exercise;

import javax.swing.JOptionPane;

class RP_ThreadEx6 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���. ");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		
		for(int i=10; i>0; i--){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}
