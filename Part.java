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

	public Part(String partName, String color, double weight, double price, int amountInStock, int reorderPaint) {
		super();
		this.partName = partName;
		this.color = color;
		this.weight = weight;
		this.price = price;
		this.amountInStock = amountInStock;
		this.reorderPoint = reorderPaint;
	}
		/**
		 * Method that compares two parts by name then weight 
		 * to see what one is 
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
		} else if(this.partName.compareTo(other.getPartName()) < 0) {
				part = -1;
			} else if(this.partName.compareTo(other.getPartName()) > 0) {
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
	 * Method that returns the value of price
	 * multiplied by amountInStock 
	 */
	public double getValue() {
		return this.price * this.amountInStock;
	}
	
	public String toString() {
		return ("Part name: " + this.partName + "\n" + "Part color: " + this.color + "\n" + "Part weight "
				+ this.weight + "\n" + "Part price: " + this.price + "\n" + "Amount in stock: "
				+ this.amountInStock + "\n" + "Reorder point: " + this.reorderPoint + "\n");
	}
}
