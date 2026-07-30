package poo;
import java.util.*;
public class ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o Valor bruto do produto: ");
		double produto = sc.nextDouble();
		double desconto = produto*0.09;

		System.out.printf("Valor bruto: %.3f Valor do desconto: %.3f Valor bruto com desconto: %.3f", produto, desconto, produto-desconto);

sc.close();
	}
}
