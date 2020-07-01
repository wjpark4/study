package exercise;

class FighterTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter723 f = new Fighter723();
		
		if(f instanceof Unit723){
			System.out.println("f�� Unit class�� �ڼ��Դϴ�.");
		}
		if(f instanceof Fightable723){
			System.out.println("f�� Fightable �������̽��� �����߽��ϴ�.");
		}
		if(f instanceof Movable723){
			System.out.println("f�� Movable �������̽��� �����߽��ϴ�.");
		}
		if(f instanceof Object){
			System.out.println("f�� Object Ŭ������ �ڼ��̴�.");
		}

	}
}

class Fighter723 extends Unit723 implements Fightable723{
	public void move(int x, int y){ /* ���� ���� */}
	public void attack(Unit723 u) { /* ���� ���� */ }
}

class Unit723{
	int currentHP;
	int x;
	int y;
}

interface Fightable723 extends Movable723, Attackable723{}
interface Movable723{ void move(int x, int y); }
interface Attackable723{ void attack(Unit723 u); }
