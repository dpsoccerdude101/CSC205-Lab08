package lab08;

/**
 * @author Kyle Adams and Dennis
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
		//failed attempt and insertion sort and many others, array[] should be replaced with inventoryList
//		for (int i = 1; i < inventoryList.size(); i++) {
//	        Part current = inventoryList.get(i);
//	        int j = i - 1;
//	        
//	        while(j >= 0 && current.compareTo(inventoryList.get(i))) {
//	            array[j+1] = array[j];
//	            j--;
//	        }
//	        // at this point we've exited, so j is either -1
//	        // or it's at the first element where current >= a[j]
//	        array[j+1] = current;
//	    }
//		
//		for(int i = 0; i < inventoryList.size(); i++) {
//			if(inventoryList.get(i).compareTo(p) == 1) {
//			
//				
//			}
		//}
	    
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
			for(int i = 0; i < inventoryList.size(); i++) {
				if(inventoryList.get(i).getColor() == color) {
					return (inventoryList.get(i).toString());
				}
			}
			return null;
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
