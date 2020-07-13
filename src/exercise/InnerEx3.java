package exercise;

class InnerEx3 {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner103{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner103{
		//int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod(){
		int lv=0;
		final int LV=0;
		class LocalInner103{
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;
			int liv4 = LV;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
