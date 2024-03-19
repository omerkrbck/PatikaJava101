package not_hesaplama;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

	
		// Scanner Sinifi Tanimlanir
		Scanner input = new Scanner(System.in);
		
		
		// Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik Derslerinin Notlari Kullanicidan Istenir..
		
		System.out.print("Matematik Notunuzu Giriniz : ");
		
		int mat = input.nextInt();
		
		System.out.print("Fizik Notunuzu Giriniz : ");
		
		int fiz = input.nextInt();
		
		System.out.print("Kimya Notunuzu Giriniz : ");
		
		int kim = input.nextInt();
		
		System.out.print("Turkce Notunuzu Giriniz : ");
		
		int turk = input.nextInt();
		
		System.out.print("Tarih Notunuzu Giriniz : ");
		
		int tar = input.nextInt();
		
		System.out.print("Muzik Notunuzu Giriniz : ");
		
		int müz = input.nextInt();
		
		// Notlarin Ortalamasi Alinir..
		int ort = ((mat + fiz + kim + turk + tar + müz)/6) ;
		
		System.out.println("Not Ortalamasi : " + ort);
		
		boolean kontrol = ort >= 60;
		
		System.out.println("Ogrenci Durumu : " + (kontrol == true ? "Sinifi Gecti" : "Sinifta Kaldi"));
		
		
		
	}
}
