import java.util.Arrays;

public class RepeatNumbers {

	static boolean isTrue(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] list = new int[] { 5, 4, 98, 72, 6, 31, 25, 40, 9, 1, 5, 6, 45, 72 };
		int[] duplicate = new int[list.length];
		int a = 0;
		for (int i = 0; i < list.length; i++) {
			for (int k = 0; k < list.length; k++) {
				if ((i != k) && (list[i] == list[k])&& list[i]%2==0) {
					if (!isTrue(duplicate, list[i])) {
						duplicate[a++] = list[i];
						break;
					}
				}
			}
		}
		for (int i : duplicate) {
			if (i != 0) {
				System.out.print(i+ ", ");
			}
		}

	}
}
