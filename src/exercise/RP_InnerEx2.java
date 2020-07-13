package exercise;

class RP_InnerEx2 {
	class InstanceInner_RP102{}
	static class StaticInner_RP102{}
	
	InstanceInner_RP102 iv = new InstanceInner_RP102();
	
	static StaticInner_RP102 cv = new StaticInner_RP102();
	
	static void staticMethod(){
		// InstanceInner_RP102 obj1 = new InstanceInner_RP102();
		StaticInner_RP102 obj2 = new StaticInner_RP102();
		
		RP_InnerEx2 outer = new RP_InnerEx2();
		InstanceInner_RP102 obj1 = outer.new InstanceInner_RP102();
	}
	
	void instanceMethod(){
		InstanceInner_RP102 obj1 = new InstanceInner_RP102();
		StaticInner_RP102 obj2 = new StaticInner_RP102();
		//LocalInner_RP102 lv = new LocalInner_RP102();
	}
	
	void myMethod(){
		class LocalInner_RP102{}
		LocalInner_RP102 lv = new LocalInner_RP102();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
