package com.simplilearn.email;

import java.util.ArrayList;
import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		ArrayList<String> emailID = new ArrayList<>();
		emailID.add("bhavanagudivada2001@gmail.com");
		emailID.add("srujanagudivada5@gmail.com");
		emailID.add("naseer227@sasi.ac.in");
		emailID.add("alekhya452@sasi.ac.in");
		emailID.add("jyothsna432@sasi.ac.in");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter user emailID");
		String enterEmail = scanner.nextLine();
		
		if(emailID.contains(enterEmail)) {
			System.out.println("emailID"+" "+enterEmail+" "+"found");
		
			
		}else {
			System.out.println("emailID"+" "+enterEmail+" "+"not found");
		}
		
	}

}
