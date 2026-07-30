package poo;
import java.util.*;
public class ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite salaro minimo ");
		double salario = sc.nextDouble();
		
		System.out.print("Digite a quantidade de quilowatts gasta(kW): ");
		double kw = sc.nextDouble();
		double valorkw = ((salario)/7/100);
		double dissem = valorkw * kw;
		double discom = dissem - dissem*0.1;
		
		System.out.printf("Valor de cada quilowatt(R$): %.6f Valor a ser pago sem desconto %.3f Valor a ser pago com desconto %.3f",valorkw,dissem,discom);

sc.close();
	}
}