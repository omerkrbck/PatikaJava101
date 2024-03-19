import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        
		
		// ATM Projesi-if statement ile ...
		/*
		String userName, password;
		int right = 3;
		int balance = 1500;
		int select;
		
		Scanner input = new Scanner(System.in);

		// Login Islemi ...
		while (right != 0) {
			
			System.out.print("Lutfen Kullanici Adinizi Giriniz : ");
			userName = input.nextLine();
			
			System.out.print("Lutfen Sifrenizi Giriniz : ");
			password = input.nextLine();
			
			if (userName.equals("patika") && password.equals("java123")) {
				System.out.println("##################################################################");
				System.out.println("**********    Sisteme Giris Yaptiniz    **********");
				System.out.println("****   Kodluyoruz Bankasina Hosgeldiniz   ****");
				
				do {
					
					System.out.println("-------------------------------------------------");
					System.out.println("1-Para Yatirma\n" +
					                   "2-Para Cekme\n" + 
							           "3-Bakiye Sorgula\n" + 
					                   "4-Cikis Yap");
					System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz : ");
					select = input.nextInt();
					
					if (select == 1) {
						System.out.println("***  Para Yatirma Islemi  ***");
						System.out.print("Para Miktari : ");
						int price = input.nextInt();
						balance += price;
						
					} else if(select == 2) {
                        System.out.println("***  Para Cekme Islemi  ***");
						System.out.print("Para Miktari : ");
						int price = input.nextInt();
						
						if (price > balance) {
							
							System.out.println("Bakiye Yetersiz !\n" + 
							                   "Cekebileceginiz Para Miktari : " + balance);
						} else {

							balance -= price;
						}
					}else if (select == 3) {
						
						System.out.println("Bakiyeniz : " + balance);
					}
				} while (select !=4);
				System.out.println("Tekrar Gorusmek Uzere ...");
				break;
			} else {
				right--;
				
				if (right == 0) {
					
					System.out.println("Hesabiniz Bloke Olmustur. Lutfen Banka Ile Iletisime Geciniz..");
				} else {

					System.out.println("Hatali Giris Yaptiniz. Tekrar Deneyiniz.");
	                System.out.println("Kalan Hakkiniz : " + right);
				}
			}
		}*/
		
		// ATM Projesi - switch case yapisi ile ....
		
		String userName, password;
		int right = 3;
		int balance = 1500;
		int select;
		
		Scanner input = new Scanner(System.in);

		// Login Islemi ...
		while (right != 0) {
			
			System.out.print("Lutfen Kullanici Adinizi Giriniz : ");
			userName = input.nextLine();
			
			System.out.print("Lutfen Sifrenizi Giriniz : ");
			password = input.nextLine();
			
			if (userName.equals("patika") && password.equals("java123")) {
				System.out.println("##################################################################");
				System.out.println("**********    Sisteme Giris Yaptiniz    **********");
				System.out.println("****   Kodluyoruz Bankasina Hosgeldiniz   ****");
				
				do {
					
					System.out.println("-------------------------------------------------");
					System.out.println("1-Para Yatirma\n" +
					                   "2-Para Cekme\n" + 
							           "3-Bakiye Sorgula\n" + 
					                   "4-Cikis Yap");
					System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz : ");
					select = input.nextInt();
					
					// swtich case yapisi
					switch (select) {
					case 1:
						
						System.out.println("***  Para Yatirma Islemi  ***");
						System.out.print("Para Miktari : ");
						int price = input.nextInt();
						balance += price;
						break;
					case 2:
						System.out.println("***  Para Cekme Islemi  ***");
						System.out.print("Para Miktari : ");
						int price2 = input.nextInt();
						
						if (price2 > balance) {
							
							System.out.println("Bakiye Yetersiz !\n" + 
							                   "Cekebileceginiz Para Miktari : " + balance);
						} else {

							balance -= price2;
						}
						break;
					case 3:
						System.out.println("Bakiyeniz : " + balance);
						break;
					default:
						break;
					}
				} while (select !=4);
				System.out.println("Tekrar Gorusmek Uzere ...");
				break;
			} else {
				right--;
				
				if (right == 0) {
					
					System.out.println("Hesabiniz Bloke Olmustur. Lutfen Banka Ile Iletisime Geciniz..");
				} else {

					System.out.println("Hatali Giris Yaptiniz. Tekrar Deneyiniz.");
	                System.out.println("Kalan Hakkiniz : " + right);
				}
			}
		}
	}
}
