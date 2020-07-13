package exercise;

class InnerEx2 {
	
	class InstanceInner102 {}
	static class StaticInner102{}
	
	InstanceInner102 iv = new InstanceInner102();
	static StaticInner102 cv  = new StaticInner102();
	
	static void staticMethod(){
		//InstanceInner102 obj1 = new InstanceInner102();
		StaticInner102 obj2 = new StaticInner102();
		
		InnerEx2 outer = new InnerEx2();
		InstanceInner102 obj1 = outer.new InstanceInner102();
	}
	
	void instanceMethod(){
		InstanceInner102 obj1 = new InstanceInner102();
		StaticInner102 obj2 = new StaticInner102();
		
		// LocalInner102 lv = new LocalInner102();
	}
	
	void myMethod(){
		class LocalInner102 {}
		LocalInner102 lv = new LocalInner102();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
