package exercise;

class ExceptionEx20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			method1();
		} catch(Exception e){
			System.out.println("main�޼��忡�� ���ܰ� ó���Ǿ���.");
			e.printStackTrace();
		}
	}
	
	static void method1() throws Exception{
		throw new Exception();
	}
}