package aufgaben;

import java.util.ArrayList;

public class NamenSortieren {

	public static void main(String[] args) {

		ArrayList<String> pupils = new ArrayList<String>();
		pupils.add("Martina");
		pupils.add("Leo");
		pupils.add("Martin");
		pupils.add("Fedor");
		pupils.add("David");
		pupils.add("Oleg");
		pupils.add("Chemmy");
		pupils.add("Viktor");
		pupils.add("Basti");

		for (int j = 0; j < pupils.size() - 1; j++) {
			for (int i = 0; i < pupils.size() - 1; ++i) {
				if (pupils.get(i).compareTo(pupils.get(i + 1)) > 0) {

					String temporary = pupils.get(i);
					pupils.set(i, pupils.get(i + 1));
					pupils.set(i + 1, temporary);
				}
			}
		}
		System.out.print(pupils);
	}

}