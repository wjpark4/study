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
		
		System.out.println("p1�� ��ǰ��ȣ (serial no)�� " + p1.serialNo);
		System.out.println("p2�� ��ǰ��ȣ (serial no)�� " + p2.serialNo);
		System.out.println("p3�� ��ǰ��ȣ (serial no)�� " + p3.serialNo);
		
		System.out.println("����� ��ǰ�� ���� ��� " + Ch6_TestProduct.count + "�� �Դϴ�.");
		

	}

}
