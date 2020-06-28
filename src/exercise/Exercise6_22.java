package exercise;

class Exercise6_22 {
	static boolean isNumber(String str){
		boolean result=false;
		if(str.equals("") || str==null){
			 result = false;
		} else {
			for(int i=0; i<str.length(); i++){
				if(str.charAt(i) >= '0' && str.charAt(i) <='9'){
					result = true;
					
				} else{
					result = false;
					break;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

	}

}
