package poo;
import java.util.*;
public class ex17 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o menor valor do intervalo (A): ");
		double A = scan.nextDouble();
		
		System.out.println("Digite o maior valor do intervalo (B): ");
		double B = scan.nextDouble();
		
		System.out.println("Digite um número real: ");
		double n= scan.nextDouble();
		if(n >= A && n <= B) {
			
		System.out.printf("O número %.3f pertence ao intervalo [%f ; %f]", n, A, B);
		} else {
		
			System.out.printf("O número %.3f não pertence ao intervalo [%f ; %f]", n,A,B);

}
		
scan.close();
	}
}