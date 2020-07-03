package exercise;

interface RP7_Parseable{
	public abstract void parse(String fileName);
}

class RP7_ParserManager{
	public static RP7_Parseable getParser(String type){
		if(type.equals("XML")){
			return new RP7_XMLParser();
		} else{
			RP7_Parseable p = new RP7_HTMLParser();
			return p;
		}
	}
}

class RP7_XMLParser implements RP7_Parseable{
	public void parse(String fileName){
		System.out.println(fileName + "= XML parsing completed.");
	}
}

class RP7_HTMLParser implements RP7_Parseable{
	public void parse(String fileName){
		System.out.println(fileName + "-HTML parsing completed");
	}
}


class RP7_PT {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP7_Parseable parser = RP7_ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = RP7_ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
