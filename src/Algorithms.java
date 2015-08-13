import java.util.List;
import java.util.ArrayList;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {

		int first = eggs.indexOf("cracked");

		return first;
	}

	public static int countPearls(List<Boolean> oysters) {

		int troo = 0;

		for (int i = 0; i < oysters.size(); i++) {

			boolean torf = oysters.get(i).booleanValue();

			if (torf == true) {

				troo++;

			}

		}

		return troo;
	}

	public static double findTallest(List<Double> peeps) {

		double tallest = 0;

		for (int i = 0; i < peeps.size(); i++) {

			double height = peeps.get(i).doubleValue();

			if (height > tallest) {

				tallest = height;

			}

		}

		return tallest;
	}

	public static String findLongestWord(List<String> words) {

		String longestWord = "";

		for (int i = 0; i < words.size(); i++) {

			if (words.get(i).length() > longestWord.length()) {

				longestWord = words.get(i);

			}

		}

		return longestWord;

	}

	public static boolean containsSOS(List<String> message1) {

		for (String s : message1) {

			boolean comparison = s.contains("... --- ...");

			if (comparison == true) {

				return true;

			}

		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {

		double score;

		int insert;

		ArrayList<Double> sortedResults = new ArrayList<Double>();

		for (int i = 0; i < results.size(); i++) {

			score = results.get(i);

			insert = 0;

			for (int j = 0; j < sortedResults.size(); j++) {

				if (sortedResults.get(j) > score) {

					break;
					
				}
				
					insert++;
			}

			sortedResults.add(insert, score);
			
			System.out.println(sortedResults);
		}

		return sortedResults;
	}

}
