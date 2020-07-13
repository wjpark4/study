package exercise;

class RP_InnerEx3 {

	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner_RP103{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner_RP103{
		//int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod(){
		int lv=0;
		final int LV = 0;
		
		class LocalInner_RP103{
			int liv = outerIv;
			int liv2 = outerCv;
			
			//int liv3 = lv;
			int liv4 = LV;
		}
	}
	
}
