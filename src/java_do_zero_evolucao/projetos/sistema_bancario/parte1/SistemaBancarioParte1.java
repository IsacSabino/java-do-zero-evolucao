package java_do_zero_evolucao.projetos.sistema_bancario.parte1;

public class SistemaBancarioParte1 {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Isac", 1000);
        Conta conta2 = new Conta("Maria", 500);
        Conta conta3 = new Conta("", -1000);

        System.out.println("----- Conta 1 -----");
        conta1.mostrarDados();

        conta1.depositar(200);

        System.out.println("----- Conta 1 depois do deposito -----");
        conta1.mostrarDados();

        conta1.depositar(-500);

        System.out.println("----- Conta 1 depois do deposito invalido -----");
        conta1.mostrarDados();

        conta1.sacar(300);

        System.out.println("----- Conta 1 depois do saque -----");
        conta1.mostrarDados();

        conta1.sacar(5000);

        System.out.println("----- Conta 1 depois do saque invalido -----");
        conta1.mostrarDados();

        System.out.println("Saldo consultado pelo getter: R$ " + conta1.getSaldo());

        System.out.println("Titular consultado pelo getter: " + conta1.getTitular());

        conta1.setTitular("Isac Sabino");

        System.out.println("----- Conta 1 depois de alterar titular -----");
        conta1.mostrarDados();

        System.out.println("----- Conta 3 com dados invalidos -----");
        conta3.mostrarDados();
        // System.out.println("----- Conta 2 -----");
        // conta2.mostrarDados();


    }
}
