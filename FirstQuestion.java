package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstQuestion {

	public static void main(String[] args) {
		List<String> automation = new ArrayList<>();
		automation.add("Java");
		automation.add("Selenium");
		automation.add("TestNG");
		automation.add("Git");
		automation.add("GitHub");
		
		System.out.println(automation);
		System.out.println("Printing the List in reverse order");
		
		// the number list will be reversed using this method
		Collections.reverse(automation);
		System.out.println(automation);

	}

}
