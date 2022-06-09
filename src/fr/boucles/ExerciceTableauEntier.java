package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tableau = new int[10];                       // Sorted Array of 10
		for (int t = 0; t < tableau.length; t++) {
			tableau[t] = t + 1;
		}
		
		System.out.println(tableau[0]);
		System.out.println(tableau.length);
		System.out.println(tableau[tableau.length-1]);
		
		tableau[4] = 8;
		
		System.out.println(tableau[4]);
	}

}
