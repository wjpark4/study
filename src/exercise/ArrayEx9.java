package exercise;

public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "SOSHELP";
		String[] morse = { ".-", "-...", "-.-.", "-..", "."
							, "..-.", "--.", "....", "..", ".---"
							, "-.-", ".-..", "--", "-.", "---"
							, ".--.", "--.-", ".-.", "...", "-"
							, "..-", "...-", ".--", "-..-", "-.--"
							, "--.."};
		
		String result="";
		
		for(int i=0; i<source.length(); i++){
			result += morse[source.charAt(i)-'A'];
		}
		System.out.println("source:" + source);
		System.out.println("morse:" + result);

	}

}
