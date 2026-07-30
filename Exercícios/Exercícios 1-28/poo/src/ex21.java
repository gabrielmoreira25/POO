
package poo;
import java.util.*;
public class ex21 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número : ");
		int n = sc.nextInt();
		boolean primo = true;
		while (n < 1) {
		
		System.out.println("Informe um numero maior ou igual a 1");
		n = sc.nextInt();
}
		for(int i = 2; i < n; i++) {
			if (n % i == 0) {
				primo = false;
			}
		}
		if (primo && n >= 1) {
		
		System.out.printf("%d é primo!", n);
		} else {
		
		System.out.printf("%d não primo!", n);
		
		}
sc.close();
		}
	}


	
