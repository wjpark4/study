package exercise;

class Exercise6_19 {
	public static void change(String str){
		str += "456";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change: "+str);
	}

}
