package Service;

import Entities.FreelancerEntity;
import Entities.ProjetoEntity;
import Entities.SistemaFreeLancersEntity;

public class SistemaFreeLancersService {
    SistemaFreeLancersEntity n1 = new SistemaFreeLancersEntity();
    FreelancerService f1 = new FreelancerService();

    public void cadastroUsuario(FreelancerEntity freelancer) {
        n1.getListaFreelancers().add(freelancer);
    }

    public void adicionarProjetoFreelancer(FreelancerEntity freelancer, ProjetoEntity projeto) {
        f1.adicionarProjeto(freelancer, projeto);
    }

    public void mostrarFreeLancers() {
        int i = 1;
        for (FreelancerEntity freelancer : n1.getListaFreelancers()) {
            System.out.println("Freelancer " + i++ + ": " + freelancer.getNome());
        }
    }

    public void top3Freelancers() {
        n1.getListaFreelancers().stream()
                .sorted((f1, f2) -> Double.compare())
                .limit(3)
                .forEach(f -> System.out.println(f.getNome() + " - R$" + f1.calcularGanhosTotais()));
    }







}
