package exercise;


class Outer_RP104{
	class InstanceInner_RP104{
		int iv=100;
	}
	
	static class StaticInner_RP104{
		int iv=200;
		static int cv=300;
	}
	
	void myMethod(){
		class LocalInner_RP104{
			int iv=400;
		}
	}
}

class RP_InnerEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer_RP104 oc = new Outer_RP104();
		Outer_RP104.InstanceInner_RP104 ii = oc.new InstanceInner_RP104();
		
		System.out.println("ii.iv : " + ii.iv);
		System.out.println("Outer.StaticInner.cv : " + Outer_RP104.StaticInner_RP104.cv);
		
		Outer_RP104.StaticInner_RP104 si = new Outer_RP104.StaticInner_RP104();
		System.out.println("si.iv : " + si.iv);
	}
}
