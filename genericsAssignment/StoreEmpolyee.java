package genericsAssignment;

import java.util.HashSet;
import java.util.Scanner;

class Employee {
	private int id;
	private String name;
	private double salary;
	private String department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void displayDetails() {
		
		System.out.println("Employee Details :");
        System.out.println("id = "+getId());
        System.out.println("name = "+getName());
        System.out.println("salary = "+getSalary());
        System.out.println("department= "+getDepartment());
       	
	}
}

public class StoreEmpolyee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		HashSet<Employee> set = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			Employee e = new Employee();
			e.setId(sc.nextInt());
			e.setName(sc.next());
			e.setSalary(sc.nextDouble());
			e.setDepartment(sc.next());
			
			set.add(e);
			e.displayDetails();
		}
		for(Employee e : set) {
			e.displayDetails();
			System.out.println();
		}
		

	}

}
