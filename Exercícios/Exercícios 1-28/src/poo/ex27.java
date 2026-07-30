package poo;
import java.util.*;
public class ex27 {
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
		boolean ts = true;
		boolean ti = true;
		for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
		if (i > j) {
		if (matriz[i][j] != 0) {
		ts = false;
		}
}
		if (i < j) {
		if (matriz[i][j] != 0) {
		ti = false;
      }
    }
  }
}
		if (ts && ti) {
		System.out.println("Matriz diagonal");
		} else if (ts) {
		System.out.println("Matriz triangular superior");
		} else {
		
		System.out.println("Matriz triangular inferior");
		}
sc.close();
	}
}

