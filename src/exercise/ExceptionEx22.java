package exercise;

import java.io.File;

class ExceptionEx22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File f = createFile(args[0]);
			System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
		} catch(Exception e){
			System.out.println(e.getMessage() + "�ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		}
	}
	
	static File createFile(String fileName) throws Exception{
		if(fileName==null || fileName.equals(""))
			throw new Exception("�����̸��� �������� �ʴ�.");
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}
}