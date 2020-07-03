package exercise;

class RP_728 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_RP728 a = new A_RP728();
		a.methodA();
	}
}

class A_RP728{
	void methodA(){
		I_RP728 i = InstanceManager_RP728.getInstance();
		i.methodB();
	}
}

interface I_RP728{
	public abstract void methodB();
}

class B_RP728 implements I_RP728{
	public void methodB(){
		System.out.println("methodB in B class");
	}
}

class InstanceManager_RP728{
	public static I_RP728 getInstance(){
		return new B_RP728();
	}
}
