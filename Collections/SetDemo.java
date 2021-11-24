import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Employee> employeeSet = new HashSet<>();
		employeeSet.add(new Employee(1,"Jinil",30000));
		employeeSet.add(new Employee(2,"Jaico",20000));
		employeeSet.add(new Employee(3,"June",35000));
		employeeSet.add(new Employee(4,"Jane",25000));
		employeeSet.add(new Employee(1,"Jinil",30000));	
		System.out.println(employeeSet);
		
		//search
		System.out.println(employeeSet.contains(new Employee(2,"Jaico",20000)));
		
		//remove
		employeeSet.remove(new Employee(2,"Jaico",20000));
		System.out.println(employeeSet);

	}

}
