package java_do_zero_evolucao.projetos.sistema_bancario.parte1;

public class Conta {
    private String titular;
    private double saldo;


    public Conta(String titular, double saldoInicial) {
        if (titular != null && !titular.isBlank()) {
            this.titular = titular;
        } else {
            this.titular = "Titular nao informado";
        }

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial invalido. A conta foi criada com saldo R$ 0.0");
        }
    }
        public void mostrarDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
        public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }
        public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saque invalido.");
        }
    }
        public double getSaldo() {
        return saldo;
    }
        public String getTitular() {
        return titular;
    }
        public void setTitular(String novoTitular) {
        if (novoTitular != null && !novoTitular.isBlank()) {
            titular = novoTitular;
        } else {
            System.out.println("Titular invalido.");
        }
    }

}