package fr.operateurs;

public class DeclarationOperateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		boolean testEt = a>0 && b<10;
		boolean testOu = a>0 || b<10;
		a=0;
		a++;
		
		String c = a>0 ? "a est plus grand que 0": "a est inférieur à 0";
		
		
		System.out.println(testEt);
		System.out.println(testOu);
		System.out.println(a);
		System.out.println(c);
		
		/*
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4;
		float e = 5.0f;
		double f = 6.0;
		char g = '7';
		boolean h = true;
		String i = "i",
				randomString = String.join("\n", "Résultat:", "1 + 5 = " + (1 + 5));
		
		System.out.println(randomString);*/
	}

}
