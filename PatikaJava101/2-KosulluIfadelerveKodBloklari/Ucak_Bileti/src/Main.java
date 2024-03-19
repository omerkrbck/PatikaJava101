import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int km, age, type;
		double perKm = 0.10, normalPrice, ageDiscountPrice = 0, typeDiscountPrice = 0;
		boolean isError = false;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("##########    Ucak Bileti Hesaplama Programi     ##########");
		System.out.print("Mesafeyi Giriniz (km) : ");
		km = input.nextInt();
		
		if (km < 0) {
			isError = true;
			System.out.println("Hatali Mesafe Girdiniz ...");
		}
		
		System.out.print("Yasinizi Giriniz : ");
		age =input.nextInt();
		
		if (age < 0) {
			isError = true;
			System.out.println("Hatali Yas Girdiniz ...");
		}
		
		System.out.print("Yolculuk Tipi Giriniz ( 1-->>> Tek Yon , 2--->> Gidis Donus )");
		type = input.nextInt();
		
		if ((type != 1) && (type != 2)){
			isError = true;
			System.out.println("Hatali Yolculuk Tipi Girdiniz ...");
		}
		
		if (!isError) {

			normalPrice = perKm * km;    // Normal Tutar
			
			if (age < 12) {
				
				ageDiscountPrice = (normalPrice - (normalPrice * 0.5));
			}else if (age >= 12 && age <= 24 ) {
				
				ageDiscountPrice = (normalPrice - (normalPrice * 0.1));
			}else if (age > 25 && age <= 65) {
				
				ageDiscountPrice = normalPrice;
			}else if (age > 65) {
				
				ageDiscountPrice = (normalPrice - (normalPrice * 0.3));
			}
			
			switch (type) {
			case 1:
				typeDiscountPrice = ageDiscountPrice;
				break;
			case 2:
				typeDiscountPrice = (ageDiscountPrice- (ageDiscountPrice * 0.2)) * 2;
				break;
			default:
				break;
			}
			
			System.out.println("Toplam Tutar : " + typeDiscountPrice + "TL");
		}
	}
}
