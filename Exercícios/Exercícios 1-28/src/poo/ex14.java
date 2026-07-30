package poo;
import java.util.*;
public class ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o mes: ");
		int mes = sc.nextInt();
		
		System.out.print("Digite os 4 digitos da placa: ");
		int placa = sc.nextInt();
		if(mes>12 && placa>9999) {
			
			System.out.print("O mes é entre 1 a 12 e a placa pode conter só 4 digitos");

		}else {
			
			System.out.printf("O IPVA vencera no mes %d",placa % 10);

		}
sc.close();
	}
}