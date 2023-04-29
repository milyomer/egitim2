package MineGame;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen satır sayısı giriniz: ");
		int n= input.nextInt();
		System.out.print("Lütfen sütun sayısı giriniz: ");
		int k= input.nextInt();
		
		MineSweeper mine= new MineSweeper(n,k);
		mine.run();
	}

}
