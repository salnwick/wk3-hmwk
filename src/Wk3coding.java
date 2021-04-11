
public class Wk3coding {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//int array
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 
		
		// implementation for question 1(a)
	    int lastIndex = ages.length - 1;
	    ages[lastIndex] = ages[lastIndex]- ages[0];
	  
	    
	 // implementation for question 1(b)
	    ages = new int[]{3, 9, 23, 64, 76, 2, 8, 28, 93, 20, 56};
	    lastIndex = ages.length - 1;
	    ages[lastIndex] = ages[lastIndex]- ages[0];
	    
	    
	    //implementation for question 1(c)
	    int sum = 0;
	    for (int i= 0; i < ages.length; i++ ) {
	    sum += ages[i];
	    
	    } System.out.println(sum/ages.length );

				
		//string array
//		String[] name = new String[6];
//		
//		name[0] = "Sam";
//		name[1] = "Tommy";
//		name[2] = "Tim";
//		name[3] = "Sally";
//		name[4] = "Buck";
//		name[5] = "Bob";
//		
	    
		
		String[] name = {"Sam","Tommy", "Tim", "Sally", "Buck", "Bob"};
		sum= 0;
	
		for (int i = 0; i < name.length; i++) {
		sum += name[i].length();
		}
		
		double average = sum/name.length; 
		
		System.out.println(average);
		
		String allNames = "";
		for (int x = 0; x < name.length; x++) { 
			allNames += name[x] + " ";
		}
		 System.out.println(allNames);
		
		
		 // answers for accessing 
		 System.out.println(name.length);
		 System.out.println(name[0]);
		 
			
			 int[] nameLengths = new int [name.length]; 
			 for (int j = 0; j < name.length; j++) {
				 nameLengths[j] = name[j].length(); 
				
			 }
			 
			 
			 //implementation for calculating sum of elements in names length array
			 
			 sum = sumOfArrayElements(nameLengths);
			 System.out.println("sum of all of elements: " + sum);
			 
		     int[] newIntArray = {2, 3, 5, 100};
		     System.out.println("Is new array sum greater than 100: " + sumGreaterThan100(newIntArray)); 
		     
		     
	  
	}
	
	public static String multipleWords(String word, int n) {
	      String results = "";
	      for (int i = 0; i < n; i++) {
	       results += word;
	        
	      }
	      
	      return results;
	      
	  }
	
	//method to calculate sum of int array elements
	public static int sumOfArrayElements(int [] intArray) {
		 int sum = 0;
		 for ( int a = 0; a < intArray.length; a++) { 
		 sum += intArray[a]; 
	  }
	
		 return sum;
}
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName; 
		
	}
	
	public static boolean sumGreaterThan100(int[] intArray) {
		int sum = sumOfArrayElements(intArray);
		
		if(sum >100)
			return true;
		else
			return false;
	}
     
	public static double averageOfElements(double[] doubleArray) {
		double sum = 0;
		for (double doubleArrays : doubleArray) {
			sum += doubleArrays; 
	}
		 return sum / doubleArray.length;
				
	}
	
	public static boolean isFirstArrayGreater(double[] doubleArray1, double[] doubleArray2) {
		double sum = averageOfElements(doubleArray1);
		
		if(sum > averageOfElements(doubleArray2))
			return true;
		else
			return false;
		
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if( isHotOutside && moneyInPocket > 10.50);
			return true;
				
	}
	 /// solves random problem
	public static int problem(int x, int y) {
	    return x*y - 3;
		
		
		
	}

}
