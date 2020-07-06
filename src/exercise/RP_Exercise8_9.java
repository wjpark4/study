package exercise;

class RP_Exercise8_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throw new RP_UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
	}
}

class RP_UnsupportedFunctionException extends RuntimeException{
	private final int ERR_CODE;
	
	RP_UnsupportedFunctionException(String str, int err){
		super(str);
		ERR_CODE=err;
	}
	
	RP_UnsupportedFunctionException(String str){
		this(str, 100);
	}
	
	public int getErrorCode(){
		return ERR_CODE;
	}
	
	public String getMessage(){
		return "["+getErrorCode()+"]"+super.getMessage();
	}
}