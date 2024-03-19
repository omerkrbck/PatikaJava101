import java.util.Arrays;
public class Main {

	public static void main(String[] args) {

		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		double sum = 1.0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += (1.0 / arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Dizideki Sayilarin Harmonik Ortalamasi : " + arr.length / sum);
	}
}
