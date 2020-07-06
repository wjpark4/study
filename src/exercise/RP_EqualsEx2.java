package exercise;


class RP92_Person{
	long id;
	
	public boolean equals(Object obj){
		if(obj!=null && obj instanceof RP92_Person){
			return id==((RP92_Person)obj).id;
		}else{
			return false;
		}
	}
	
	RP92_Person(long id){
		this.id=id;
	}
}

class RP_EqualsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP92_Person p1 = new RP92_Person(8011081111222L);
		RP92_Person p2 = new RP92_Person(8011081111222L);
		
		if(p1==p2){
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else{
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		if(p1.equals(p2)){
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else{
			System.out.println("p1과 p2는 다른 사람입니다.");
		}

	}

}
