package sistemaBancario;

import java.util.Scanner;

public abstract class contaBancaria implements Conta{
    double saldo = 0;
    Scanner entrada = new Scanner(System.in);

    @Override
    public void menuConta() {
        System.out.println("0 - sair\n1 - depositar\n2 - consultar saldo");
    }

    @Override
    public void consultarSaldo() {
        System.out.println(saldo);
    }

    @Override
    public void depositar() {
        System.out.println("Digite o valor a depositar: ");
        double valor = entrada.nextDouble();
        saldo += valor;
    }


}
