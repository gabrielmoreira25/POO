package poo;
import java.util.*;
public class ex16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salario bruto: ");
		double bruto= sc.nextDouble();
		
		System.out.print("Digite a prestação: ");
		double prestacao= sc.nextDouble();
		double des = bruto * 0.09;
		double liquido = bruto - des;
		if(prestacao<=liquido*0.3) {
		
		System.out.printf("\nO emprestimo pode ser concedido ");
		}else {
		
		System.out.printf("\nO emprestimo não pode ser concedido ");
		System.out.printf("\nSalario liquido: %.2f", liquido);
		System.out.printf("\nLimite (30%%): %.2f", liquido * 0.3);
sc.close();
}
	}
}

