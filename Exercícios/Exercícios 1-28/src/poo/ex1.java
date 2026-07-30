package poo;
import java.util.*;
public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um numero inteiro:");
		int n = sc.nextInt();
		int anterior = n - 1;
		int proximo = n + 1;

			System.out.printf("Numero anterior de %d é %d\nNumero superior de %d é %d", n,
anterior, n, proximo);
			sc.close();
	}
}
