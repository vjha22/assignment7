package assignment7vj;

import java.util.*;
public class Sorting 
{ 
	public static String Sorting(String inputString) 
	{ 
		char tempArray[] = inputString.toCharArray(); 
		
		Arrays.sort(tempArray); 
	
		return new String(tempArray); 
	} 
	
	public static void main(String[] args) 
	{ 
        Scanner s=new Scanner(System.in);
        String inputString = ""; 
        inputString=s.next();
		String outputString = Sorting(inputString); 
		
		System.out.println("Input String : " + inputString); 
		System.out.println("Output String : " + outputString); 
	} 
} 