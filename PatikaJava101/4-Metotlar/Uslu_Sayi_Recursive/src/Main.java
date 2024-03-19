import java.util.Scanner;

public class Main {
	
	static int usAlma(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * usAlma(a, b - 1);
        }
    }

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Taban Degerini Giriniz : ");
		int a = input.nextInt();
		
		System.out.print("Us Degerini Giriniz : ");
		int b = input.nextInt();
		
		System.out.println(a+ "^" + b + " Degeri : " + usAlma(a, b));
	}

}

