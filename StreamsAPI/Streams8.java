import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product implements Comparable{
	private String name;
	private double price;
	public Product() {
		this.name = "undefined";
		this.price = 0.0;
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int compareTo(Object o) {
		Product newObject = (Product)o;
		return (int) (this.getPrice()-newObject.getPrice());
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
public class Streams8 {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Hp Laptop",36000));
		products.add(new Product("Dell PC",27000));
		products.add(new Product("Mouse",200));
		products.add(new Product("Key Board",300));
		products.add(new Product("Web Cam",1200));
		
		//sort elements on price
		products.stream()
			.sorted()
			.forEach(System.out::println);
		
		//Return number of elements with price greater than 1000
		int productGT1000 = (int) products.stream()
			.filter(product->product.getPrice()>1000)
			.count();
		System.out.println("Products gt " + productGT1000);
		
		//Average of accessories only
		double totalOfAccessories =products.stream()
			.filter(product->(!product.getName().contains("Laptop") && !product.getName().contains("PC")))
			.collect(Collectors.averagingDouble(product->product.getPrice()));
		System.out.println(totalOfAccessories);
			
			
		//Total inventory price
		double totalInventoryPrice = products.stream()
				.map(product->product.getPrice())
				.reduce(0.0, (Double a,Double b)->a+b);
		System.out.println(totalInventoryPrice);
		
		//Minimum price
		products.stream()
			.min((product1,product2)->product1.getPrice()>product2.getPrice()?1:-1)
			.ifPresent(System.out::print);
			

	}

}
