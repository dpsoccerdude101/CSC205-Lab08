package lab08;

/**
 * @author Kyle Adams & Dennis P
 *
 */
public class Part {

	// instance variables
	private String partName;
	private String color;
	private double weight;
	private double price;
	private int amountInStock;
	private int reorderPoint;

	/**
	 * Parameterized constructor
	 * 
	 * @param partName
	 * @param color
	 * @param weight
	 * @param price
	 * @param amountInStock
	 * @param reorderPaint
	 */
	public Part(String pN, String c, double wt, double pr, int amtInStk, int reOrderPt) {
		partName = pN;
		color = c;

		weight = isWeightReal(wt) ? wt : 0.0;
		price = isPriceReal(pr) ? pr : 0.0;
		amountInStock = isAmountInStockReal(amtInStk) ? amtInStk : 0;
		reorderPoint = isReOrderPointReal(reOrderPt) ? reOrderPt : 0;
	}

	/**
	 * Method that compares two parts by name then weight to see what one is
	 * 
	 * @param other
	 * @return int
	 */
	public int compareTo(Part other) {
		int part = 0;
		if (this.partName.contentEquals(other.getPartName())) {
			if (this.weight < other.getWeight()) {
				part = -1;
			} else if (this.weight == other.getWeight()) {
				part = 0;
			} else if (this.weight > other.getWeight()) {
				part = 1;
			}
		} else if (this.partName.compareTo(other.getPartName()) < 0) {
			part = -1;
		} else if (this.partName.compareTo(other.getPartName()) > 0) {
			part = 1;
		}
		return part;
	}

	/**
	 * Getter methods
	 */
	public String getPartName() {
		return partName;
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public double getPrice() {
		return price;
	}

	public int getAmountInStock() {
		return amountInStock;
	}

	public int getReorderPoint() {
		return reorderPoint;
	}

	/**
	 * Method that returns the value of price multiplied by amountInStock
	 */
	public double getValue() {
		return this.price * this.amountInStock;
	}

	public String toString() {
		return ("Part name: " + this.partName + "\n" + "Part color: " + this.color + "\n" + "Part weight " + this.weight
				+ "\n" + "Part price: " + this.price + "\n" + "Amount in stock: " + this.amountInStock + "\n"
				+ "Reorder point: " + this.reorderPoint + "\n");
	}

	private boolean isWeightReal(double wt) {
		return (wt > 0.0);
	}

	private boolean isPriceReal(double pr) {
		return (pr > 0.0);
	}

	private boolean isAmountInStockReal(double amtInStk) {
		return (amtInStk >= 0);
	}

	private boolean isReOrderPointReal(int reOrderPt) {
		return (reOrderPt > 0);
	}
}
