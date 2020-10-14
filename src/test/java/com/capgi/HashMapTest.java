/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.capgi;

import org.junit.Assert;
import org.junit.Test;

public class HashMapTest {
	@Test
	public void givenSentenceReturnFrequencyOfEachWord() {
		String sentence = "To be or not to be";
		HashMap<String, Integer> hashMap = new HashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = hashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			hashMap.add(word, value);
		}
		Integer frequency = hashMap.get("to");
		System.out.println(hashMap);
		Assert.assertEquals(2, (int) frequency);
	}
}
