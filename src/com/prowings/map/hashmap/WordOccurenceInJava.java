package com.prowings.map.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class WordOccurenceInJava {

	public static void main(String[] args) {

		String text = "india is my country and india Is Beautiful !!!";

		text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
		String[] words = text.split(" ");

		HashMap<String, Integer> wordCountMap = new HashMap<>();
		for (String word : words) {
			if (wordCountMap.containsKey(word)) {

				int count = wordCountMap.get(word);
				wordCountMap.put(word, count + 1);

			} else {
				wordCountMap.put(word, 1);
			}
		}
		for (String word : wordCountMap.keySet()) {
			int count = wordCountMap.get(word);
			System.out.println(word + ": " + count);
		}

	}
}
