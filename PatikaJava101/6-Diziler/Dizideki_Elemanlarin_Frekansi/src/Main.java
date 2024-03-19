
import java.util.Arrays;

public class Main {
    
	public static void main(String[] args) {
        
		int number=0;
        
		int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] list2 = Arrays.copyOf(list, list.length);
		Arrays.sort(list);
        
		System.out.println("*****    Tekrar Sayilari    *****");
        System.out.println(Arrays.toString(list2));
        //int a=0;
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length;j++){
                if(list[i]==list[j]){
                    number++;
                }
            }

            if(list[i]!=list[i+1]){
                System.out.println(list[i]+ " Sayisi " + number +" kere Tekrar Edildi.");
            }
            if(list[i] == list[list.length-1] && i == list.length-2 ) {
                System.out.println(list[list.length-1] + " Sayisi " + number + " Kere Tekrar edildi. ");
            }
            number = 0;
        }
    }
}
