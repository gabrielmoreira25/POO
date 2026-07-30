package poo;
import java.util.*;
public class ex22 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de termos:");
		int termos = scan.nextInt();
		double h = 0;
		int denominador = 1;
		for (int i = 1; i <= termos; i++) {
			if (i % 2 == 1) {
				h += 1.0 / denominador;
			} else {
				h -= 1.0 / denominador;
			}
			denominador += 2;
		}
		
		System.out.printf("H = %.10f\n", h);
scan.close();
	}
}
