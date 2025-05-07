package Service;

import Entities.FreelancerEntity;
import Entities.ProjetoEntity;

import java.util.Scanner;

public class ProjetoService {

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
}
