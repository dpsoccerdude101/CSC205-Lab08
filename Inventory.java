/**
 * 
 */
package lab08;

/**
 * @author Kyle Adams
 *
 */
import java.util.*;

public class Inventory {

	//instance variables
	private ArrayList<Part> inventoryList = new ArrayList<Part>();
	
	/**
	 * method that alphabetizes the parts
	 * @param p
	 */
	public void sortedInsert(Part p) {
		boolean pSpot = false;
		
		if(inventoryList.size() == 0) {
			inventoryList.add(p);
		}
		else {
			int i = 0;
			while (i < inventoryList.size() && pSpot == false) {
				
				if (p.compareTo(inventoryList.get(i)) == 1) { 
					inventoryList.add(i,p);
					pSpot = true;
					//i++;
				} 
				else if (i > inventoryList.size()) {
					 pSpot = true;
					 inventoryList.add(i,p);
				}
				i++;
			}
		}
		
        
		
	            }
	   
	    /**
	     * Method that returns the total values of all the parts in the arraylist
	     * @return double
	     */
		public double totalInventoryValue() {
			double total = 0;
			for(int i = 0; i < inventoryList.size(); i++) {
				total += inventoryList.get(i).getValue();
			}
			return total;
		}
		
		/**
		 * Method that returns all parts that match the color
		 * @param color
		 * @return string
		 */
		public String searchByColor(String color) {
			ArrayList<Part> dummyList = new ArrayList<Part>();
			
			for(int i = 0; i < inventoryList.size(); i++) {
				if(inventoryList.get(i).getColor() == color) {
					dummyList.add(inventoryList.get(i));
				}
			}
			return dummyList.toString();
		}
		
		/**
		 * Returns the heaviest part in the arrayList
		 * @return string
		 */
		public String heaviestPart() {
			Part heaviest = inventoryList.get(0);
			
			for(int i = 0; i < inventoryList.size(); i++) {
				if (inventoryList.get(i).getWeight() > heaviest.getWeight()){
					heaviest = inventoryList.get(i);
				}
			}
			return heaviest.toString();
		}
		
		/**
		 * method returns the total of the amount in stock of the given part
		 * @param partName
		 * @return int
		 */
		public int numPartsInStock(String partName) {
			int total = 0;
			for(int i = 0; i < inventoryList.size(); i++) {
				if(inventoryList.get(i).getPartName() == partName) {
					total += inventoryList.get(i).getAmountInStock();
				}
			}
			return total;
		}
		
		public ArrayList<Part> reOrderList(){
			
			ArrayList<Part> reOrderedList = new ArrayList<Part>();
			for(int i = 0; i < inventoryList.size(); i++) {
				if(inventoryList.get(i).getAmountInStock() < inventoryList.get(i).getReorderPoint()) {
					reOrderedList.add(inventoryList.get(i));
				}
			}
			return reOrderedList;
		}
	

}
