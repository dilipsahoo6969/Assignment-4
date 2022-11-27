package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FifthQuestion {

	public static void main(String[] args) {
		List<List<Integer>> fnlres = new ArrayList<>();
		List<Integer> res1 = Arrays.asList(11,22,23);
		List<Integer> res2 = Arrays.asList(9,19,29);
		List<Integer> res3 = Arrays.asList(7,17,27);
		fnlres.add(res1);
		fnlres.add(res2);
		fnlres.add(res3);
		System.out.println(fnlres);
		}

	}

