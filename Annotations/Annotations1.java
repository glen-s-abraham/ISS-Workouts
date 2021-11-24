import java.util.ArrayList;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface PrinterInterface{
	public void print(String str);
}

class A{
	public void show() {
		System.out.println("A");
	}
}
class B extends A{
	
	@Deprecated
	public int show(int i) {
		return i;
	}
	
	@Override
	@SuppressWarnings({"rawtypes", "unused" })
	public void show() {
		ArrayList list = new ArrayList();
		System.out.println("B");
	}
}
public class Annotations1 {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		PrinterInterface printer = System.out::print;
		printer.print("Document printing");

	}

}
