package Service;

import Entities.FreelancerEntity;
import Entities.ProjetoEntity;
import Entities.SistemaFreeLancersEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FreelancerService {
    SistemaFreeLancersEntity s1 = new SistemaFreeLancersEntity();
    FreelancerEntity f1 = new FreelancerEntity();

    public void adicionarProjeto(FreelancerEntity freelancer, ProjetoEntity projeto) {
        freelancer.getListaProjetos().add(projeto);
    }

    public FreelancerEntity criarFreelancer(){

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o Nome do freeLancer:");
        String nomeFreeLancer = input.nextLine();

        System.out.println("Digite a area do freeLancer:");
        String areaAtuacao = input.nextLine();

        FreelancerEntity f1 = new FreelancerEntity(nomeFreeLancer, areaAtuacao);

        System.out.println("Usuario Cadastrado com sucesso");

        return f1;
    }

    public String mostrandoGanhos (FreelancerEntity f1){
        return ("Seu ganhos totais foram: " + calcularGanhosTotais(f1));
    }

    public double calcularGanhosTotais(FreelancerEntity freelancer) {
        double total = 0.0;
        for (ProjetoEntity projeto : freelancer.getListaProjetos()) {
            total += projeto.getValor();
        }
        return total;
    }










}
