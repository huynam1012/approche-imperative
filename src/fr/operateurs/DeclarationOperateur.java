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
	}

}
