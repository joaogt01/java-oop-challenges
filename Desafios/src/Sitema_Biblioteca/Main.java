package Sitema_Biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        biblioteca biblioteca = new biblioteca();
        while (true){
            int opcao = biblioteca.menu();
            if (opcao == 0){
                break;
            } else if (opcao == 1) {
                biblioteca.cadastrarLivro();
            } else if (opcao == 2) {
                biblioteca.consultarLivros();
            } else if (opcao == 3) {
                biblioteca.emprestarLivro();
            } else if (opcao == 4) {
                biblioteca.removerLivro();
            }
        }
    }
}
