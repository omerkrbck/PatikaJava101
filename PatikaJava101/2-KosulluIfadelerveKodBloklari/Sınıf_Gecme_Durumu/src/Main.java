import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int mat, fizik, turkce, kimya, muzik;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik Notunuz : ");
		mat = input.nextInt();
		
		if (mat < 0 || mat > 100) {
			mat = 0;
		}
		
		System.out.println("Turkce Notunuz : ");
		turkce = input.nextInt();
		
		if (turkce < 0 || turkce > 100) {
			turkce = 0;
		}
		
		System.out.println("Fizik Notunuz : ");
		fizik = input.nextInt();
		
		if (fizik < 0 || fizik > 100) {
			fizik = 0;
		}
		
		System.out.println("Kimya Notunuz : ");
		kimya = input.nextInt();
		
		if (kimya < 0 || kimya > 100) {
			kimya = 0;
		}
		
		System.out.println("Muzik Notunuz : ");
		muzik = input.nextInt();
		
		if (muzik < 0 || muzik > 100) {
			muzik = 0;
		}
		
		double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
		
		if (avarage <= 55) {
			System.out.println("Sinifta Kaldiniz, Seneye Tekrar Gorusmek Uzere ...");
		} else {
            System.out.println("Tebrikler Gectiniz ...");
		}
		
		System.out.println("Ortalamaniz : " + avarage);
	}
}
