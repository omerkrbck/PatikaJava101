import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("**********      TERS UCGEN      **********");
		System.out.print("Lutfen Ters Ucgenin Basamak Sayisini Giriniz : ");
		int n = input.nextInt();
		
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
 		
		    for (int k = 1; k <= (2 * (n - i) + 1); k++) {
			
			     System.out.print("*");
		    }
		    System.out.println();
		}
	}

}
