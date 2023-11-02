package marcos.ferrel2;

public class EmployeeProgram {

	public static void main(String[] args) {
		RegularEmployee employee = new RegularEmployee();
		employee.setCpf("123.456.789-42");
		employee.setName("Marcos");
		employee.setSurname("Ferrel");
		employee.setIncome(100d);
		print(employee);
		//System.out.println(employee.getName() + " " + employee.getSurname() + " has an income of " + employee.payRate());
		
		System.out.println("");
		
		CommissionEmployee employee1 = new CommissionEmployee();
		employee1.setCpf("456.123.789-42");
		employee1.setName("Joao");
		employee1.setSurname("Ferreira");
		employee1.setTotalSales(1500d);
		employee1.setCommissionRate(0.1d);
		print(employee1);
		//System.out.println(employee1.getName() + " " + employee1.getSurname() + " has an income of " + employee1.payRate());
		
		System.out.println(" ");
		
		HourlyEmployee employee2 = new HourlyEmployee();
		employee2.setCpf("789.123.456-42");
		employee2.setName("Peter");
		employee2.setSurname("Gabriel");
		employee2.setPerHour(15.50d);
		employee2.setWorkHours(8d);
		print(employee2);
		//System.out.println(employee2.getName() + " " + employee2.getSurname() + " has an income of " + employee2.payRate());
	}
	
	public static void print(Employee employee) {
		if (employee instanceof HourlyEmployee ) {
			HourlyEmployee hour = (HourlyEmployee) employee;
			System.out.println(employee.getName() + " " + employee.getSurname() + " has na income of " + employee.payRate());
			System.out.println("They is paid " + hour.getPerHour() + " per hour.");
			employee.printValues();
		} else
		System.out.println(employee.getName() + " " + employee.getSurname() + " has an income of " + employee.payRate());
		employee.printValues();

	}

}
