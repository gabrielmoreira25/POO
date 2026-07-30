package poo;
import java.util.*;
public class ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor deposito ");
		double deposito = sc.nextDouble();
		
		System.out.print("Digite a taxa de juros: ");
		double juros = sc.nextDouble();
		double ren = deposito * juros/100;
		double total = deposito + ren;
		
		System.out.printf("Valor do rendimento %.3f Valor depois do rendimento %.3f", ren,total);

sc.close();
	}
}