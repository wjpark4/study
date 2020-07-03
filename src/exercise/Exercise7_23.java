package exercise;

class Exercise7_23 {
	static double sumArea(Shape_E722[] arr){
		double sum=0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i].calcArea();
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape_E722[] arr = {new Circle_E722(5.0) , new Rectangle_E722(3,4), new Circle_E722(1)};
		System.out.println("면적의 합 : " + sumArea(arr));
	}
}
