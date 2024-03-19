import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] list = {15,12,788,1,-1,-778,2,0};
	    int[] tempList = Arrays.copyOf(list, list.length);
	    Arrays.sort(tempList);
        int min = list[0];
        int max = list[0];
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayi Giriniz : ");
        int number = input.nextInt();
        
        for (int i:tempList) {
            if(i<number){
                min=i;
            }
            else if(i>number){
                max=i;
                break;
            }
        }
        
        System.out.println("*********************************");
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Girilen Sayi : " + number);
        System.out.println("Girilen sayidan kucuk en yakin sayi : " + min);
        System.out.println("Girilen sayidan buyuk en yakin sayi : " + max);		
	}
}
