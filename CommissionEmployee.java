package marcos.ferrel2;

/**
 * Extends means that this class will inherit data from a father class.
 */
public class CommissionEmployee extends Employee {

	private Double totalSales;

	private Double commissionRate;

	@Override
	public Double payRate() {
		return totalSales * commissionRate;

	}

	public Double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(Double totalSales) {
		this.totalSales = totalSales;
	}

	public Double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(Double commissionRate) {
		this.commissionRate = commissionRate;
	}

}
