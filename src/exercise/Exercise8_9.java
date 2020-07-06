package exercise;

class Exercise8_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throw new UnsupportedFunctionException("�������� �ʴ� ����Դϴ�.", 100);
	}
}

class UnsupportedFunctionException extends RuntimeException{
	private final int ERR_CODE;
	
	UnsupportedFunctionException(String str, int err){
		super(str);
		ERR_CODE = err;
	}
	
	UnsupportedFunctionException(String str){
		this(str, 100);
	}
	
	
	public int getErrorCode(){
		return ERR_CODE;
	}
	
	public String getMessage(){
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
	
	
}