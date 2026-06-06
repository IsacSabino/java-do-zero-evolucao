package java_do_zero_evolucao.aula2;

public class MetodosAula2 {
    public static void main(String[] args) {
        mostrarBoasVindas();
        mostrarNome("Isac");
        mostrarIdade(26);
        mostrarPerfil("Isac", 26, 1.65);

        int idadeAnoQueVem = calcularIdadeAnoQueVem(26);
        System.out.println("Ano que vem terei " + idadeAnoQueVem + " anos");

        double dobroDaAltura = calcularDobroDaAltura(1.65);
        System.out.println("O dobro da altura é " + dobroDaAltura);

        boolean maiorDeIdade = verificarMaiorDeIdade(15);
        System.out.println("É maior de idade? " + maiorDeIdade);

        String classificacao = classificarIdade(15);
        System.out.println("Classificação: " + classificacao);

        String resultadoNota = classificarNota(3);
        System.out.println("Resultado da nota: " + resultadoNota);

        mostrarResumoAluno("Isac", 26, 1.65, 8);

    }




    static void mostrarBoasVindas() {
        System.out.println("Bem-vindo à Aula 2 de Java");
        System.out.println("Hoje eu vou aprender métodos");
    }

    static void mostrarNome(String nome) {
        System.out.println("Meu nome é " + nome);
    }

    static void mostrarIdade(int idade) {
        System.out.println("Minha idade é " + idade);
    }

    static void mostrarPerfil(String nome, int idade, double altura) {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }

    static int calcularIdadeAnoQueVem(int idade) {
        return idade + 1;
    }

    static double calcularDobroDaAltura(double altura) {
        return altura * 2;
    }
    static boolean verificarMaiorDeIdade(int idade) {
        return idade >= 18;
    }
    static String classificarIdade(int idade) {
        if (idade >= 18) {
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }
    static String classificarNota(int nota){
        if (nota >= 9) {
            return "Excelente";
        } else if (nota >= 7) {
            return "Aprovado";
        } else if (nota >= 5) {
            return "Recuperação";
    } else {
            return "Reprovado";
        }
    }
    static void mostrarResumoAluno(String nome, int idade, double altura, int nota) {
        String classificacaoIdade = classificarIdade(idade);
        String resultadoNota = classificarNota(nota);

        System.out.println("Resumo do aluno");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Classificação de idade: " + classificacaoIdade);
        System.out.println("Resultado da nota: " + resultadoNota);
    }
}