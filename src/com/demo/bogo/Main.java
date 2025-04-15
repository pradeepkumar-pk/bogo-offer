package com.demo.bogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	/*	Example 1:
			•	Input:
				o	Product Price List: [10, 20, 30, 40, 50, 60]
			•	Output:
				o	Discounted Items (Free): [50, 30, 10]
				o	Payable Items: [60, 40, 20]
			
		Example 2:
			•	Input:
				o	Product Price List: [10, 20, 30, 40, 50, 50, 60]
			•	Output:
				o	Discounted Items (Free): [50, 40, 20]
				o	Payable Items: [60, 50, 30, 10] */

		
		List<Integer> productPriceList = Arrays.asList(10, 20, 30, 40, 50, 50, 60);
		
		productPriceList.sort((o1, o2) -> o2-o1);
		System.out.println(productPriceList);
		
		Map<Object, List<Integer>> bogoo= new HashMap<Object, List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		for(int i=0; i<productPriceList.size(); i++) {
			if(i%2!=0)
				l1.add(productPriceList.get(i));
			else
				l2.add(productPriceList.get(i));
		}
		bogoo.put("free", l1);
		bogoo.put("payable", l2);
		
		System.out.println(bogoo);	
		
	}
}
