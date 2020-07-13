package exercise;

class RP_InnerEx1 {
	
	class InstanceInner_RP101{
		int iv=100;
		//static int cv = 100;
		final static int CONST=100;
	}
	
	static class StaticInner_RP101{
		int iv=200;
		static int cv=200;
	}
	
	void myMethod(){
		class LocalInner_RP101{
			int iv=300;
			//static int cv = 300;
			final static int CONST=300;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InstanceInner_RP101.CONST);
		System.out.println(StaticInner_RP101.cv);
	}
}
