package exercise;

class ParentE_77{
	int x=100;
	
	ParentE_77(){
		this(200);
	}
	
	ParentE_77(int x){
		this.x = x;
	}
	
	int getX(){
		return x;
	}
}

class ChildE_77 extends ParentE_77{
	int x = 3000;
	
	ChildE_77(){
		this(1000);
	}
	
	ChildE_77(int x){
		this.x = x;
	}
}


class Exercise7_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildE_77 c = new ChildE_77();
		
		System.out.println("x="+c.getX());
	}
}
