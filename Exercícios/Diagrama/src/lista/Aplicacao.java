package lista;


public class Aplicacao {

    public static void main(String[] args) {

        System.out.println("=== CURSOS ===");
        Curso engComp = new Curso(1, "ECP", "Engenharia de Computação");
        Curso admEmp  = new Curso(2, "ADM", "Administração de Empresas");
        System.out.println(engComp);
        System.out.println(admEmp);

        System.out.println("\n=== PROFESSORES ===");
        Professor profFelipe = new Professor(123456, "Felipe Lopes");
        Professor profAna    = new Professor(654321, "Ana Souza");
        System.out.println(profFelipe);
        System.out.println(profAna);

        System.out.println("\n=== DISCIPLINAS ===");
        Disciplina poo        = new Disciplina(10, "Programação Orientada a Objetos", profFelipe);
        Disciplina estrutDados = new Disciplina(11, "Estrutura de Dados", profFelipe);
        Disciplina gestPessoas = new Disciplina(12, "Gestão de Pessoas", profAna);
        System.out.println(poo);
        System.out.println(estrutDados);
        System.out.println(gestPessoas);

        System.out.println("\n=== ALUNOS ===");
        Aluno alice = new Aluno(2024001, "Alice Ferreira", engComp);
        Aluno bob   = new Aluno(2024002, "Bob Martins",   engComp);
        Aluno carol = new Aluno(2024003, "Carol Lima",    admEmp);

       
        alice.adicionarDisciplina(poo,         8.5);
        alice.adicionarDisciplina(estrutDados, 7.0);

       
        bob.adicionarDisciplina(poo, 6.0);

       
        carol.adicionarDisciplina(gestPessoas, 9.5);

        System.out.println(alice);
        System.out.println(bob);
        System.out.println(carol);

        System.out.println("\n=== TURMAS ===");
        Turma turmaA = new Turma(1, "ECP-2024A");
        Turma turmaB = new Turma(2, "ADM-2024A");

        turmaA.adicionarAluno(alice);
        turmaA.adicionarAluno(bob);
        turmaB.adicionarAluno(carol);

        System.out.println(turmaA);
        turmaA.listarAlunos();
        System.out.printf("  Média geral da turma %s: %.2f%n",
                turmaA.getSigla(), turmaA.calcularMediaGeral());

        System.out.println();
        System.out.println(turmaB);
        turmaB.listarAlunos();
        System.out.printf("  Média geral da turma %s: %.2f%n",
                turmaB.getSigla(), turmaB.calcularMediaGeral());

        System.out.println("\n=== REMOVENDO ALUNO DA TURMA ===");
        System.out.println("Removendo Bob (matrícula 2024002) da turma " + turmaA.getSigla());
        turmaA.removerAluno(2024002);
        turmaA.listarAlunos();

        System.out.println("\n=== ATUALIZANDO PROFESSOR ===");
        System.out.println("Antes: " + estrutDados);
        estrutDados.setProfessor(profAna);
        System.out.println("Depois: " + estrutDados);
    }
}
