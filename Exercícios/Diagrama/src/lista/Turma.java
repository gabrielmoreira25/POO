package lista;



import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int id;
    private String sigla;

  
    private List<Aluno> alunos;

    public Turma(int id, String sigla) {
        this.id = id;
        this.sigla = sigla;
        this.alunos = new ArrayList<>();
    }

  
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public boolean removerAluno(int matricula) {
        return alunos.removeIf(a -> a.getMatricula() == matricula);
    }


    public double calcularMediaGeral() {
        if (alunos.isEmpty()) return 0.0;
        double soma = 0.0;
        for (Aluno aluno : alunos) {
            soma += aluno.calcularMedia();
        }
        return soma / alunos.size();
    }


    public void listarAlunos() {
        System.out.println("  Alunos da Turma " + sigla + ":");
        for (Aluno aluno : alunos) {
            System.out.println("    -> " + aluno);
        }
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getSigla() { return sigla; }
    public void setSigla(String sigla) { this.sigla = sigla; }

    public List<Aluno> getAlunos() { return alunos; }

    @Override
    public String toString() {
        return "Turma{id=" + id
                + ", sigla='" + sigla + "'"
                + ", totalAlunos=" + alunos.size()
                + "}";
    }
}
