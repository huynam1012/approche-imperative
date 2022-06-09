package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		for (i = 0; i < 10; i++) {
			System.out.println(i);
		}

		String j = "Nam";
		for (var k = 0; k < 20; k++) {
			System.out.println(j);
		}

		for (var n = 2; n <= 100; n++) {
			if ((n % 2) == 0)
				System.out.println(n);
		}

		for (var m = 1; m <= 99; m++) {
			if ((m % 2) != 0)
				System.out.println(m);
		}

	}

}
