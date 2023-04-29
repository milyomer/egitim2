package MineGame;

import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
	int n, k;
	int row, col;
	int row2 = 0, col2 = 0;
	String[][] mineFrame;
	String[][] gameFrame;
	boolean isFailed = false;
	int count = 0, step = 0, mines = 0;

	void defaulter() {
		for (int i = 0; i < mineFrame.length; i++) {
			for (int j = 0; j < mineFrame[i].length; j++) {
				mineFrame[i][j] = " - |";
				gameFrame[i][j] = " - |";
			}
		}
	}

	MineSweeper(int n, int k) {
		this.n = n;
		this.k = k;
		Random frame = new Random();
		this.mines = (this.n * this.k) / 4;
		this.step = (this.n * this.k) - this.mines;
		mineFrame = new String[this.n][this.k];
		gameFrame = new String[this.n][this.k];

		defaulter();
		while (this.mines > 0) {
			int row = frame.nextInt(this.n);
			int col = frame.nextInt(this.k);
			if (mineFrame[row][col] != " * |") {
				mineFrame[row][col] = " * |";
				this.mines--;
			}
		}

	}

	boolean isTrue() {
		if ((row2 >= this.n || row2 < 0) || (col2 >= this.k || col2 < 0)) {
			System.out.println("Hatalı giriş. Tekrar Deneyin");
			return false;
		}
		return true;
	}

	void isCheck() {
		Scanner io = new Scanner(System.in);
		do {
			do {
				System.out.print("Satır seçiniz: ");
				row2 = io.nextInt();
				System.out.print("Sütun seçiniz: ");
				col2 = io.nextInt();
			} while (!isTrue());

			if (mineFrame[row2][col2].equals(" * |")) {
				isFailed = true;
				break;
			}

			for (int i = (row2 - 1 < 0 ? row2 : row2 - 1); i <= (row2 + 1 >= mineFrame.length ? row2 : row2 + 1); i++) {
				for (int j = (col2 - 1 < 0 ? col2 : col2 - 1); j <= (col2 + 1 >= mineFrame[i].length ? col2
						: col2 + 1); j++) {
					if (mineFrame[i][j].equals(" * |")) {
						count++;
					}
				}
				System.out.println();
			}
			if (gameFrame[row2][col2] == " - |") {
				gameFrame[row2][col2] = String.valueOf(" " + count + " |");
				this.step--;
			}
			count = 0;
			printInfo();

		} while (this.step != 0);
		if (this.step == 0) {
			System.out.print("Tebrikler. Kazandınız.");
		}
	}

	void printInfo() {
		for (int a = 0; a <= gameFrame.length; a++)
			System.out.print("===");
		System.out.println();

		for (int l = 0; l < gameFrame.length; l++) {
			for (int m = 0; m < gameFrame[l].length; m++) {
				System.out.print(gameFrame[l][m]);
			}
			System.out.println();
		}

	}

	void run() {
		for (int i = 0; i < mineFrame.length; i++) {
			for (int j = 0; j < mineFrame[i].length; j++) {
				System.out.print(mineFrame[i][j]);
			}
			System.out.println();
		}
		printInfo();
		isCheck();
		winOrLost();

	}

	void winOrLost() {
		if (isFailed) {
			System.out.println("Geçmiş olsun Kaybettiniz.");
		}
	}
}
