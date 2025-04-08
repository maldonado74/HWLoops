package Array;

public class ArrayForLoop {

	public static void main(String[] args) {
		// print all elements of an array using for loop
		
		int [] studentAge = {7,6,7,8,9,2,6};//seven index
		for (int i = 0; i < studentAge.length; i++) {
		System.out.println("This is one element of studentAge: " +studentAge[i]);
		}
		
		// create an array of size 10, assign values of 0, 1, 2, using for loop
		int[] arraySize = new int[11]; // Create array of size 11
        for (int i = 1; i < arraySize.length; i++) {
        	arraySize[i] = i; // Assign the loop index to the arraySize element
           	System.out.println("This is one element of arraySize: "+i);
        }
        
        //create an array of size 10, assign values of 0, 10, 20 till 90,100 using for loop
        int[] arrayByTen = new int[100]; // Create array of size 11
       	     for (int i = 10; i <= arrayByTen.length; i += 10) {
    	     System.out.println("This is one element of arrayByTen: "+i);
    	    }
 	}
}
