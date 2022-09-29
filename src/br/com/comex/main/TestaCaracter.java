package br.com.comex.main;

public class TestaCaracter {
    
	public static void main(String[] args) {
		String frase = "1";
		char c = frase.charAt(0);
		if (Character.isDigit(c)) {System.out.println(c + " é número");} 
		if (Character.isLetter(c)){System.out.println(c + " é letra");}		
	}
}	
//		for (int i = 0; i < frase.length(); i++) {
//		    char c = frase.charAt(i);
//		    if (Character.isDigit(c)) {
//		        System.out.println(c + " é número");
//		    } else if (Character.isLetter(c)) {
//		        System.out.println(c + " é letra");
//		    } else {
//		        System.out.println(c + " não é letra nem número");
//		    }
//		}
//
//	}
//
//}
