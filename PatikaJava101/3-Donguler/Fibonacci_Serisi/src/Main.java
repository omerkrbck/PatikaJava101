import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int n, first = 0, second = 1, next;

        System.out.println("********** Fibonacci Serisi **********");
        System.out.print("Fibonacci Serisinin Eleman Sayisini Giriniz : ");
        n = input.nextInt();

        System.out.print("Fibonacci Serisi: ");

        int i = 1;
        while (i <= n) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
            i++;
	}
 }
}
