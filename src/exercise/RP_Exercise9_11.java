package exercise;

class RP_Exercise9_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int from =0;
		int to=0;
		
		try{
			if(args.length != 2)
				throw new Exception("���� �ܰ� �� ��, �� ���� ���ڸ� �Է����ּ���.");
			
			from = Integer.parseInt(args[0]);
			to = Integer.parseInt(args[1]);
			
			if(!(from >= 2 && from <= 9 && to >= 2 && to <= 9))
				throw new Exception("������ 2~9�����Դϴ�.");
		}catch(Exception e){
			e.getMessage();
			System.exit(0);
		}
		
		
		
		if(from > to){
			int tmp = from;
			from = to;
			to = tmp;
		}
		
		for(int i=from; i<to; i++){
			for(int j=1; j<=9; j++){
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
	}
}
