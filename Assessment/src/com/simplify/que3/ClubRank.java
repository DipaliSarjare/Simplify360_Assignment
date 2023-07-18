package com.simplify.que3;

public class ClubRank {
	public static void main(String[] args) {
	//String[] players = {"p1", "p2", "p3", "p4", "p5"};
	int[] ranks = { 20, 5, 28, 67, 44 };
	int maxRank = ranks[0];

	// Find the maximum rank among the existing players
	for (int i = 1; i < ranks.length; i++) {
		if (ranks[i] > maxRank) {
			maxRank = ranks[i];
		}
	}

	int harperRank = maxRank + 1;
	System.out.println("Harper's rank: " + harperRank);
}

}
