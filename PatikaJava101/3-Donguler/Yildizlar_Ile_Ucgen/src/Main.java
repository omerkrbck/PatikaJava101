import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Yildizlar ile ucgen yapimi ...
		/*
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("**********   Yildizlar Ile Ucgen Yapimi   ***********");
		System.out.print("Lutfen Basamak Sayisini Giriniz : ");
		n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= (n-i); j++) {
				
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}*/
		
		
		// Yildizlar ile elmas yapimi ...
		
        Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("**********   Yildizlar Ile Elmas Yapimi   ***********");
		System.out.print("Lutfen Basamak Sayisini Giriniz : ");
		n = input.nextInt();
		
		// Elmasin Ust Tarafi ...
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= (n-i); j++) {
				
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// Elmasin Alt Tarafi ...
		for (int i = 1; i <= (n - 1); i++) {

			for (int j = 1; j <= i; j++) {
				
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * (n - i) - 1); k++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
