package marcos.ferrel2;

/**
 * Extends means that this class will inherit data from a father class.
 */
public class HourlyEmployee extends Employee {
	
	private Double perHour;
	
	private Double workHours;

	@Override
	public Double payRate() {
		return perHour*workHours;
	}

	public Double getPerHour() {
		return perHour;
	}

	public void setPerHour(Double perHour) {
		this.perHour = perHour;
	}

	public Double getWorkHours() {
		return workHours;
	}

	public void setWorkHours(Double workHours) {
		this.workHours = workHours;
	}

	
	
}
