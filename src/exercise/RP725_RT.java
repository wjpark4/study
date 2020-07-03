package exercise;

class RP725_RT {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP725_Tank tank = new RP725_Tank();
		RP725_Dropship dropship = new RP725_Dropship();
		RP725_Marine marine = new RP725_Marine();
		RP725_SCV scv = new RP725_SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		// scv.repair(marine);
	}
}

interface RP725_Repairable {}
class RP725_GroundUnit extends RP725_Unit{
	RP725_GroundUnit(int hp){
		super(hp);
	}
}

class RP725_AirUnit extends RP725_Unit{
	RP725_AirUnit(int hp){
		super(hp);
	}
}

class RP725_Unit{
	int hitPoint;
	final int MAX_HP;
	RP725_Unit(int hp){
		MAX_HP = hp;
	}
}


class RP725_Tank extends RP725_GroundUnit implements RP725_Repairable{
	RP725_Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
}

class RP725_Dropship extends RP725_AirUnit implements RP725_Repairable{
	RP725_Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}
}

class RP725_Marine extends RP725_GroundUnit{
	RP725_Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}

class RP725_SCV extends RP725_GroundUnit implements RP725_Repairable{
	RP725_SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(RP725_Repairable r){
		if(r instanceof RP725_Unit){
			RP725_Unit u = (RP725_Unit) r;
			while(u.hitPoint != u.MAX_HP){
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
		
	}
}
