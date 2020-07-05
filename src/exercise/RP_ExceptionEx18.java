package exercise;

class RP_ExceptionEx18 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try{
			method1();
		} catch(Exception e){
			System.out.println("¤¾¤·");
		}
		//method1();
	}
	
	static void method1() throws Exception{
		method2();
	}
	
	static void method2() throws Exception{
		throw new Exception();
	}

}
