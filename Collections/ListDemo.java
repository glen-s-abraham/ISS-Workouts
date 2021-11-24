import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1,"Glen",10000));
		employeeList.add(new Employee(2,"Alok",20000));
		employeeList.add(new Employee(3,"Jishma",30000));
		employeeList.add(new Employee(4,"Glen",10000));
		System.out.println(employeeList);
		
		//get first employee
		System.out.println(employeeList.get(0));
		
		//update 4th employee
		employeeList.set(3, new Employee(4,"Jai",25000));
		System.out.println(employeeList);
		
		//search
		System.out.println(employeeList.contains(new Employee(1,"Glen",10000)));
		
		//index of
		System.out.println(employeeList.indexOf(new Employee(1,"Glen",10000)));
		
		//remove and employee
		employeeList.remove(3);
		System.out.println(employeeList);
		
		//for loop
		for(int i=0;i<employeeList.size();i++)
			System.out.println(employeeList.get(i));
		
		//enhanced for loop
		for(Employee employee:employeeList)
			System.out.println(employee);
		
		//foreach loop
		employeeList.forEach(employee->System.out.println(employee));
		
		//Iterator
		Iterator <Employee> iterEmp = employeeList.iterator();
		while(iterEmp.hasNext())
			System.out.println(iterEmp.next());
		
	}
	

}
