package sistemaBancario;

public class contaPoupanca extends contaBancaria{
    @Override
    public void depositar() {
        System.out.println("Digite o valor a depositar: ");
        double valor = entrada.nextDouble();
        saldo += valor * 0.99;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("seu saldo em conta poupança é: " + saldo);
    }

    @Override
    public void menuConta() {
        System.out.println("0 - sair\n1 - depositar\n2 - consultar saldo");
    }
}
