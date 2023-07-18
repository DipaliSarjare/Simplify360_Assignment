package com.simplify.que1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Bouquet bouquet = new Bouquet();

		// Adding flowers to the bouquet
		bouquet.addFlower("Bouquet1", "Rose", "Red");
		bouquet.addFlower("Bouquet1", "Rose", "White");
		bouquet.addFlower("Bouquet1", "Rose", "Yellow");
		bouquet.addFlower("Bouquet1", "Tulip", "White");
		bouquet.addFlower("Bouquet1", "Tulip", "Purple");
		bouquet.addFlower("Bouquet1", "Lily", "White");

		bouquet.addFlower("Bouquet2", "Rose", "Pink");
		bouquet.addFlower("Bouquet2", "Rose", "Orange");
		bouquet.addFlower("Bouquet2", "Chrysanthemum", "Yellow");
		bouquet.addFlower("Bouquet2", "Balsam", "Pink");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the flower: ");
		String flower = scanner.nextLine();

		System.out.print("Enter the color: ");
		String color = scanner.nextLine();

		String result = bouquet.findBouquet(flower, color);
		System.out.println("Output :"+result);
	}
}