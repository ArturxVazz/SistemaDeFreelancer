package Service;

import Entities.FreelancerEntity;
import Entities.SistemaFreeLancersEntity;

import java.util.ArrayList;
import java.util.List;

public class FreelancerService {
    SistemaFreeLancersEntity n1 = new SistemaFreeLancersEntity();

    public void cadastroUsuario(FreelancerEntity freelancer) {
        n1.getListaFreelancers().add(freelancer);
    }
}
