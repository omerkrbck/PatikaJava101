import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		/*Meyveler ve KG Fiyatları

		Armut : 2,14 TL
		Elma : 3,67 TL
		Domates : 1,11 TL
		Muz: 0,95 TL
		Patlıcan : 5,00 TL*/
		System.out.println("##########  _____ Manav Hosgeldiniz  ##########");
		
		Scanner input = new Scanner(System.in);
		
		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz = 0.95;
		double patlican = 5;
		double toplamTutar;
		
		System.out.println("***** Lutfen Almak Istediginiz Manav Urunlerinin Miktarini Giriniz *****");
		
		System.out.print("Armut : ");
		double armutInput = input.nextDouble();
		
		System.out.print("Elma : ");
		double elmaInput = input.nextDouble();
		
		System.out.print("Domates : ");
		double domatesInput = input.nextDouble();
		
		System.out.print("Muz : ");
		double muzInput = input.nextDouble();
		
		System.out.print("Patlican : ");
		double patlicanInput = input.nextDouble();
		
		toplamTutar = armut*armutInput + elma*elmaInput + domates*domatesInput +
				      muz*muzInput + patlican*patlicanInput;
				
		System.out.println("Toplam Tutar : " + toplamTutar + " TL");
        }

}
