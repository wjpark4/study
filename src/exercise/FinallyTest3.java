package exercise;

class FinallyTest3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyTest3.method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼���� ���ƿԽ��ϴ�.");
	}
	
	static void method1(){
		try{
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("method1()�� finally���� ����Ǿ���.");
		}
	}
}
