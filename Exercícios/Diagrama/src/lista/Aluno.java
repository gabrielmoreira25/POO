package lista;

import java.util.ArrayList;
import java.util.List;


public class Aluno {
    private int matricula;
    private String nome;


    private Curso curso;

    private List<Disciplina> disciplinas;

    private List<Double> notas;

    public Aluno(int matricula, String nome, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.disciplinas = new ArrayList<>();
        this.notas = new ArrayList<>();
    }


    public void adicionarDisciplina(Disciplina disciplina, double nota) {
        disciplinas.add(disciplina);
        notas.add(nota);
    }

 
    public double calcularMedia() {
        if (notas.isEmpty()) return 0.0;
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }


    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }

    public List<Disciplina> getDisciplinas() { return disciplinas; }
    public List<Double> getNotas() { return notas; }


    public String toString() {
        return "Aluno{matricula=" + matricula
                + ", nome='" + nome + "'"
                + ", curso=" + (curso != null ? curso.getSigla() : "sem curso")
                + ", media=" + String.format("%.2f", calcularMedia())
                + "}";
    }
}
