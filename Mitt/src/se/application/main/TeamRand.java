package se.application.main;

import java.util.*;

public class TeamRand {
	int half;
	int antal;

	public void RandomTeam() {
		int[] aA;

		System.out.println("Hur många spelare ska vara med?");
		Scanner sc = new Scanner(System.in);
		antal = sc.nextInt();
		aA = new int[antal];

		half = antal / 2;

		System.out.println("Lag 1:");
		for (int i = 0; i < antal; i++) {
			Random rand = new Random();

			aA[i] = rand.nextInt(antal) + 1;
			if (i != 0) {
				while (aA[i] == aA[i] && aA[i] == aA[i - 1] && aA[i] == aA[i - 2] && aA[i] == aA[i - 3] && aA[i] == aA[i - 4]
						&& aA[i] == aA[i - 5] && aA[6] == aA[i - 7] && aA[i] == aA[i - 8] && aA[i] == aA[i - 9]
						&& aA[i] == aA[i - 10]) { // ska fixas!

					aA[i] = rand.nextInt(antal) + 1;

				}
			}

			if (i == half) {
				System.out.println("Lag 2:");
			}

			System.out.println(aA[i]);

		}

	}

}
