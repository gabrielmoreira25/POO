package Entidade;


import java.util.*;



public class Aplicacao {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa=new Pessoa();
		int idade;
		

		System.out.println("Digite o nome ");
		pessoa.setNome(sc.next());
		
		
		System.out.println("Data de nascimento");
		pessoa.setAno(sc.nextInt());
		
		
		
		System.out.println("Usuario digite altura:");
		
		pessoa.setAltura(sc.nextDouble());
		
		
		idade = pessoa.calcularid();

		
		System.out.printf("O %s tem %.2f de altura e %d de idade .", pessoa.getNome(), pessoa.getAltura(), idade);
			
        sc.close();

	}

}
