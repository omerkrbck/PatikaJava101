import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Double boy, kilo, vki;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen Boyunuzu Giriniz(metre cinsinden) : ");
		boy = input.nextDouble();
		
		System.out.println("Lutfen Kilonuzu Giriniz(kg cinsinden) : ");
		kilo = input.nextDouble();
		input.close();
		
		vki = (kilo / (boy * boy));
		
		System.out.println("Vucut Kitle Indeksi : " + vki);
		
	}

}

