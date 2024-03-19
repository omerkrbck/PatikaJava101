import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("##################### UCGEN ALAN HESAPLAMA ##########################");
		System.out.print("1. Kenar Uzunlugunu Giriniz : ");
		
		double a = input.nextDouble();
		
        System.out.print("2. Kenar Uzunlugunu Giriniz : ");
		
		double b = input.nextDouble();
		
        System.out.print("3. Kenar Uzunlugunu Giriniz : ");
		
		double c = input.nextDouble();
		
		double cevre = a + b + c;
		
		double u = cevre / 2;
		
		double alan = Math.sqrt((u * (u - a) * (u - b) * (u - c)));
		
		System.out.println("Ucgenin Alani : " + alan);
	}

}
