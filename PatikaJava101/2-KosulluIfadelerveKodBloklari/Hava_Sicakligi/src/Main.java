import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int heat;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sicaklik Giriniz : ");
		heat  = input.nextInt();
		
		if (heat < 5) {
			System.out.println("Kayak Yapabilirsin...");
		} else if (heat >=5 && heat < 10) {
			System.out.println("Sinemaya Gidebilirsin...");
		}else if (heat >= 10 && heat < 15) {
			System.out.println("Sinemaya Gidebilirsin...\nPiknige Gidebilirsin...");
		}else if (heat >= 15 && heat < 25) {
			System.out.println("Piknige Gidebilirsin...");
		}else {
			System.out.println("Yuzmeye Gidebilirsin..");
		}
	}
}
