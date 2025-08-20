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
        System.out.println("----------------------------------");
    }

    @Override
    public void consultarLivros() {
        int cont = 1;
        for (Livro l : livros){
            System.out.println(cont + " - " + l);
            cont++;
        }
        System.out.println("----------------------------------");

    }

    @Override
    public void emprestarLivro() {
        int cont = 1;
        for (Livro l : livros){
            System.out.println(cont + " - " + l);
            cont++;}
        System.out.println("Escolha o Livro para emprestar ");
        int emprestimo = entrada.nextInt();
        System.out.println("Concluido");
        if (livros.get(emprestimo -1).disponivel == true){
            livros.get(emprestimo - 1).disponivel = false;
        }else {
            System.out.println("Livro indisponivel no momento, tente outra opção!");
        }
    }

    public int menu(){
        System.out.println("0 - sair \n1 - cadastrar livro \n2 - consultar livros\n3 - emprestar livro");
        System.out.println("----------------------------------");
        int opcaoMenu = entrada.nextInt();
        entrada.nextLine();
        return (opcaoMenu);
    }

}

