import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userName, password;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanici Adiniz : ");
		userName = input.nextLine();
		
		System.out.print("Sifreniz : ");
		password = input.nextLine();
		
		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giris Yaptiniz ... ");
		}else {
			System.out.println("Bilgileriniz Yanlis ... ");
			int select;
			System.out.println("Sifrenizi Sifirlamak Ister Misiniz? -Evet..1 -Hayir..2 Tuslayin.");
			select = input.nextInt();
			
			switch (select) {
			case 1:
				Scanner input2 = new Scanner(System.in);
				System.out.print("Lutfen Yeni Sifrenizi Giriniz : ");
				String newPassword = input2.nextLine();
				input.nextLine();
				
				if (newPassword.equals("java123")) {
					System.out.println("Sifre Olusturulamadi, Lutfen Baska Sifre Giriniz...");
				}else {
					System.out.println("Yeni Sifre Basarili Bir Sekilde Olusturuldu...");
				}
				break;
			case 2:
				System.out.println("Sifreniz Yanlis...");
				break;
			default:
				System.out.println("Yanlis Secim Yaptiniz...");
				break;
			}
		}
	}
}
