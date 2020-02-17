package aufgaben;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerArreyList {

	public static void main(String[] args) {

		Scanner sV = new Scanner(System.in);
		String line = "";
		ArrayList<String> list = new ArrayList<String>();

		while (!line.equals("x")) {
			line = sV.nextLine();
			if (!line.equals("x")) {

				list.add(line);

			}
		}

		for (int j = 0; j < list.size() - 1; j++) {
			for (int i = 0; i < list.size() - 1; ++i) {
				if (list.get(i).compareTo(list.get(i + 1)) > 0) {

					String temporary = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temporary);
				}
			}
		}
		System.out.println(list);

	}
}
