import java.util.Arrays;

public class MatrisTranspozu {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 9, 5 } };
		int[][] newValue = new int[arr[0].length][arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[0].length; k++) {
				newValue[k][i] = arr[i][k];
			}
		}
		
		for(int[] i: newValue) {
			for(int k: i) {
				System.out.print(k+ ", ");
			}System.out.println();
		}
		
	}
}
