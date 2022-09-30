package br.com.comex.main;

public class TestaCaracter {
    
	public static void main(String[] args) {
		String frase = "a";
		char c = frase.charAt(0);
		if (Character.isDigit(frase.charAt(0))) {System.out.println(c + " é número");} 
		if (Character.isLetter(frase.charAt(0))){System.out.println(c + " é letra");}		
	}
}	
