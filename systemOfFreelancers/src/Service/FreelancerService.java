package Service;

import Model.FreelancerEntity;
import Model.ProjetoEntity;
import Repository.SistemaFreeLancersEntity;

import java.util.List;
import java.util.Scanner;

public class FreelancerService {
    SistemaFreeLancersEntity sf1 = new SistemaFreeLancersEntity();

    public FreelancerService(SistemaFreeLancersEntity sf1) {
        this.sf1 = sf1;
    }

    public void adicionarProjetoaFreelancer (String nomeFreelancer, String nomeProjeto, String cliente, double valor, int duracaoEmDias) {
        FreelancerEntity freelancer = sf1.buscarFreelancer(nomeFreelancer);
        if (freelancer != null) {
            ProjetoEntity projeto = new ProjetoEntity(nomeProjeto, cliente, valor, duracaoEmDias);
            freelancer.getListaProjetos().add(projeto);
        } else {
            System.out.println("Freelancer não encontrado.");
        }
    }

    public FreelancerEntity criarFreelancer(){

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o Nome do freeLancer:");
        String nomeFreeLancer = input.nextLine();

        System.out.println("Digite a area do freeLancer:");
        String areaAtuacao = input.nextLine();

        FreelancerEntity f1 = new FreelancerEntity(nomeFreeLancer,areaAtuacao);

        System.out.println("Usuario Cadastrado com sucesso");

        return f1;
    }

    public double calcularGanhosTotais(FreelancerEntity freelancer) {
        double total = 0.0;
        for (ProjetoEntity projeto : freelancer.getListaProjetos()) {
            total += projeto.getValor();
        }
        return total;
    }

    public ProjetoEntity atrelnadoFreelancerAProjeto() {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o nome do projeto:");
        input.nextLine();
        String nomeProjeto = input.nextLine();

        System.out.println("Qual o nome do cliente:");
        String nomeCliente = input.nextLine();

        System.out.println("Valor do projeto: ");
        double valorProjeto = input.nextDouble();

        System.out.println("Duração de dias do projeto:");
        int duracaoProjeto = input.nextInt();
        input.nextLine();


        ProjetoEntity p1 = new ProjetoEntity(nomeProjeto, nomeCliente, valorProjeto, duracaoProjeto);

        return p1;
    }

    public void cadastroUsuario(FreelancerEntity freelancer) {
        sf1.getListaFreelancers().add(freelancer);
    }

    public void exibirFreelancersComGanhos() {
        List<FreelancerEntity> freelancers = sf1.getListaFreelancers();

        for (FreelancerEntity freelancer : freelancers) {
            System.out.println(freelancer.getNome() + " - R$" + calcularGanhosTotais(freelancer));
        }
    }



}
