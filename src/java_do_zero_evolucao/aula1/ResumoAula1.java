package java_do_zero_evolucao.aula1;

public class ResumoAula1 {
    public static void main(String[] args) {
        // 1. Variaveis
        String nome = "Isac";
        int idade = 26;
        double altura = 1.65;
        boolean estudandoJava = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estudando Java: " + estudandoJava);

        // 2. Concatenacao com conta
        System.out.println("Ano que vem: " + (idade + 1));

        // 3. Operadores matematicos
        int a = 20;
        int b = 4;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtracao: " + (a - b));
        System.out.println("Multiplicacao: " + (a * b));
        System.out.println("Divisao: " + (a / b));
        System.out.println("Resto: " + (a % b));

        // 4. Comparacoes
        System.out.println("a e maior que b? " + (a > b));
        System.out.println("a e menor que b? " + (a < b));
        System.out.println("a e igual a b? " + (a == b));
        System.out.println("a e diferente de b? " + (a != b));

        // 5. if / else
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // 6. else if
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
