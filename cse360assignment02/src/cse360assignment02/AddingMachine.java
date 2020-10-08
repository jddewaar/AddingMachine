package cse360assignment02;

public class AddingMachine {
	private int total;
	private String operations = "";
	  
	public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    operations += total; // String container for the print display
	}
	  
	public int getTotal () {
		return total; //returns total
	}
	  
	public void add (int value) {
		total += value; //adds to the total value
		operations += " + " + value; // updates variables
	}

	public void subtract (int value) {
		total -= value; //subtracts from the total value
		operations += " - " + value; // updates variables
	}

	public String toString () {
	    return operations; // Prints
	}

	public void clear() { // updates variables with default values
		total = 0;
		operations = "" + total;
	}
	/* For testing the methods
	public static void main(String[] args) {
        //Create instance of class
        AddingMachine myCalculator = new AddingMachine();
        
        myCalculator.add(4);
        myCalculator.subtract(2); 
        myCalculator.add(5);
        System.out.println(myCalculator);
        System.out.println(myCalculator.getTotal());
        myCalculator.clear();
        System.out.println(myCalculator);
        System.out.println(myCalculator.getTotal());
        myCalculator.add(6);
        myCalculator.subtract(3); 
        myCalculator.add(7);
        System.out.println(myCalculator);
        System.out.println(myCalculator.getTotal());
    }
    */
}
