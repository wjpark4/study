package exercise;

class RP723_FT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP723_Fighter f = new RP723_Fighter();
		
		if(f instanceof RP723_Unit){
			System.out.println("f는 Unit클래스의 자손입니다.");
		}
		if(f instanceof RP723_Fightable){
			System.out.println("f는 Fightable 인터페이스를 구현했습니다.");
		}
		if(f instanceof RP723_Movable){
			System.out.println("f는 Movable 인터페이스를 구현했습니다.");
		}
		if(f instanceof RP723_Attackable){
			System.out.println("f는 Attackable 인터페이스를 구현했습니다.");
		}
		if(f instanceof Object){
			System.out.println("f는 Object클래스의 자손입니다.");
		}

	}
}

class RP723_Fighter extends RP723_Unit implements RP723_Fightable{
	public void move(int x, int y){ }
	public void attack(RP723_Unit u) {}
}

class RP723_Unit{
	int currentHP;
	int x;
	int y;
}

interface RP723_Fightable extends RP723_Movable, RP723_Attackable{}
interface RP723_Movable {void move(int x, int y);}
interface RP723_Attackable {void attack(RP723_Unit u);}