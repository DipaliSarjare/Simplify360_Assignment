package com.simplify.que1;

import java.util.*;

class Bouquet {
	
	private Map<String, Set<String>> bouquetMap;

	public Bouquet() {
		bouquetMap = new HashMap<>();
	}

	public void addFlower(String bouquetName, String flower, String color) {
		bouquetMap.putIfAbsent(bouquetName, new HashSet<>());
		Set<String> flowerSet = bouquetMap.get(bouquetName);
		flowerSet.add(flower + " - " + color);
	}

	public String findBouquet(String flower, String color) {
		for (Map.Entry<String, Set<String>> entry : bouquetMap.entrySet()) {
			Set<String> flowerSet = entry.getValue();
			for (String flowerInfo : flowerSet) {
				if (flowerInfo.contains(flower + " - " + color)) {
					return entry.getKey();
				}
			}
		}
		return "Output: None";
	}
}

