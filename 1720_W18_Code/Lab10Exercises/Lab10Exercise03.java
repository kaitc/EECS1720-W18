package Lab10Exercises;

import java.io.PrintStream;
import java.util.Map;
import java.util.TreeMap;

/**
 * This app will access internal data that consists of a list of fruit names. It
 * determines the number of fruit names that begin with each letter of the
 * alphabet. Then it prints two tab-delimited tokens to the console: the first
 * token is the letter of the alphabet, the second token is the number of fruit
 * names that start with that letter.
 * 
 * If a given letter of the alphabet doesn't have any fruit names, then the app
 * doesn't necessarily print out that letter (with the second token of 0).
 * 
 * 
 * @author <to be completed>
 *
 */
public class Lab10Exercise03 {

	public static void main(String[] args) {
		PrintStream out = System.out;

		String[] theFruits = { "Apple", "Akee", "Apricot", "Avocado", "Banana", "Bilberry", "Blackberry",
				"Blackcurrant", "Black sapote", "Blueberry", "Boysenberry", "Currant", "Cherry", "Cherimoya",
				"Chico fruit", "Cloudberry", "Coconut", "Cranberry", "Cucumber", "Damson", "Date", "Dragonfruit",
				"Durian", "Elderberry", "Feijoa", "Fig", "Goji berry", "Gooseberry", "Grape", "Grapefruit", "Guava",
				"Honeyberry", "Huckleberry", "Jabuticaba", "Jackfruit", "Jambul", "Japanese plum", "Jostaberry",
				"Jujube", "Juniper berry", "Kiwano (horned melon)", "Kiwifruit", "Kumquat", "Lemon", "Lime", "Loquat",
				"Longan", "Lychee", "Mango", "Mangosteen", "Marionberry", "Melon", "Cantaloupe", "Honeydew",
				"Watermelon", "Miracle fruit", "Mulberry", "Nectarine", "Nance", "Olive", "Orange", "Blood orange",
				"Clementine", "Mandarine", "Tangerine", "Papaya", "Passionfruit", "Peach", "Pear", "Persimmon",
				"Plantain", "Plum", "Pineapple", "Pineberry", "Plumcot (or Pluot)", "Pomegranate", "Pomelo",
				"Purple mangosteen", "Quince", "Raspberry", "Salmonberry", "Rambutan", "Redcurrant", "Salal berry",
				"Salak", "Satsuma", "Soursop", "Star apple", "Star fruit", "Strawberry", "Surinam cherry", "Tamarillo",
				"Tamarind", "Ugli fruit", "Yuzu" };

		Map<String, Integer> myMap = new TreeMap<String, Integer>();


	}

}
