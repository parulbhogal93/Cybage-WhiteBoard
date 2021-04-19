package com.DemoProject.ProcessArrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] origArray = new Integer[] { 1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8 };
        removeDuplicatesFromArray(origArray);
    }
 
    public static void removeDuplicatesFromArray(Integer[] strArray) {
    	 
        // Iterating using enhanced for-loop
        System.out.println("Original Arrays with duplicates:\n");
        for(Integer str : strArray) {
            System.out.print(str+",");
        }
 
        // get size of the Arrays using length property
        int sizeOfArrays = strArray.length;
 
        // remove duplicates, using 2 for-loops
        // outer for-loop
        for(int outForLoop = 0; outForLoop < sizeOfArrays; outForLoop++) {
            // inner for-loop
            for(int inForLoop = outForLoop + 1; inForLoop < sizeOfArrays; inForLoop++) {
                // check whether, it already contains this element
                if(strArray[outForLoop] == strArray[inForLoop]){
                    // if elements are same, then replace with last item
                    strArray[inForLoop] = strArray[sizeOfArrays-1];
                    // at the same time, decrement size value by 1
                    sizeOfArrays--;
                    // also decrement inner for-loop
                    inForLoop--;
                }
            }
        }
 
        // create new String[] to copy unique elements
        Integer[] uniqueStrArrays = Arrays.copyOf(strArray, sizeOfArrays);
 
        // Iterating using enhanced for-loop
        System.out.println("\n\nUnique elements:\n");
        for(Integer str : uniqueStrArrays) {
            System.out.print(str + ",");
        }
    }
}