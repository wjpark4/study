package exercise;

class Exercise7_18 {
	
	static void action(RobotE718 r){
		if( r instanceof DanceRobotE718){
			DanceRobotE718 dr = (DanceRobotE718)r;
			dr.dance();
			//((DanceRobotE718) r).dance();
		} else if( r instanceof SingRobotE718){
			SingRobotE718 sr = (SingRobotE718) r;
			sr.sing();
			//((SingRobotE718) r).sing();
		} else if( r instanceof DrawRobotE718){
			DrawRobotE718 dr = (DrawRobotE718) r;
			dr.draw();
			//((DrawRobotE718) r).draw();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobotE718[] arr = {new DanceRobotE718(), new SingRobotE718(), new DrawRobotE718()};
		
		for(int i=0; i<arr.length; i++)
			action(arr[i]);
	}
}

class RobotE718{}

class DanceRobotE718 extends RobotE718{
	void dance(){
		System.out.println("춤을 춥니다.");
	}
}

class SingRobotE718 extends RobotE718{
	void sing(){
		System.out.println("노래를 합니다.");
	}
}

class DrawRobotE718 extends RobotE718{
	void draw(){
		System.out.println("그림을 그립니다.");
	}
}
