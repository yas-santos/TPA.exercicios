package prj.Aula03;
import java.util.Scanner;

public class SalarioLiquido {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		double valorhora,aulames,inssdesconto,salarioliquido,salariobruto;
		
		System.out.println("digite valor hora");
		valorhora=ler.nextDouble();
		
		System.out.println("digite as aulas dadas no m�s");
		aulames=ler.nextDouble();
		
		salariobruto=(valorhora*aulames);
		
		inssdesconto=(salariobruto/100);
		
		salarioliquido=(salariobruto-inssdesconto);
		System.out.println("O sal�rio liquido � igual a "+salarioliquido);
		ler.close();
		
		
	}

}
