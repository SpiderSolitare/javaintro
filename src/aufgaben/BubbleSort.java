package aufgaben;

public class BubbleSort {

	public static void main(String[] args) {
		

		int[] z = { 9, 1, 5, 7, 4, 6, 3, 2, 8, 0 };

		for (int j = 0; j < z.length - 1; j++) {
			for (int i = 0; i < z.length - 1; i++) {
				if (z[i] > z[i + 1]) {
					int x = z[i];
					z[i] = z[i + 1];
					z[i + 1] = x;

				}

			}

		}
		
		System.out.println(z[0]);
		System.out.println(z[1]);
		System.out.println(z[2]);
		System.out.println(z[3]);
		System.out.println(z[4]);
		System.out.println(z[5]);
		System.out.println(z[6]);
		System.out.println(z[7]);
		System.out.println(z[8]);
		System.out.println(z[9]);

	}

}