package Repository;

import Model.FreelancerEntity;
import Model.ProjetoEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SistemaFreeLancersEntity {
    private List<FreelancerEntity> listaFreelancers = new ArrayList<>();


    public void salvar(FreelancerEntity freelancer) {
        listaFreelancers.add(freelancer);
    }

    public FreelancerEntity buscarFreelancer(String nomeFreelancer) {
        for (FreelancerEntity freelancer : listaFreelancers) {
            if (freelancer.getNome().equalsIgnoreCase(nomeFreelancer)) {
                return freelancer;  // Retorna o objeto freelancer
            }
        }
        return null;  // Retorna null se não encontrar o freelancer
    }



    public List<FreelancerEntity> getListaFreelancers() {
        return listaFreelancers;
    }



}
