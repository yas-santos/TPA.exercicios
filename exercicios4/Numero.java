package prj.Aula4;
import java.util.Scanner;
public class Numero {
	public static void main(String[]args) {
		Scanner entrada= new Scanner (System.in);
		double numero;
		System.out.println("Digite o número");
		numero=entrada.nextDouble();
		if (numero<0) {
			System.out.println("O número é negativo!");
		} else if(numero>0){
			System.out.println("O número é positivo!");
		} else {
			System.out.println("O número é neutro!");
			entrada.close();
			
			
		}
		
	}

}
