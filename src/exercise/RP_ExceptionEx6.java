package exercise;

class RP_ExceptionEx6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Exception e = new Exception("���Ƿ� �߻��������ϴ�.");
			throw e;
			//throw new Exception("���Ƿ� �߻�~~");
		}catch(Exception e){
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("���α׷��� ���� ����Ǿ���.");
	}
}
