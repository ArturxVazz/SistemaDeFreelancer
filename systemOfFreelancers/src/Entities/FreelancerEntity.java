package Entities;

import java.util.ArrayList;
import java.util.List;

public class FreelancerEntity {
    private String nome;
    private String areaDeAtuacao;

    private List<ProjetoEntity> listaProjetos = new ArrayList<>();


    public FreelancerEntity(){}

    public FreelancerEntity(String nome, String areaDeAtuacao) {
        this.nome = nome;
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public List<ProjetoEntity> getListaProjetos() {
        return listaProjetos;
    }
}
