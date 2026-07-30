package poo;
import java.util.*;
public class ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor da hora-aula: ");
		double horario = sc.nextDouble();
		
		System.out.print("Informe as aulas dadas do mes: ");
		double mes = sc.nextDouble();
		
		System.out.print("Digite o percentual do desconto do inss: ");
		double inss= sc.nextDouble();
		double resultado = (horario*mes)* (1-inss/100);
		
		System.out.printf("Salario liquido %.3f", resultado);

		sc.close();
	}
}
