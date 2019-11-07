package lab08;

/**
 * @author Kyle Adams and Dennis
 *
 */
import java.util.*;

public class Inventory {

	// instance variables
	private ArrayList<Part> inventoryList = new ArrayList<Part>();

	/**
	 * method that alphabetizes the parts
	 * 
	 * @param p
	 */
	public void sortedInsert(Part p) {
		boolean pSpot = false;
		if (inventoryList.size() == 0) {
			inventoryList.add(p);
		} else {
			int i = 0;
			while (i < inventoryList.size() && pSpot == false) {

				if (p.compareTo(inventoryList.get(i)) == 1) {
					inventoryList.add(i, p);
					pSpot = true;
					// i++;
				} else if (i > inventoryList.size()) {
					pSpot = true;
					inventoryList.add(i, p);
				}
				i++;
			}
		}
	}

	/**
	 * Method that returns the total values of all the parts in the arraylist
	 * 
	 * @return double
	 */
	public double totalInventoryValue() {
		double total = 0;
		for (int i = 0; i < inventoryList.size(); i++) {
			total += inventoryList.get(i).getValue();
		}
		return total;
	}

	/**
	 * Method that returns all parts that match the color
	 * 
	 * @param color
	 * @return string
	 */
	public String searchByColor(String color) {
		String concatInventoryMatches = "";
		for (int i = 0; i < inventoryList.size(); i++) {
			if (inventoryList.get(i).getColor().equalsIgnoreCase(color)) {
				concatInventoryMatches += (inventoryList.get(i).toString() + "\n");
			}
		}
		return concatInventoryMatches;
	}

	/**
	 * Returns the heaviest part in the arrayList
	 * 
	 * @return string
	 */
	public String heaviestPart() {
		Part heaviest = inventoryList.get(0);
		for (int i = 0; i < inventoryList.size(); i++) {
			if (inventoryList.get(i).getWeight() > heaviest.getWeight()) {
				heaviest = inventoryList.get(i);
			}
		}
		return heaviest.toString();
	}

	/**
	 * method returns the total of the amount in stock of the given part
	 * 
	 * @param partName
	 * @return int
	 */
	public int numPartsInStock(String partName) {
		int total = 0;
		int l = 0;
		int listSize = inventoryList.size() - 1;
		while (l <= listSize) {
			int mid = 1 + (listSize - 1) / 2;

			if (inventoryList.get(mid).getPartName().equalsIgnoreCase(partName)) {
				int count = mid;
				while (inventoryList.get(count).getPartName().equalsIgnoreCase(partName)) {
					count--;
				}
				while (inventoryList.get(count).getPartName().equalsIgnoreCase(partName)) {
					total += inventoryList.get(count).getAmountInStock();
					count++;
					return total;
				}
			}
			if (inventoryList.get(mid).getPartName().compareTo(partName) < 0)
				l = mid + 1;
			else
				listSize = mid - 1;
		}
		return 0;
	}

	public ArrayList<Part> reOrderList() {

		ArrayList<Part> reOrderedList = new ArrayList<Part>();
		for (int i = 0; i < inventoryList.size(); i++) {
			if (inventoryList.get(i).getAmountInStock() < inventoryList.get(i).getReorderPoint()) {
				reOrderedList.add(inventoryList.get(i));
			}
		}
		return reOrderedList;
	}
}
