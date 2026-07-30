package poo;
import java.util.*;
public class ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
		
		System.out.println("Digite o valor:");
		matriz[i][j] = sc.nextInt();
		}
}
		
		System.out.println("Matriz:");
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {

	System.out.print(matriz[i][j] + " ");
	}
	System.out.println();
	}
	System.out.println("Diagonal principal:");
	
	for (int i = 0; i < 3; i++) {
	System.out.print(matriz[i][i] + " ");
	}
	
	System.out.println("\nDiagonal secundaria:");
		for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
		if (i + j == 2) {
		
		System.out.print(matriz[i][j] + " ");
			}
		}
	}
	sc.close();
	}
}