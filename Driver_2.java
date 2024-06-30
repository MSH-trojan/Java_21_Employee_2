package driver_2;

import java.util.*;

public class Driver_2 {
	public static void main(String[] args) {
		Employee emp[] = new Employee[100];
		Employee hold;
		Scanner input = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter name - 'quit' to stop");
		String name = input.next();
		while (!name.equals("quit")) {
			System.out.println("Enter age ");
			int age = input.nextInt();
			System.out.println("Enter salary ");
			double salary = input.nextDouble();
			emp[count++] = new Employee(name, age, salary);
			System.out.println("Enter name - quit to stop");
			name = input.next();
		}
			
		for(int pass = 1; pass < count ; pass++) {
			for(int i = 0 ; i < count - 1; i++) {
				if(emp[i].getName().compareTo(emp[i+1].getName()) > 0) {
					hold = emp[i];
					emp[i] = emp[i + 1];
					emp[i + 1] = hold;
				}
			}
		}
		
		for(int i = 0; i < count ; i++)
			System.out.println(emp[i].toString());
		
		System.out.println();
		
		for(int i = 0; i < count ; i++) {
			if(emp[i].getSalary() > 40000 && emp[i].getSalary() < 60000)
				System.out.println(emp[i].toString_1());
		}
	}
}
	class Employee{
		private String name;
		private int age;
		private double salary;
		public Employee(String n, int a, double s) {
			name = n; age = a; salary = s;
		}
		
		public String getName() {return name;}		
		public double getSalary() {return salary;}
		
		public String toString() {
			return "name: " + name + "		age: " + age + "	salary: $" + salary;
		}
		public String toString_1() {
			return name + " has a salary between 40k and 60k." + "\n";
		}
}