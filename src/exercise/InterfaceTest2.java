package exercise;

class A_727{
	void autoPlay(I_727 i){
		i.play();
	}
}

interface I_727{
	//public abstract void play();
	void play();
}

class B_727 implements I_727 {
	public void play(){
		System.out.println("play in B class");
	}
}

class C_727 implements I_727 {
	public void play(){
		System.out.println("play in C class");
	}
}

class InterfaceTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_727 a = new A_727();
		a.autoPlay(new B_727());
		a.autoPlay(new C_727());
	}

}
