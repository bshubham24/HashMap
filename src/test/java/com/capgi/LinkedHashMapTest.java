package com.capgi;

import org.junit.Assert;
import org.junit.Test;

public class LinkedHashMapTest {
	@Test
	public void givenParagraphReturnFrequencyOfDesiredWord() {
		String sentence = "Paranoids are not paranoid " + "because they are paranoid "
				+ "but because they keep putting themselves deliberately " + "into paranoid avoidable situations";
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = linkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			linkedHashMap.add(word, value);
		}
		int frequency = linkedHashMap.get("paranoid");
		System.out.println(linkedHashMap);
		Assert.assertEquals(3, frequency);
	}

	@Test
	public void WhenGivenWordFromParagraphRemoveThatWord() {
		String sentence = "Paranoids are not paranoid " + "because they are paranoid "
				+ "but because they keep putting themselves deliberately " + "into paranoid avoidable situations";
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = linkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			linkedHashMap.add(word, value);
		}
		System.out.println(linkedHashMap);
		linkedHashMap.remove("avoidable");
		System.out.println(linkedHashMap);
		Assert.assertEquals(null, linkedHashMap.get("avoidable"));
	}
}