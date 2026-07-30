package poo;
import java.util.*;
public class ex13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero ");
		double n = sc.nextDouble();
		if(n % 2 == 0) {
		
		System.out.printf("É par");
		}else {

			System.out.printf("É impar");

		}
sc.close();
	}
}
