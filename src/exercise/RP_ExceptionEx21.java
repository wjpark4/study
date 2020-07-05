package exercise;

import java.io.File;

class RP_ExceptionEx21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = createFile(args[0]);
		System.out.println(f.getName() + " ������ ���������� �����Ǿ����ϴ�.");
	}
	
	static File createFile(String fileName){
		try{
			if(fileName==null || fileName.equals(""))
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		}catch(Exception e){
			fileName = "�������.txt";
		}finally{
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}
	
	static void createNewFile(File f){
		try{
			f.createNewFile();
		}catch(Exception e){}
	}
}
