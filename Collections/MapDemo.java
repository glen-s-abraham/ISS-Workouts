import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, Employee> employees = new HashMap<>();
		employees.put(1, new Employee(1,"Jake",25000));
		employees.put(8, new Employee(2,"Jane",25000));
		employees.put(4, new Employee(3,"Doe",25000));
		employees.put(2, new Employee(4,"John",25000));
		employees.put(null, new Employee(5,"Jis",25000));
		System.out.println(employees);
		
		
		
		for(int i=0;i<employees.size();i++)
			System.out.println(employees.get(i));
		
		for(Employee employee:employees.values())
			System.out.println(employee);
		
		employees.remove(2);
		
		for(Map.Entry<Integer, Employee> empEntry:employees.entrySet())
			System.out.println(empEntry.getKey() + " " + empEntry.getValue());
		
		employees.replace(1,new Employee(1,"Glen",50000));
		
		employees.forEach((Integer key,Employee value)->System.out.println(key+" "+value));

	}

}
