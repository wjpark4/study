package exercise;

class Outer104{
	class InstanceInner104{
		int iv=100;
		
	}
	
	static class StaticInner104{
		int iv=200;
		static int cv=300;
	}
	
	void myMethod(){
		class LocalInner104{
			int iv=400;
		}
	}
}

class InnerEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer104 oc = new Outer104();
		Outer104.InstanceInner104 ii = oc.new InstanceInner104();
		
		System.out.println("ii.iv : " + ii.iv);
		System.out.println("Outer.StaticInner.cv : " + Outer104.StaticInner104.cv);
		
		Outer104.StaticInner104 si = new Outer104.StaticInner104();
		System.out.println("si.iv : " + si.iv);
	}
}
