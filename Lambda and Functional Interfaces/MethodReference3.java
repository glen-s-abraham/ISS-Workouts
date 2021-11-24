interface SomeInterface{
	public void someMethod();
}

class SomeClass{
	public void printHello() {
		System.out.println("Hello");
	}
}
public class MethodReference3 {

	public static void main(String[] args) {
		
		SomeInterface interfaceObj = new SomeClass()::printHello;
		interfaceObj.someMethod();
				
	}

}
