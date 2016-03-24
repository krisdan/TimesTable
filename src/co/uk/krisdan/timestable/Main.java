package co.uk.krisdan.timestable;

import java.util.*;

import co.uk.krisdan.timestable.questions.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which times table would");
		System.out.println("you like to create?: \r");
		
		int multiplier = input.nextInt();
		
		
		System.out.println("How many questions would");
		System.out.println("you like this table to hold?: \r");
		int numQs = input.nextInt();
		
		TimesTableAPI api = VanillaTimesTableAPI.getInstance();
		
		TimesTable timesTable = api.getTimesTable(numQs, multiplier);
		
		System.out.print(timesTable);
		}
}
