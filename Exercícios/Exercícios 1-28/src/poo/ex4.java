package poo;
import java.util.*;
public class ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Celsius:");
		int celsius = sc.nextInt();

		float Fahrenheit = (((9*celsius)+160)/5);

		System.out.printf("Temperatura em Fahrenheit %.2f",Fahrenheit);
		sc.close();
	}
}