package exercise;

class RP97_Exercise9_7 {
	
	static boolean contains(String src, String target){
		return src.indexOf(target)!=-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));

	}
}
