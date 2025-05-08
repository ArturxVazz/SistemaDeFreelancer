import Controller.MenuService;
import Model.FreelancerEntity;
import Repository.SistemaFreeLancersEntity;
import Service.FreelancerService;

public class Main {
    public static void main(String[] args) {
        SistemaFreeLancersEntity freelancerMain = new SistemaFreeLancersEntity();
        FreelancerService service = new FreelancerService(freelancerMain);
        MenuService controller = new MenuService(service);


        controller.menu();
    }
}