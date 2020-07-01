package exercise;

class FighterTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter723 f = new Fighter723();
		
		if(f instanceof Unit723){
			System.out.println("f는 Unit class의 자손입니다.");
		}
		if(f instanceof Fightable723){
			System.out.println("f는 Fightable 인터페이스를 구현했습니다.");
		}
		if(f instanceof Movable723){
			System.out.println("f는 Movable 인터페이스를 구현했습니다.");
		}
		if(f instanceof Object){
			System.out.println("f는 Object 클래스의 자손이다.");
		}

	}
}

class Fighter723 extends Unit723 implements Fightable723{
	public void move(int x, int y){ /* 내용 생략 */}
	public void attack(Unit723 u) { /* 내용 생략 */ }
}

class Unit723{
	int currentHP;
	int x;
	int y;
}

interface Fightable723 extends Movable723, Attackable723{}
interface Movable723{ void move(int x, int y); }
interface Attackable723{ void attack(Unit723 u); }
