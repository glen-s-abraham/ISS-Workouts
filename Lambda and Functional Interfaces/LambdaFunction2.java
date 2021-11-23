public class LambdaFunction2 {

	public static void main(String[] args) {
		Drawable square = (int width,int height)->{
			System.out.println("width of square "+width);
			System.out.println("height of square "+height);
		
		};
		square.draw(5, 5);
	}

}
