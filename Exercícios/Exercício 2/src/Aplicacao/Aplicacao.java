package Aplicacao;
import java.time.LocalDate;
import java.util.*;

public class Aplicacao  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] nome = new String[3];
		int[] ano = new int[3];
		double[] altura = new double[3];
		int[] idade = new int[3];
		
		for(int i =0 ; i < 3; i++) {
			System.out.printf("\nPesso %d", i+1);
			System.out.println("\nNome");
			nome[i] = sc.nextLine();
			
			System.out.println("\nAno de nascimento: ");
			ano[i] = Integer.parseInt(sc.nextLine());
			
			System.out.println("\nAltura:");
			altura[i] = Double.parseDouble(sc.nextLine());
			idade[i] = LocalDate.now().getYear() - ano[i];
			
		}
		int idadeMaior = idade[0];
		int posicaoMaior = 0;
		
		for(int i = 0; i < 3 ; i++) {
			System.out.printf("\n Dados Pessoas %d", i + 1);
			System.out.printf("\nNome: %s",nome[i]);
			System.out.printf("\nIdade: %d", idade[i]);
			System.out.printf("\nAltura: %.2f", altura[i]);
			
			if(idade[i] > idadeMaior) {
				idadeMaior = idade[i];
				posicaoMaior = i;
				
			}
			System.out.printf("\n====Informaçã");
			System.out.printf("\nO (A) %s apresenta a maior idade.", nome[posicaoMaior]);
			
			sc.close();
			
			
			
		}

	}

}
