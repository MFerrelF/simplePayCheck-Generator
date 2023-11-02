package marcos.ferrel2;

/**
 * Abstract means that this class is a father. 
 */
public abstract class Employee {
	
	private String name;
	
	private String surname;
	
	private String cpf;
	
	public abstract Double payRate();
	
	public void printValues() {
		Double value = payRate();
		System.out.println("Their pay system is " + value);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
		
}

