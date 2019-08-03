package com.string.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public void findIt(String str) {
		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for (Character ch : charArray) {
			System.out.println("iput Char ::    " +ch);
			if (baseMap.containsKey(ch)) {
				System.out.println("duplicate Char" + baseMap.get(ch));
				baseMap.put(ch, baseMap.get(ch) + 1);
			} else {
				baseMap.put(ch, 1);
			}
		}
		Set<Character> keys = baseMap.keySet();
		for (Character ch : keys) {
			System.out.println(ch + "  is___________ " + baseMap.get(ch) + " times");
			if (baseMap.get(ch) > 1) {
				System.out.println(ch + "  is " + baseMap.get(ch) + " times");
			}
		}
	}

	public static void main(String a[]) {
		DuplicateCharacters dcf = new DuplicateCharacters();
		dcf.findIt("india is my country iiiiiiiiiiiiiiiiii");
	}

}
