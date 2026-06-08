package java_do_zero_evolucao.aula3;

public class ClassesObjetosAula3 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.nome = "Isac";
        aluno1.idade = 26;
        aluno1.nota = 8.5;

        aluno2.nome = "Maria";
        aluno2.idade = 22;
        aluno2.nota = 5.5;

        aluno3.nome = "Carlos";
        aluno3.idade = 19;
        aluno3.nota = 7.0;

        System.out.println("----- Aluno 1 -----");
        aluno1.mostrarDados();

        System.out.println("----- Aluno 2 -----");
        aluno2.mostrarDados();

        System.out.println("----- Aluno 3 -----");
        aluno3.mostrarDados();
    }
}