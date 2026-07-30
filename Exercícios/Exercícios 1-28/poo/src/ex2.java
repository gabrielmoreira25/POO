package poo;
import java.util.*;
public class ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero :");
		float n1 = sc.nextInt();
		System.out.print("Informe o segundo numero :");
		float n2 = sc.nextInt();
		System.out.print("Informe o terceiro numero :");
		float n3 = sc.nextInt();
		
		System.out.printf("Media dos numeros %.2f ,%.2f ,%.2f é %.2f ", n1, n2, n3,
((n1+n2+n3)/3));
sc.close();
	}
}
