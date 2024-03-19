import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double r,aci , alan, cevre;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen Dairenin Yaricapini Giriniz : ");
		
		r = input.nextDouble();
		
		System.out.println("Lutfen Daire Dilimi Acisini Giriniz : ");
		
		aci = input.nextDouble();
		
		alan = (Math.PI * (r * r) * aci) / 360;
		
		cevre = (2 * Math.PI * r * aci) / 360; 
		
		System.out.println("Dairenin Alani : " + alan);
		
		System.out.println("Dairenin Cevresi : " + cevre);
		
		
				
	}

}
