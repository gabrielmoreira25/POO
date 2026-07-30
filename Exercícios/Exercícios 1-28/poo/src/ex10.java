package poo;
import java.util.*;
public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor gasto na viagem: ");
		double viagem = sc.nextDouble();
		
		System.out.print("Digite a velocidade media: ");
		double vm = sc.nextDouble();
		double dis = viagem* vm;
		double lis = dis/12;

		System.out.printf("Quantidade de litros de combustivel gasto %.1f", lis);

		sc.close();
	}
}