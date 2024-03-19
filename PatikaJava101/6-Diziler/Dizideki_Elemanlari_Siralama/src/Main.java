import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Lutfen Dizinin Boyutunu Giriniz : ");
		int n = input.nextInt();
		
		int[] list = new int[n];
		
		for (int i = 0; i < list.length; i++) {
			
			System.out.print((i + 1) + " . Elemani : ");
			 list[i] = input.nextInt();
		}
		
		Arrays.sort(list);
		System.out.println("Kucukten Buyuge Siralanan Dizi : " + Arrays.toString(list));
	}
}
