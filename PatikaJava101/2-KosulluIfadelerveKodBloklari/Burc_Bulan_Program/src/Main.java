import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int month, day;
		String burc ="";
		boolean isError = false;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("**********    Burc Bulan Programa Hosgeldiniz    **********");
		System.out.print("Dogdugunuz Ay : ");
		month = input.nextInt();
		
		System.out.print("Dogdugunuz Gun : ");
		day = input.nextInt();
		
		if (month == 1) {    // Ocak Ayi
			
			if (day >=1 && day <=31) {
				if (day < 22) {
					burc = "Oglak";
				}else {
					burc = "Kova";
				}
			}else {
				isError = true;
			}
		}else if (month == 2) {    // Subat Ayi
			
			if (day >=1 && day <=28) {
				if (day < 20) {
					burc = "Kova";
				}else {
					burc = "Balik";
				}
			}else {
				isError = true;
			}
		}else if (month == 3) {    // Mart Ayi
			
			if (day >=1 && day <=31) {
				if (day < 21) {
					burc = "Balik";
				}else {
					burc = "Koc";
				}
			}else {
				isError = true;
			}
		}else if (month == 4) {    // Nisan Ayi
			
			if (day >=1 && day <=30) {
				if (day < 21) {
					burc = "Koc";
				}else {
					burc = "Boga";
				}
			}else {
				isError = true;
			}
		}else if (month == 5) {    // Mayis Ayi
			
			if (day >=1 && day <=31) {
				if (day < 22) {
					burc = "Boga";
				}else {
					burc = "Ikizler";
				}
			}else {
				isError = true;
			}
		}else if (month == 6) {    // Haziran Ayi
			
			if (day >=1 && day <=30) {
				if (day < 23) {
					burc = "Ikizler";
				}else {
					burc = "Yengec";
				}
			}else {
				isError = true;
			}
		}else if (month == 7) {    // Temmuz Ayi
			
			if (day >=1 && day <=31) {
				if (day < 23) {
					burc = "Yengec";
				}else {
					burc = "Aslan";
				}
			}else {
				isError = true;
			}
		}else if (month == 8) {    // Agustos Ayi
			
			if (day >=1 && day <=31) {
				if (day < 23) {
					burc = "Aslan";
				}else {
					burc = "Basak";
				}
			}else {
				isError = true;
			}
		}else if (month == 9) {    // Eylul Ayi
			
			if (day >=1 && day <=30) {
				if (day < 23) {
					burc = "Basak";
				}else {
					burc = "Terazi";
				}
			}else {
				isError = true;
			}
		}else if (month == 10) {    // Ekim Ayi
			
			if (day >=1 && day <=31) {
				if (day < 23) {
					burc = "Terazi";
				}else {
					burc = "Akrep";
				}
			}else {
				isError = true;
			}
		}else if (month == 11) {    // Kasim Ayi
			
			if (day >=1 && day <=30) {
				if (day < 22) {
					burc = "Akrep";
				}else {
					burc = "Yay";
				}
			}else {
				isError = true;
			}
		}else if (month == 12) {    // Aralik Ayi
			
			if (day >=1 && day <=31) {
				if (day < 22) {
					burc = "Yay";
				}else {
					burc = "Oglak";
				}
			}else {
				isError = true;
			}
		}else {
			System.out.println("Lutfen Gecerli Ay Giriniz ... ");
		}
		
		
		if (isError) {
			
			System.out.println("Hatali Giris Yaptiniz, Tekrar Deneyiniz... 	");
		}else {
			System.out.println("Burcunuz : " + burc);
		}
	}
}
