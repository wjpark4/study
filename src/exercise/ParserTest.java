package exercise;

interface Parseable724{
	public abstract void parse(String fileName);
}

class ParserManager724{
	public static Parseable724 getParser(String type){
		if(type.equals("XML")){
			return new XMLParser724();
		} else {
			Parseable724 p = new HTMLParser724();
			return p;
		}
	}
}

class XMLParser724 implements Parseable724{
	public void parse(String fileName){
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser724 implements Parseable724{
	public void parse(String fileName){
		System.out.println(fileName + "-HTML parsing completed.");
	}
}

class ParserTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parseable724 parser = ParserManager724.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager724.getParser("HTML");
		parser.parse("document2.html");
		
	}
}
