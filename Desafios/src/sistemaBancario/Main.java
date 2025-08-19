package sistemaBancario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);

        while (true) {
            System.out.println("0 - sair\n1 - Abrir conta corrente\n2 - Abrir Conta Poupança");
            int opcaoMenu = menu.nextInt();

            if (opcaoMenu == 0) {
                System.out.println("Cabou");
                break;

            } else if (opcaoMenu == 1) {
                contaCorrente usuario = new contaCorrente();
                while (true) {
                    usuario.menuConta();
                    int opcaoMenuConta = menu.nextInt();

                    if (opcaoMenuConta == 0) {
                        break;
                    } else if (opcaoMenuConta == 1) {
                        usuario.depositar();
                    } else if (opcaoMenuConta == 2) {
                        usuario.consultarSaldo();
                    } else {
                        System.out.println("Opção inválida");
                    }
                }

            } else if (opcaoMenu == 2) {
                contaPoupanca usuarioP = new contaPoupanca();
                while (true) {
                    usuarioP.menuConta();
                    int opcaoMenuContaP = menu.nextInt();

                    if (opcaoMenuContaP == 0) {
                        break;
                    } else if (opcaoMenuContaP == 1) {
                        usuarioP.depositar();
                    } else if (opcaoMenuContaP == 2) {
                        usuarioP.consultarSaldo();
                    } else {
                        System.out.println("Opção inválida");
                    }
                }

            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
