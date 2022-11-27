package assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThirdQuestion {

	public static void main(String[] args) {
		List<String> automation = new ArrayList<>();
		automation.add("Java");
		automation.add("TestNG");
		automation.add("Maven");
		automation.add("Java");
		
		System.out.println(automation);
		
		// Converting the list to set so duplicates are removed
		HashSet<String> res = new HashSet<>(automation);
		System.out.println(res);
		
		// Again converting back to list from set with unique values
		List<String> finres = new ArrayList<>(res);
		System.out.println(finres);
		}

	}

