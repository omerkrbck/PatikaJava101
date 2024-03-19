import java.util.Scanner;

public class Main {
	
	
	static int a=0;
    static void desen(int num1,int num2)
    {
        System.out.print(num1 + " ");

        if(num1 > 0 && a == 0)
        {
            desen(num1-5, num2);
        }
        else if (num1 <= 0 || a == 1)
        {
            a = 1;
            if(num1 < num2)
                desen(num1+5, num2);
        }
    }

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("N Sayisini Giriniz : ");
		int n = input.nextInt();
		
		System.out.print("Ciktisi ===>>> ");
		desen(n, n);
	}
}
