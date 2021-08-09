package com.yzm.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * after ask for hr , i still don't understand the meaning of the topic 
 * with 'The program need to support converting the digits from 0 to 99 into letters'?
 * can i required an input & output exmaple?
 * @author yanzengming
 *
 */
public class Coding {
	/**
	 * only match to the next one button
	 * @param arr
	 * @return
	 */
	public static String function1(int[] arr) {
		System.out.println("input:"+Arrays.toString(arr));
		
		//mapping digit to the telephone buttons
		Map<Integer,List<Character>> map = new HashMap<Integer, List<Character>>();
		map.put(2, Arrays.asList('a','b','c'));
		map.put(3, Arrays.asList('d','e','f'));
		map.put(4, Arrays.asList('g','h','i'));
		map.put(5, Arrays.asList('j','k','l'));
		map.put(6, Arrays.asList('m','n','o'));
		map.put(7, Arrays.asList('p','q','r','s'));
		map.put(8, Arrays.asList('t','u','v'));
		map.put(9, Arrays.asList('w','x','y','z'));
		
		List<List<Character>> list = new ArrayList<List<Character>>(arr.length);
		for (int i : arr) {
			if (i >= 2 || i <= 9) {
				list.add(map.get(i));
			}
		}
		
		System.out.println("every button's elements ="+list);
		StringBuilder sb = new StringBuilder();
		if (list.size() == 1) {
			list.get(0).forEach(e->sb.append(e).append(" "));
		}else {
			for (int i = 0; i < list.size()-1; i++) {
				List<Character> btn1 = list.get(i);
				List<Character> btn2 = list.get(i+1);
				for (int k = 0; k < btn1.size(); k++) {
					for (int j = 0; j < btn2.size(); j++) {
						sb.append(btn1.get(k)).append(btn2.get(j)).append(" ");
					}
					
				}
			}
		}
		System.out.println("output:" + sb.toString());
		return sb.toString().trim();
	}
	
	/**
	 * if input a array's length is greater than 3
	 * the array[0] will match array[2] 
	 * the others are the same  (for example:array's length is six,array[1] match array[5])
	 * @param arr
	 * @return
	 */
	public static String function2(int[] arr) {
		System.out.println("input:"+Arrays.toString(arr));
		
		//mapping digit to the telephone buttons
		Map<Integer,List<Character>> map = new HashMap<Integer, List<Character>>();
		map.put(2, Arrays.asList('a','b','c'));
		map.put(3, Arrays.asList('d','e','f'));
		map.put(4, Arrays.asList('g','h','i'));
		map.put(5, Arrays.asList('j','k','l'));
		map.put(6, Arrays.asList('m','n','o'));
		map.put(7, Arrays.asList('p','q','r','s'));
		map.put(8, Arrays.asList('t','u','v'));
		map.put(9, Arrays.asList('w','x','y','z'));
		
		StringBuilder sb = new StringBuilder();
		List<List<Character>> list = new ArrayList<List<Character>>(arr.length);
		for (int i = 0; i < arr.length -1; i++) {
			if (arr[i] >= 2 || arr[i] <= 9) {
				for (int j = i+1; j < arr.length; j++) {
					List<Character> btn1 = map.get(arr[i]);
					List<Character> btn2 = map.get(arr[j]);
					for (int k = 0; k < btn1.size(); k++) {
						for (int h = 0; h < btn2.size(); h++) {
							sb.append(btn1.get(k).toString()).append(btn2.get(h).toString()).append(" ");
						}
					}
				}
			}
		}
		
		System.out.println("every button's elements ="+list);
		
		System.out.println("output:" + sb.toString());
		return sb.toString().trim();
	}
	
	public static void main(String[] args) {
		function1(new int[]{9});
		System.out.println();
		function1(new int[]{2,3,4});
		System.out.println();
		function2(new int[]{2,3,4});
		System.out.println();
		function2(new int[]{9});
		
	}
}
