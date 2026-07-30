package poo;
import java.util.*;
public class ex24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[20];
		int[] p = new int[20];
		int[] imp = new int[20];
		int contp = 0;
		int conti = 0;
		for (int i = 0; i < 20; i++) {
		
		System.out.println("Digite os numeros:");
		n[i] = sc.nextInt();
		if (n[i] % 2 == 0) {
			p[contp] = n[i];
			contp++;
		} else {
			imp[conti] = n[i];
			conti++;
			}
		}
		
		System.out.println("Vetor com os valores pares:");
		
		System.out.print("[");
		for (int i = 0; i < contp; i++) {

		System.out.print(p[i] + ", ");
		}
		
		System.out.print("]");
		
		System.out.println("\nVetor com os valores ímpares:");
		
		System.out.print("[");
		for (int i = 0; i < conti; i++) {
		
		System.out.print(imp[i] + ", ");
}

		System.out.print("]");
sc.close();
	}
}
