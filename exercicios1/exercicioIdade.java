package prjAula05;
import java.util.Scanner;

public class exercicioIdade { 
	public static void main (String [] args) { 
	
		Scanner ler = new Scanner (System.in);
		int anoNascimento, anoAtual, idade;
		
		System.out.println ("Insira o ano atual: ");
		anoAtual = ler.nextInt ();
		
		System.out.println ("Insira o ano de nascimento: ");
		anoNascimento = ler.nextInt ();
		
		idade = (anoAtual - anoNascimento);
		
		if (idade<10) {
			System.out.println("Crian�a");
			
		} else if (idade < 18) {
			System.out.println("Adolescente");
				
		} else if (idade < 60) {
			System.out.println("Adulto");
			
		} else {
			System.out.println("Idoso");
			ler.close();
		}
		System.out.println ("A idade �: " + idade);
				
	}						
}
