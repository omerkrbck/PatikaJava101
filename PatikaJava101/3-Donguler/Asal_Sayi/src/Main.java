import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("********** 1-100 Arasindaki Asal Sayilar **********");
		System.out.print("2 3 5 ");
		for (int i = 6; i <= 100; i++) {
			
			if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0)) {
				
				System.out.print(" " + i);
			}
		}
	}
}
