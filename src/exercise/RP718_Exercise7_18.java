package exercise;

class RP718_Exercise7_18 {
	
	static void action(RP718_Robot r){
		if(r instanceof RP718_DanceRobot){
			RP718_DanceRobot dr = (RP718_DanceRobot)r;
			dr.dance();
		} else if(r instanceof RP718_SingRobot){
			RP718_SingRobot sr = (RP718_SingRobot)r;
			sr.sing();
		} else if(r instanceof RP718_DrawRobot){
			RP718_DrawRobot dr = (RP718_DrawRobot)r;
			dr.draw();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP718_Robot[] arr = { new RP718_DanceRobot(), new RP718_SingRobot(), new RP718_DrawRobot()};
		
		for(int i=0; i<arr.length; i++){
			action(arr[i]);
		}
	}
}

class RP718_Robot{}

class RP718_DanceRobot extends RP718_Robot{
	void dance(){
		System.out.println("춤을 춥니다.");
	}
}

class RP718_SingRobot extends RP718_Robot{
	void sing(){
		System.out.println("노래를 합니다.");
	}
}

class RP718_DrawRobot extends RP718_Robot{
	void draw(){
		System.out.println("그림을 그립니다.");
	}
}