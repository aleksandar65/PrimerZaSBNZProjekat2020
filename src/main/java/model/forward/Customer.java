package model.forward;

public class Customer {
	private CustomerCategory category;
	private double spent_ammount;
	private double discount;

	public CustomerCategory getCategory() {
		return category;
	}

	public void setCategory(CustomerCategory category) {
		this.category = category;
	}

	public double getSpent_ammount() {
		return spent_ammount;
	}

	public void setSpent_ammount(double spent_ammount) {
		this.spent_ammount = spent_ammount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
