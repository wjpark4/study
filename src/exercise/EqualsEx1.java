package exercise;

class EqualsEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value91 v1 = new Value91(10);
		Value91 v2 = new Value91(10);
		
		if(v1.equals(v2)){
			System.out.println("v1�� v2�� �����ϴ�.");
		}else{
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}
		
		v2 = v1;
		
		if(v1.equals(v2)){
			System.out.println("v1�� v2�� �����ϴ�.");
		}else{
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}

	}
}

class Value91{
	int value;
	
	Value91(int value){
		this.value = value;
	}
}
