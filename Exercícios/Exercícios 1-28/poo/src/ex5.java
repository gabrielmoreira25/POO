package poo;
import java.util.*;
public class ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe as horas:");
		int hora = sc.nextInt();
		System.out.print("Informe os minutos:");
		int minutos = sc.nextInt();
		int total = (hora*60)+minutos;

		System.out.printf("Se passaram %d minutos desde do inicio do dia",total);
sc.close();
	}
}