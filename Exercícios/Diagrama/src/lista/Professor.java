package lista;

 

public class Professor {
    private int siape;
    private String nome;

    public Professor(int siape, String nome) {
        this.siape = siape;
        this.nome = nome;
    }

  
    public int getSiape() { return siape; }
    public void setSiape(int siape) { this.siape = siape; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }


    public String toString() {
        return "Professor{siape=" + siape + ", nome='" + nome + "'}";
    }
}
