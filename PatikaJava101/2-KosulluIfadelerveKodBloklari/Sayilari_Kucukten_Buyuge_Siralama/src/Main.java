import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a, b, c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. Sayiyi Giriniz(a) : ");
		a = input.nextInt();
		
		System.out.print("2. Sayiyi Giriniz(b) : ");
		b= input.nextInt();
		
		System.out.print("3. Sayiyi Giriniz(c) : ");
		c = input.nextInt();
		
		if ((a < b) && (a < c)) {
			
			if (b < c) {
				System.out.println("Siralama : a < b < c");
			}else {
				System.out.println("Siralama : a < c < b");
			}
		}else if ((b < a) && (b < c)) {
			
			if (a < c) {
				System.out.println("Siralama : b < a < c");
			}else {
				System.out.println("Siralama : b < c < a");
			}
		}else if ((c < a) && (c < b)) {
			
			if (a < b) {
				System.out.println("Siralama : c < a < b");
			}else {
				System.out.println("Siralama : c < b < a");
			}
		} 
	}

}
