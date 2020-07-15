package exercise;

//import java.awt.List;
import java.util.*;
class ArrayListEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 10;					// 자르고자 하는 글자의 개수
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10);	// 자른 글자를 담을 공간을 여유있게 잡는다
		
		for(int i=0; i<length; i+=LIMIT){				// i가 source문장의 범위만 안넘어가면
			if(i+LIMIT < length)						// LIMIT까지의 범위가 source문장 범위만 안넘어가면
				list.add(source.substring(i, i+LIMIT));	// 새로만든 리스트에 i부터 10개씩 추가한다.
			else
				list.add(source.substring(i));			// 넘어가면 i부터 끝까지 추가한다.
		}
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}
