package exercise;

class RP910_Exercise9_10 {
	
	static String format(String str, int length, int alignment){
		int diff = length-str.length();
		if(diff < 0){
			return str.substring(0, length);
		}
		char[] source = str.toCharArray();
		char[] ch = new char[length];
		for(int i=0; i<length; i++){
			ch[i] = ' ';
		}	
		switch(alignment){
			case 0:
				System.arraycopy(source, 0, ch, 0, source.length);
				break;
			case 1:
				System.arraycopy(source, 0, ch, diff/2, source.length);
				break;
			case 2:
				System.arraycopy(source, 0, ch, diff, source.length);
				break;
		}
		return new String(ch);
		
	}
	
	public static void main(String[] args) {
		String str = "°¡³ª´Ù";
		
		System.out.println(format(str,7,0));
		System.out.println(format(str,7,1));
		System.out.println(format(str,7,2));

	}
}
