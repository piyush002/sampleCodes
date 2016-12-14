package com.sample.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ZipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 99, B = 99;
		String aTemp = String.valueOf(A);
		String bTemp = String.valueOf(B);
		StringBuilder result = new StringBuilder("");
		int loopSize = Math.min(aTemp.length(), bTemp.length());
		for (int i = 0; i < loopSize; i++) {
			result.append(aTemp.charAt(i)).append(bTemp.charAt(i));
		}
		if (aTemp.length() > bTemp.length())
			System.out.println(result.append(aTemp.substring(loopSize,
					aTemp.length())));
		else
			System.out.println(result.append(bTemp.substring(loopSize,
					bTemp.length())));
		//Another Example
		/*int a[]={5,10,51,10,4,51,3,4,5};
		ZipTest z1=new ZipTest();
		System.out.println(z1.arrayResult(a).toString());*/
	}

	public List<Integer> arrayResult(int a[]) {
		List<Integer> a1 = new ArrayList<Integer>();
		Set<Integer> unique = Arrays.stream(a).boxed()
				.collect(Collectors.toSet());
		List<Integer> bestSol2 = new ArrayList<Integer>();
		if (a.length < 2)
			return Arrays.stream(a).boxed().collect(Collectors.toList());

		// return Arrays.asList(a);

		for (int i = 0; i < a.length; i++) {
			// int y=a[i];
			if (i == 0)
				a1.add(a[i]);
			else {

				if (a1.get(0) == a[i])
					a1.remove(0);
				a1.add(a[i]);
				if (a1.containsAll(unique)) {
					while (a1.subList(1, a1.size()).contains(a1.get(0))) {
						a1.remove(0);

					}

					if (unique.size() == a1.size())
						return a1;
					if (bestSol2 == null || bestSol2.size() < a1.size())
						bestSol2 = a1;

				}
			}
			// if(IntStream.of(a1).anyMatch(x -> x == y));
		}
		while (bestSol2.subList(0, bestSol2.size() - 1).contains(
				bestSol2.get(bestSol2.size() - 1))) {
			bestSol2.remove(bestSol2.size() - 1);

		}
		return bestSol2;
	}
}
