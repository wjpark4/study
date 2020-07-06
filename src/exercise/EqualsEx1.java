package exercise;

class EqualsEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value91 v1 = new Value91(10);
		Value91 v2 = new Value91(10);
		
		if(v1.equals(v2)){
			System.out.println("v1과 v2는 같습니다.");
		}else{
			System.out.println("v1과 v2는 다릅니다.");
		}
		
		v2 = v1;
		
		if(v1.equals(v2)){
			System.out.println("v1과 v2는 같습니다.");
		}else{
			System.out.println("v1과 v2는 다릅니다.");
		}

	}
}

class Value91{
	int value;
	
	Value91(int value){
		this.value = value;
	}
}
