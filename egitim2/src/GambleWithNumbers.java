import java.util.Random;
import java.util.Scanner;

public class GambleWithNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int number = rand.nextInt(100);
		int right = 0;
		int value;
		int[] numb = new int[5];
		boolean isFail = false;
		boolean isWin = false;
		System.out.println(number);

		do {
			System.out.print("Lütfen tahmininizi girin: ");
			value = input.nextInt();
			if (value <= 0 || value > 99) {
				if (isFail) {
					right++;
					System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız: " + (5 - right));
				} else {
					isFail = true;
					System.out.println("Hatalı giriş yaptınız. Tekrar deneyin.");
					System.out.println("Sonraki hatalı denemenizde hakkınızdan düşücektir.");
				}
				continue;
			}
			if (value == number) {
				System.out.println(value + " rakamı gizli sayı ile aynıdır.");
				System.out.println("Tebrikler. Kazandınız!!.");
				isWin = true;
				break;
			}
			if (value < number) {
				System.out.println(value + " rakamı gizli sayıdan küçüktür.");
			} else {
				System.out.println(value + " rakamı gizli sayıdan büyüktür.");
			}
			numb[right] = value;
			right++;
			System.out.println(
					right == 5 ? "Son hakkınızı kullanıdınız." : "Tekrar deneyiniz. Kalan hakkınız: " + (5 - right));
		} while (right < 5);
		if (!isWin) {
			System.out.println("Kaybettiniz. Gizli rakam: " + number);
			if (!isFail) {
				System.out.print("Girdiğiniz rakamlar:\n[");
				for (int i : numb) {
					System.out.print(i + ", ");
				}
				System.out.print("]");
			}
		}
	}

}
