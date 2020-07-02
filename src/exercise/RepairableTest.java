package exercise;

class RepairableTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank725 tank = new Tank725();
		Dropship725 dropship = new Dropship725();
		Marine725 marine = new Marine725();
		SCV725 scv = new SCV725();
		
		scv.repair(tank);
		scv.repair(dropship);
		//scv.repair(marine);
	}
}

interface Repairable725 {}
class GroundUnit725 extends Unit725{
	GroundUnit725(int hp){
		super(hp);
	}
}

class AirUnit725 extends Unit725{
	AirUnit725(int hp){
		super(hp);
	}
}

class Unit725{
	int hitPoint;
	final int MAX_HP;
	Unit725(int hp){
		MAX_HP = hp;
	}
}

class Tank725 extends GroundUnit725 implements Repairable725{
	Tank725(){
		super(180);
		hitPoint = MAX_HP;
	}
	
	public String toString(){
		return "Tank";
	}
}

class Dropship725 extends AirUnit725 implements Repairable725{
	Dropship725(){
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString(){
		return "Dropship";
	}
}

class Marine725 extends GroundUnit725{
	Marine725(){
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV725 extends GroundUnit725 implements Repairable725{
	SCV725(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable725 r){
		if(r instanceof Unit725){
			Unit725 u = (Unit725)r;
			while(u.hitPoint != u.MAX_HP){
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}	
	}
}

