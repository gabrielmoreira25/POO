import java.util.*;
public class Esporte {

    String nome;
    String descricao_es;

    int Ano_inclusao;

    int N_medalhas_ouro;
    int N_medalhas_prata;
    int N_medalhas_bronze;

    void calcularDiferenca() {

        int diferencaOuro = 2 - N_medalhas_ouro;
        int diferencaPrata = 2 - N_medalhas_prata;
        int diferencaBronze = 2 - N_medalhas_bronze;

        System.out.println("Diferença do Ouro: " + diferencaOuro);
        System.out.println("Diferença da Prata: " + diferencaPrata);
        System.out.println("Diferença do Bronze: " + diferencaBronze);
    }

    public static void main(String[] args) {

        Esporte e1 = new Esporte();

        e1.nome = "Ginástica Artística";
        e1.descricao_es = "https://www.olimpiadatododia.com.br/";
        e1.Ano_inclusao = 1896;
        e1.N_medalhas_ouro = 1;
        e1.N_medalhas_prata = 0;
        e1.N_medalhas_bronze = 1;

        e1.calcularDiferenca();
    }
}