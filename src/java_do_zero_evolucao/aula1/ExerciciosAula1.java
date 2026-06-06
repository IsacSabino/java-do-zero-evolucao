package java_do_zero_evolucao.aula1;

public class ExerciciosAula1 {
    public static void main(String[] args) {
        // Exercicio 1: imprimir tres linhas
        System.out.println("Meu nome e Isac");
        System.out.println("Estou revisando a Aula 1");
        System.out.println("Quero aprender Java passo a passo");

        // Exercicio 2: variaveis
        String nome = "Isac";
        int idade = 26;
        double altura = 1.65;
        boolean estudandoJava = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estudando Java: " + estudandoJava);

        // Exercicio 3: concatenacao e conta
        System.out.println("Ano que vem eu terei " + (idade + 1) + " anos");
        System.out.println("Daqui a 5 anos eu terei " + (idade + 5) + " anos");

        // Exercicio 4: operadores matematicos
        int a = 20;
        int b = 4;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtracao: " + (a - b));
        System.out.println("Multiplicacao: " + (a * b));
        System.out.println("Divisao: " + (a / b));
        System.out.println("Resto: " + (a % b));

        // Exercicio 5: comparacoes
        System.out.println("a e maior que b? " + (a > b));
        System.out.println("a e menor que b? " + (a < b));
        System.out.println("a e igual a b? " + (a == b));
        System.out.println("a e diferente de b? " + (a != b));

        // Exercicio 6: if / else
        if (idade >= 18) {
            System.out.println("Pode tirar carteira de motorista");
        } else {
            System.out.println("Ainda nao pode tirar carteira de motorista");
        }

        // Exercicio 7: else if
        int nota = 7;

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
