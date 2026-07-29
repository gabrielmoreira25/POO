package Entidade;
import java.util.*;

public class Pessoa {

			
			public String nome;
			public int anodenascimento;
			public double altura;
			
			public void setNome(String nome) {
				this.nome=nome;
				}
		   public void setAno(int anodenascimento) {
			   this.anodenascimento = anodenascimento;
			 
	            }
		   public void setAltura(double altura) {
			   this.altura = altura;
			   }
		   public String getNome() {
			   return nome;
		   }
		   public int getAno() {
			   return anodenascimento;
		   }
		   public double getAltura() {
			   return altura;
		   }
		   
		   public int calcularid() {
			   int calcularid = 2026 - anodenascimento;
			   return calcularid;
		   }
		   
		   
		   
}

