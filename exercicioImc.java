package prjAula05;
import java.util.Scanner;

public class exercicioImc {
	public static void main (String [] args ) {
		
		Scanner ler = new Scanner (System.in);
		double peso, altura, imc;
		
		System.out.println ("Insira o peso: ");
		peso = ler.nextDouble();
		
		System.out.println ("Insira a altura: ");
		altura = ler.nextDouble();
		
		imc= (peso/(altura * altura));
		if (imc < 18.5) {
			 System.out.println ("Excesso de magreza");
			 
		} else if (imc<25) {
			System.out.println("Peso normal");
			
		} else if (imc<30) {
			System.out.println("Excesso de peso");
			
		} else if (imc<35) {
			System.out.println("Obesidade grau 1");
			
		} else if (imc<40) {
			System.out.println("Obesidade grau 2");
			
		} else {
			System.out.println("Obesidade grau 3");
			ler.close();
		}
		System.out.println("O imc � igual a: "+imc);
		
	}

}
