import java.nio.channels.SelectableChannel;
import java.util.Scanner;

public class Main {
	
	static int sum(int a, int b) {
		int result = a + b;
		System.out.println("Toplam : " + result);
		return result; 
	}
	
	static int minus(int a, int b) {
		int result = a - b;
		System.out.println("Cikarma : " + result);
		return result;
	}
	
	static int times(int a, int b) {
		int result = a * b;
		System.out.println("Carpma : " + result);
		return result;
	}
	
	static int divided(int a, int b) {
		if (b == 0) {
			System.out.println("Ikinci4 Sayi Sifirdan Farkli Olmali ..");
			return 0;
		}
		int result = a / b;
		System.out.println("Bolme : " + result);
		return result;
	}
	
	static int power(int a, int b) {
		int result = 1;
		for (int i = 1; i <= b; i++) {
			result *= a;
		}
		return result;
	}
	
	static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuc : " + result);
    }
	
	static int mod(int a, int b) {
		return a % b;
	}
	
	
	static void calc(int a, int b) {
		System.out.println("Dikdortgen Cevresi : " + (2 * (a + b)));
		System.out.println("Dikdortgen Alani : " + (2 * a * b));
	}
	
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int select;
		
		String menu = "*****   MENU   *****\n"
				      + "1- Toplama Islemi\n"
				      + "2- Cikarma Islemi\n"
				      + "3- Carpma Islemi\n"
				      + "4- Bolme islemi\n"
				      + "5- Uslu Sayi Hesaplama\n"
				      + "6- Faktoriyel Hesaplama\n"
				      + "7- Mod Alma\n"
				      + "8- Dikdortgen Alan ve Cevre Hesabi\n"
				      + "0- Cikis Yap : \n"
				      + "********************";
		
		while (true) {
			System.out.println(menu);
			System.out.print("Bir Islem Seciniz : ");
			select = input.nextInt();

			int a = 0;
			int b = 0;
			if (select == 0) {
				System.out.println("Hesap Makinesi Kapatiliyor ... ");
				break;
			}else if (select == 6) {
				System.out.println("*** Faktoriyel Hesaplama ***");
			} else {
				System.out.print("Ilk Sayiyi Giriniz : ");
				a = input.nextInt();
				System.out.print("Ikinci Sayiyi Giriniz : ");
				b = input.nextInt();
			}
			
			
			
			switch (select) {
			case 1:
			    sum(a, b);
				break;
			case 2:
				minus(a, b);
			    break;
			case 3:
				times(a, b);
				break;
			case 4:
				divided(a, b);
				break;
			case 5:
				System.out.println("Us Hesabi : " + power(a, b));
				break;
			case 6:	
				factorial();
				break;
			case 7:
				System.out.println("Mod Alma Islemi : " + mod(a, b));
				break;
			case 8:
				calc(a, b);
				break;
			default:
				System.out.println("Gecersiz Bir Islem Girdiniz .... ");
				break;
			}
		
		}
		
			
	}

}
