package com.chainsys.day7;
import java.util.Arrays;
import java.util.List;

public class ProgramsArray {

	
	public static void main(String[] args) {
		
	    List<String> fruits = Arrays.asList("Apple", "Mango", "Banana","Grapes");
		System.out.println(fruits);
		//copyOf() - used to create a new array from an existing array.
		//static int[]	copyOf(int[] original, int newLength)
		int[] array ={1,2,33,44,6};		
		int[] new_array=Arrays.copyOf(array, 5);
		System.out.println("\n\nNew Int Array: \n"+Arrays.toString(new_array));
		
		//static boolean[] copyOf(boolean[] original, int newLength)
		boolean[] array1={true, true, true, false, true, false, true};
		boolean[] new_array1=Arrays.copyOf(array1, 6);
		System.out.println("\nNew Boolean Array: \n"+Arrays.toString(new_array1));
		
		//static char[]	copyOf(char[] original, int newLength)
		char[] array2={'a', 'e', 'i', 'o', 'u'};
		char[] new_array2=Arrays.copyOf(array2, 8);
		System.out.println("\nNew Character Array: \n"+Arrays.toString(new_array2));
		
		//static float[]	copyOf(float[] original, int newLength)
		float[] array3={1.1f, 22.3f, 7.7f, 9.45f, 43.7f, 53.2f, 6.66f};
		float[] new_array3=Arrays.copyOf(array3, 7);
		System.out.println("\nNew Float array: \n"+Arrays.toString(new_array3));
	
		//static double[] copyOf(double[] original, int newLength)
		double[] array4={5.5,73,45,2,87,5,4,33,64,43.5};
		double[] new_array4=Arrays.copyOf(array4, 3);
		System.out.println("\nNew Double array: \n"+Arrays.toString(new_array4));
		
		// static boolean equals(int[] a, int[] a2)
        int[] a1 = new int [] {3,13,15,1,5};
        System.out.println("\nARRAY 1:"); 
		for(int num:a1)
		{
			System.out.print(num+" ");
		} 
        int[] a2 = new int [] {3,13,15,1,5};
        System.out.println("\nARRAY 2:"); 
		for(int num:a2)
		{
			System.out.print(num+" ");
		} 
        int[] a3 = new int [] {99,3,2,7,9};
        System.out.println("\nARRAY 3:"); 
		for(int num:a3)
		{
			System.out.print(num+" ");
		} 
        System.out.println("\n\nARRAY1 = ARRAY2 : " +
                                Arrays.equals(a1, a2));
        System.out.println("ARRAY2 = ARRAY3 : " +
                                Arrays.equals(a2, a3));
        
        
        //deepequals()
        //equals() can be only performed to 1-D arrays 
        int[][] arr1 = { { 11, 1 }, { 22, 2 }, {33,3} };
        int[][] arr2 = { { 11, 1 }, { 22, 2 }, {33,3} };
 
        System.out.println("\n\nARRAY1 equals ARRAY2 : "
                           + Arrays.equals(arr1, arr2));
        System.out.println("ARRAY1 deepequals ARRAY2: "
                           + Arrays.deepEquals(arr1, arr2));
        
        //hashCode() - returns a hash code based on the contents of the specified array
        boolean a5[] = {true, false, true}; 		  
		int hashCode1=Arrays.hashCode(a5);
		System.out.println("\nHashCode Of Array array is: "+hashCode1);
    
		char a6[] = {'a','e','i'}; 		  
		int hashCode2=Arrays.hashCode(a6);
		System.out.println("\nHashCode for char array: "+hashCode2);
	
		double a7[] = {11.2,54.8,4.6}; 		  
		int hashCode3=Arrays.hashCode(a7);
		System.out.println("\nHashCode for double array: "+hashCode3);
	
	    //fill
		int ar[] = {23,2,4,77,5,3,8}; 
        Arrays.fill(ar, 10); 
        System.out.println("\nArray filled with 10\n" + Arrays.toString(ar)); 
	
        // Fill from index 2 to index 7 
        int ar1[] = {1,2,3,4,5,6,7,8,9,10}; 
        Arrays.fill(ar1, 2, 8, 10); 
        System.out.println("\nArray filled from index 2 to index 7 :\n" +Arrays.toString(ar1)); 
	
        //Fill multidimentional array
        int [][]ar2 = new int [3][2]; 
        for (int[] row : ar2) 
        Arrays.fill(row, 3); 
        System.out.println("\nArray filled with 3 in multidimentional Array :\n" +Arrays.deepToString(ar2)); 
        
        //sort()
        int[] ar3 = { 976,1,45,-967,45,-23,657,55,0,-1000 };
        System.out.println("\nGIVEN ARRAY: ");
        for (int num : ar3) 
        {
            System.out.print(num + " ");
        }
        Arrays.sort(ar3);
        System.out.println("\nSORTED ARRAY: ");
        for (int num : ar3)
        {
            System.out.print(num + " ");
	    }
        
        //setAll() - Set all elements of the specified array, using the provided generator function to compute each element.
        //static void setAll(int[] array, IntUnaryOperator generator)
      	int ar4[] = new int[15];
      	Arrays.setAll(ar4, (index)-> index+index);
      	System.out.println("\n\nArray generated by adding the index value:\n"+Arrays.toString(ar4));
      	
       //Example of static void setAll(double[] array, IntToDoubleFunction generator)
       double ar5[] = new double[10];
       Arrays.setAll(ar5, (index)-> index*5);
       System.out.println("\nArray generated by multiplying index value with 5: \n"+Arrays.toString(ar5));
	}
}
	                           
	
	

