package poo;
import java.util.*;
public class ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a altura da lata:");
		float altura = sc.nextInt();
		
		System.out.print("Informe o raio da lata:");
		float raio = sc.nextInt();
		float volume = (float) (Math.PI * Math.pow(raio,2) * altura);

		System.out.printf("Volume da lata = %.2f " ,volume );
sc.close();
	}
}