import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("*****   Harmonik Sayilari Bulan Program   *****");
		System.out.print("Lutfen N Sayisini Giriniz : ");
		n = input.nextInt();
		
		double total = 1.0;
		double oneDi;
		
		for (int i = 2; i <= n; i++) {
			
			oneDi = 1.0 / i;
			total += oneDi;
		}
		System.out.println("Harmonik : " + total);
	}

}
