package pack1;

import java.util.ArrayList;
import java.util.Scanner;

class GerenciadorEmpregados {
    private ArrayList<Empregado> empregados;
    private Scanner scanner;

    public GerenciadorEmpregados() {
        empregados = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarEmpregado() {
        System.out.println("Adicionar novo empregado:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Alergias: ");
        String alergias = scanner.nextLine();
        System.out.print("Condições Médicas: ");
        String condiçoes_preexistentes = scanner.nextLine();
        System.out.print("Telefone de Contato: ");
        String telefone = scanner.nextLine();
        System.out.print("Email de Contato: ");
        String emailContato = scanner.nextLine();

        Empregado empregado = new Empregado(nome, alergias, condiçoes_preexistentes, telefone, emailContato);
        empregados.add(empregado);
        System.out.println("Empregado adicionado com sucesso!");
    }

    public void exibirEmpregado() {
    	if (empregados.isEmpty()) {
            System.out.println("Nenhum Empregado Localizado.");
        } else {
            for (Empregado empregado : empregados) {
                System.out.println(empregado);
            }
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Empregado");
            System.out.println("2. Exibir Empregado");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarEmpregado();
                    break;
                case 2:
                    exibirEmpregado();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void main(String[] args) {
        GerenciadorEmpregados gerenciador = new GerenciadorEmpregados();
        gerenciador.menu();
    }
}