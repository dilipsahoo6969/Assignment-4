package assignment4;

import java.util.ArrayList;
import java.util.List;

public class SecondQuestion {

	public static void main(String[] args) {
		List<String> automation = new ArrayList<>();
		automation.add("Git");
		automation.add("GitHub");
		automation.add("GitLab");
		automation.add("GitBash");
		automation.add("Selenium");
		automation.add("Java");
		automation.add("Maven");
		
		System.out.println(automation);
		
		automation.remove("Java");
		automation.remove("Maven");
		System.out.println(automation);
		}

	}

