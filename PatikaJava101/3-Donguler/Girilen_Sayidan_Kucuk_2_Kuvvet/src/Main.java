import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Lutfen Sayi Giriniz : ");
		n = input.nextInt();
		
		for (int i = 1, j = 1; i < n && j < n; i*=4, j*=5) {
			
			System.out.println("4' un kuvvetleri " + i + " = " + i);
			System.out.println("5'in kuvvetleri " + j + " = " + j);
		}
	}
	
}
