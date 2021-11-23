interface Parse{
	public String parse(String str);
}

class StringPareser{
	public static String upperIfLengthgreaterThan3(String str) {
		if(str.length()>3)
			return str.toUpperCase();
		return str.toLowerCase();
	}
}

class MyPrinter{
	public void print(String str, Parse p) {
		str = p.parse(str);
		System.out.println(str);
	}
}

public class MethodReference1 {

	public static void main(String[] args) {
		String str = "Java";
		
		new MyPrinter().print(str,new Parse() {
			@Override
			public String parse(String str) {
				return StringPareser.upperIfLengthgreaterThan3(str);
			}
			
		});
		//lambda expressions
		new MyPrinter().print(str, (String s)->StringPareser.upperIfLengthgreaterThan3(s));
		
		//Method reference
		new MyPrinter().print(str, StringPareser::upperIfLengthgreaterThan3);
		
	}

}
