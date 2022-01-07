package com.harni.assignment;
import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strs = scan.next();
		
		System.out.println("Actual is: "+strs);
		
		String reverse= new StringBuilder(strs).reverse().toString();
		
		System.out.println("Reverse is: "+reverse);
		
		if(strs.equals(reverse)){
			System.out.println("it is palindrome");
		}
		else{
			System.out.println("it is not palindrome");
		}
		
		
	}

}
