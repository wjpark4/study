package exercise;

class RP723_FT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP723_Fighter f = new RP723_Fighter();
		
		if(f instanceof RP723_Unit){
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		}
		if(f instanceof RP723_Fightable){
			System.out.println("f�� Fightable �������̽��� �����߽��ϴ�.");
		}
		if(f instanceof RP723_Movable){
			System.out.println("f�� Movable �������̽��� �����߽��ϴ�.");
		}
		if(f instanceof RP723_Attackable){
			System.out.println("f�� Attackable �������̽��� �����߽��ϴ�.");
		}
		if(f instanceof Object){
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
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