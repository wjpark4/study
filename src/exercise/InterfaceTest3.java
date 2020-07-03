package exercise;

class InterfaceTest3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_728 a = new A_728();
		a.methodA();

	}
}

class A_728{
	void methodA(){
		I_728 i = InstanceManager_728.getInstance();
		i.methodB();
	}
}

interface I_728{
	public abstract void methodB();
}

class B_728 implements I_728{
	public void methodB(){
		System.out.println("methodB in B class");
	}
}

class InstanceManager_728{
	public static I_728 getInstance(){
		return new B_728();
	}
}
