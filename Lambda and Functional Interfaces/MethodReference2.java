class Print {
	public static void run() {
		System.out.println("Hello");
	}
}
public class MethodReference2 {
	public static void main(String args[]) {
		new Thread(Print::run).start();
	}
}
