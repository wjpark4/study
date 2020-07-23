package exercise;

import java.util.*;

class RP_TreeMapEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		
		TreeMap map = new TreeMap();
		
		for(int i=0; i<data.length; i++){
			if(map.containsKey(data[i])){
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1));
			}else{
				map.put(data[i], new Integer(1));
			}
		}
		Iterator it = map.entrySet().iterator();
		
		System.out.println("= �⺻���� =");
		while(it.hasNext()){
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
		System.out.println();
		
		Set set = map.entrySet();
		List list = new ArrayList(set);		// ArrayList(Collection c)
		
		// static void sort(List list, Comparator c)
		Collections.sort(list, new ValueComparator_1134());
		
		it = list.iterator();
		
		System.out.println("= ���� ũ�Ⱑ ū ������ ���� =");
		
		while(it.hasNext()){
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
		

	}


static class ValueComparator_1134 implements Comparator{
	public int compare(Object o1, Object o2){
		if(o1 instanceof Map.Entry && o2 instanceof Map.Entry){
			Map.Entry e1 = (Map.Entry)o1;
			Map.Entry e2 = (Map.Entry)o2;
			
			int v1 = ((Integer)e1.getValue()).intValue();
			int v2 = ((Integer)e2.getValue()).intValue();
			
			return v2 - v1;
		}
		return -1;
	}
}
	public static String printBar(char ch, int value){
		char[] bar = new char[value];
		
		for(int i=0; i<bar.length; i++){
			bar[i] = ch;
		}
		return new String(bar);
	}
}
