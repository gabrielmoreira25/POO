package poo;
import java.util.*;
public class ex25 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] alturas = new double[10];
		double soma = 0;
		for (int i = 0; i < 10; i++) {
		
		System.out.print("Informe a altura: ");
		alturas[i] = sc.nextDouble();
		soma += alturas[i];
		}
		double media = soma / 10;
		
		System.out.println("Média das alturas: " + media);
		
		System.out.println("Alturas maiores que a média:");
		for (int i = 0; i < 10; i++) {
		if (alturas[i] > media) {
		
		System.out.println(alturas[i]);
		}
}
sc.close();
	}
}
