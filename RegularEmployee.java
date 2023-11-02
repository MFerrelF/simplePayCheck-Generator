package marcos.ferrel2;

/**
 * Extends means that this class will inherit data from a father class.
 */
public class RegularEmployee extends Employee {

	private Double income;

	@Override
	public Double payRate() {
		return income;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

}
