package exercise;

class Exercise9_10 {
	
	static String format(String str, int length, int alignment){
		int diff = length-str.length();
		if(length < str.length()){
			return str.substring(0, length);
		}
			
		char[]source = str.toCharArray();
		char[]result = new char[length];
			
		switch(alignment){
			case 0:
				System.arraycopy(source, 0, result, 0, source.length);
				break;
			case 1:
				System.arraycopy(source, 0, result, diff/2, source.length);
				break;
			case 2:
				System.arraycopy(source, 0, result, diff, source.length);
				break;
		}
			
		
		return new String(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "°¡³ª´Ù";
		
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
	}
}
