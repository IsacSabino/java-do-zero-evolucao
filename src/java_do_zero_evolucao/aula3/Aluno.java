package java_do_zero_evolucao.aula3;

public class Aluno {
    String nome;
    int idade;
    double nota;

    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
        System.out.println("Status: " + status());
    }
    boolean estaAprovado() {
        return nota >= 7;
    }
    String status() {
        if (estaAprovado()) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}