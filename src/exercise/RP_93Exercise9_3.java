package exercise;

class RP_93Exercise9_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		String path="";
		String fileName = "";
		
		int fullPath2 = fullPath.lastIndexOf("\\") ;
		fullPath = fullPath.substring(0) ;
		path = fullPath.substring(0, fullPath.lastIndexOf("\\")); 
		fileName = fullPath.substring(fullPath.lastIndexOf("\\")+1);
		
		System.out.println("fullPath2 : "+fullPath2);
		System.out.println("fullPath : "+fullPath);
		System.out.println("path : "+path);
		System.out.println("fileName : "+fileName);
	}
}
