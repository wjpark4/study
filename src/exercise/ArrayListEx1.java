package exercise;

import java.util.*;

class ArrayListEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
																// list1 = {5, 4, 2, 0, 1, 3}
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); 	// list2 = {4, 2, 0}인가
		print(list1, list2);
		
		Collections.sort(list1);								// list1과 list2를 정렬한다. 오름차순 list1 = {0, 1, 2, 3, 4, 5}
		Collections.sort(list2);								// Collections.sort(List l)   list2 = {0, 2, 4}
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));	// list1에 list2의 모든객체가 포함되어 있는가?	true
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");										// list2 = {0, 2, 4, "A" ,"B", "C"}
		print(list1, list2);									// list1 = {0, 1, 2, 3, 4, 5}
		
		list2.set(3, "AA");										// list2 = {0, 2, 4, "AA" ,"B", "C"}
		print(list1, list2);									// list1 = {0, 1, 2, 3, 4, 5}
		
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));	// false -> true래
		print(list1, list2);									// list1 = {0, 2, 4}
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i=list2.size()-1; i>=0; i--){										// i는 list마지막에서 부터 앞으로 하나씩
			if(list1.contains(list2.get(i)))										// list1에 list2의 순서에서 같은 객체가 있으면 list2에서 지우자
				list2.remove(i);
		}
		print(list1, list2);									// list2 = {2, 4, "AA", "B", "C"}
		
		
	}
	
	static void print(ArrayList list1, ArrayList list2){
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
