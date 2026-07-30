package Entidade;

public class Pessoa {
String nome;
int idade;
	public static void main(String[] args) {
		Pessoa pp = new Pessoa();
		pp.nome = "João";
		pp.idade = 30;
		
		System.out.println("Nome informado: " + pp.nome);
		System.out.println("Idade informada: "+ pp.idade);
	}
}