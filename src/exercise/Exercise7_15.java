package exercise;

class Unit_715{}
class AirUnit_715 extends Unit_715{}
class GroundUnit_715 extends Unit_715{}
class Tank_715 extends GroundUnit_715{}
class AirCraft_715 extends AirUnit_715{}

class Exercise7_15 {
	public static void main(String[] args) {
		Unit_715 u = new GroundUnit_715();
		Tank_715 t = new Tank_715();
		AirCraft_715 ac = new AirCraft_715();
		
		t = (Tank_715) u;
	}
}
