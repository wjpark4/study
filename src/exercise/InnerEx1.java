package exercise;

class InnerEx1 {
	
	class InstanceInner101{
		int iv=100;
		//static int cv=100;
		final static int CONST = 100;
	}
	
	static class StaticInner101{
		int iv=200;
		static int cv=200;
	}
	
	void myMethod(){
		class LocalInner101{
			int iv=300;
			//static int cv=300;
			final static int CONST=300;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InstanceInner101.CONST);
		System.out.println(StaticInner101.cv);
	}
}
