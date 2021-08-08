package heranca_polimorfismo_ex1;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + "$ " + totalPrice() + "(Taxa alfandegária: $ " + customsFee + ")";
	}

}
