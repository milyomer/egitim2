import java.util.Scanner;

public class isPalindromic {

	static boolean isCheck(String check) {
		int j = check.length() - 1;
		int i=0;
		for (; i <j; i++) {
			if (check.charAt(i) != check.charAt(j)) {
				return false;
			}
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Lütfen bir kelime giriniz: ");
		String word = in.nextLine();
		System.out.println(isCheck(word));
	}

}
