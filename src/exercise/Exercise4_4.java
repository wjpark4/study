package exercise;

public class Exercise4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int sum = 0;
		while(sum <100){
			++i;
			if(i%2 ==0)
				sum +=-i;
			else
				sum +=i;
			//i++;
		}
		System.out.println("몇 이상이 되어야 100이상이 되는가? " + i);

	}

}
