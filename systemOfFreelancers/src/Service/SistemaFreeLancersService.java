package Service;

import Entities.FreelancerEntity;
import Entities.ProjetoEntity;
import Entities.SistemaFreeLancersEntity;

public class SistemaFreeLancersService {
    SistemaFreeLancersEntity n1 = new SistemaFreeLancersEntity();
    FreelancerService f1 = new FreelancerService();
    FreelancerEntity f12 = new FreelancerEntity();

    public void cadastroUsuario(FreelancerEntity freelancer) {
        n1.getListaFreelancers().add(freelancer);
    }

    public void adicionarProjetoFreelancer(FreelancerEntity freelancer, ProjetoEntity projeto) {
        f1.adicionarProjeto(freelancer, projeto);
    }

    public void mostrarFreeLancers() {
        int i = 0;
        for (FreelancerEntity freelancer : n1.getListaFreelancers()) {
            System.out.println("Freelancer " + i++ + ": " + freelancer.getNome());
        }
    }

}
