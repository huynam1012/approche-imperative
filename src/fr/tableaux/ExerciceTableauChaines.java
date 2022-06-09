package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] villes = {"Montpellier", "Béziers", "Toulouse", "Nîmes", "Narbone"};
		
		System.out.println(villes[0]);
		System.out.println(villes[1]);
		System.out.println(villes[2]);
		System.out.println(villes[3]);
		System.out.println(villes[4]);
		System.out.println(villes.length);
		System.out.println("-----------------------");
		
		villes[3] = "Reims"; //j'affecte la valeur "reims" à la case d'index 3 du tableau villes
		
		for (var ville : villes)
		{
			System.out.println(ville);
		}
	}

}
