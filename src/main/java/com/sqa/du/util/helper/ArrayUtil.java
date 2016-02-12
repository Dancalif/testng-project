package com.sqa.du.util.helper;

import java.util.Arrays;

public class ArrayUtil {

	// Create a method that takes a String array and increases it value by one
	// element
	public static String[] addStringElement(String[] elements, String addString) {
		// Local variables
		String[] newStringArray;
		// Check if the supplied String array is null and if so, we will be
		// adding one element
		if (elements != null) {
			// Supplied array contains elements so the new size will be
			// increased by 1 and add element
			newStringArray = Arrays.copyOf(elements, elements.length + 1);
			// Set the last element to supplied String addString
			newStringArray[elements.length] = addString;
		} else {
			// Supplied array does not contain any elements yet
			newStringArray = new String[1];
			// Set the first/last and only element to supplied String addString
			newStringArray[0] = addString;
		}
		return newStringArray;
	}
}
