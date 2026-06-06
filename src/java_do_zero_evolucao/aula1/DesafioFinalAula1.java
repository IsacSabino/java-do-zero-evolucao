package java_do_zero_evolucao.aula1;

public class DesafioFinalAula1 {
    public static void main(String[] args) {
        String nome = "Isac";
        int idade = 26;
        double altura = 1.65;
        boolean estudandoJava = true;
        int nota = 7;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estudando Java: " + estudandoJava);
        System.out.println("Ano que vem: " + (idade + 1));

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
    }
}
