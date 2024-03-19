import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("*****   Min - Max Sayilari Bulma   *****");
		System.out.print("Kac Tane Sayi Gireceksiniz : ");
		int n = input.nextInt();
		
		System.out.print("1. Sayiyi Giriniz : ");
		int number = input.nextInt();
		
		int minNumber, maxNumber;
		
		minNumber = number;
		maxNumber = number;
		
		for (int i = 2; i <= n; i++) {
			
			System.out.print(i + ". Sayiyi Giriniz : ");
			number = input.nextInt();
			
			if (number > maxNumber) {
				
				maxNumber = number;
			} else if (number < minNumber) {
				
				minNumber = number;
			}
		}
		System.out.println("******************************************************");
		System.out.println("En Buyuk Sayi : " + maxNumber);
		System.out.println("En Kucuk Sayi : " + minNumber);
		System.out.println("******************************************************");

	}
}
