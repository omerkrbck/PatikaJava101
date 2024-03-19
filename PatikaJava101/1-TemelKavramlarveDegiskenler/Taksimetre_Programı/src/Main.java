import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int km;
		
		double perKm = 2.2, total , startPrice = 10;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen Mesafeyi KM cinsinden giriniz : ");
		
		km = input.nextInt();
		
		total = startPrice+ (km * perKm);
		
		total = (total < 20)? 20 : total;
		
		System.out.println("Toplam Tutar : " + total);
		
	}

}
