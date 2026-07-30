package poo;
import java.util.*;
public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor de A:");
		int A = sc.nextInt();
		System.out.print("Informe o valor de B :");
		int B= sc.nextInt();
		int C = A;
		A = B;
		System.out.printf("Valor de A: %d Valor de B: %d",A,C);
		sc.close();
		}
	}