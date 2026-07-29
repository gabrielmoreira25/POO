package lista;

 
public class Curso {
    private int id;
    private String sigla;
    private String nome;

    public Curso(int id, String sigla, String nome) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
    }

 
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getSigla() { return sigla; }
    public void setSigla(String sigla) { this.sigla = sigla; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }


    public String toString() {
        return "Curso{id=" + id + ", sigla='" + sigla + "', nome='" + nome + "'}";
    }
}
