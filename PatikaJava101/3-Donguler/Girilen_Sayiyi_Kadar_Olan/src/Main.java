import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lutfen Sayi Giriniz : ");
		number = input.nextInt();
		
		int count = 0;
		int total = 0;
		double average = 0;
		
		for (int i = 0; i <= number; i++) {
			
			if ((i %3 == 0) && (i %4 == 0)) {
				total += i;
				count++;
			}
			average = total / count;
		}
		System.out.println("0'dan girilen sayiya kadar olan sayilardan 3 ve 4'e tam bolunen sayilarin ortalamasi : " + average);
	}
}
