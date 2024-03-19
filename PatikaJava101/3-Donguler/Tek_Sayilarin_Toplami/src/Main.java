import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;
		int total = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Lutfen Sayi Giriniz : ");
			n = input.nextInt();
			
			if ((n %2 == 0) && (n %4 == 0)) {
				
				total += n;
			}
		} while (n > 0);
		
		System.out.println("Girilen degerlerden cift ve 4'un katlari olan sayilarin toplami : " + total);
	}
}
