import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double para, kdv_degeri, kdvPara, kdv_18 = 18, kdv_8 = 8;

		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lutfen Para Degeri Giriniz : ");
		
		para = input.nextDouble();
		
		boolean kontrol_1 = para >= 0;
		boolean kontrol_2 = para <= 1000;
		boolean kdv_kontrol = kontrol_1 && kontrol_2;
		
		kdv_degeri = kdv_kontrol ? kdv_18 : kdv_8;
		
		kdvPara = para + (para * kdv_degeri)/100;
		
		System.out.println("Para Tutari : " + para + "\nKDV'li Para Tutari : " + kdvPara + "\nKDV Tutari : " + kdv_degeri+ "%");
	}

}
