package poo;
import java.util.*;
public class ex28 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] ind = new int[2][3];
		double[] lucros = new double[3];
		double[] lucroInd = new double[2];
		for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
		
		System.out.println("Digite a quantidade:");
		ind[i][j] = sc.nextInt();
		}
}
		for (int i = 0; i < 3; i++) {
		
		System.out.println("Digite o lucro:");
		lucros[i] = sc.nextDouble();
}
		for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
		lucroInd[i] += ind[i][j] * lucros[j];
		}
}
		System.out.println("Lucro industria 1: " + lucroInd[0]);
		
		System.out.println("Lucro industria 2: " + lucroInd[1]);
		if (lucroInd[0] > lucroInd[1]) {
		
		System.out.println("Industria 1 melhor");
		
		} else if (lucroInd[0] < lucroInd[1]) {
		
		System.out.println("Industria 2 melhor");
		} else {

		System.out.println("Mesma coisa");
}
sc.close();
	}
}