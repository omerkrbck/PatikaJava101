import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

				
		Scanner input = new Scanner(System.in);
		
		// Faktoriyel Hesaplama
		/*
		int n;

		System.out.print("Faktoriyel Sayisi Giriniz : ");
		n = input.nextInt();
		
		int total = 1 ;
		
		for (int i = 1; i <= n; i++) {
			
			total *=i;
		}
		
		System.out.println(n + "! : " + total); */
		
		
		// Kombinasyon Hesaplama
		
		
		int n, r;
		int totalN = 1, totalR = 1, totalNR = 1;
		double combination;
		
		System.out.print("n Degerinin Giriniz : ");
		n = input.nextInt();
		
		System.out.print("r Degerini Giriniz : ");
		r = input.nextInt();
		
		
        for (int i = 1; i <= n; i++) {
			
			totalN *=i;
		}
        
        for (int i = 1; i <= r; i++) {
			
			totalR *=i;
		}
        
        for (int i = 1; i <= (n-r); i++) {
			
			totalNR *=i;
		}
        
        combination = (totalN / (totalR * totalNR));
        
        System.out.println("Kompinasyon : " + combination);
	}

}
