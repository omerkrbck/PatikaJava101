import java.util.Scanner;

public class Main {
	
	static boolean asalMi(int sayi, int bolen) {
        if (bolen * bolen > sayi) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalMi(sayi, bolen + 1);
    }

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayi Giriniz : ");
		int sayi = input.nextInt();
		
		if (sayi < 2) {
            System.out.println(sayi + " bir asal sayi degildir.");
        } else {
            if (asalMi(sayi, 2)) {
                System.out.println(sayi + " bir asal sayidir.");
            } else {
                System.out.println(sayi + " bir asal sayi degildir.");
            }
        }

	}

}
