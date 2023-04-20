import java.util.Arrays;

public class RepeatNumbersPiece {

	public static void main(String[] args) {
		int[] list = new int[] { 10, 20, 20, 10, 10, 20, 5, 20 };
		Arrays.sort(list);
		int k = 1, i = 0;
		System.out.println(Arrays.toString(list));
		while (i < list.length) {
			if (i == 0) {
				for (int j = 0; j < list.length; j++) {
					if ((i != j) && (list[i] == list[j])) {
						k++;
					}
				}
				System.out.println(list[i] + " sayısı: " + k + " kere tekrar edildi.");
				k = 1;
			} else if (list[i] != list[i - 1]) {
				for (int j = 0; j < list.length; j++) {
					if ((i != j) && (list[i] == list[j])) {
						k++;
					}
				}

				System.out.println(list[i] + " sayısı: " + k + " kere tekrar edildi.");
			}
			k = 1;
			i++;
		}
	}
}
