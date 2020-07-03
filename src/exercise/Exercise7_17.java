package exercise;

abstract class UnitE7_17{
	int x, y;
	abstract void move(int x, int y);
	void stop(){}
}

class MarineE7_17 extends UnitE7_17{
	//int x, y;
	void move(int x, int y){}
	//void stop(){}
	void stimPack(){}
}

class TankE7_17 extends UnitE7_17{
	//int x, y;
	void move(int x, int y){}
	//void stop(){}
	void changeMode(){}
}

class DropshipE7_17 extends UnitE7_17{
	//int x, y;
	void move(int x, int y){}
	//void stop(){}
	void load(){}
	void unload(){}
}

class Exercise7_17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
