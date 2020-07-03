package exercise;

class A_RP727{
	void autoPlay(I_RP727 i){
		i.play();
	}
}

interface I_RP727{
	public abstract void play();
}

class B_RP727 implements I_RP727{
	public void play(){
		System.out.println("play in B class");
	}
}

class C_RP727 implements I_RP727{
	public void play(){
		System.out.println("play in C class");
	}
}

class RP_727 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_RP727 a = new A_RP727();
		a.autoPlay(new B_RP727());
		a.autoPlay(new C_RP727());
	}
}
