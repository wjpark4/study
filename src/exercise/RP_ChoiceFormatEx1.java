package exercise;

import java.util.*;
import java.text.*;

class RP_ChoiceFormatEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] limits = {60, 70, 80, 90};
		//limits, grades간의 순서와 개수를 맞추어야 한다.
		String[] grades = {"D", "C", "B", "A"};
		
		int[] scores = {100, 95, 88, 70, 52, 60, 70};
		
		ChoiceFormat form = new ChoiceFormat(limits, grades);
		
		for(int i=0; i<scores.length; i++){
			System.out.println(scores[i] + " : " + form.format(scores[i]));
		}
	}
}
