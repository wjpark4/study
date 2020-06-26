package exercise;

class Ch6_TestProduct{
	static int count=0;
	int serialNo;
	{
		++count;
		serialNo = count;
	}
	
	//public Ch6_TestProduct() {}
}


class Ch6_ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch6_TestProduct p1 = new Ch6_TestProduct();
		Ch6_TestProduct p2 = new Ch6_TestProduct();
		Ch6_TestProduct p3 = new Ch6_TestProduct();
		
		System.out.println("p1의 제품번호 (serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호 (serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호 (serial no)는 " + p3.serialNo);
		
		System.out.println("생산된 제품의 수는 모두 " + Ch6_TestProduct.count + "개 입니다.");
		

	}

}
