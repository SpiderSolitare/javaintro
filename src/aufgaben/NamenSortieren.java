package aufgaben;

import java.util.ArrayList;
import java.util.Collections;

public class NamenSortieren {
	public static void main(String[] args) {
		ArrayList<String> pupils = new ArrayList<String>();
		pupils.add("Leo");
		pupils.add("Martin");
		pupils.add("Feder");
		pupils.add("David");
		pupils.add("Oleg");
		pupils.add("Chemmy");
		pupils.add("Viktor");
		pupils.add("Basti");

		Collections.sort(pupils);

		for (String i : pupils) {
			System.out.println(i);
		}
	}
}
