package exercise;

class RP_EqualsEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP91_Value v1 = new RP91_Value(10);
		RP91_Value v2 = new RP91_Value(10);
		
		if(v1.equals(v2)){
			System.out.println("v1�� v2�� �����ϴ�.");
		}else{
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}
		
		v2=v1;
		if(v1.equals(v2)){
			System.out.println("v1�� v2�� �����ϴ�.");
		}else{
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}
	}
}

class RP91_Value{
	int value;
	
	RP91_Value(int value){
		this.value = value;
	}
}
