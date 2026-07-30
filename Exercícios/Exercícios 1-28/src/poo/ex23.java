package poo;
import java.util.*;
public class ex23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		double maior = 0;
		double menor = 999;
		double somaM = 0;
		double somaT = 0;
		for (int i = 1; i <= 6; i++) {
		
		System.out.println("Digite 1 para masculino e 2 para feminino");
		int c = sc.nextInt();

		System.out.println("Digite a altura: ");
		double a = sc.nextDouble();
		somaT+= a;
		if (a > maior) {
			maior = a;
		}
		if (a < menor) {
			menor = a;
		}
		if (c == 2) {
			cont++;
			somaM += a;
			}
		}
		double mediaM = 0;
		if (cont > 0) {
			mediaM = somaM / cont;
		}
		double mediaT= somaT / 6;
		
		System.out.println("Maior altura: " + maior);
		
		System.out.println("Menor altura: " + menor);
		
		System.out.println("Média das mulheres: " + mediaM);
		
		System.out.println("Média da turma: " + mediaT);
sc.close();
	}
}
