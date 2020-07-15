package exercise;

import java.util.*;

class VectorEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(5);								// 용량이 5인 Vector를 생성한다.
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);												// [1, 2, 3] size : 3 capacity : 5
		
		v.trimToSize();											// 빈 공간을 없앤다. (용량과 크기가 같아진다.)
		System.out.println("=== After trimToSize() ===");
		print(v);												// [1, 2, 3] size : 3 capacity : 3
		
		v.ensureCapacity(6);									// 용량을 6으로 눌리면서 앞으로 늘어날 용량단위도 6으로 한다.?
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);												// [1, 2, 3] size : 3 capacity : 6
		
		v.setSize(7);
		System.out.println("=== After setSize(7) ===");
		print(v);												// [1, 2, 3, null, null, null, null] size : 7 capacity : 12
		
		v.clear();
		System.out.println("=== After clear() ===");
		print(v);												// [] size : 0 capacity : 12
		
	}
	
	public static void print(Vector v){
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
	}
}
