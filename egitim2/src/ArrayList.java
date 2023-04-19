import java.util.Arrays;
import java.util.Scanner;

public class ArrayList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Girmek istediğiniz dizi kaç elemanlı: ");
		int n = input.nextInt();
		int[] list = new int[n];
		int k = 0;
		System.out.println("Lütfen dizinizdeki sayıları girin: ");
		do {
			System.out.print((k + 1) + ". elemanı: ");
			int i = input.nextInt();
			String m = input.nextLine();
			list[k] = i;
			k++;
		} while (k < n);
		Arrays.sort(list);
		System.out.print("Sıralı olarak diziniz: " + Arrays.toString(list));
	}
}
