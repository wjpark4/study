package exercise;

public class Exercise6_23 {
	static int max(int[] arr){
		int max=0;
		
		if( arr==null || arr.length==0){
			return -999999;
		}
		
		max=arr[0];
		for(int i=0; i<arr.length-1; i++){
			
			if(arr[i]<arr[i+1]){
				max = arr[i+1];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {}));

	}

}
