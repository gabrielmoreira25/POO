package poo;
import java.util.*;
public class ex20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.printf("Valor do limite inferior(a):");
		int a = sc.nextInt();

		System.out.printf("Valor do limite inferior(a):");
		int b = sc.nextInt();
		while(b<a) {

		System.out.print("O valor de b tem que ser maior que a!");

		System.out.println("\nDigite o valor superior (b): ");
		b = sc.nextInt();
		}
			int somai = 0;
			int qtdi = 0;
			int Parpr = 1;
			for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				Parpr *= i;
			} else {
				somai += i;
				qtdi++;
			}
		}
			double mediaImpar = 0;
			if (qtdi > 0) {
			mediaImpar = (double) somai/ qtdi;
}
			System.out.println("\nMédia dos ímpares: " + mediaImpar);

			System.out.println("Produtório dos pares: " +Parpr);
sc.close();
	}
}
