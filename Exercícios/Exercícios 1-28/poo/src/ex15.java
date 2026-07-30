package poo;
import java.util.*;
public class ex15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int n1 = sc.nextInt();

		System.out.print("Digite o segundo numero: ");
		int n2 = sc.nextInt();
		if(n1>n2) {

		System.out.printf("O numero %d é maior, numero %d é menor",n1,n2);
		}else if(n1<n2) {

		System.out.printf("O numero %d é maior, numero %d é menor",n2,n1);
		}else {

			System.out.printf("O primeiro e o segundo numero são iguais");
}
sc.close();
	}
}
