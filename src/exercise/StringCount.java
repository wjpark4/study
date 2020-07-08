package exercise;

class StringCount {
	private int count;
	private String source = "";
	
	public StringCount(String source){
		this.source = source;
	}
	
	public int stringCount(String s){
		return stringCount(s, 0);
	}
	
	public int stringCount(String s, int pos){
		int index=0;
		if(s == null || s.length()==0) return 0;
		if((index=source.indexOf(s, pos)) != -1){
			count++;
			stringCount(s, index+s.length());
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbccAABBCCaa";
		System.out.println(str);
		StringCount sc = new StringCount(str);
		System.out.println("aa�� " + sc.stringCount("aa") + "�� ã�ҽ��ϴ�.");
	}
}
