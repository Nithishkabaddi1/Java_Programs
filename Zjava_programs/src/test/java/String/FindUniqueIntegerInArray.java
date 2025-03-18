package String;

import java.util.HashMap;

public class FindUniqueIntegerInArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 1, 2, 3 };

		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		for (int c : a) {
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);
			}
		}
		System.out.print("the unique integers are : ");
		for (int key : hmap.keySet()) {

			if (hmap.get(key) == 1) {
				System.out.print(key + " ");
			}
		}}}
