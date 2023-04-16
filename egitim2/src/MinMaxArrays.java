import java.util.Scanner;
import java.util.Arrays;

public class MinMaxArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen bir rakam giriniz: ");
		int n = input.nextInt();

		int[] array = new int[] { 45, 95, 62, 35, 2, 41, 18, -74, -32, -12, -5 };
		Arrays.sort(array);

		int max = 0, min=0;
		for (int i : array) {
			if(i>n) {
				max=i;
				break;
			}
		}
		for(int i=array.length-1; i>=0; i--) {
			if(n>array[i]) {
				min=array[i];
				break;
			}
		}
		System.out.println("Girilen rakamdan küçük, en büyük sayı: " + min);
		System.out.println("Girilen rakamdan büyük, en küçük sayı: " + max);
	}

}
