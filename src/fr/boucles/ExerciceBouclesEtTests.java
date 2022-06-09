package fr.boucles;
import java.util.Arrays;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		for(int i=0; i < array.length; i++)	{
		    System.out.println(array[i]);
		}
		
		System.out.println(Arrays.toString(array));
		
		for(int i = array.length-1; i >=0 ; i--){
	    System.out.println(array[i]);
		}
		
		System.out.println("------------------");
		for (int i=0; i < array.length; i++) {
			if (i > 3) {
				System.out.println(i);
			}
				
		}
		
		System.out.println("------------------");
		for (int i=0; i < array.length; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
				
		}
		
		System.out.println("------------------");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
		
		System.out.println("------------------");
		for (int i = 0; i < array.length; i++) {
			int j = array[i];

			if (i % 2 == 0) {
				System.out.println(j);
			}

		}
	}

}
