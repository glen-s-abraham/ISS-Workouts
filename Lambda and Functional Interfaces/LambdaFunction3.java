
public class LambdaFunction3 {

	public static void main(String[] args) {
		//Thread withoud lambda
		Thread thread1= new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread implementation without lambda function");
			}
		});
		thread1.start();
		
		Thread thread2 = new Thread(()->System.out.println("Thread implementation with lambda"));
		thread2.start();

	}

}
