package lab08;

public class InventoryTester {
public static void main(String[] args)
{
	Inventory myInventory = new Inventory();
	//-------------------name    color    weight price amountInStock reOPt
	myInventory.sortedInsert
(new Part("bolt", "red",     5.0,   4.50, 100, 20));
	myInventory.sortedInsert
(new Part("bolt", "black",   2.5,   2.50, 200, 50));
	myInventory.sortedInsert
(new Part("bolt", "green",   1.5,   1.50, 500, 300));
	myInventory.sortedInsert
(new Part("nut",  "red",     1.5,   3.50, 50, 100));
	myInventory.sortedInsert
(new Part("nut", "black",   1.0,   2.50, 300, 400));
	myInventory.sortedInsert
(new Part("screw", "red",     5.0,   4.50, 100, 100));
	myInventory.sortedInsert
(new Part("screw", "black",   2.5,   2.50, 200, 200));
	myInventory.sortedInsert
(new Part("cam", "green",   1.5,   1.50, 500, 1000));
	myInventory.sortedInsert
(new Part("cog",  "red",     1.5,   3.50, 50, 20));
	myInventory.sortedInsert
(new Part("cog", "black",   1.0,   2.50, 300, 500));
		
	System.out.println("------------------------------------------------");
	System.out.println("Testing search by color");
	System.out.println("Red Parts: \n" + myInventory.searchByColor("red"));
		
	System.out.println("Green Parts: \n" + 
			myInventory.searchByColor("green"));
		
	System.out.println("Black Parts: \n" + 
			myInventory.searchByColor("black"));
		
	System.out.println("------------------------------------------------");
	System.out.println("Testing Total Inventory");
	System.out.println("Total Value of the Inventory:  " + 
			myInventory.totalInventoryValue());
		
	System.out.println("------------------------------------------------");
	System.out.println("Testing heaviest part");
	System.out.println("Heaviest Part: " + myInventory.heaviestPart());
		
		
	System.out.println("------------------------------------------------");
	System.out.println("Testing number of parts of a given name in stock");
	System.out.println("Number of nuts in stock:   " + 
			myInventory.numPartsInStock("nut"));
	System.out.println("Number of bolts in stock:  " + 
			myInventory.numPartsInStock("bolt"));
	System.out.println("Number of screws in stock: " +
myInventory.numPartsInStock("screw"));
	System.out.println("Number of cams in stock:   " + 
			myInventory.numPartsInStock("cam"));
	System.out.println("Number of cogs in stock:   " +
 	myInventory.numPartsInStock("cog"));
		
		
	//------------------name    color    weight   price amountInStock reOPt
	myInventory.sortedInsert
(new Part("bolt",  "red",     7.0,   8.50, 200, 300));
	myInventory.sortedInsert
(new Part("bolt",  "black",   2.5,   2.00, 200, 100));
	myInventory.sortedInsert
(new Part("bolt",  "green",   1.5,   1.50, 400, 300));
	myInventory.sortedInsert
(new Part("nut",   "red",     1.5,   3.00, 90, 10));
	myInventory.sortedInsert
(new Part("nut",   "black",   1.0,   2.50, 200, 300));
	myInventory.sortedInsert
(new Part("screw", "red",     5.0,   4.50, 100, 200));
	myInventory.sortedInsert
(new Part("screw", "black",   2.5,   2.50, 200, 100));
	myInventory.sortedInsert
(new Part("cam",   "green",   1.5,   1.50, 400, 500));
	myInventory.sortedInsert
(new Part("cog",   "red",     1.5,   3.50, 50, 100));
	myInventory.sortedInsert
(new Part("cog",   "black",   1.0,   1.50, 300, 400));
		
	System.out.println("------------------------------------------------");
	System.out.println("Testing search by color");
	System.out.println("Red Parts: \n" + myInventory.searchByColor("red"));
		
	System.out.println("Green Parts: \n" + 
				myInventory.searchByColor("green"));
		
	System.out.println("Black Parts: \n" + 
				myInventory.searchByColor("black"));
		
	System.out.println("-----------------------------------------------");
	System.out.println("Testing Total Inventory");
	System.out.println("Total Value of the Inventory:  " + 
				myInventory.totalInventoryValue());
		
	System.out.println("------------------------------------------------");
	System.out.println("Testing heaviest part");
	System.out.println("Heaviest Part: " + myInventory.heaviestPart());
		
		
	System.out.println("------------------------------------------------");
	System.out.println("Testing number of parts of a given name in stock");
	System.out.println("Number of nuts in stock:   " + 
				myInventory.numPartsInStock("nut"));
	System.out.println("Number of bolts in stock:  " + 
				myInventory.numPartsInStock("bolt"));
	System.out.println("Number of screws in stock: " + 
				myInventory.numPartsInStock("screw"));
	System.out.println("Number of cams in stock:   " + 
				myInventory.numPartsInStock("cam"));
	System.out.println("Number of cogs in stock:   " +
 				myInventory.numPartsInStock("cog"));
	System.out.println("Reorder List = " + myInventory.reOrderList());
	}
}

