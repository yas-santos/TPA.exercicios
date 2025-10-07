package prj.Aula4;
import java.util.Scanner;

public class SalarioMinimo {
	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		double salario;
		System.out.println("digite o seu sal�rio");
		salario=entrada.nextDouble();
		if (salario<1302) {
			 System.out.println("Menor que o sal�rio minimo");
		}else {
			System.out.println("Maior que sal�rio minimo");
			entrada.close();
		}
		     
		      
	}

}
