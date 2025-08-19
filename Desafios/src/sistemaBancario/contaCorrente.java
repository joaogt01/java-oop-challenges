package sistemaBancario;
public class contaCorrente extends contaBancaria {

    @Override
    public void depositar() {
        System.out.println("Digite o valor a depositar: ");
        double valor = entrada.nextDouble();
        saldo += valor;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu Saldo em conta corrente é: " + saldo);
    }

    @Override
    public void menuConta() {
        System.out.println("0 - sair\n1 - depositar\n2 - consultar saldo");
    }
}

