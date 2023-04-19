
public class LetterArray {
	public static void main(String[] args) {
		int[][] letter = new int[6][4];

		for (int i = 0; i < letter.length; i++) {
			for (int k = 0; k < letter[i].length; k++) {
				if (i != 0 && i != 2 && i!=5) {
					if (k != 0 && k != 3) {
						System.out.print("   ");
					} else {
						System.out.print(" * ");
					}
				} else {
					if(k!=3)
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}
}
