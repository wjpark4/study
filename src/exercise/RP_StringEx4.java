package exercise;

class RP_StringEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {new String("aaa"), new String("bbb"), new String("ccc")};
		for(int i=0; i<words.length; i++){
			if(words[i].equals("ccc")){
				System.out.println("words���� equals�޼���� ã�ҽ��ϴ�.");
			}
			if(words[i] == "ccc"){
				System.out.println("words���� ==�����ڷ� ã�ҽ��ϴ�.");
			}
		}
		
		for(int i=0; i<words.length; i++){
			words[i]=words[i].intern();
		}
		
		System.out.println("<< String �迭 words�� ���ڿ��� intern�޼��带" + " ������ �� >>");
		for(int i=0; i<words.length; i++){
			if(words[i].equals("ccc")){
				System.out.println("words���� equals�޼���� ã�ҽ��ϴ�.");
			}
			if(words[i] == "ccc"){
				System.out.println("words���� ==�����ڷ� ã�ҽ��ϴ�.");
			}
		}
		
	}
}
