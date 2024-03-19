import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// for Dongusu ile ebob ekok bulma
		/*
		System.out.print("n1 Sayisini Giriniz: ");
		int  n1 = input.nextInt();
		System.out.print("n2 Sayisini Giriniz :");
		int n2 = input.nextInt();
		
		int ebob = 1;
		
		for (int i = 1; i <= n1; i++) {
			
			if (n1 % i == 0 && n2 % i == 0) {
				
				ebob = i;
			} 
		}
		System.out.println("EBOB : " + ebob);
		
		System.out.println("EKOK : " + (n1 * n2)/ebob);
		*/
		
		// while ile ebob ekok bulma
		
		System.out.print("n1 Sayisini Giriniz: ");
		int  n1 = input.nextInt();
		System.out.print("n2 Sayisini Giriniz :");
		int n2 = input.nextInt();
		
		int ebob = 1;
		
		int i = 1;
	    while (i <= n1 && i <= n2) {
	          if (n1 % i == 0 && n2 % i == 0) {
	              ebob = i;
	          }
	        i++;
	    }
		
		
		System.out.println("EBOB : " + ebob);
		
		System.out.println("EKOK : " + (n1 * n2)/ebob);
		
		

	}

}
