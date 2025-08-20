package Sitema_Biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class biblioteca implements LivroOperacoes{
    public ArrayList<Livro> livros = new ArrayList<>();
    public Scanner entrada = new Scanner(System.in);

    @Override
    public void cadastrarLivro() {
        System.out.println("Titulo do Livro: ");
        String titulo = entrada.nextLine();
        System.out.println("Autor do Livro: ");
        String autor = entrada.nextLine();

        Livro novoLivro = new Livro(titulo, autor);
        livros.add(novoLivro);
        System.out.println("Livro Cadastrado");
    }

    @Override
    public void consultarLivros() {
        for (Livro l : livros){
            System.out.println(l);
        }

    }

    @Override
    public void emprestarLivro() {

    }

    public int menu(){
        System.out.println("0 - sair \n1 - cadastrar livro \n2 - consultar livros\n3 - emprestar livro");
        int opcaoMenu = entrada.nextInt();
        entrada.nextLine();
        return (opcaoMenu);
    }

}

