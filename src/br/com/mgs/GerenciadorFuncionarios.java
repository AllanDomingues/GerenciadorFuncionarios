package br.com.mgs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorFuncionarios {
    private Map<Integer, Funcionario> funcionarios;
    private int proximoId;

    // Construtor
    public GerenciadorFuncionarios() {
        funcionarios = new HashMap<>();
        proximoId = 1;
    }

    // Método para adicionar um funcionário
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.put(proximoId, funcionario);
        proximoId++;
        System.out.println("Funcionário adicionado com sucesso. ID: " + (proximoId - 1));
    }

    // Método para buscar e exibir informações de um funcionário pelo ID
    public void exibirInformacoesFuncionario(int id) {
        Funcionario funcionario = funcionarios.get(id);
        if (funcionario != null) {
            System.out.println("Informações do Funcionário (ID: " + id + "):");
            funcionario.exibirInformacoes();
        } else {
            System.out.println("Funcionário não encontrado com o ID: " + id);
        }
    }

    // Método principal para execução do programa de teste
    public static void main(String[] args) {
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n### Sistema de Gerenciamento de Funcionários ###");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Buscar Funcionário por ID");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o \n pendente após nextInt()

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Funcionário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Alergias: ");
                    String alergias = scanner.nextLine();
                    System.out.print("Problemas Médicos: ");
                    String problemasMedicos = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Funcionario novoFuncionario = new Funcionario(nome, cargo, alergias, problemasMedicos, telefone, email);
                    gerenciador.adicionarFuncionario(novoFuncionario);
                    break;

                case 2:
                    System.out.print("Digite o ID do Funcionário: ");
                    int idBusca = scanner.nextInt();
                    gerenciador.exibirInformacoesFuncionario(idBusca);
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        }
    }
}
