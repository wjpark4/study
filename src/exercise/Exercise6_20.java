package exercise;

class Exercise6_20 {
	
	static int[] shuffle(int[] arr){
		//if(arr==null || arr.length==0){
			//return arr;
		//}
		
		for(int i=0; i<arr.length; i++){
			int temp;
			int rvar=(int)(Math.random()*arr.length);
			temp=arr[i];
			arr[i]=arr[rvar];
			arr[rvar]=temp;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	}

}
