package Controller;

import Model.FreelancerEntity;
import Service.FreelancerService;

import java.util.Scanner;

public class MenuService {
        private FreelancerService service;

    public MenuService(FreelancerService service) {
        this.service = service;
    }

    public void menu() {
            Scanner scanner = new Scanner(System.in);
            int escolha;

            do {
                System.out.println("\nMenu de Gestão de Freelancers:");
                System.out.println("1. Cadastrar Freelancer");
                System.out.println("2. Adicionar Projeto a um Freelancer");
                System.out.println("3. Exibir Freelancers e seus Ganhos");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        cadastrarFreelancer(scanner);
                        break;
                    case 2:
                        adicionarProjeto(scanner);
                        break;
                    case 3:
                        service.exibirFreelancersComGanhos();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } while (escolha != 0);
        }

        private void cadastrarFreelancer(Scanner scanner) {
            System.out.print("Digite o nome do freelancer: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a área de atuação do freelancer: ");
            String areaDeAtuacao = scanner.nextLine();

            FreelancerEntity f1 = new FreelancerEntity();

            service.cadastroUsuario(f1);
            System.out.println("Freelancer cadastrado com sucesso.");
        }

        private void adicionarProjeto(Scanner scanner) {
            System.out.print("Digite o nome do freelancer: ");
            String nomeFreelancer = scanner.nextLine();
            System.out.print("Digite o nome do projeto: ");
            String nomeProjeto = scanner.nextLine();
            System.out.print("Digite o cliente do projeto: ");
            String cliente = scanner.nextLine();
            System.out.print("Digite o valor do projeto: ");
            double valor = scanner.nextDouble();
            System.out.print("Digite a duração do projeto (em dias): ");
            int duracaoEmDias = scanner.nextInt();
            scanner.nextLine();
            service.adicionarProjetoaFreelancer(nomeFreelancer, nomeProjeto, cliente, valor, duracaoEmDias);
            System.out.println("Projeto adicionado com sucesso.");
        }

}


