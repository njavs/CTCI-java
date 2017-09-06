// CTCI Technical Questions Chapter 1: Strings and Arrays

import java.util.*;
import java.math.*;

import java.lang.StringBuilder;

public class HelloWorld {
	public static void main (String[] args){
		checkIfPermutationOfPalindrome("taco cat");
	}
	
	// 1.1
	public static boolean checkIfStringUnique(String str){
		boolean unique = true;
		int length = str.length();
		char[] s = str.toCharArray();
		Arrays.sort(s);
		System.out.println(s);
		for(int i = 0; i <= length-2; i++){
			if (s[i]==s[i+1])
					unique = false;
		}
		
		System.out.println("The string is unique?");
		System.out.println(unique);
		return unique;
	}
	
	// 1.2
	public static boolean checkIfPermutation(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;
		char a1[] = s1.toCharArray();
		char a2[] = s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		String str1 = new String(a1);
		String str2 = new String(a2);
		return str1.equals(str2);
	}
	
	// 1.3 (redo without library functions)
	public static String URLify(String s){
		String new_s = s.toLowerCase().replace(" ", "%20");
		System.out.print(new_s);
		return s;
	}
	
	// 1.4
	public static boolean checkIfPermutationOfPalindrome(String s){
		char[] arr = s.toLowerCase().toCharArray();
		char[] record = new char[128];
		
		// Initialize record array to all 0s
		for(int i = 0; i < record.length; i++){
			record[i] = 0;
		}
		
		// Record number of instances a character appears in the string.
		for(int i = 0; i < arr.length; i++){
			if(arr[i]!=' ') //Ignore spaces.
				record[(int)(arr[i])]++;
		}
		
		// Count number of characters than appear an odd number of times in the string.
		int oddCounter = 0;
		for(int i = 0; i < record.length; i++){
			if( (record[i]%2) != 0){
				oddCounter++;
			}
		}
		
		// If more than one character appears an odd number of times, more than one character is unmatched.
		// Therefore the string cannot be a palindrome.

		if (oddCounter > 1){
			System.out.println("false");
			return false;
		} else {
			System.out.println("true");
			return true;
		}	
	}
	
	// 1.5
	public static boolean oneOrZeroEditsAway(String s, String t){
		char[] arrS = s.toCharArray();
		char[] arrT = t.toCharArray();
		
		if( (arrS.length > arrT.length + 1 ) || (arrT.length > arrS.length + 1 ) )
			return false;
		return true;
	}
	
	// WHAT'S LEFT: 1.5, 1.6, 1.7, 1.8, 1.9
	
}